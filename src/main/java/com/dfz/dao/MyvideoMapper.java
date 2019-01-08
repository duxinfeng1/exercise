package com.dfz.dao;

import com.dfz.entity.Myvideo;

public interface MyvideoMapper {
    int deleteByPrimaryKey(Integer myId);

    int insert(Myvideo record);

    int insertSelective(Myvideo record);

    Myvideo selectByPrimaryKey(Integer myId);

    int updateByPrimaryKeySelective(Myvideo record);

    int updateByPrimaryKey(Myvideo record);
}