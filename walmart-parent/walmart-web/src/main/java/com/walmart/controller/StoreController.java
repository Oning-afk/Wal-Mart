package com.walmart.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.walmart.service.StoreService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: Wal-Mart
 * @description:
 * @author: 邓希凡
 * @create: 2019-09-10 20:52
 **/
@RestController
@RequestMapping("store")
public class StoreController {

    @Reference
    private StoreService storeService;
}
