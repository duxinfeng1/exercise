package com.dfz.controller;

import com.dfz.service.IGradeService;
import com.dfz.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class GradeController {

    @Autowired
    private IGradeService gradeS;

    @GetMapping("/grade.do")
    public ResultVo findAll() {
        ResultVo vo = gradeS.findAll();
        return vo;
    }
}
