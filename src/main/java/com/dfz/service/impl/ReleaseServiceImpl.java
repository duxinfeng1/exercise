package com.dfz.service.impl;

import com.dfz.dao.ImagesMapper;
import com.dfz.dao.ReleaseMapper;
import com.dfz.entity.Images;
import com.dfz.service.ReleaseService;
import com.dfz.vo.ReleaseAndUserVo;
import com.dfz.vo.ReleaseMessageVo;
import com.dfz.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReleaseServiceImpl implements ReleaseService {

    @Autowired
    private ReleaseMapper releaseMapper;
    @Autowired
    private ImagesMapper imagesMapper;

    @Override
    public ResultVo findAllReleaseByTrId(Integer thId) {
        //创建一个用于存储回复的动态信息+回复数量集合
        List<ReleaseMessageVo> releaseMessageVos = new ArrayList<>();
        //通过热议话题的id查找该热议下的动态信息的集合
        List<ReleaseAndUserVo> releasesByThIdAndTrId = releaseMapper.findReleasesByThIdAndTrId(thId);
        //遍历这个动态集合
        for (ReleaseAndUserVo releases:releasesByThIdAndTrId) {
            //通过releases的主键查找到它关联的图片集合
            List<Images> images = imagesMapper.selectImagesByTrId(releases.getTrId());
            //将查找到的图片集合放入改动态对象里
            releases.setImagesList(images);
            //new一个动态信息+回复数量(ReleaseMessageVo)的对象
            ReleaseMessageVo releaseMessageVo = new ReleaseMessageVo();
            //通过releases的主键查找到该动态下的回复数量
            int replyCount = releaseMapper.findReplyCount(releases.getTrId());
            //将该对象存入动态信息+回复数量(releaseMessageVos)集合
            releaseMessageVo.setReleaseAndUserVo(releases);
            releaseMessageVo.setReplyNUmber(replyCount);
            releaseMessageVos.add(releaseMessageVo);
        }
        return ResultVo.setOK(releaseMessageVos);
    }
}
