package com.dfz.dao;

import com.dfz.entity.Trainuser;

public interface TrainuserMapper {
    int deleteByPrimaryKey(Integer tuId);

    int insert(Trainuser record);

    int insertSelective(Trainuser record);

    Trainuser selectByPrimaryKey(Integer tuId);

    int updateByPrimaryKeySelective(Trainuser record);

    int updateByPrimaryKey(Trainuser record);
}