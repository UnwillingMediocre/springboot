package com.stodger.springboot.template.freemarker.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author KimYuan
 * @version V1.0
 * @date 2022-07-11
 */
@Data
@AllArgsConstructor
public class Product {
    private String productNumber;

    private String name;
}
