package com.dfz.dao;

import com.dfz.entity.Videouser;

public interface VideouserMapper {
    int deleteByPrimaryKey(Integer tVId);

    int insert(Videouser record);

    int insertSelective(Videouser record);

    Videouser selectByPrimaryKey(Integer tVId);

    int updateByPrimaryKeySelective(Videouser record);

    int updateByPrimaryKey(Videouser record);
}