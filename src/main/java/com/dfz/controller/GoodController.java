package com.dfz.controller;

import com.dfz.service.IGoodsService;
import com.dfz.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(produces = "这是Java编写的接口文档",value = "接口文档")
@RestController
@CrossOrigin
public class GoodController {

    @Autowired
    private IGoodsService goodsService;
    //通过商品类型id查找商品
    @ApiOperation(notes = "实现传递参数，响应指定数量的数据",tags = {"名次"},value = "商品名称价格接口")
    @PostMapping("/goods.do")
    public ResultVo findByGradeId(Integer gradeId) {
        ResultVo vo = goodsService.findByGradeId(gradeId);
        return vo;
    }

    //通过商品id查询出来商品详情
    @ApiOperation(notes = "实现传递参数，响应指定数量的数据",tags = {"名次"},value = "商品详情接口")
    @PostMapping("/goodsDetail.do")
    public ResultVo findByGoodsId(Integer goodsId) {
        ResultVo vo = goodsService.findByGoodsId(goodsId);
        return vo;
    }
}
