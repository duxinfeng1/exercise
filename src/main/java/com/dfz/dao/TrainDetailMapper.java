package com.dfz.dao;

import com.dfz.entity.TrainDetail;

public interface TrainDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TrainDetail record);

    int insertSelective(TrainDetail record);

    TrainDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TrainDetail record);

    int updateByPrimaryKey(TrainDetail record);
}