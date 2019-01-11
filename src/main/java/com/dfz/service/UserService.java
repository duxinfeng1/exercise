package com.dfz.service;

import com.dfz.entity.User;
import com.dfz.vo.ResultVo;

public interface UserService {
    //登录
    ResultVo login(String username,String password);

    //注册
    ResultVo register(String username, String password);

}
