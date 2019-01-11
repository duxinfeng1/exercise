package com.dfz.service.impl;

import com.dfz.dao.CartMapper;
import com.dfz.entity.Cart;
import com.dfz.service.ICartService;
import com.dfz.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService implements ICartService{

    @Autowired
    private CartMapper cartDao;


    @Override
    public ResultVo findAll() {
       if(cartDao.selectAll() != null){
           return ResultVo.setOK(cartDao.selectAll());
       }else {
           return ResultVo.setERROR("暂无信息");
       }

    }

    @Override
    public ResultVo addCart(Integer gId, String gName, Float gPrice, Integer gNum, String sSize, Integer uId, String gImg) {
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
