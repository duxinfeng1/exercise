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
    private MyVideoMapper videoDao;
    @Override
    public ResultVo findByParent(String parent) {
        List<MyVideo> list = videoDao.findByParent(parent);
        return ResultVo.setOK(list);
    }

    @Override
    public ResultVo findBySort(String sort) {
        List<MyVideo> list = videoDao.findBySort(sort);
        return ResultVo.setOK(list);
    }

    @Override
    public ResultVo findVideoByProect(String project) {
        List<Video> list = videoDao.findVideoByProject(project);
        return ResultVo.setOK(list);
    }

    @Override
    public ResultVo findVideoTrainById(Integer id) {
        List<MyVideo> list= videoDao.findVideoTrainById(id);
        return ResultVo.setOK(list);
    }
}
