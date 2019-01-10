package com.dfz.service.impl;

import com.dfz.dao.HottopicMapper;
import com.dfz.dao.ReleaseMapper;
import com.dfz.entity.Hottopic;
import com.dfz.service.HottopicService;
import com.dfz.vo.AddReleaseVo;
import com.dfz.vo.ReleaseAndUserVo;
import com.dfz.vo.ResultVo;
import com.dfz.vo.UserDetailVo;
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

    @Override
    public ResultVo findAllHottopics() {
        List<AddReleaseVo> releaseVoList = new ArrayList<>();
        List<Hottopic> allHottopics = hottopicMapper.findAllHottopics();
        for (Hottopic topic:allHottopics) {
            AddReleaseVo addReleaseVo = new AddReleaseVo();
            addReleaseVo.setHottopic(topic);
            addReleaseVo.setReleaseNumber(hottopicMapper.findTheNumberOfReleaseByThId(topic.getThId()));
            releaseVoList.add(addReleaseVo);
        }
        return ResultVo.setOK(releaseVoList);
    }

    @Override
    public ResultVo findHotHottopics() {
        List<Hottopic> hottopicList = new ArrayList<>();
        List<Hottopic> allHottopics = hottopicMapper.findAllHottopics();
        for (Hottopic topic:allHottopics) {
            if (hottopicMapper.findTheNumberOfReleaseByThId(topic.getThId())>2){
                hottopicList.add(topic);
            }
        }
        return ResultVo.setOK(hottopicList);
    }

    @Override
    public ResultVo findAllMessageByThId(Integer thId) {

        Map<String,Object> map = new HashMap<>();
        int theNumberOfRelease = hottopicMapper.findUserNumberByThId(thId);
        Hottopic hottopic = hottopicMapper.findHottopicByThId(thId);
        List<UserDetailVo> users = hottopicMapper.findAllUserByPage(thId);
        List<ReleaseAndUserVo> allRelease = releaseMapper.findReleasesByThIdAndPraise(thId);
        map.put("topic",hottopic);
        map.put("users",users);
        map.put("theNumberOfRelease",theNumberOfRelease);
        map.put("allRelease",allRelease);
        return ResultVo.setOK(map);
    }

    @Override
    public ResultVo findAllUserByThId(Integer thId) {
        List<UserDetailVo> allUserByThId = hottopicMapper.findAllUserByThId(thId);
        return  ResultVo.setOK(allUserByThId);
    }
}
