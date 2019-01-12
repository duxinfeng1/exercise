package com.dfz.controller;

import com.dfz.service.ReleaseService;
import com.dfz.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(produces = "这是Java编写的接口文档",value = "动态模块接口文档")
@RestController
@CrossOrigin
public class ReleaseController {
    @Autowired
    private ReleaseService releaseService;

    @ApiOperation(notes = "需要token中的用户id -- uId,热议话题的id--thId",tags = {"名次"},value = "指定热议话题id下的所有动态")
    @PostMapping("/findReleasesByThId.do")
    public ResultVo findReleasesByThId(Integer uId,Integer thId) {
        return releaseService.findAllReleaseByThId(uId,thId);
    }

    @ApiOperation(notes = "需要token中的用户id -- uId",tags = {"名次"},value = "查找普通的动态")
    @PostMapping("/findReleasesInRelease.do")
    public ResultVo findReleasesInRelease(Integer uId) {
        return releaseService.findReleasesInRelease(uId);
    }

    @ApiOperation(notes = "需要token中的用户id -- uId",tags = {"名次"},value = "查找我关注的人发的动态")
    @PostMapping("/findReleasesByMyFollow.do")
    public ResultVo findReleasesByMyFollow(Integer uId) {
        return releaseService.findReleasesByMyFollow(uId);
    }
}
