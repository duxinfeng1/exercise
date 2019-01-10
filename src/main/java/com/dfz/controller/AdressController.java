package com.dfz.controller;

import com.dfz.entity.Address;
import com.dfz.service.IAdressService;
import com.dfz.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@Api(produces = "这是Java编写的接口文档",value = "接口文档")
@RestController
@CrossOrigin
public class AdressController {

    @Autowired
    private IAdressService adService;

    //根据用户id查询地址
    @ApiOperation(notes = "实现传递参数，响应指定数量的数据",tags = {"商品"},value = "地址管理接口")
    @PostMapping("/adress.do")
    public ResultVo findByDId(Integer dId) {
        ResultVo vo = adService.findByDid(dId);
        return vo;
    }


    //根据地址id删除地址
    @ApiOperation(notes = "实现传递参数，响应指定数量的数据",tags = {"商品"},value = "地址删除接口")
    @PostMapping("/adressdelete.do")
    public ResultVo delete(Integer id) {
        ResultVo vo = adService.deleteById(id);
        return vo;
    }

    //根据地址id删除地址
    @ApiOperation(notes = "实现传递参数，响应指定数量的数据",tags = {"商品"},value = "添加地址接口")
    @PostMapping("/adressadd.do")
    public ResultVo add(Address adress) {
        ResultVo vo = adService.insertAdress(adress);
        return vo;
    }
}
