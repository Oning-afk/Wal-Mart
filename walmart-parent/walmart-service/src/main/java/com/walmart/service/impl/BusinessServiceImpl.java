package com.walmart.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.walmart.mapper.BusinessMapper;
import com.walmart.pojo.Business;
import com.walmart.pojo.BusinessExample;
import com.walmart.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @program: Wal-Mart
 * @description:
 * @author: 邓希凡
 * @create: 2019-09-10 20:54
 **/
@Service
public class BusinessServiceImpl implements BusinessService {

    @Autowired
    private BusinessMapper businessMapper;

    @Override
    public List<Business> queryBusiness( ) {
        BusinessExample businessExample = new BusinessExample();
        List<Business> businesses = businessMapper.selectByExample(businessExample);
        return businesses;
    }
}
