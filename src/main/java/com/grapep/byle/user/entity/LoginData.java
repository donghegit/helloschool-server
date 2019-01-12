package com.grapep.byle.user.entity;


import lombok.Data;

/**
 * Created by zhongyanli on 17/8/20.
 */

@Data
public class LoginData {
    private String userPhone;
    private String code;
    private String plantform;
    private String channelId;

    public LoginData(String userPhone, String code, String plantform, String channelId) {
        this.userPhone = userPhone;
        this.code = code;
        this.plantform = plantform;
        this.channelId = channelId;
    }

}

