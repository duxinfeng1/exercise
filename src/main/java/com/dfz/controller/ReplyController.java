package com.dfz.controller;

import com.dfz.service.ReplyService;
import com.dfz.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(produces = "这是Java编写的接口文档",value = "接口文档")
@RestController
@CrossOrigin
public class ReplyController {

    @Autowired
    private ReplyService replyService;

    @ApiOperation(notes = "需要指定的动态id--thId",tags = {"名次"},value = "指定动态下回复的内容")
    @PostMapping("/findAllReplyByTrId.do")
    public ResultVo findAllReplyByTrId(Integer trId){
       return replyService.findAllReplyByTrId(trId);
    }
}
