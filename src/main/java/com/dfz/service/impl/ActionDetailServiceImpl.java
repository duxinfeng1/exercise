package com.dfz.service.impl;

import com.dfz.dao.ActionDetailMapper;
import com.dfz.entity.ActionDetail;
import com.dfz.service.ActionDetailService;
import com.dfz.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActionDetailServiceImpl implements ActionDetailService {
    @Autowired
    private ActionDetailMapper actionDetailDao;

    @Override
    public ResultVo findActionDetailByName(String name) {
        List<ActionDetail> list = actionDetailDao.findActionDetailByName(name);
        return ResultVo.setOK(list);
    }
}
