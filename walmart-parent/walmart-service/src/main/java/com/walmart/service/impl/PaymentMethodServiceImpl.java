package com.walmart.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.walmart.entity.PageResult;
import com.walmart.mapper.PaymentMethodMapper;
import com.walmart.pojo.PaymentMethod;
import com.walmart.service.PaymentMethodService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @program: walmart-parent
 * @description: 系统-支付方式-业务层
 * @author: 张晋浩
 * @create: 2019-09-17 19:37
 **/
@Service
public class PaymentMethodServiceImpl implements PaymentMethodService {


    @Autowired
    private PaymentMethodMapper paymentMethodMapper;

    @Override
    public PageResult searchPaymentMethod(Integer page, Integer rows) {
        PageHelper.startPage(page,rows);
        int count = paymentMethodMapper.countByExample(null);
        List<PaymentMethod> paymentMethods = paymentMethodMapper.selectByExample(null);
        return new PageResult(count,paymentMethods);
    }

    @Override
    public PaymentMethod searchPaymentMethodById(Long id) {

        return paymentMethodMapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean updatePaymentById(PaymentMethod paymentMethod) {
        return paymentMethodMapper.updateByPrimaryKeySelective(paymentMethod)>0;
    }
}
