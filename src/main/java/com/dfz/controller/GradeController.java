package com.dfz.controller;

import com.dfz.service.IGradeService;
import com.dfz.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(produces = "这是Java编写的接口文档",value = "接口文档")
@RestController
@CrossOrigin
public class GradeController {

    @Autowired
    private IGradeService gradeS;

    @ApiOperation(notes = "实现传递参数，响应指定数量的数据",tags = {"商品"},value = "商品类型接口")
    @GetMapping("/grade.do")
    public ResultVo findAll() {
        ResultVo vo = gradeS.findAll();
        return vo;
    }

    @ApiOperation(notes = "实现传递参数，响应指定数量的数据",tags = {"商品"},value = "商城主页运动服饰接口")
    @GetMapping("/sportsWear.do")
    public ResultVo findOne() {
        ResultVo vo = gradeS.findOne();
        return vo;
    }

    @ApiOperation(notes = "实现传递参数，响应指定数量的数据",tags = {"商品"},value = "商城主页运动装备接口")
    @GetMapping("/equipment.do")
    public ResultVo findTwo() {
        ResultVo vo = gradeS.findTwo();
        return vo;
    }

    @ApiOperation(notes = "实现传递参数，响应指定数量的数据",tags = {"商品"},value = "商城主页健康食品接口")
    @GetMapping("/healthyFood.do")
    public ResultVo findThree() {
        ResultVo vo = gradeS.findThree();
        return vo;
    }


}
