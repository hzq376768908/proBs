package com.pro.bs.area.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HelloController {

    @RequestMapping(value = "/test.do",method = RequestMethod.GET)
    public String testHello(Model model){
        model.addAttribute("message","hello");
        return "login";
    }
}
