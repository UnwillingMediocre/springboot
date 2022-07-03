package com.stodger.springboot.actuator.config;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author KimYuan
 * @version V1.0
 * @date 2022-07-03
 */

@Component
@Endpoint(id = "customEndpoint")
public class CustomEndpoint {

    @ReadOperation
    public String custome() {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        return simpleDateFormat.format(date);
    }
}
