package com.grapep.byle.common.resp;

import com.grapep.byle.common.constants.Constants;
import lombok.Data;

/**
 * @Describe: 自定义API
 * @Author : donghe
 * @DateTime: 2017.11.11  13:59
 */
@Data
public class ApiResult<T> {

    private int code = Constants.RESP_STATUS_OK;

    private String message;

    private T data;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setData(T data) {
        this.data = data;
    }
}
