package com.dfz.dao;

import com.dfz.entity.Follow;
import com.dfz.entity.Funs;

import java.util.List;
import java.util.Map;

public interface FollowMapper {
    int deleteByPrimaryKey(Integer tfId);

    int insert(Follow record);

    int insertSelective(Follow record);

    Follow selectByPrimaryKey(Integer tfId);

    int updateByPrimaryKeySelective(Follow record);

    int updateByPrimaryKey(Follow record);

    //通过登录用户ID与其他用户ID两个参数来判断是否已关注
    Follow findfollowByTwoId(Map<String,Integer> map);

    List<Integer> findtfDIdByDId(Integer dId);

    int updateFlag(Follow follow);

    int addFollow(Follow follow);

    Follow findfollowById(Map<String,Integer> map);
}