package com.dfz.dao;

import com.dfz.entity.Reply;
import com.dfz.vo.ReReplyVo;
import com.dfz.vo.ReplyVo;

import java.util.List;

public interface ReplyMapper {
    int deleteByPrimaryKey(Integer reId);

    int insert(Reply record);

    int insertSelective(Reply record);

    Reply selectByPrimaryKey(Integer reId);

    int updateByPrimaryKeySelective(Reply record);

    int updateByPrimaryKey(Reply record);

    List<ReplyVo> findMainReply(Integer trId);

    List<ReReplyVo> findReReply(Integer reId);
}