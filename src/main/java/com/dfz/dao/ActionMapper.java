package com.dfz.dao;

import com.dfz.entity.Action;

public interface ActionMapper {
    int deleteByPrimaryKey(Integer taId);

    int insert(Action record);

    int insertSelective(Action record);

    Action selectByPrimaryKey(Integer taId);

    int updateByPrimaryKeySelective(Action record);

    int updateByPrimaryKey(Action record);
}