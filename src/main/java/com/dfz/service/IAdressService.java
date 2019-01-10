package com.dfz.service;

import com.dfz.entity.Address;
import com.dfz.vo.ResultVo;

public interface IAdressService {
    //通过用户id查找到用户地址
    ResultVo findByDid(Integer dId);
    //通过id删除地址
    ResultVo deleteById(Integer id);
    //添加地址
    ResultVo insertAdress(Address adress);

}
