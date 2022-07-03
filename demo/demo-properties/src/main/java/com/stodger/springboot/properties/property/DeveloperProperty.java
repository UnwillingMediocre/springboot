package com.stodger.springboot.properties.property;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author KimYuan
 * @version V1.0
 * @date 2022-06-12
 */

@Data
@Component
public class DeveloperProperty {

    @Value("${developer.name}")
    public String name;

    @Value("${developer.website}")
    public String website;

    @Value("${developer.desc}")
    public String desc;
}
