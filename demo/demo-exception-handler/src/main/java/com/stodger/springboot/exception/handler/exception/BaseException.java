package com.stodger.springboot.exception.handler.exception;

import com.stodger.springboot.exception.handler.constant.Status;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author KimYuan
 * @version V1.0
 * @date 2022-07-10
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class BaseException extends RuntimeException {

    /**
     * 编码
     */
    public Integer code;

    /**
     * 异常信息
     */
    public String msg;

    public BaseException(Status status) {
        super(status.getMsg());
        this.code = status.getCode();
        this.msg = status.getMsg();
    }

    public BaseException(Integer code, String message) {
        super(message);
        this.code = code;
        this.msg = message;
    }
}
