package com.dfz.dao;

import com.dfz.entity.Cart;

import java.util.List;

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



}