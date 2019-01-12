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

    //查找当前所有热议话题+每个热议话题中的参与人数
    List<Hottopic> findAllHottopics();

    //查找指定热议话题id下的动态数量+每个热议话题中的参与人数
    int findTheNumberOfReleaseByThId(Integer thId);

    //查找指定热议话题id下的用户信息列表
    List<UserDetailVo> findAllUserByThId(Integer thId);

    //查找指定热议话题id下的四条用户信息
    List<UserDetailVo> findAllUserByPage(Integer thId);

    //查找参与该热议话题id下的用户的数量
    int findUserNumberByThId(Integer thId);

    //查找指定热议话题的信息
    Hottopic findHottopicByThId(Integer thId);



}