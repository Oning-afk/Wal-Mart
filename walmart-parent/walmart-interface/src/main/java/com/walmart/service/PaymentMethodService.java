package com.walmart.service;

import com.walmart.entity.PageResult;
import com.walmart.pojo.PaymentMethod;

/**
 * @author zjh
 */
public interface PaymentMethodService {


    PageResult searchPaymentMethod(Integer page, Integer rows);


    PaymentMethod searchPaymentMethodById(Long id);

    boolean updatePaymentById(PaymentMethod paymentMethod);

}
