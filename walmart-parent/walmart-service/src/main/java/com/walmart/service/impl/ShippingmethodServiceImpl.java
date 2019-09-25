package com.walmart.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.walmart.entity.PageResult;
import com.walmart.mapper.DeliverycorpMapper;
import com.walmart.mapper.PaymentMethodMapper;
import com.walmart.mapper.ShippingmethodMapper;
import com.walmart.mapper.ShippingmethodPaymentmethodMapper;
import com.walmart.pojo.*;
import com.walmart.pojogroup.ShippingDeliverycorpPaymentmethod;
import com.walmart.service.ShippingmethodService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShippingmethodServiceImpl implements ShippingmethodService {
    @Autowired
    private ShippingmethodMapper shippingmethodMapper;
    @Autowired
    private DeliverycorpMapper deliverycorpMapper;
    @Autowired
    private PaymentMethodMapper paymentMethodMapper;
    @Autowired
    private ShippingmethodPaymentmethodMapper shippingmethodPaymentmethodMapper;
    @Override
    public PageResult findPageShippingmethod(Shippingmethod shippingmethod, int pageSize, int pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        ShippingmethodExample shippingmethodExample = new ShippingmethodExample();
        ShippingmethodExample.Criteria criteria = shippingmethodExample.createCriteria();
        if (shippingmethod.getName() !=null){
            if (shippingmethod.getName() !=null && shippingmethod.getName().length() >0){
                criteria.andNameLike( "%" + shippingmethod.getName() +"%");
            }
        }
        Page<Shippingmethod> page = (Page<Shippingmethod>) shippingmethodMapper.selectByExample(shippingmethodExample);
        return new PageResult(page.getTotal(),page.getResult());
    }

    @Override
    public boolean deleteShippingmethod(String[] ids) {
        int i = 0;
        for (String id : ids) {
            i = shippingmethodMapper.deleteByPrimaryKey(Long.parseLong(id));
        }
        if (i>0){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public ShippingDeliverycorpPaymentmethod searchShippingDeliverycorpPaymentmethod(Long id) {
        Shippingmethod shippingmethod = shippingmethodMapper.selectByPrimaryKey(id);
        Deliverycorp deliverycorp = deliverycorpMapper.selectByPrimaryKey(shippingmethod.getDefaultdeliverycorpId());
        ShippingmethodPaymentmethodExample shippingmethodPaymentmethodExample = new ShippingmethodPaymentmethodExample();
        ShippingmethodPaymentmethodExample.Criteria criteria = shippingmethodPaymentmethodExample.createCriteria();
        criteria.andShippingmethodsIdEqualTo(id);
        List<ShippingmethodPaymentmethodKey> shippingmethodPaymentmethodKeys = shippingmethodPaymentmethodMapper.selectByExample(shippingmethodPaymentmethodExample);
        List<PaymentMethod> paymentMethodList = new ArrayList<>();
        for (ShippingmethodPaymentmethodKey shippingmethodPaymentmethodKey : shippingmethodPaymentmethodKeys) {
            PaymentMethod paymentMethod = new PaymentMethod();
            paymentMethod = paymentMethodMapper.selectByPrimaryKey(shippingmethodPaymentmethodKey.getPaymentmethodsId());
            paymentMethodList.add(paymentMethod);
        }
        ShippingDeliverycorpPaymentmethod shippingDeliverycorpPaymentmethod = new ShippingDeliverycorpPaymentmethod();
        shippingDeliverycorpPaymentmethod.setShippingmethod(shippingmethod);
        shippingDeliverycorpPaymentmethod.setDeliverycorp(deliverycorp);
        shippingDeliverycorpPaymentmethod.setShippingmethodPaymentmethodKey(shippingmethodPaymentmethodKeys);
        shippingDeliverycorpPaymentmethod.setPaymentMethod(paymentMethodList);
        return shippingDeliverycorpPaymentmethod;
    }

    @Override
    public boolean updateShippingDeliverycorpPaymentmethod(ShippingDeliverycorpPaymentmethod shippingDeliverycorpPaymentmethod) {
        return false;
    }

    @Override
    public List<Shippingmethod> findPage() {
        return shippingmethodMapper.selectByExample(null);
    }
}
