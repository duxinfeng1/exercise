package com.dfz.dao;

import com.dfz.entity.Hottopic;

public interface HottopicMapper {
    int deleteByPrimaryKey(Integer thId);

    int insert(Hottopic record);

    int insertSelective(Hottopic record);

    Hottopic selectByPrimaryKey(Integer thId);

    int updateByPrimaryKeySelective(Hottopic record);

    int updateByPrimaryKey(Hottopic record);
}