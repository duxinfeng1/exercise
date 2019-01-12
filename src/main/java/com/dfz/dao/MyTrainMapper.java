package com.dfz.dao;

import com.dfz.entity.MyTrain;
import com.dfz.vo.TrainVo;

import java.util.List;
import java.util.Map;

public interface MyTrainMapper {
    int deleteByPrimaryKey(Integer mtId);

    int insert(MyTrain record);

    int insertSelective(MyTrain record);

    MyTrain selectByPrimaryKey(Integer mtId);

    int updateByPrimaryKeySelective(MyTrain record);

    int updateByPrimaryKey(MyTrain record);

    //查询当前用户添加的训练列表
    List<MyTrain> findMyTrainById(Integer id);
    //根据条件查询训练
    List<TrainVo> findByCondition(Map<String,Object> infos);
}