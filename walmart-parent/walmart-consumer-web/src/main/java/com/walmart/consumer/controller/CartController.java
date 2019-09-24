package com.walmart.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.walmart.entity.PageResult;
import com.walmart.pojo.Product;
import com.walmart.pojogroup.ProductStoreGroupBean;
import com.walmart.service.CartService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @program: walmart-parent
 * @description: 购物车控制层
 * @author: 张晋浩
 * @create: 2019-09-24 09:09
 **/
@Controller
@RequestMapping("cart")
public class CartController {


    @Reference
    private CartService cartService;

    @ResponseBody
    @RequestMapping("addToShopCart")
    public void addToShopCart(Long skuId,Integer quantity){
        cartService.addToShopCart(skuId,quantity);
    }


    @ResponseBody
    @RequestMapping("getCartCount")
    public Integer getCartCount(){
        return cartService.getCartCount();
    }

    @ResponseBody
    @RequestMapping("queryCartQuantity")
    public List queryCartQuantity(){
        return cartService.queryCartQuantity();
    }


    @ResponseBody
    @RequestMapping("queryCartDetail")
    public List<ProductStoreGroupBean> queryCartDetail(){
        return cartService.queryCartDetail();
    }

}
