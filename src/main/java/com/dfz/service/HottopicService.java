package com.dfz.service;

import com.dfz.vo.ResultVo;

public interface HottopicService {

    ResultVo findAllHottopics();

    ResultVo findHotHottopics();

    ResultVo findAllMessageByThId(Integer thId);

    ResultVo findAllUserByThId(Integer thId);
}
