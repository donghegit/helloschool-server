package com.grapep.byle.jms;

import com.alibaba.fastjson.JSONObject;
import com.grapep.byle.common.exception.ByleException;
import com.shuyuanwl.sms.api.bean.DownRes;
import com.shuyuanwl.sms.api.core.ApiSender;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;
import javax.jms.Destination;

@Slf4j
@Component(value = "smsProcessor")
public class SmsProcessor {
    private final String PASSWORD = "kYw3VDAz";
    private final String ACCOUNT = "grapep@grapep";

    @Autowired
    private JmsMessagingTemplate jmsTemplate;


    public void sendSmsToQueue(Destination destination, final String message){
        jmsTemplate.convertAndSend(destination, message);
    }

    @JmsListener(destination="sms.queue")
    public void doSendSmsMessage(String text) throws ByleException {
        JSONObject jsonObject = JSONObject.parseObject(text);
        String url = "http://api.shuyuanwl.com:8080/api/sms/send";
        String mobiles = jsonObject.getString("phone"); //号码
        String content = jsonObject.getString("content");//短信内容
        String account = ACCOUNT; //账号
        String extno = "01"; //扩展码
        String password = PASSWORD;//密码
        String batchno = "1";//批次号
        DownRes res = ApiSender.send(url, account, password, mobiles, content, extno,batchno);
        log.info("sms-result:"+res);
        if(!"200".equals(res.getCode())){
            throw new ByleException(res.toString());
        }
    }



}
