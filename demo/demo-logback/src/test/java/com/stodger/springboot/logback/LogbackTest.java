package com.stodger.springboot.logback;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author KimYuan
 * @version V1.0
 * @date 2022-07-03
 */

@RunWith(SpringRunner.class)
@Slf4j
@SpringBootTest
public class LogbackTest {

    @Test
    public void  logTest(){
        for(int i = 0; i < 100; i++) {
            log.info("test info");
            log.error("test error");
        }
    }
}
