package com.dfz.controller;

import com.dfz.service.ReleaseService;
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
public class ReleaseController {
    @Autowired
    private ReleaseService releaseService;

    @ApiOperation(notes = "实现传递参数，响应指定数量的数据",tags = {"名次"},value = "商品名称价格接口")
    @PostMapping("/findAllReleaseByThId.do")
    public ResultVo findAllReleaseByThId(Integer thId) {
        return releaseService.findAllReleaseByThId(thId);
    }
}
