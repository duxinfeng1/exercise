package com.dfz.service.impl;

import com.dfz.dao.UserMapper;
import com.dfz.entity.User;
import com.dfz.service.UserService;
import com.dfz.vo.EncryptUtil;
import com.dfz.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userdao;
    @Override
    public ResultVo login(String username,String password) {
        User user1 = userdao.findByPhone(username);
        if(user1!=null){
            if(Objects.equals(user1.getuPassword(), EncryptUtil.md5Enc(password))){
                return  ResultVo.setOK(user1);
            }else{
                return ResultVo.setERROR("密码错误");
            }
        }else{
            User user2 = userdao.findByEail(username);
            if(user2!=null){
                if(Objects.equals(user2.getuPassword(), EncryptUtil.md5Enc(password))){
                    return  ResultVo.setOK(user2);
                }else{
                    return ResultVo.setERROR("密码错误");
                }
            }else{
                return ResultVo.setERROR("用户名不存在");
            }
        }
    }
}
