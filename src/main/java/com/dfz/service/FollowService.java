package com.dfz.service;

import com.dfz.vo.ResultVo;

public interface FollowService {

    ResultVo addFollow(Integer uId,Integer dId);

    ResultVo updateFlag(Integer uId,Integer dId);
}
