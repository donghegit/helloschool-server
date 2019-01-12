package com.grapep.byle.user.controller;

import com.google.gson.Gson;
import com.grapep.byle.commodity.entity.Commodity;
import com.grapep.byle.common.constants.Constants;
import com.grapep.byle.common.exception.ByleException;
import com.grapep.byle.common.resp.ApiResult;
import com.grapep.byle.common.rest.BaseController;

import com.grapep.byle.user.entity.LoginInfo;
import com.grapep.byle.user.entity.LoginResponse;
import com.grapep.byle.user.entity.TokenResponse;
import com.grapep.byle.user.entity.User;
import com.grapep.byle.user.service.UserService;
import io.rong.RongCloud;
import io.rong.models.response.TokenResult;
import io.rong.models.user.UserModel;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;


@Slf4j
@RestController
@RequestMapping("user")
public class UserController extends BaseController {

    @Autowired
    @Qualifier("userServiceImpl")
    private UserService userService;

    /**
     *
     * @describe 发送验证码
     * @param:  user
     * @return
     * @author donghe
     * @date 2017/11/11 14:00
     */
    @RequestMapping(value = "/getVercode",method = RequestMethod.POST)
    @ApiOperation(value = "发送验证码",notes = "对接三方短信商发送短信",httpMethod = "POST")
    @ApiImplicitParam(name = "user",dataType = "User",required = true)
    public ApiResult<String> sendVerCode(@RequestBody User user, HttpServletRequest request){
        ApiResult<String> resp = new ApiResult<String>();
        try {
            if(StringUtils.isEmpty(user.getUserPhone())){
                throw new ByleException("手机号不能为空");
            }
            userService.sendVerCode(user.getUserPhone(),getIpFromRequest(request));
            resp.setMessage("发送成功");
        }catch (ByleException e) {
            resp.setCode(e.getStatusCode());
            resp.setMessage(e.getMessage());
        }catch (Exception e){
            resp.setCode(Constants.RESP_STATUS_INTERNAL_ERROR);
            resp.setMessage("内部错误");
        }
        return resp;
    }

    /**
     *
     * @describe 登录
     * @param:
     * @return
     * @author donghe
     * @date 2017/11/17 23:00
     */
    @RequestMapping(value = "/login",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public ApiResult login(@RequestBody LoginInfo loginInfo){
        ApiResult<LoginResponse> resp = new ApiResult<>();
        String key = loginInfo.getKey();
        String data = loginInfo.getData();
        LoginResponse res ;
        try {
            if (data == null) {
                throw new ByleException("非法请求");
            }
            res = userService.login(key,data);
            resp.setData(res);
        }catch (ByleException e){
            resp.setCode(e.getStatusCode());
            resp.setMessage(e.getMessage());
        }catch (Exception e) {
            resp.setCode(Constants.RESP_STATUS_INTERNAL_ERROR);
            resp.setMessage("内部错误");
        }
        System.out.println(new Gson().toJson(resp).toString());
        return resp;
    }

    /**
     *
     * @describe 获取融云token
     * @param:
     * @return
     * @author donghe
     * @date 2017/12/9 15:40
     */

    @RequestMapping(value = "/getRongToken",method = RequestMethod.POST)
    public ApiResult getRongToken(@RequestBody User user){

        ApiResult<TokenResponse> result = new ApiResult<>();
        RongCloud rongCloud = RongCloud.getInstance(Constants.APPKEY_RONG,Constants.APPSECRET_RONG);
        //com.grapep.byle.rong.methods.User userRong = new com.grapep.byle.rong.methods.User(Constants.APPKEY_RONG,Constants.APPSECRET_RONG);
        io.rong.methods.user.User userRong = rongCloud.user;
        try {
            if(StringUtils.isBlank(String.valueOf(user.getUserId()))
                    || StringUtils.isBlank(user.getUserName())
                    || StringUtils.isBlank(user.getUserHead())){

                result.setCode(Constants.RESP_STATUS_INTERNAL_ERROR);
                result.setMessage("用户信息为空");
                return result;
            }
            UserModel userModel = new UserModel()
                    .setId("hHjap87")
                    .setName("RongCloud")
                    .setPortrait("http://www.rongcloud.cn/images/logo.png");
            TokenResult resultToken = userRong.register(userModel);
//            TokenResult tokenResult = userRong.getToken(String.valueOf(user.getUserId()),user.getUserName(),user.getUserHead());
            if(resultToken.getCode() == 200){
                TokenResponse tokenResponse = new TokenResponse();
                tokenResponse.setToken(resultToken.getToken());
                tokenResponse.setUserId(resultToken.getUserId());
                result.setData(tokenResponse);
            }else{
                result.setCode(resultToken.getCode());
                result.setMessage(resultToken.getMsg());
            }
        } catch (Exception e) {
            result.setCode(Constants.RESP_STATUS_INTERNAL_ERROR);
            result.setMessage(e.getMessage());
        }
        return result;

    }

    /**
     *
     * @describe 用户完善信息
     * @param:
     * @return
     * @author donghe
     * @date 2017/12/10 23:52
     */
    @RequestMapping(value = "/addBaseInfo",method = RequestMethod.POST)
    public ApiResult addBaseInfo(@RequestBody User user){
        ApiResult<User> apiResult = new ApiResult<>();
        try {
            User mUser = userService.addBaseInfo(user);
            apiResult.setData(mUser);
        } catch (ByleException e) {
            apiResult.setCode(Constants.RESP_STATUS_INTERNAL_ERROR);
            apiResult.setMessage(e.getMessage());
        }
        return apiResult;

    }


    @RequestMapping(value = "/test",method = RequestMethod.GET)
    @ResponseBody
    public String tesr(){
        return "test";

    }
}
