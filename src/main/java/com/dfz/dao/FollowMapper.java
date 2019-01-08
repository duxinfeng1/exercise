package com.dfz.dao;

import com.dfz.entity.Follow;

public interface FollowMapper {
    int deleteByPrimaryKey(Integer tfId);

    int insert(Follow record);

    int insertSelective(Follow record);

    Follow selectByPrimaryKey(Integer tfId);

    int updateByPrimaryKeySelective(Follow record);

    int updateByPrimaryKey(Follow record);
}