package com.walmart.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.walmart.entity.PageResult;
import com.walmart.pojo.Shippingmethod;
import com.walmart.service.ShippingmethodService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shippingmethod")
public class ShippingmethodController {
    @Reference
    private ShippingmethodService shippingmethodService;
    @RequestMapping("/searchShippingmethod")
    public PageResult searchShippingmethod(Shippingmethod shippingmethod, @RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "5") Integer rows){

        return shippingmethodService.findPageShippingmethod(shippingmethod,rows,page);
    }
    @RequestMapping("/deleteShippingmethod")
    public boolean deleteShippingmethod(String[] ids) {
        return shippingmethodService.deleteShippingmethod(ids);
    }
}

