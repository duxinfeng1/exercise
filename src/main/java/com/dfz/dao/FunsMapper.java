package com.dfz.dao;

import com.dfz.entity.Funs;

import java.util.Map;

public interface FunsMapper {
    int deleteByPrimaryKey(Integer tfId);

    int insert(Funs record);

    int insertSelective(Funs record);

    Funs selectByPrimaryKey(Integer tfId);

    int updateByPrimaryKeySelective(Funs record);

    int updateByPrimaryKey(Funs record);

    int updateFlag(Funs funs);

    int addFun(Funs funs);

    Funs findfunByTwoId(Map<String, Integer> map);

    Funs findfunById(Map<String, Integer> map);

    }