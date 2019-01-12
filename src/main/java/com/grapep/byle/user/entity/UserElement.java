package com.grapep.byle.user.entity;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @describe 用户头次登录成功写入缓存的数据，以后每次都从缓存中获取验证登录是否正确
 * @param:
 * @return
 * @author donghe
 * @date 2017/11/17 22:21
 */
@Data
public class UserElement {

    private Integer userId;

    private String phone;

    private String token;

    private String platform;

    private String pushUserId;

    private String pushChannelId;


    /**
     * 转 map
     * @return
     */
    public Map<String, String> toMap() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("platform", this.platform);
        map.put("userId", this.userId + "");
        map.put("token", token);
        map.put("phone", phone);
        if (this.pushUserId != null) {
            map.put("pushUserId", this.pushUserId);
        }
        if (this.pushChannelId != null) {
            map.put("pushChannelId", this.pushChannelId);
        }
        return map;
    }

    /**
     * map转对象
     * @param map
     * @return
     */
    public static UserElement fromMap(Map<String, String> map) {
        UserElement ue = new UserElement();
        ue.setPlatform(map.get("platform"));
        ue.setToken(map.get("token"));
        ue.setPhone(map.get("phone"));
        ue.setUserId(Integer.valueOf(map.get("userId")));
        ue.setPushUserId(map.get("pushUserId"));
        ue.setPushChannelId(map.get("pushChannelId"));
        return ue;
    }

}
