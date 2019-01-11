package com.dfz.dao;

import com.dfz.entity.Images;

import java.util.List;

public interface ImagesMapper {
    int deleteByPrimaryKey(Integer tiId);

    int insert(Images record);

    int insertSelective(Images record);

    Images selectByPrimaryKey(Integer tiId);

    int updateByPrimaryKeySelective(Images record);

    int updateByPrimaryKey(Images record);

    List<Images> selectImagesByTrId(Integer trId);
}