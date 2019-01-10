package com.dfz.dao;

import com.dfz.entity.Release;
import com.dfz.vo.ReleaseAndUserVo;

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

    List<ReleaseAndUserVo> findReleasesByThIdAndTrId(Integer thId);

}