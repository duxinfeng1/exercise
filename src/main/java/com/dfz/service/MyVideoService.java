package com.dfz.service;

import com.dfz.vo.ResultVo;

public interface MyVideoService {
    ResultVo findByParent(String parent);

    ResultVo findBySort(String sort);



    ResultVo findVideoTrainById(Integer id);
}
