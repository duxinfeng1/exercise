package com.dfz.controller;

import com.dfz.service.ICartService;
import com.dfz.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@Api(produces = "这是Java编写的接口文档",value = "接口文档")
public class CartController {

    @Autowired
    private ICartService cartService;


    //查询购物车中所有信息
    @GetMapping("/cartall.do")
    @ApiOperation(notes = "实现传递参数，响应指定数量的数据",tags = {"商品"},value = "购物车所有订单信息接口")
    public ResultVo findAll(Integer uId){
        ResultVo vo = cartService.findAll(uId);
        return vo;
    }

    @GetMapping("/cartadd.do")
    @ApiOperation(notes = "实现传递参数，响应指定数量的数据",tags = {"商品"},value = "加入购物车接口接口")
    public ResultVo cartAdd(Integer gId, String gName, Float gPrice, Integer gNum, String sSize,Integer uId,String gImg){
        ResultVo vo = cartService.addCart(gId,gName,gPrice,gNum,sSize,uId,gImg);
        return vo;
    }

}
