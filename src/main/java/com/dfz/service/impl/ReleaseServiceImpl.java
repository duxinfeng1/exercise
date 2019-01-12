package com.dfz.service.impl;

import com.dfz.dao.FollowMapper;
import com.dfz.dao.ImagesMapper;
import com.dfz.dao.ReleaseMapper;
import com.dfz.dao.UserDetailMapper;
import com.dfz.entity.Follow;
import com.dfz.entity.Images;
import com.dfz.entity.UserDetail;
import com.dfz.service.ReleaseService;
import com.dfz.vo.PageBeanVo;
import com.dfz.vo.ReleaseAndUserVo;
import com.dfz.vo.ReleaseMessageVo;
import com.dfz.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ReleaseServiceImpl implements ReleaseService {

    @Autowired
    private ReleaseMapper releaseMapper;
    @Autowired
    private ImagesMapper imagesMapper;
    @Autowired
    private UserDetailMapper userDetailMapper;
    @Autowired
    private FollowMapper followMapper;

    @Override
    public ResultVo findAllReleaseByThId(Integer uId, Integer thId) {
        Map<String,Integer> map = new HashMap<>();
        UserDetail userDetail = userDetailMapper.findDIdByUId(uId);
        if (userDetail != null) {
            int udId = userDetail.getdId();
            //创建一个用于存储回复的动态信息+回复数量集合
            List<ReleaseMessageVo> releaseMessageVos = new ArrayList<>();
            //通过热议话题的id查找该热议下的动态信息的集合
            List<ReleaseAndUserVo> releasesByThIdAndTrId = releaseMapper.findReleasesByThId(thId);
            //遍历这个动态集合
            for (ReleaseAndUserVo releases : releasesByThIdAndTrId) {
                int tfId = releases.getdId();
                map.put("udId", udId);
                map.put("tfId", tfId);
                Follow follow = followMapper.findfollowByTwoId(map);
                if (udId == tfId) {
                    releases.setIsFollow(0);
                } else if (follow != null && follow.getTfFlag() == 0) {
                    releases.setIsFollow(1);
                } else {
                    releases.setIsFollow(2);
                }
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
        }else{
            return ResultVo.setERROR("我去");
        }
    }

    @Override
    public ResultVo findReleasesInRelease(Integer uId) {
        Map<String,Integer> map = new HashMap<>();
        UserDetail userDetail = userDetailMapper.findDIdByUId(uId);
        if (userDetail != null) {
            int udId = userDetail.getdId();
            //创建一个用于存储回复的动态信息+回复数量集合
            List<ReleaseMessageVo> releaseMessageVos = new ArrayList<>();
            //通过热议话题的id查找该热议下的动态信息的集合
            List<ReleaseAndUserVo> releasesInRelease = releaseMapper.findReleasesInRelease();
            if (releasesInRelease != null) {
                //遍历这个动态集合
                for (ReleaseAndUserVo releases:releasesInRelease) {
                    int tfId = releases.getdId();
                    map.put("udId",udId);
                    map.put("tfId",tfId);
                    Follow follow = followMapper.findfollowByTwoId(map);
                    if (udId == tfId){
                        releases.setIsFollow(0);
                    }else if ( follow != null && follow.getTfFlag() == 0){
                        releases.setIsFollow(1);
                    }else{
                        releases.setIsFollow(2);
                    }
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
            }else{
                return ResultVo.setERROR("无数据");
            }
        }else{
           return ResultVo.setERROR("臣妾做不到啊");
        }

    }

    @Override
    public ResultVo findReleasesByMyFollow(Integer uId) {
        Map<String,Integer> map = new HashMap<>();
        UserDetail userDetail = userDetailMapper.findDIdByUId(uId);
        if (userDetail != null) {
            int udId = userDetail.getdId();
            //创建一个用于存储回复的动态信息+回复数量集合
            List<ReleaseMessageVo> releaseMessageVos = new ArrayList<>();
            //通过关注的id查找该热议下的动态信息的集合
            List<Integer> dIdList = followMapper.findtfDIdByDId(udId);
            if (dIdList != null) {
                List<ReleaseAndUserVo> releasesInRelease = releaseMapper.findReleasesByMyFollow(dIdList);
                //遍历这个动态集合
                for (ReleaseAndUserVo releases:releasesInRelease) {
                    int tfId = releases.getdId();
                    map.put("udId",udId);
                    map.put("tfId",tfId);
                    Follow follow = followMapper.findfollowByTwoId(map);
                    if (udId == tfId){
                        releases.setIsFollow(0);
                    }else if ( follow != null && follow.getTfFlag() == 0){
                        releases.setIsFollow(1);
                    }else{
                        releases.setIsFollow(2);
                    }
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
            } else {
                return ResultVo.setERROR("我未关注任何人");
            }
        }else{
            return ResultVo.setERROR("用户详情表不存在");
        }
    }
}
