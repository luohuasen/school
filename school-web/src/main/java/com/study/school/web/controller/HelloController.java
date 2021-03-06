package com.study.school.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by luohuasen on 2017/5/13.
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    private final static String title = "hello";

    @RequestMapping("/say")
    @ResponseBody
    public String say(String name){
        System.out.println("成功获取");
        return title + name;
    }
}
