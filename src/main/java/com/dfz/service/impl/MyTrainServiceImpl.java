package com.dfz.service.impl;

import com.dfz.dao.MyTrainMapper;
import com.dfz.entity.MyTrain;
import com.dfz.service.MyTrainService;
import com.dfz.vo.ResultVo;
import com.dfz.vo.TrainVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
public class MyTrainServiceImpl implements MyTrainService {
    @Autowired
    private MyTrainMapper myTrainDao;

    @Override
    public ResultVo findMyTrainById(Integer id) {
        List<MyTrain> list = myTrainDao.findMyTrainById(id);
        return ResultVo.setOK(list);
    }

    @Override
    public ResultVo findByCondition(Map<String, Object> infos) {
        List<TrainVo> list = myTrainDao.findByCondition(infos);
        return ResultVo.setOK(list);
    }
}
