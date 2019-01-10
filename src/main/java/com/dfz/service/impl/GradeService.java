package com.dfz.service.impl;

import com.dfz.dao.GradeMapper;
import com.dfz.service.IGradeService;
import com.dfz.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class GradeService implements IGradeService{

    @Autowired
    private GradeMapper gradeDao;

    //查询商品类型
    @Override
    public ResultVo findAll() {

        return ResultVo.setOK(gradeDao.selectAll());
    }
    //运动服饰
    public ResultVo findOne(){
        if(gradeDao.selectOne() != null){
            return ResultVo.setOK(gradeDao.selectOne());
        }else {
            return ResultVo.setERROR("暂无该商品");
        }
    }
    //运动装备
    public ResultVo findTwo(){
        if(gradeDao.selectOne() != null){
            return ResultVo.setOK(gradeDao.selectOne());
        }else {
            return ResultVo.setERROR("暂无该商品");
        }
    }

    //健康食品
    public ResultVo findThree(){
        if(gradeDao.selectOne() != null){
            return ResultVo.setOK(gradeDao.selectOne());
        }else {
            return ResultVo.setERROR("暂无该商品");
        }
    }
}
