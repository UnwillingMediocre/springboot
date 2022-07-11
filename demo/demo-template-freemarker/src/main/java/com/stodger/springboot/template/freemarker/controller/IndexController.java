package com.stodger.springboot.template.freemarker.controller;

import cn.hutool.core.util.ObjectUtil;
import com.stodger.springboot.template.freemarker.model.Product;
import com.stodger.springboot.template.freemarker.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author KimYuan
 * @version V1.0
 * @date 2022-07-10
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
            List<Product> productList = new ArrayList<>();
            productList.add(new Product("P1", "苹果"));
            productList.add(new Product("P2", "香蕉"));
            productList.add(new Product("P3", "西瓜"));
            productList.add(new Product("P4", "葡萄"));


            modelAndView.addObject("productList", productList);
            modelAndView.addObject("date", new Date());

            modelAndView.setViewName("page/index");
            modelAndView.addObject(user);
        }

        return modelAndView;

    }
}
