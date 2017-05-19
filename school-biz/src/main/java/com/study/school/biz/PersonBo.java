package com.study.school.biz;

import java.io.IOException;
import java.io.OutputStream;

/**
 * Description:
 * Created By LuoHuaSen in 2017/5/16 15:58
 */
public interface PersonBo {
    int count();

    void export(OutputStream os) throws IOException;
}
