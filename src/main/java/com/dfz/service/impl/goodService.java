package com.dfz.service.impl;

import com.dfz.dao.GoodsMapper;
import com.dfz.service.IGoodsService;
import com.dfz.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class goodService implements IGoodsService {


    @Autowired
    private GoodsMapper goodsDao;

    //二级商品信息
    @Override
    public ResultVo findByGradeId(int gradeId) {
        return ResultVo.setOK(goodsDao.findByGradeId(gradeId));
    }

    //通过商品id查询出商品详情
    @Override
    public ResultVo findByGoodsId(int goodsId) {
        return ResultVo.setOK(goodsDao.findByGoodsId(goodsId));
    }
}
