package com.dfz.controller;

import com.dfz.service.UserService;
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
public class UserController {
    @Autowired
    private UserService service;

    //登录
    @ApiOperation(notes = "实现传递参数，响应指定数量的数据",tags = {"用户"},value = "登录接口")
    @PostMapping("/login.do")
    public ResultVo login(String username, String password) {
        ResultVo ret = service.login(username, password);
//        if (ret.getCode() == 0) {
//            Subject subject = SecurityUtils.getSubject();
//            UsernamePasswordToken token = new UsernamePasswordToken(username, password);
//            subject.getSession().setAttribute("admin", ret.getData());
//            subject.login(token);
//            ret.setData(token);
//        }
        return ret;
    }
}
