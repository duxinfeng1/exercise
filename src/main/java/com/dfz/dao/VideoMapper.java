package com.dfz.dao;

import com.dfz.entity.Video;

public interface VideoMapper {
    int deleteByPrimaryKey(Integer tvId);

    int insert(Video record);

    int insertSelective(Video record);

    Video selectByPrimaryKey(Integer tvId);

    int updateByPrimaryKeySelective(Video record);

    int updateByPrimaryKey(Video record);
}