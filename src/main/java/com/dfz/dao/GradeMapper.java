package com.dfz.dao;

import com.dfz.entity.Grade;

import java.util.List;

public interface GradeMapper {
    int deleteByPrimaryKey(Integer gradeId);

    int insert(Grade record);

    int insertSelective(Grade record);

    Grade selectByPrimaryKey(Integer gradeId);

    int updateByPrimaryKeySelective(Grade record);

    int updateByPrimaryKey(Grade record);

    List<Grade> selectAll();

    List<Grade> selectByGradeId();

    //运动服饰
    List<Grade> selectOne();
    //运动装备
    List<Grade> selectTwo();
    //健康食品
    List<Grade> selectThree();
}