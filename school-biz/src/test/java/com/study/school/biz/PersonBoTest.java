package com.study.school.biz;

import com.study.school.dao.mapper.PersonMapper;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.*;

/**
 * Created by Seth on 2017/5/19.
 */
public class PersonBoTest extends BizTestBase{
    @Autowired
    private PersonBo personBo;

    @Autowired
    private PersonMapper personMapper;

    @Test
    public void testCount(){
        System.out.println(personBo.count());
    }

    @Test
    public void testExport() throws IOException {

    }
}
