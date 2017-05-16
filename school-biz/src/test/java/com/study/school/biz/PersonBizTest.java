package com.study.school.biz;

import com.study.school.dao.mapper.PersonMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Description:
 * Created By LuoHuaSen in 2017/5/16 19:01
 */

public class PersonBizTest extends BaseTest{
   /* @Autowired
    private PersonBo personBo;*/

    @Autowired
    private PersonMapper personMapper;

    @Test
    public void test(){
       // Assert.assertTrue(personBo.count() > 0);
    }
}
