package com.grapep.byle.user.service;

import com.alibaba.fastjson.JSON;
import com.google.gson.Gson;
import com.grapep.byle.cache.CommonCacheUtil;
import com.grapep.byle.common.exception.ByleException;
import com.grapep.byle.common.util.RandomNumberCode;
import com.grapep.byle.jms.SmsProcessor;
import com.grapep.byle.security.AESUtil;
import com.grapep.byle.security.Base64Util;
import com.grapep.byle.security.MD5Util;
import com.grapep.byle.security.RSAUtil;
import com.grapep.byle.user.dao.UserMapper;
import com.grapep.byle.user.entity.LoginData;
import com.grapep.byle.user.entity.LoginResponse;
import com.grapep.byle.user.entity.User;
import com.grapep.byle.user.entity.UserElement;
import lombok.extern.slf4j.Slf4j;
import org.apache.activemq.command.ActiveMQQueue;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.jms.Destination;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@Service
public class UserServiceImpl implements UserService{

    private static final String VERIFYCODE_PREFIX = "verify.code.";
    private static final String SMS_QUEUE = "sms.queue";

    @Autowired
    private CommonCacheUtil cacheUtil;
    @Autowired
    private SmsProcessor smsProcessor;
    @Autowired
    private UserMapper userMapper;

    /**
     *
     * @describe 发送验证码
     * @param:
     * @return
     * @author donghe
     * @date 2017/11/11 16:35
     */
    @Override
    public void sendVerCode(String phone, String ip) throws ByleException {
        //生成随机数
        String verCode = RandomNumberCode.verCode();
        //判断验证码是否过期，用户ip登录次数,用户手机号登录次数
        int result = cacheUtil.cacheForVerificationCode(VERIFYCODE_PREFIX+phone,verCode,"reg",60,ip);
        if (result == 1) {
            log.info("当前验证码未过期，请稍后重试");
            throw new ByleException("当前验证码未过期，请稍后重试");
        } else if (result == 2) {
            log.info("超过当日验证码次数上线");
            throw new ByleException("超过当日验证码次数上限");
        } else if (result == 3) {
            log.info("超过当日验证码次数上限 {}", ip);
            throw new ByleException(ip + "超过当日验证码次数上限");
        }
        log.info("Sending verify code {} for phone {}", verCode, phone);
        //验证码推送到队列
        Destination destination = new ActiveMQQueue(SMS_QUEUE);
        Map<String,String> smsParam = new HashMap<>();
        smsParam.put("phone",phone);
        smsParam.put("content","毕业啦验证码:"+verCode);
        String message = JSON.toJSONString(smsParam);
        smsProcessor.sendSmsToQueue(destination,message);
    }


    /**
     *
     * @describe 登录
     * @param:
     * @return
     * @author donghe
     * @date 2017/11/17 22:19
     */
    @Override
    @Transactional
    public LoginResponse login(String key, String data) throws ByleException {
        String decryptData = null;
        String token = null;
        LoginResponse res = new LoginResponse();
        User user = null;

        //RSA解密AES的key
        byte[] aesKey = new byte[0];
        try {
            aesKey = RSAUtil.decryptByPrivateKey(Base64Util.decode(key));
            String oriKey = new String(aesKey,"UTF-8");
            System.out.println(oriKey);
            //AES的key解密AES加密数据
            decryptData = AESUtil.decrypt(data, oriKey);
            if (decryptData == null) {
                throw new Exception();
            }
            LoginData loginData = new Gson().fromJson(decryptData,LoginData.class);
            if(StringUtils.isBlank(loginData.getUserPhone()) || StringUtils.isBlank(loginData.getCode())
                    || StringUtils.isBlank(loginData.getPlantform()) || StringUtils.isBlank(loginData.getChannelId())){
                throw new Exception();
            }
            //去redis中核对手机验证码是否匹配
            String verCode = cacheUtil.getCacheValue(VERIFYCODE_PREFIX+loginData.getUserPhone());
            if(verCode == null){
                throw new ByleException("你的手机没发过验证码");
            }

            if(verCode.equals(loginData.getCode())){
                //判断用户是否存在
                user = userMapper.selectByPhone(loginData.getUserPhone());
                if(user == null){  //用户不存在
                    user = new User();
                    user.setUserPhone(loginData.getUserPhone());
                    userMapper.insert(user);  //插入一条记录
                    user = userMapper.selectByPhone(loginData.getUserPhone());
                }
            }else{
                throw new ByleException("手机号与验证码不匹配");
            }
            try{
                //生成token
                token = this.generateToken(user);
            }catch (Exception e){
                throw new ByleException("Fail to generate token");
            }

            UserElement userElement = new UserElement();
            userElement.setPhone(loginData.getUserPhone());
            userElement.setToken(token);
            userElement.setPlatform(loginData.getPlantform());
            userElement.setUserId(user.getUserId());
            userElement.setPushChannelId(loginData.getChannelId());
            cacheUtil.putTokenWhenLogin(userElement);

        } catch (Exception e) {
            log.error("Fail to decrypt data", e);
            throw new ByleException(e.getMessage());
        }
        res.setToken(token);
        res.setUserId(String.valueOf(user.getUserId()));
        res.setName(user.getUserName());
        res.setHead(user.getUserHead());
        res.setIsAuth(user.getIsAuthentication());
        return res;
    }

    @Override
    public User addBaseInfo(User user) throws ByleException {
        int effect = userMapper.updateBaseInfoByUserId(user);
        if(effect > 0){
            return userMapper.selectByPrimaryKey(user.getUserId());
        }else{
            //回滚
            //抛异常
            throw new ByleException("更新基本信息失败");
        }

    }

    /**
     *
     * @describe 生成 token
     * @param:
     * @return
     * @author donghe
     * @date 2017/11/17 22:18
     */
    private String generateToken(User user)
            throws Exception {
        String source = user.getUserId() + ":" + user.getUserPhone() + System.currentTimeMillis();
        return MD5Util.getMD5(source);
    }
}
