package com.study.school.service.impl;

import com.study.school.services.TestService;

/**
 * Description:
 * Created By LuoHuaSen in 2017/5/16 16:30
 */
public class TestServiceImpl implements TestService{
    @Override
    public void hello(String name) {
        System.out.println("hello, " + name);
    }
}
