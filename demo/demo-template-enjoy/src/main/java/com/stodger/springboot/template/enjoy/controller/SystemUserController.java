package com.stodger.springboot.template.enjoy.controller;

import com.stodger.springboot.template.enjoy.model.Product;
import com.stodger.springboot.template.enjoy.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author KimYuan
 * @version V1.0
 * @date 2022-07-11
 */
@Controller
@Slf4j
@RequestMapping("/sys/user")
public class SystemUserController {
    /**
     * 用户登录
     * @param user
     * @param request
     * @return
     */
    @PostMapping("/login")
    public ModelAndView login(User user, HttpServletRequest request) {
        log.info("进入...");
        ModelAndView mv = new ModelAndView();

        mv.addObject(user);
        mv.setViewName("redirect:/");

        request.getSession().setAttribute("user", user);
        return mv;
    }

    /**
     * 跳转登录页面
     * @return
     */
    @GetMapping("/login")
    public ModelAndView login() {
        return new ModelAndView("page/login");
    }
}
