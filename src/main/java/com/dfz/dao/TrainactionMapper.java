package com.dfz.dao;

import com.dfz.entity.Trainaction;

public interface TrainactionMapper {
    int deleteByPrimaryKey(Integer tAId);

    int insert(Trainaction record);

    int insertSelective(Trainaction record);

    Trainaction selectByPrimaryKey(Integer tAId);

    int updateByPrimaryKeySelective(Trainaction record);

    int updateByPrimaryKey(Trainaction record);
}