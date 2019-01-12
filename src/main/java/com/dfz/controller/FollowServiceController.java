package com.dfz.controller;

import com.dfz.service.FollowService;
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
public class FollowServiceController {

    @Autowired
    private FollowService followService;

    @ApiOperation(notes = "直接调用，无需参数",tags = {"名次"},value = "查找当前所有热议话题")
    @PostMapping("/addFollow.do")
    public ResultVo addFollow(Integer uId,Integer dId) {
        return followService.addFollow(uId,dId);
    }

    @ApiOperation(notes = "直接调用，无需参数",tags = {"名次"},value = "查找当前所有热议话题")
    @PostMapping("/updateFlag.do")
    public ResultVo updateFlag(Integer uId,Integer dId) {
        return followService.updateFlag(uId,dId);
    }
}
