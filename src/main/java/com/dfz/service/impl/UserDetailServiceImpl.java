package com.dfz.service.impl;

import com.dfz.dao.UserDetailMapper;
import com.dfz.entity.UserDetail;
import com.dfz.service.UserDetailService;
import com.dfz.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDetailServiceImpl implements UserDetailService {

    @Autowired
    private UserDetailMapper userDetailMapper;

    @Override
    public ResultVo findUserNameBydId(Integer dId) {
        UserDetail user =userDetailMapper.findBydId(dId);
        return ResultVo.setOK(user);
    }
}
