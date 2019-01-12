package com.grapep.byle.common.exception;


/**
 * @Describe: 自定义异常
 * @Author : donghe
 * @DateTime: 2017.11.11  13:55
 */
public class ByleException extends Exception {
    private static final long serialVersionUID = -7370331410579650067L;

    public ByleException(String message) {
        super(message);
    }

    public int getStatusCode() {
        return 500;
    }

}
