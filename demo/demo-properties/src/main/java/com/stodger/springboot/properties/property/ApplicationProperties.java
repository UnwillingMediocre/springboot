package com.stodger.springboot.properties.property;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author KimYuan
 * @version V1.0
 * @date 2022-06-12
 */

@Data
@ConfigurationProperties(ApplicationProperties.PREFIX)
@Component
public class ApplicationProperties {

    public static final String PREFIX = "application";

    public String name;

    public String version;
}
