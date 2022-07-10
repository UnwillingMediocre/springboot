package com.stodger.springboot.exception.handler.model;

import com.stodger.springboot.exception.handler.constant.Status;
import com.stodger.springboot.exception.handler.exception.BaseException;
import lombok.Data;

/**
 * @author KimYuan
 * @version V1.0
 * @date 2022-07-10
 */

@Data
public class ApiResponse {

    /**
     * 编码
     */
    public Integer code;

    /**
     * 异常信息
     */
    public String msg;

    /**
     * 数据
     */
    public Object data;

    /**
     * 无参构造
     */
    public ApiResponse() {

    }

    /**
     * 全参构造
     * @param code   编码
     * @param msg   异常信息
     * @param data  数据
     */
    public ApiResponse(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    /**
     * 构造一个自定义的API返回
     *
     * @param code  状态码
     * @param msg   异常信息
     * @param data 返回数据
     * @return ApiResponse
     */
    public static ApiResponse of(Integer code, String msg, Object data) {
        return new ApiResponse(code, msg, data);
    }

    /**
     * 构造一个成功且带数据的API返回
     *
     * @param data 返回数据
     * @return ApiResponse
     */
    public static ApiResponse ofSuccess(Object data) {
        return ofStatus(Status.OK, data);
    }

    /**
     * 构造一个成功且自定义消息的API返回
     *
     * @param msg 返回内容
     * @return ApiResponse
     */
    public static ApiResponse ofMessage(String msg) {
        return of(Status.OK.getCode(), msg, null);
    }

    /**
     * 构造一个有状态的API返回
     *
     * @param status 状态 {@link Status}
     * @return ApiResponse
     */
    public static ApiResponse ofStatus(Status status) {
        return ofStatus(status, null);
    }

    /**
     * 构造一个有状态且带数据的API返回
     *
     * @param status 状态 {@link Status}
     * @param data   返回数据
     * @return ApiResponse
     */
    public static ApiResponse ofStatus(Status status, Object data) {
        return of(status.getCode(), status.getMsg(), data);
    }

    /**
     * 构造一个异常且带数据的API返回
     *
     * @param t    异常
     * @param data 返回数据
     * @param <T>  {@link BaseException} 的子类
     * @return ApiResponse
     */
    public static <T extends BaseException> ApiResponse ofException(T t, Object data) {
        return of(t.getCode(), t.getMsg(), data);
    }

    /**
     * 构造一个异常且带数据的API返回
     *
     * @param t   异常
     * @param <T> {@link BaseException} 的子类
     * @return ApiResponse
     */
    public static <T extends BaseException> ApiResponse ofException(T t) {
        return ofException(t, null);
    }
}
