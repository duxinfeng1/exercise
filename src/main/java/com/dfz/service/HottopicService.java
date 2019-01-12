package com.dfz.service;

import com.dfz.vo.ResultVo;

public interface HottopicService {

    //查找当前所有热议话题
    ResultVo findAllHottopics();

    //查找当前精选的热议话题
    ResultVo findHotHottopics();

    //查找指定热议话题id下的页面的所有信息(udId为当前登录用户的ID)
    ResultVo findAllMessageByThId(Integer uId,Integer thId);

    ////查找指定热议话题id下的用户信息列表
    ResultVo findAllUserByThId(Integer thId);

}
