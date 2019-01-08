package com.dfz.dao;

import com.dfz.entity.Mytrain;

public interface MytrainMapper {
    int deleteByPrimaryKey(Integer mtId);

    int insert(Mytrain record);

    int insertSelective(Mytrain record);

    Mytrain selectByPrimaryKey(Integer mtId);

    int updateByPrimaryKeySelective(Mytrain record);

    int updateByPrimaryKey(Mytrain record);
}