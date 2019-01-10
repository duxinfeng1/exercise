package com.dfz.service.impl;

import com.dfz.dao.AddressMapper;
import com.dfz.entity.Address;
import com.dfz.service.IAdressService;
import com.dfz.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdressService implements IAdressService{


    @Autowired
    private AddressMapper adDao;

    //通过用户id查找到用户地址
    @Override
    public ResultVo findByDid(Integer dId) {
        if(adDao.selectByUserId(dId) != null){
            return ResultVo.setOK(adDao.selectByUserId(dId));
        }else {
            return ResultVo.setERROR("地址没有找到");
        }
    }

    //通过id删除地址
    @Override
    public ResultVo deleteById(Integer id) {
        if(adDao.deleteByPrimaryKey(id) > 0){
            return ResultVo.setOK(adDao.deleteByPrimaryKey(id));
        }else {
            return ResultVo.setERROR("删除失败");
        }
    }
    //添加地址
    @Override
    public ResultVo insertAdress(Address adress) {
        if (adDao.insertSelective(adress) > 0){
            return ResultVo.setOK(null);
        }else {
            return ResultVo.setERROR("添加失败");
        }

    }
}
