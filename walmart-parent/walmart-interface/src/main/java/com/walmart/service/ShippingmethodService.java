package com.walmart.service;

import com.walmart.entity.PageResult;
import com.walmart.pojo.Shippingmethod;
import com.walmart.pojogroup.ShippingDeliverycorpPaymentmethod;

import java.util.List;

public interface ShippingmethodService {
    /**
     * 配送方式查询
     * @param shippingmethod
     * @param pageSize
     * @param pageNum
     * @return
     */
    PageResult findPageShippingmethod(Shippingmethod shippingmethod, int pageSize, int pageNum);

    /**
     * 配送方式删除
     * @param ids
     */
    boolean deleteShippingmethod(String[] ids);

    ShippingDeliverycorpPaymentmethod  searchShippingDeliverycorpPaymentmethod(Long id);

    boolean updateShippingDeliverycorpPaymentmethod(ShippingDeliverycorpPaymentmethod shippingDeliverycorpPaymentmethod);

    List<Shippingmethod> findPage();
}
