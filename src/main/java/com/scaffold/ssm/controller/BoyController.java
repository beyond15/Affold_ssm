package com.scaffold.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by xiaohu.zheng on 2018/9/29.
 */
@Controller
public class BoyController {

    @RequestMapping(value = "/boy")
    public String index(){
        return "hello2";
    }


    @RequestMapping(value = "/hello/{data}")
    public String index1(@PathVariable("data") String mydata, Model model){
        model.addAttribute("data", mydata);
        return "hello3";
    }
}
