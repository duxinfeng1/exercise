package com.dfz.service;

import com.dfz.vo.ResultVo;

public interface IGoodsService {

    //通过商品类型查询商品
    ResultVo findByGradeId(int gradeId);

    //根据商品id查询商品详情
    ResultVo findByGoodsId(int goodsId);

    //通过商品id查询商品图片
    ResultVo findImg(int goodsId);

}
