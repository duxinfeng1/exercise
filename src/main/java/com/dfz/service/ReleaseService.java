package com.dfz.service;

import com.dfz.vo.ResultVo;

public interface ReleaseService  {

    ResultVo findAllReleaseByThId(Integer uId,Integer thId);

    ResultVo findReleasesInRelease(Integer uId);

    ResultVo findReleasesByMyFollow(Integer uId);

}
