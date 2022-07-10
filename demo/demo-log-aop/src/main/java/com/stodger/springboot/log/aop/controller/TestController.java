package com.stodger.springboot.log.aop.controller;

import cn.hutool.core.lang.Dict;
import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONUtil;
import com.stodger.springboot.log.aop.config.LogAopAnnotation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @author KimYuan
 * @version V1.0
 * @date 2022-07-10
 */
@RestController
@RequestMapping("/test")
@Slf4j
public class TestController {

    /**
     *
     * @param username
     * @return
     */
    @GetMapping("/getusername")
    @LogAopAnnotation("TestController")
    public String GetUserName(String username) {

        return StrUtil.isBlank(username) ? "hello World" : "hello " + username;
    }

    /**
     *  测试post json方法
     * @param map 请求的json参数
     * @return {@link Dict}
     */
    @PostMapping("/testJson")
    @LogAopAnnotation("TestController")
    public Dict testJson(@RequestBody Map<String, Object> map) {

        final String jsonStr = JSONUtil.toJsonStr(map);
        log.info(jsonStr);
        return Dict.create().set("json", map);
    }
}
