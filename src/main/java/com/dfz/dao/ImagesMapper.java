package com.dfz.dao;

import com.dfz.entity.Images;

public interface ImagesMapper {
    int deleteByPrimaryKey(Integer tiId);

    int insert(Images record);

    int insertSelective(Images record);

    Images selectByPrimaryKey(Integer tiId);

    int updateByPrimaryKeySelective(Images record);

    int updateByPrimaryKey(Images record);
}