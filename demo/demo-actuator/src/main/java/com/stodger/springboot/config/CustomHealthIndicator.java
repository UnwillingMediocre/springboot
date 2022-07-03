package com.stodger.springboot.config;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * 自定义 HealthIndicator
 * @author KimYuan
 * @version V1.0
 * @date 2022-07-03
 */
@Component
public class CustomHealthIndicator implements HealthIndicator {

    @Override
    public Health health() {
        return Health.down().build();
    }
}
