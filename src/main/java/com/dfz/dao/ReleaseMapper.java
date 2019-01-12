package com.dfz.dao;

import com.dfz.entity.Release;
import com.dfz.vo.ReleaseAndUserVo;
import org.omg.PortableInterceptor.INACTIVE;

import java.util.List;
import java.util.Map;

public interface ReleaseMapper {
    int deleteByPrimaryKey(Integer trId);

    int insert(Release record);

    int insertSelective(Release record);

    Release selectByPrimaryKey(Integer trId);

    int updateByPrimaryKeySelective(Release record);

    int updateByPrimaryKey(Release record);

    List<ReleaseAndUserVo> findReleasesByThIdAndPraise(Integer thId);

    //通过话题id来查找动态
    List<ReleaseAndUserVo> findReleasesByThId(Integer thId);

    //查找回复数量
    int findReplyCount(Integer grId);

    List<ReleaseAndUserVo> findReleasesInRelease();

    int findAllCount();

    List<ReleaseAndUserVo> findReleasesByMyFollow(List<Integer> dIdList);
}