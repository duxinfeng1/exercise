package com.dfz.controller;

import com.dfz.service.MyTrainService;
import com.dfz.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Api(produces = "这是Java编写的接口文档",value = "接口文档")
@RestController
@CrossOrigin
public class MyTrainController {
    @Autowired
    private MyTrainService trainService;

    @ApiOperation(notes = "实现传递参数，响应指定数量的数据",tags = {"我的"},value = "查询登录用户的训练列表")
    @GetMapping("/findMyTrainById.do")
    public  ResultVo findMyTrainById(Integer id){
        return trainService.findMyTrainById(id);
    }

    @ApiOperation(notes = "实现传递参数，响应指定数量的数据",tags = {"我的"},value = "自由训练根据条件查询")
    @GetMapping("/findByCondition.do")
    public ResultVo findByCondition(String taPart,Integer mtTimes,String mtHard){
        Map<String,Object> map = new HashMap<>();
        if(taPart!=null&&taPart!=""){
            map.put("taPart",taPart);
        }
        if(mtTimes!=null){
            map.put("mtTimes",mtTimes);
        }
        if(mtHard!=null&&mtHard!=""){
            map.put("mtHard",mtHard);
        }
        return trainService.findByCondition(map);
    }
}
