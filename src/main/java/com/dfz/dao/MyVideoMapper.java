package com.dfz.dao;

import com.dfz.entity.MyVideo;
import com.dfz.entity.Video;

import java.util.List;

public interface MyVideoMapper {
    int deleteByPrimaryKey(Integer myId);

    int insert(MyVideo record);

    int insertSelective(MyVideo record);

    MyVideo selectByPrimaryKey(Integer myId);

    int updateByPrimaryKeySelective(MyVideo record);

    int updateByPrimaryKey(MyVideo record);
    //根据父类查找菜单列表
    List<MyVideo> findByParent(String parent);
    //根据分类菜单查找具体课程列表
    List<MyVideo> findBySort(String sort);

    //查找从视频训练中加入我的
    List<MyVideo> findVideoTrainById(Integer id);

}