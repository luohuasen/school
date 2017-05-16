package com.study.school.dao.mapper;

import com.study.school.dao.model.Squad;
import com.study.school.dao.model.SquadExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SquadMapper {
    int countByExample(SquadExample example);

    int deleteByExample(SquadExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Squad record);

    int insertSelective(Squad record);

    List<Squad> selectByExample(SquadExample example);

    Squad selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Squad record, @Param("example") SquadExample example);

    int updateByExample(@Param("record") Squad record, @Param("example") SquadExample example);

    int updateByPrimaryKeySelective(Squad record);

    int updateByPrimaryKey(Squad record);
}