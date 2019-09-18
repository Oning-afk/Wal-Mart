package com.walmart.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.github.pagehelper.PageHelper;
import com.walmart.entity.PageResult;
import com.walmart.pojo.Business;
import com.walmart.service.BusinessService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: Wal-Mart
 * @description:
 * @author: 邓希凡
 * @create: 2019-09-10 20:51
 **/
@RestController
@RequestMapping("business")
public class BusinessController {

    @Reference
    private BusinessService businessService;

    @RequestMapping("/findPageBusiness")
    public PageResult findPageBusiness(Business business, @RequestParam(defaultValue = "1")Integer pageSize,@RequestParam(defaultValue = "124")Integer pageNum){

        return businessService.findPageBusiness(business,pageSize,pageNum);
    }

    @RequestMapping("/delBusiness")
    public boolean delBusiness(String [] ids){

        return businessService.delBusiness(ids);
    }
}
