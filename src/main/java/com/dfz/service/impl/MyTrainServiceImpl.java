package com.dfz.service.impl;

import com.dfz.dao.MyTrainMapper;
import com.dfz.entity.MyTrain;
import com.dfz.service.MyTrainService;
import com.dfz.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MyTrainServiceImpl implements MyTrainService {
    @Autowired
    private MyTrainMapper trainDao;
    @Override
    public ResultVo findMyTrainById(Integer id) {
        List<MyTrain> list = trainDao.findMyTrainById(id);
        return ResultVo.setOK(list);
    }
}
