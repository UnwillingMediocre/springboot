package com.stodger.springboot.log.aop;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.MDC;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author KimYuan
 * @version V1.0
 * @date 2022-07-10
 */
@RunWith(SpringRunner.class)
@Slf4j
@SpringBootTest
public class TestDemo {

    @Test
    public void  logTest(){
        MDC.put("userId","stodger");
        for(int i = 0; i < 100; i++) {
            log.info("test info");
            log.error("test error");
        }
    }
}
