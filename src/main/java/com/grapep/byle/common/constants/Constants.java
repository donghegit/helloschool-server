package com.grapep.byle.common.constants;

/**
 * @Describe: 常量
 * @Author : donghe
 * @DateTime: 2017.11.11  13:57
 */
public class Constants {
    /**
     * 用户token
     **/
    public static final String REQUEST_TOKEN_KEY = "user-token";
    /**
     * 客户端版本
     **/
    public static final String REQUEST_VERSION_KEY = "version";
    /**
     * 客户端平台 android/ios
     **/
    public static final String REQUEST_PLATFORM_KEY = "platform";

    public static final String REQUEST_TYPE_KEY = "type";
    /**
     * 自定义状态码 start
     **/
    public static final int RESP_STATUS_OK = 200;

    public static final int RESP_STATUS_NOAUTH = 401;

    public static final int RESP_STATUS_INTERNAL_ERROR = 500;

    public static final int RESP_STATUS_BADREQUEST = 400;
    /**自定义状态码 end**/


    /**
     * 七牛云存储key
     **/
    public static final String QINIU_ACCESS_KEY = "uwNmKMge2w4EUXL3P7FSRF2eHkhmYSCx9AGOQQIT";
    public static final String QINIU_SECRET_KEY = "Pgrs2LIx6tWqakjnnJrSvtycjJlYKBeVLYnfoUug";
    public static final String QINIU_HEAD_IMG_BUCKET_NAME = "byle";
    public static final String QINIU_HEAD_IMG_BUCKET_URL = "idv0xmb.qiniudns.com";
    public static final String QINIU_HEAD_IMG_URL = "p086oszzx.bkt.clouddn.com";
    public static final String QINIU_PROTOCOL="http://";
    /**七牛云存储key结束**/

    /**
     *
     * Rong云 appKey  appSecret
     *
     */
    public static final String APPKEY_RONG = "mgb7ka1nmwjig";
    public static final String APPSECRET_RONG = "N66s0I4KJnif1";
    /**Rong云 结束  **/


}
