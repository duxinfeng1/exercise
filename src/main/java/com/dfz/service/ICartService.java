package com.dfz.service;

import com.dfz.vo.ResultVo;

public interface ICartService {

    //查询购物车中所有订单
    ResultVo findAll(Integer uId);

    //添加购物车g_id, g_name, g_price,g_num, s_size,g_img
    ResultVo addCart(Integer gId, String gName, Float gPrice, Integer gNum, String sSize,Integer uId, String gImg);
}
