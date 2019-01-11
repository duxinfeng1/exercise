package com.dfz.service;

import com.dfz.vo.ResultVo;

public interface ReplyService {

    ResultVo findAllReplyByTrId(Integer trId);
}
