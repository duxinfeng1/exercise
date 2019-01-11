package com.dfz.service;

import com.dfz.vo.ResultVo;

public interface ImageService {

    ResultVo selectImagesByTrId(Integer trId);
}
