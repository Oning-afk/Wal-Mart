package com.walmart.service;

import com.walmart.entity.PageResult;
import com.walmart.pojo.Product;
import com.walmart.pojogroup.ProductStoreGroupBean;

import java.util.List;

public interface CartService {

    void addToShopCart(Long skuId, Integer quantity);

    Integer getCartCount();

    List<ProductStoreGroupBean> queryCartDetail();

    List queryCartQuantity();
}
