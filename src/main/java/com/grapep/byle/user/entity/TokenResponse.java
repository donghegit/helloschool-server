package com.grapep.byle.user.entity;

import lombok.Data;

/**
 * @Describe: TODO
 * @Author : donghe
 * @DateTime: 2017.12.09  16:31
 */
@Data
public class TokenResponse {
    private String userId;
    private String token;
}
