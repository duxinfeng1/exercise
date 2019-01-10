package com.dfz.controller;

import com.dfz.config.MailUtil;
import com.dfz.config.QcloudSms;
import com.dfz.consts.SystemConst;
import com.dfz.service.UserService;
import com.dfz.vo.PhoneUtil;
import com.dfz.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


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

        return ret;
    }

    @ApiOperation(notes = "实现传递参数，响应指定数量的数据",tags = {"用户"},value = "注册接口")
    @PostMapping("/register.do")
    public ResultVo register(String username,String code, String password){
        try {
            if( code.equals((String)SystemConst.map.get("code2"))){
                service.register(username,password);
            }
            return ResultVo.setOK(null);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultVo.setERROR("验证失败");
        }
    }

    @ApiOperation(notes = "实现传递参数，响应指定数量的数据",tags = {"用户"},value = "获取验证码接口")
    @GetMapping("/code.do")
    public ResultVo code(String username){
        if(PhoneUtil.isPhone(username)) {
            String code1 = QcloudSms.getCode();//获取随机验证码
            SystemConst.map.put("code2",code1);
            try {
                //调用接口方法，发送短信到手机 --phone接收短信的手机号码
                QcloudSms.sendCode(username, code1);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else {
            String code1 = QcloudSms.getCode();//获取随机验证码
            SystemConst.map.put("code2",code1);
            try {
                //调用接口方法，发送短信到手机 --phone接收短信的手机号码
                MailUtil.sendEmail(username,code1);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return ResultVo.setOK(null);
    }

}
