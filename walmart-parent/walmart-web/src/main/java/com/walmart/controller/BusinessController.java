package com.walmart.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.walmart.pojo.Business;
import com.walmart.service.BusinessService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    /**
    * @Description: 商家自动补全
    * @Param: 用户输入的名字
    * @return: List<Business
    * @Author: 邓希凡
    * @Date: 2019/9/17
    */
    @RequestMapping("queryBusiness")
    public List<Business> queryBusiness(){
        return businessService.queryBusiness();
    }
}
