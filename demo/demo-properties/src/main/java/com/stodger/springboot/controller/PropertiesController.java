package com.stodger.springboot.controller;

import cn.hutool.core.lang.Dict;
import com.stodger.springboot.property.ApplicationProperties;
import com.stodger.springboot.property.ApplicationProperty;
import com.stodger.springboot.property.DeveloperProperties;
import com.stodger.springboot.property.DeveloperProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author KimYuan
 * @version V1.0
 * @date 2022-06-12
 */

@RestController
public class PropertiesController {

    private final ApplicationProperty applicationProperty;
    private final DeveloperProperty developerProperty;
    private final DeveloperProperties developerProperties;
    private final ApplicationProperties applicationProperties;

    @Autowired
    public PropertiesController(ApplicationProperty applicationProperty, DeveloperProperty developerProperty, DeveloperProperties developerProperties, ApplicationProperties applicationProperties) {
        this.applicationProperty = applicationProperty;
        this.developerProperty = developerProperty;
        this.developerProperties = developerProperties;
        this.applicationProperties = applicationProperties;
    }

    @GetMapping(value = "/property")
    public Dict index() {
        return Dict.create()
                .set("applicationProperty", applicationProperty)
                .set("developerProperty", developerProperty)
                .set("applicationProperties",applicationProperties)
                .set("developerProperties",developerProperties);
    }

}
