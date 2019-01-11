package com.dfz.service.impl;

import com.dfz.dao.UserMapper;
import com.dfz.entity.User;
import com.dfz.service.UserService;
import com.dfz.vo.EncryptUtil;
import com.dfz.vo.PhoneUtil;
import com.dfz.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userdao;
    @Override
    public ResultVo login(String username,String password) {
        Map<String, Object> token = new HashMap<>();
        User user1 = userdao.findByPhone(username);
        if(user1!=null){
            if(Objects.equals(user1.getuPassword(), EncryptUtil.md5Enc(password))){
                token.put("id",user1.getuId());
                token.put("username",user1.getuPhone());
                Map<String, Object> token1 = new HashMap<>();
                token1.put("token",token);
                return  ResultVo.setOK(token1);
            }else{
                return ResultVo.setERROR("密码错误");
            }
        }else{
            User user2 = userdao.findByEail(username);
            if(user2!=null){
                if(Objects.equals(user2.getuPassword(), EncryptUtil.md5Enc(password))){
                    token.put("id",user2.getuId());
                    token.put("username",user2.getuEmail());
                    Map<String, Object> token1 = new HashMap<>();
                    token1.put("token",token);
                    return  ResultVo.setOK(token1);
                }else{
                    return ResultVo.setERROR("密码错误");
                }
            }else{
                return ResultVo.setERROR("用户名不存在");
            }
        }
    }
    //注册
    @Override
    public ResultVo register(String username, String password) {
        if(PhoneUtil.isPhone(username)){
            if(userdao.findByPhone(username) == null){
                Map<String, Object> map = new HashMap<>();
                map.put("phone",username);
                map.put("password",EncryptUtil.md5Enc(password));
                userdao.insertPhone(map);
                return ResultVo.setOK(null);
            }else {
                return ResultVo.setERROR("该手机已被注册");
            }
        }else {
            if(userdao.findByEail(username) == null){
                Map<String, Object> map = new HashMap<>();
                map.put("email",username);
                map.put("password",EncryptUtil.md5Enc(password));
                userdao.insertEmail(map);
                return  ResultVo.setOK(null);
            }else {
                return ResultVo.setERROR("该邮箱已被注册");
            }
        }
    }
}
