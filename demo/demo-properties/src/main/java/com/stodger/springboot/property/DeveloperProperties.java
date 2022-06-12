package com.stodger.springboot.property;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author KimYuan
 * @version V1.0
 * @date 2022-06-12
 */

@Data
@ConfigurationProperties(DeveloperProperties.PREFIX)
@Component
public class DeveloperProperties {

    public static final String PREFIX = "developer";

    public String name;

    public String website;

    public String desc;
}
