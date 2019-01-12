package com.dfz.controller;

import com.dfz.service.ActionDetailService;
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
public class ActionDetailController {
    @Autowired
    private ActionDetailService actionDetailService;

    @ApiOperation(notes = "实现传递参数，响应指定数量的数据",tags = {"我的"},value = "查询对应训练的动作详情列表")
    @GetMapping("/findActionDetailByName.do")
    public ResultVo findActionDetailByName(String name){
        return actionDetailService.findActionDetailByName(name);
    }
}
