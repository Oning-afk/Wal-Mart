package com.walmart.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.walmart.entity.PageResult;
import com.walmart.pojo.PaymentMethod;
import com.walmart.service.PaymentMethodService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: walmart-parent
 * @description: 系统-支付方式-控制层
 * @author: 张晋浩
 * @create: 2019-09-17 19:36
 **/
@Controller
@RequestMapping("paymentmethod")
public class PaymentMethodController {

    @Reference
    private PaymentMethodService paymentMethodService;


    @RequestMapping("searchPaymentMethod")
    @ResponseBody
    public PageResult searchPaymentMethod(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "5") Integer rows){
        return paymentMethodService.searchPaymentMethod(page,rows);
    }


    @RequestMapping("searchPaymentMethodById")
    @ResponseBody
    public PaymentMethod searchPaymentMethodById(Long id) {
        return paymentMethodService.searchPaymentMethodById(id);
    }


    @RequestMapping("updatePaymentById")
    @ResponseBody
    public boolean updatePaymentById(PaymentMethod paymentMethod){
        return paymentMethodService.updatePaymentById(paymentMethod);
    }

}
