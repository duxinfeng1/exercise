package com.dfz.dao;

import com.dfz.entity.User;

import java.util.Map;

public interface UserMapper {
    int deleteByPrimaryKey(Integer uId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer uId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    //通过电话查找
    User findByPhone(String phone);
    //通过邮箱查找
    User findByEail(String email);

    //通过手机注册
    void insertPhone(Map<String, Object> map);

    //通过邮箱注册
    void insertEmail(Map<String, Object> map);

}
