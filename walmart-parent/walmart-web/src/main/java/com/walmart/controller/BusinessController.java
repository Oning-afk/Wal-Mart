package com.walmart.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.walmart.service.BusinessService;
import org.springframework.web.bind.annotation.RequestMapping;
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
}
