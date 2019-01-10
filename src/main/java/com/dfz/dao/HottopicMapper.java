package com.dfz.dao;

import com.dfz.entity.Hottopic;
import com.dfz.entity.UserDetail;
import com.dfz.vo.UserDetailVo;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface HottopicMapper {
    int deleteByPrimaryKey(Integer thId);

    int insert(Hottopic record);

    int insertSelective(Hottopic record);

    Hottopic selectByPrimaryKey(Integer thId);

    int updateByPrimaryKeySelective(Hottopic record);

    int updateByPrimaryKey(Hottopic record);

    List<Hottopic> findAllHottopics();

    int findTheNumberOfReleaseByThId(Integer thId);

    List<UserDetailVo> findAllUserByThId(Integer thId);

    List<UserDetailVo> findAllUserByPage(Integer thId);

    int findUserNumberByThId(Integer thId);

    Hottopic findHottopicByThId(Integer thId);



}