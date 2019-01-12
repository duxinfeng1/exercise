package com.dfz.service;

import com.dfz.dao.FollowMapper;
import com.dfz.dao.FunsMapper;
import com.dfz.dao.UserDetailMapper;
import com.dfz.entity.Follow;
import com.dfz.entity.Funs;
import com.dfz.entity.UserDetail;
import com.dfz.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class FollowServiceImpl implements FollowService {
    @Autowired
    private FollowMapper followMapper;
    @Autowired
    private UserDetailMapper userDetailMapper;
    @Autowired
    private FunsMapper funsMapper;

    @Override
    public ResultVo addFollow(Integer uId, Integer dId) {
        UserDetail dIdByUId = userDetailMapper.findDIdByUId(uId);
        if (dIdByUId != null) {
            int udId = dIdByUId.getdId();
            Map<String, Integer> map = new HashMap<>();
            map.put("udId", udId);
            map.put("tfId", dId);
            Follow follow1 = followMapper.findfollowById(map);
            Funs funs = funsMapper.findfunById(map);
            if (follow1 != null) {
                follow1.setTfFlag(0);
                if (followMapper.updateFlag(follow1) > 0) {
                    if (funs != null) {
                        funs.setTfFlag(0);
                        if (funsMapper.updateFlag(funs) > 0) {
                            return ResultVo.setOK(null);
                        } else {
                            return ResultVo.setERROR("关注失败");
                        }
                    }
                    return ResultVo.setOK(null);
                } else {
                    return ResultVo.setERROR("关注失败");
                }
            } else {
                Funs funs1 = new Funs();
                funs1.setdId(dId);
                funs1.setTfDId(udId);
                funs1.setTfFlag(0);
                Follow follow = new Follow();
                follow.setTfFlag(0);
                follow.setdId(udId);
                follow.setTfDId(dId);
                if (followMapper.addFollow(follow) > 0) {
                    if (funsMapper.addFun(funs1) > 0) {
                        return ResultVo.setOK(null);
                    } else {
                        return ResultVo.setERROR("关注失败");
                    }
                } else {
                    return ResultVo.setOK(null);
                }
            }
        }else{
            return ResultVo.setERROR("该用户无详情表");
        }

    }

    @Override
    public ResultVo updateFlag(Integer uId, Integer dId) {
        UserDetail dIdByUId = userDetailMapper.findDIdByUId(uId);
        int udId = dIdByUId.getdId();
        Map<String, Integer> map = new HashMap<>();
        map.put("udId", udId);
        map.put("tfId", dId);
        Follow follow1 = followMapper.findfollowById(map);
        Funs funs = funsMapper.findfunById(map);
        if (follow1 != null) {
            follow1.setTfFlag(1);
            if (followMapper.updateFlag(follow1) > 0) {
                if (funs != null) {
                    funs.setTfFlag(1);
                    if (funsMapper.updateFlag(funs) > 0) {
                        return ResultVo.setOK(null);
                    } else {
                        return ResultVo.setERROR("关注失败");
                    }
                }
                return ResultVo.setOK(null);
            } else {
                return ResultVo.setERROR("关注失败");
            }
        } else {
            return ResultVo.setERROR("该用户无详情表");
        }
    }
}