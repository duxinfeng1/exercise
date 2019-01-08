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

    @ApiOperation(notes = "实现传递参数，响应指定数量的数据",tags = {"数量","名次"},value = "获取名次接口")
    @GetMapping("/grade.do")
    public ResultVo findAll() {
        ResultVo vo = gradeS.findAll();
        return vo;
    }
}
