package com.dfz.service.impl;

import com.dfz.dao.ReleaseMapper;
import com.dfz.service.ReleaseService;
import com.dfz.vo.ReleaseAndUserVo;
import com.dfz.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReleaseServiceImpl implements ReleaseService {

    @Autowired
    private ReleaseMapper releaseMapper;


    @Override
    public ResultVo findAllReleaseByTrId(Integer thId) {
        return null;
    }
}
