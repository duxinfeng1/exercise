package com.dfz.service.impl;

import com.dfz.dao.GoodsMapper;
import com.dfz.dao.ImgMapper;
import com.dfz.service.IGoodsService;
import com.dfz.vo.ResultVo;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class goodService implements IGoodsService {


    @Autowired
    private GoodsMapper goodsDao;

    @Autowired
    private ImgMapper imgDao;

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

    @Override
    public ResultVo findImg(int goodsId) {
        if(imgDao.selectByGoodsId(goodsId) != null){
            return ResultVo.setOK(imgDao.selectByGoodsId(goodsId));
        }else {
            return ResultVo.setERROR("暂无该商品");
        }

    }

}
