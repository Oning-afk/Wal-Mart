package com.walmart.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.walmart.entity.PageResult;
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
    public PageResult findPageBusiness(Business business, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageSize,pageNum);
        BusinessExample businessExample = new BusinessExample();
        BusinessExample.Criteria criteria = businessExample.createCriteria();
        if (business != null){
            if (business.getUsername() != null && business.getUsername().length()>0){
                criteria.andUsernameLike("%"+business.getUsername()+"%");
            }
        }
        Page<Business> businesses = (Page<Business>) businessMapper.selectByExample(businessExample);
        return new PageResult(businesses.getTotal(),businesses.getResult());
    }

    @Override
    public boolean delBusiness(String[] ids) {
        int i =0;
        for (String id: ids){
            i = businessMapper.deleteByPrimaryKey(Long.parseLong(id));
        }
        if (i>0){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public List<Business> findStockAll() {
        List<Business> businesses = businessMapper.selectByExample(null);
        int count = businessMapper.countByExample(null);
        return businesses;
    }
}
