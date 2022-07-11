package com.stodger.springboot.template.enjoy.config;

import com.jfinal.template.Directive;
import com.jfinal.template.Env;
import com.jfinal.template.io.Writer;
import com.jfinal.template.stat.Scope;

import java.io.IOException;
import java.util.Date;

/**
 * @author KimYuan
 * @version V1.0
 * @date 2022-07-11
 */
public class TestDirective extends Directive {
    @Override
    public void exec(Env env, Scope scope, Writer writer) {
        try {
            writer.write("test...");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
