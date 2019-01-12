package com.grapep.byle.user.entity;

import lombok.Data;

/**
 * Created by donghe on 2017/11/19.
 */

@Data
public class LoginResponse {

    private String token;
    private String userId;
    private String head;
    private String name;
    private String isAuth;

}
