package com.stodger.springboot.exception.handler.exception;

import com.stodger.springboot.exception.handler.constant.Status;
import lombok.Getter;

/**
 * @author KimYuan
 * @version V1.0
 * @date 2022-07-10
 */
@Getter
public class JsonException extends BaseException{

    public JsonException(Status status) {
        super(status);
    }

    public JsonException(Integer code, String msg) {
        super(code, msg);
    }
}
