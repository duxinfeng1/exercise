package com.dfz.service.impl;

import com.dfz.dao.ReplyMapper;
import com.dfz.dao.UserDetailMapper;
import com.dfz.entity.UserDetail;
import com.dfz.service.ReplyService;
import com.dfz.vo.ReReplyVo;
import com.dfz.vo.ReplyVo;
import com.dfz.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ReplyServiceImpl implements ReplyService {

    @Autowired
    private ReplyMapper replyMapper;
    @Autowired
    private UserDetailMapper userDetailMapper;

    @Override
    public ResultVo findAllReplyByTrId(Integer trId) {
        List<ReplyVo> mainReply = replyMapper.findMainReply(trId);
        for (ReplyVo reply:mainReply) {
                reply.setReReplyVos(new ArrayList<>());
                List<ReReplyVo> reReplyVos = replyMapper.findReReply(reply.getReId());
                if (reReplyVos != null) {
                    for (ReReplyVo reReply : reReplyVos) {
                        UserDetail bydId = userDetailMapper.findBydId(reReply.getdId());
                        UserDetail bydIds = userDetailMapper.findBydId(reReply.getReUserId());
                        reReply.setdName(bydId.getdName());
                        reReply.setReUserName(bydIds.getdName());
                    }
                    reply.setReReplyVos(reReplyVos);
                }
            }

        return ResultVo.setOK(mainReply);
    }
}
