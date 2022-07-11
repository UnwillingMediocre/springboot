package com.stodger.springboot.template.beetl.controller;

import cn.hutool.core.util.ObjectUtil;
import com.stodger.springboot.template.beetl.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @author KimYuan
 * @version V1.0
 * @date 2022-07-11
 */

@Controller
@Slf4j
public class IndexController {

    @GetMapping(value = {"", "/"})
    public ModelAndView Index(HttpServletRequest request){

        ModelAndView modelAndView = new ModelAndView();

        User user = (User)request.getSession().getAttribute("user");

        if(ObjectUtil.isNull(user)) {
            modelAndView.setViewName("redirect:/sys/user/login");
        }else {
            modelAndView.setViewName("page/index.btl");
            modelAndView.addObject(user);
        }

        return modelAndView;

    }
}
