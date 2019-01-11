package com.dfz.service.impl;

import com.dfz.dao.MyVideoMapper;
import com.dfz.entity.MyVideo;
import com.dfz.entity.Video;
import com.dfz.service.MyVideoService;
import com.dfz.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyVideoServiceImpl implements MyVideoService {
    @Autowired
    private MyVideoMapper myVideoDao;
    @Override
    public ResultVo findByParent(String parent) {
        List<MyVideo> list = myVideoDao.findByParent(parent);
        return ResultVo.setOK(list);
    }

    @Override
    public ResultVo findBySort(String sort) {
        List<MyVideo> list = myVideoDao.findBySort(sort);
        return ResultVo.setOK(list);
    }


    @Override
    public ResultVo findVideoTrainById(Integer id) {
        List<MyVideo> list= myVideoDao.findVideoTrainById(id);
        return ResultVo.setOK(list);
    }
}
