package com.dfz.controller;

import com.dfz.service.HottopicService;
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
    public class HottopicController {

        @Autowired
        private HottopicService hottopicService;
        //所有热议话题
        @ApiOperation(notes = "直接调用，无需参数",tags = {"名次"},value = "查找当前所有热议话题")
        @PostMapping("/findAllHottopics.do")
        public ResultVo findAllHottopics() {
          return hottopicService.findAllHottopics();
        }

        @ApiOperation(notes = "无需参数，内部处理",tags = {"名次"},value = "查找当前精选热议话题")
        @PostMapping("/findHotHottopics.do")
        public ResultVo findHotHottopics() {
            return hottopicService.findHotHottopics();
        }

        @ApiOperation(notes = "返回的是整个页面数据",tags = {"名次"},value = "查找指定热议话题id下的页面的所有信息")
        @PostMapping("/findAllMessageByThId.do")
        public ResultVo findAllMessageByThId(Integer uId, Integer thId) {
            return hottopicService.findAllMessageByThId(uId,thId);
        }

    }


