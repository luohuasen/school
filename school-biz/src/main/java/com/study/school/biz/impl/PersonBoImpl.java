package com.study.school.biz.impl;
import com.study.school.biz.PersonBo;
import com.study.school.dao.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.io.OutputStream;

/**
 * Description:
 * Created By LuoHuaSen in 2017/5/16 16:01
 */
@Service
public class PersonBoImpl implements PersonBo {
    @Autowired
    private PersonMapper personMapper;

    @Override
    public int count() {
        return personMapper.count();
    }

    @Override
    public void export(OutputStream os) {

    }
}
