package com.grapep.byle.user.service;

import com.grapep.byle.common.exception.ByleException;
import com.grapep.byle.user.entity.LoginResponse;
import com.grapep.byle.user.entity.User;
import org.apache.ibatis.annotations.Mapper;


public interface UserService {

    void sendVerCode(String phone, String ip) throws ByleException;  //发送验证码

    LoginResponse login(String key, String data) throws ByleException;    //登录

    User addBaseInfo(User user) throws ByleException;
}
