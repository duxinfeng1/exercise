package com.dfz.dao;

import com.dfz.entity.Size;

public interface SizeMapper {
    int deleteByPrimaryKey(Integer sId);

    int insert(Size record);

    int insertSelective(Size record);

    Size selectByPrimaryKey(Integer sId);

    int updateByPrimaryKeySelective(Size record);

    int updateByPrimaryKey(Size record);
}