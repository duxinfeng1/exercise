package com.dfz.dao;

import com.dfz.entity.MyVideo;

public interface MyVideoMapper {
    int deleteByPrimaryKey(Integer myId);

    int insert(MyVideo record);

    int insertSelective(MyVideo record);

    MyVideo selectByPrimaryKey(Integer myId);

    int updateByPrimaryKeySelective(MyVideo record);

    int updateByPrimaryKey(MyVideo record);
}