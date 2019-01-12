package com.dfz.dao;

import com.dfz.entity.UserDetail;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

public interface UserDetailMapper {
    int deleteByPrimaryKey(Integer dId);

    int insert(UserDetail record);

    int insertSelective(UserDetail record);

    UserDetail findBydId(Integer dId);

    int updateByPrimaryKeySelective(UserDetail record);

    int updateByPrimaryKey(UserDetail record);

    UserDetail findDIdByUId(Integer uId);
}