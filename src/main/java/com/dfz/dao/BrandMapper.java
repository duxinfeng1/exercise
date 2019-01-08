package com.dfz.dao;

import com.dfz.entity.Brand;

public interface BrandMapper {
    int deleteByPrimaryKey(Integer bId);

    int insert(Brand record);

    int insertSelective(Brand record);

    Brand selectByPrimaryKey(Integer bId);

    int updateByPrimaryKeySelective(Brand record);

    int updateByPrimaryKey(Brand record);
}