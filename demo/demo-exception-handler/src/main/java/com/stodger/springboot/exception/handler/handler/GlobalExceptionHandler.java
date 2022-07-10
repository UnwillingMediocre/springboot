package com.stodger.springboot.exception.handler.handler;

import com.stodger.springboot.exception.handler.exception.JsonException;
import com.stodger.springboot.exception.handler.exception.PageException;
import com.stodger.springboot.exception.handler.model.ApiResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author KimYuan
 * @version V1.0
 * @date 2022-07-10
 */

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    private static final String DEFAULT_ERROR_VIEW = "error";

    /**
     * 统一 json 异常处理
     *
     * @param exception JsonException
     * @return 统一返回 json 格式
     */
    @ExceptionHandler(value = JsonException.class)
    @ResponseBody
    public ApiResponse jsonErrorHandler(JsonException exception) {
        log.error("【JsonException】:{}", exception.getMessage());
        return ApiResponse.ofException(exception);
    }

    /**
     * 统一 页面 异常处理
     *
     * @param exception PageException
     * @return 统一跳转到异常页面
     */
    @ExceptionHandler(value = PageException.class)
    public ModelAndView pageErrorHandler(PageException exception) {
        log.error("【PageException】:{}", exception.getMessage());
        ModelAndView view = new ModelAndView();
        view.addObject("msg", exception.getMessage());
        view.setViewName(DEFAULT_ERROR_VIEW);
        return view;
    }

}
