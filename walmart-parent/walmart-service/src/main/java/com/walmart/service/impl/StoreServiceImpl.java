package com.walmart.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.walmart.mapper.StoreMapper;
import com.walmart.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @program: Wal-Mart
 * @description:
 * @author: 邓希凡
 * @create: 2019-09-10 20:54
 **/
@Service
public class StoreServiceImpl implements StoreService {

    @Autowired
    private StoreMapper storeMapper;
}
