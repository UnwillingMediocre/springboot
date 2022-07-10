package com.stodger.springboot.exception.handler.controller;

import com.stodger.springboot.exception.handler.constant.Status;
import com.stodger.springboot.exception.handler.exception.JsonException;
import com.stodger.springboot.exception.handler.exception.PageException;
import com.stodger.springboot.exception.handler.model.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author KimYuan
 * @version V1.0
 * @date 2022-07-10
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/getjson")
    public ApiResponse getJson() {
        throw new JsonException(Status.UNKNOWN_ERROR);
    }

    @GetMapping("/getpage")
    public ModelAndView getPage() {
        throw new PageException(Status.UNKNOWN_ERROR);
    }
}
