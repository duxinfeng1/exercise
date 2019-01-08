package com.dfz.service.impl;

import com.dfz.dao.GradeMapper;
import com.dfz.service.IGradeService;
import com.dfz.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class GradeService implements IGradeService{

    @Autowired
    private GradeMapper gradeDao;

    @Override
    public ResultVo findAll() {

        return ResultVo.setOK(gradeDao.selectAll());
    }
}
