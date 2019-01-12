package com.dfz.dao;

import com.dfz.entity.Cart;

import java.util.List;
import java.util.Map;

public interface CartMapper {
    int deleteByPrimaryKey(Integer id);
    //添加购物车
    int insert(Cart record);

    int insertSelective(Cart record);

    Cart selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cart record);

    int updateByPrimaryKey(Cart record);

    //查询购物车内所有订单信息
    List<Cart> selectAll(Integer uId);

    //查询购物车是否有相同名称的商品
    Cart selectByGNameAndUId(Map<String, Object> map);

    //更改购物车的商品数量
    void updateNum(Map<String, Object> map);
}