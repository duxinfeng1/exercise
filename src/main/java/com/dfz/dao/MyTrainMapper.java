package com.dfz.dao;

import com.dfz.entity.MyTrain;

import java.util.List;

public interface MyTrainMapper {
    int deleteByPrimaryKey(Integer mtId);

    int insert(MyTrain record);

    int insertSelective(MyTrain record);

    MyTrain selectByPrimaryKey(Integer mtId);

    int updateByPrimaryKeySelective(MyTrain record);

    int updateByPrimaryKey(MyTrain record);

    List<MyTrain> findMyTrainById(Integer id);

}