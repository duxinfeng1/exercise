package com.dfz.controller;

import com.dfz.service.MyVideoService;
import com.dfz.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(produces = "这是Java编写的接口文档",value = "接口文档")
@RestController
@CrossOrigin
public class MyVideoController {
    @Autowired
    private MyVideoService videoService;

    @ApiOperation(notes = "实现传递参数，响应指定数量的数据",tags = {"训练"},value = "训练二级菜单接口")
    @GetMapping("/findByParent.do")
    public ResultVo findByParent(String parent){
        return videoService.findByParent(parent);
    }

    @ApiOperation(notes = "实现传递参数，响应指定数量的数据",tags = {"训练"},value = "训练列表展示接口")
    @GetMapping("/findBySort.do")
    public ResultVo findBySort(String trainSort){
        return videoService.findBySort(trainSort);
    }

    @ApiOperation(notes = "实现传递参数，响应指定数量的数据",tags = {"训练"},value = "视频详情视频列表接口")
    @GetMapping("/findVideoByProject")
    public  ResultVo findVideoByProject(String project){
        return videoService.findVideoByProect(project);
    }


    @ApiOperation(notes = "实现传递参数，响应指定数量的数据",tags = {"我的"},value = "查询登录用户的视频训练列表")
    @GetMapping("/findVideoTrainById")
    public  ResultVo findVideoTrainById(Integer id){
        return videoService.findVideoTrainById(id);
    }
}
