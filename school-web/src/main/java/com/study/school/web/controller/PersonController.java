package com.study.school.web.controller;

import com.study.school.biz.PersonBo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by luohuasen on 2017/5/13.
 */
@Controller
@RequestMapping("/person")
public class PersonController{
    @Autowired
    private PersonBo personBo;

    @RequestMapping("/count")
    @ResponseBody
    public String count(){
        System.out.println(personBo.count());
        return personBo.count()>0 ? "success" : "false";
    }
}
