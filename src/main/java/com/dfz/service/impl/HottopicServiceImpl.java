package com.dfz.service.impl;

import com.dfz.dao.*;
import com.dfz.entity.Follow;
import com.dfz.entity.Hottopic;
import com.dfz.entity.Images;
import com.dfz.entity.UserDetail;
import com.dfz.service.HottopicService;
import com.dfz.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class HottopicServiceImpl implements HottopicService {

    @Autowired
    private HottopicMapper hottopicMapper;
    @Autowired
    private ReleaseMapper releaseMapper;
    @Autowired
    private ImagesMapper imagesMapper;
    @Autowired
    private FollowMapper followMapper;
    @Autowired
    private UserDetailMapper userDetailMapper;

    @Override
    public ResultVo findAllHottopics() {
        //创建热议话题+参与人数的集合releaseVoList
        List<AddReleaseVo> releaseVoList = new ArrayList<>();
        //查找当前所有热议话题
        List<Hottopic> allHottopics = hottopicMapper.findAllHottopics();
        for (Hottopic topic:allHottopics) {
            //new一个热议话题+参与人数AddReleaseVo对象
            AddReleaseVo addReleaseVo = new AddReleaseVo();
            //添加至addReleaseVo对象中
            addReleaseVo.setHottopic(topic);
            //查找参与该热议话题id下的用户的数量并添加至AddReleaseVo对象
            addReleaseVo.setReleaseNumber(hottopicMapper.findTheNumberOfReleaseByThId(topic.getThId()));
            //将AddReleaseVo对象添至releaseVoList集合中
            releaseVoList.add(addReleaseVo);
        }
        return ResultVo.setOK(releaseVoList);
    }

    @Override
    public ResultVo findHotHottopics() {
        List<Hottopic> hottopicList = new ArrayList<>();
        List<Hottopic> allHottopics = hottopicMapper.findAllHottopics();
        //通过动态的多少判断是否为精选
        for (Hottopic topic:allHottopics) {
            if (hottopicMapper.findTheNumberOfReleaseByThId(topic.getThId())>2){
                hottopicList.add(topic);
            }
        }
        return ResultVo.setOK(hottopicList);
    }

    @Override
    public ResultVo findAllMessageByThId(Integer uId,Integer thId) {
        UserDetail userDetail = userDetailMapper.findDIdByUId(uId);
        if (userDetail != null) {
            int udId = userDetail.getdId();
            Map<String,Integer> map1 = new HashMap<>();
            List<ReleaseMessageVo> releaseMessageVos = new ArrayList<>();
            Map<String,Object> map = new HashMap<>();
            int theNumberOfRelease = hottopicMapper.findUserNumberByThId(thId);
            Hottopic hottopic = hottopicMapper.findHottopicByThId(thId);
            List<UserDetailVo> users = hottopicMapper.findAllUserByPage(thId);
            List<ReleaseAndUserVo> allRelease = releaseMapper.findReleasesByThIdAndPraise(thId);
            for (ReleaseAndUserVo releases:allRelease) {
                //判断是否关注
                int tfId = releases.getdId();
                map1.put("udId",udId);
                map1.put("tfId",tfId);
                Follow follow = followMapper.findfollowByTwoId(map1);
                if (udId == tfId){
                    releases.setIsFollow(0);
                }else if (follow != null && follow.getTfFlag() == 0){
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
            map.put("topic",hottopic);
            map.put("users",users);
            map.put("theNumberOfRelease",theNumberOfRelease);
            map.put("releaseMessageVos",releaseMessageVos);
            return ResultVo.setOK(map);
        }else{
            return ResultVo.setERROR("异常");
        }
    }

    @Override
    public ResultVo findAllUserByThId(Integer thId) {
        List<UserDetailVo> allUserByThId = hottopicMapper.findAllUserByThId(thId);
        return  ResultVo.setOK(allUserByThId);
    }
}
