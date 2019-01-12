package com.grapep.byle.common.rest;

import com.grapep.byle.cache.CommonCacheUtil;
import com.grapep.byle.common.constants.Constants;
import com.grapep.byle.user.entity.UserElement;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @Describe: TODO
 * @Author : donghe
 * @DateTime: 2017.11.11  13:58
 */
public class BaseController {

    @Autowired
    private CommonCacheUtil cacheUtil;

    /**
     *
     * @describe 获取当前请求 IP
     * @param:  request
     * @return String
     * @author donghe
     * @date 2017/11/11 13:59
     */
    protected String getIpFromRequest(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)){
            ip = request.getHeader("Proxy-Client-IP");
        }
        if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)){
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)){
            ip = request.getRemoteAddr();
        }
        return ip.equals("0:0:0:0:0:0:0:1")?"127.0.0.1":ip;
    }

    protected UserElement getCurrentUser() {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();
        String token = request.getHeader(Constants.REQUEST_TOKEN_KEY);
        if (StringUtils.isNotEmpty(token)) {
            try {
                UserElement ue = cacheUtil.getUserByToken(token);
                return ue;
            } catch (Exception e) {
                return null;
            }
        }
        return null;
    }
}
