package com.dfz.dao;

import com.dfz.entity.GoodsSize;

public interface GoodsSizeMapper {
    int deleteByPrimaryKey(Integer gsId);

    int insert(GoodsSize record);

    int insertSelective(GoodsSize record);

    GoodsSize selectByPrimaryKey(Integer gsId);

    int updateByPrimaryKeySelective(GoodsSize record);

    int updateByPrimaryKey(GoodsSize record);
}