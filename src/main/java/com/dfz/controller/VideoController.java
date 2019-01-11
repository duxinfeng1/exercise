package com.dfz.controller;

import com.dfz.service.VideoService;
import com.dfz.vo.ResultVo;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class VideoController {
    @Autowired
    private VideoService videoService;

    @ApiOperation(notes = "实现传递参数，响应指定数量的数据",tags = {"训练"},value = "视频详情中视频列表接口")
    @GetMapping("/findVideoByProject.do")
    public  ResultVo findVideoByProject(String project){
        return videoService.findVideoByProject(project);
    }

}
