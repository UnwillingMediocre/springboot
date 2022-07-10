package com.stodger.springboot.exception.handler.constant;

import lombok.Getter;

/**
 * @author KimYuan
 * @version V1.0
 * @date 2022-07-10
 */
@Getter
public enum Status {

    /**
     * 操作成功
     */
    OK(200, "success"),

    /**
     * 未知异常
     */
    UNKNOWN_ERROR(500, "server exception");
    /**
     * 状态码
     */
    private Integer code;
    /**
     * 内容
     */
    private String msg;

    Status(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
