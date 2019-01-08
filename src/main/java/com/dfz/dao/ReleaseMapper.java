package com.dfz.dao;

import com.dfz.entity.Release;

public interface ReleaseMapper {
    int deleteByPrimaryKey(Integer trId);

    int insert(Release record);

    int insertSelective(Release record);

    Release selectByPrimaryKey(Integer trId);

    int updateByPrimaryKeySelective(Release record);

    int updateByPrimaryKey(Release record);
}