package com.dfz.dao;

import com.dfz.entity.ActionDetail;

import java.util.List;

public interface ActionDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ActionDetail record);

    int insertSelective(ActionDetail record);

    ActionDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ActionDetail record);

    int updateByPrimaryKey(ActionDetail record);
    //查找我的训练对应的动作列表
    List<ActionDetail> findActionDetailByName(String name);
}