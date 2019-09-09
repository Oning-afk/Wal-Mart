package com.walmart.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.walmart.mapper.TestMapper;
import com.walmart.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @program: Wal-Mart
 * @description:
 * @author: 邓希凡
 * @create: 2019-09-08 22:08
 **/

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestMapper testMapper;

    @Override
    public void TestAdd() {
        testMapper.testAdd();
    }
}
