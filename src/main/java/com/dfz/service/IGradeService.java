package com.dfz.service;

import com.dfz.vo.ResultVo;


public interface IGradeService {

    //商品分类查询
    ResultVo findAll();

    //运动服饰
    ResultVo findOne();

    //运动装备
    ResultVo findTwo();

    //健康食品
    ResultVo findThree();

}
