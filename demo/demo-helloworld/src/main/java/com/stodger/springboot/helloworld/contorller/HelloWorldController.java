package com.stodger.springboot.helloworld.contorller;

import cn.hutool.core.util.StrUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author KimYuan
 * @version V1.0
 * @date 2022-06-12
 */
@RestController
@RequestMapping("/helloWorld")
public class HelloWorldController {

    /**
     * hello world
     * @param name 参数 必须
     * @return name
     */
    @RequestMapping("/getHelloWorld")
    public String getHelloWorld(@RequestParam(required = true, name="test",defaultValue = "123456") String name) {
        String test = "test";
        if(StrUtil.contains(name, test)) {
            name = "Hello world";
        }
        return name;
    }
}
