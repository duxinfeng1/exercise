package com.dfz.dao;

import com.dfz.entity.Video;

import java.util.List;

public interface VideoMapper {
    int deleteByPrimaryKey(Integer tvId);

    int insert(Video record);

    int insertSelective(Video record);

    Video selectByPrimaryKey(Integer tvId);

    int updateByPrimaryKeySelective(Video record);

    int updateByPrimaryKey(Video record);
    //查找每个课程的所有视频
    List<Video> findVideoByProject(String project);
}