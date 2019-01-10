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
        //通过商品类型id查找商品
        @ApiOperation(notes = "实现传递参数，响应指定数量的数据",tags = {"名次"},value = "商品名称价格接口")
        @PostMapping("/findAllHottopics.do")
        public ResultVo findAllHottopics() {
          return hottopicService.findAllHottopics();
        }

        @ApiOperation(notes = "实现传递参数，响应指定数量的数据",tags = {"名次"},value = "商品名称价格接口")
        @PostMapping("/findHotHottopics.do")
        public ResultVo findHotHottopics() {
            return hottopicService.findHotHottopics();
        }

        @ApiOperation(notes = "实现传递参数，响应指定数量的数据",tags = {"名次"},value = "商品名称价格接口")
        @PostMapping("/findAllMessageByThId.do")
        public ResultVo findAllMessageByThId(Integer thId) {
            return hottopicService.findAllMessageByThId(thId);
        }

        @ApiOperation(notes = "实现传递参数，响应指定数量的数据",tags = {"名次"},value = "商品名称价格接口")
        @PostMapping("/findAllUserByThId.do")
        public ResultVo findAllUserByThId(Integer thId) {
            return hottopicService.findAllUserByThId(thId);
        }
    }


