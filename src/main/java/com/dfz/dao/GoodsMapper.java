package com.dfz.dao;

import com.dfz.entity.Goods;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface GoodsMapper {
    int deleteByPrimaryKey(Integer gId);

    int insert(Goods record);

    int insertSelective(Goods record);

    Goods selectByPrimaryKey(Integer gId);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);

    List<Goods> findByGradeId(int gradeId);

    List<Goods> findByGoodsId(int goodsId);

}