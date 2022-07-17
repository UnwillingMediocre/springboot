package com.stodger.springboot.redis.controller;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import com.stodger.springboot.redis.model.User;
import com.stodger.springboot.redis.service.RedisCacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author KimYuan
 * @version V1.0
 * @date 2022-07-17
 */

@RestController
@RequestMapping("/test")
public class TestController {

    private final RedisCacheService redisCacheService;

    public TestController(RedisCacheService redisCacheService) {
        this.redisCacheService = redisCacheService;
    }

    /**
     * 添加 String
     * @param key
     * @param value
     */
    @PostMapping("/add")
    public void add(@RequestParam("key") String key, @RequestParam("value") Object value) {
        if(StrUtil.isEmpty(key)) {
            throw new RuntimeException("key 不能为空");
        }
        if(ObjectUtil.isNull(value)) {
            throw new RuntimeException("value 不能为空");
        }
        redisCacheService.add(key, value);
    }

    @GetMapping("/getkey")
    public String getKey(String key) {
        if(StrUtil.isEmpty(key)) {
            throw new RuntimeException("key 不能为空");
        }

        return redisCacheService.get(key);
    }

    @GetMapping("/getuserbykey")
    public User getUserByKey(String key) {
        if(StrUtil.isEmpty(key)) {
            throw new RuntimeException("key 不能为空");
        }

        return redisCacheService.getObject(key, User.class);
    }

    /**
     *  添加hash类型
     * @param key
     * @param subKey
     * @param value
     */
    @PostMapping("/addhash")
    public void addHash(@RequestParam("key") String key, @RequestParam("subKey") String subKey, @RequestParam("value") Object value) {
        if(StrUtil.isEmpty(key)) {
            throw new RuntimeException("key 不能为空");
        }
        if(StrUtil.isEmpty(subKey)) {
            throw new RuntimeException("subKey 不能为空");
        }
        if(ObjectUtil.isNull(value)) {
            throw new RuntimeException("value 不能为空");
        }
        redisCacheService.addHashCache(key,subKey, value);
    }

    /**
     * 获取 hash
     * @param key
     * @param subKey
     * @return
     */
    @GetMapping ("/gethash")
    public Object getHash(@RequestParam("key") String key, @RequestParam("subKey") String subKey) {

        if(StrUtil.isEmpty(key)) {
            throw new RuntimeException("key 不能为空");
        }
        if(StrUtil.isEmpty(subKey)) {
            throw new RuntimeException("subKey 不能为空");
        }

        return redisCacheService.getHashCache(key,subKey);
    }
}
