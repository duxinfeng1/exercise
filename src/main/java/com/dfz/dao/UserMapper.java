package com.dfz.dao;

import com.dfz.entity.User;

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
}
