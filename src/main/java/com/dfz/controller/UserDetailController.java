package com.dfz.controller;

import com.dfz.service.UserDetailService;
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
public class UserDetailController {
    @Autowired
    private UserDetailService userDetailService;

    @ApiOperation(notes = "实现传递参数，响应指定数量的数据",tags = {"名次"},value = "通过用户id查找用户信息")
    @PostMapping("/findUserBydId.do")
    public ResultVo findUserBydId(Integer dId) {
        return userDetailService.findUserNameBydId(dId);
    }
}
