package com.dfz.service;
import com.dfz.vo.ResultVo;

import java.util.Map;


public interface MyTrainService {

    ResultVo findMyTrainById(Integer id);

    ResultVo findByCondition(Map<String,Object> infos);
}
