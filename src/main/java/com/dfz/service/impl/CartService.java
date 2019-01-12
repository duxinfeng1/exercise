package com.dfz.service.impl;

import com.dfz.dao.CartMapper;
import com.dfz.entity.Cart;
import com.dfz.service.ICartService;
import com.dfz.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CartService implements ICartService{

    @Autowired
    private CartMapper cartDao;


    @Override
    public ResultVo findAll(Integer uId) {
       if(cartDao.selectAll(uId) != null){
           return ResultVo.setOK(cartDao.selectAll(uId));
       }else {
           return ResultVo.setERROR("暂无信息");
       }

    }
    //添加
    @Override
    public ResultVo addCart(Integer gId, String gName, Float gPrice, Integer gNum, String sSize, Integer uId, String gImg) {
        Map<String, Object> map = new HashMap<>();
        map.put("gName", gName);
        map.put("uId", uId);
        if(cartDao.selectByGNameAndUId(map) !=null ){
            Cart cart = cartDao.selectByGNameAndUId(map);
            Integer Num = cart.getgNum() + gNum;
            Map<String, Object> map1 = new HashMap<>();
            map1.put("gNum", Num);
            map1.put("id", cart.getId());
            cartDao.updateNum(map1);
            return ResultVo.setOK(null);
        }else {
            Cart cart = new Cart();
            cart.setgId(gId);
            cart.setgName(gName);
            cart.setgPrice(gPrice);
            cart.setgNum(gNum);
            cart.setuId(uId);
            cart.setsSize(sSize);
            cart.setgImg(gImg);
            return ResultVo.setOK(cartDao.insert(cart));
        }
    }
}
