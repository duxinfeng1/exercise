package com.dfz.service.impl;

import com.dfz.dao.VideoMapper;
import com.dfz.entity.Video;
import com.dfz.service.VideoService;
import com.dfz.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VideoServiceImpl implements VideoService {
    @Autowired
    private VideoMapper videoDao;
    @Override
    public ResultVo findVideoByProject(String project) {
        List<Video> list = videoDao.findVideoByProject(project);
        return ResultVo.setOK(list);
    }

}
