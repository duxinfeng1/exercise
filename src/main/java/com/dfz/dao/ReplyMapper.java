package com.dfz.dao;

import com.dfz.entity.Reply;

public interface ReplyMapper {
    int deleteByPrimaryKey(Integer reId);

    int insert(Reply record);

    int insertSelective(Reply record);

    Reply selectByPrimaryKey(Integer reId);

    int updateByPrimaryKeySelective(Reply record);

    int updateByPrimaryKey(Reply record);
}