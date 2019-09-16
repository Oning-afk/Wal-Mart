package com.walmart.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.walmart.entity.PageResult;
import com.walmart.mapper.BusinessMapper;
import com.walmart.mapper.StoreMapper;
import com.walmart.mapper.StorecategoryMapper;
import com.walmart.mapper.StorerankMapper;
import com.walmart.pojo.*;
import com.walmart.pojogroup.StoreGroupBean;
import com.walmart.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * @program: Wal-Mart
 * @description:
 * @author: 邓希凡
 * @create: 2019-09-10 20:54
 **/
@Service(timeout = 120000,retries = 0)
public class StoreServiceImpl implements StoreService {

    @Autowired
    private StoreMapper storeMapper;

    @Autowired
    private StorerankMapper storerankMapper;

    @Autowired
    private StorecategoryMapper storecategoryMapper;

    @Autowired
    private BusinessMapper businessMapper;

    @Override
    public PageResult findStore(int pageSize, int pageNum, Store store, int hasExpired) {
        PageHelper.startPage(pageNum,pageSize);
        StoreExample storeExample = new StoreExample();
        StoreExample.Criteria criteria = storeExample.createCriteria();
        if(store!=null){
            if(store.getStatus()!=null&&store.getStatus()!=-1){
                criteria.andStatusEqualTo(store.getStatus());
            }
            if(store.getIsenabled()!=null){
                criteria.andIsenabledEqualTo(store.getIsenabled());
            }
            if(store.getType()!=null&&store.getType()!=-1){
                criteria.andTypeEqualTo(store.getType());
            }
        }
        if(hasExpired!=-1){
            if(hasExpired==1){
                criteria.andEnddateLessThan(new Date());
            }else{
                criteria.andEnddateGreaterThan(new Date());
            }

        }
        Page<Store> stores = (Page<Store>) storeMapper.selectByExample(storeExample);
        Page<StoreGroupBean> storeGroupBeans = new Page<>();
        storeGroupBeans.setTotal(stores.getTotal());
        for (Store store1 : stores) {
            StoreGroupBean storeGroupBean = new StoreGroupBean();
            Storerank storerank = storerankMapper.selectByPrimaryKey(store1.getStorerankId());
            Storecategory storecategory = storecategoryMapper.selectByPrimaryKey(store1.getStorecategoryId());
            Business business = businessMapper.selectByPrimaryKey(store1.getBusinessId());
            storeGroupBean.setStore(store1);
            storeGroupBean.setBusiness(business);
            storeGroupBean.setStorecategory(storecategory);
            storeGroupBean.setStorerank(storerank);
            storeGroupBeans.add(storeGroupBean);
        }
        long totalPage= (int) Math.ceil(stores.getTotal()/stores.getPageSize());
        return new PageResult(storeGroupBeans.getTotal(),storeGroupBeans.getResult(),pageNum,pageSize,totalPage);
    }

    @Override
    public void addStore(Store store) {
        storeMapper.insertSelective(store);
    }

    @Override
    public Store findStoreById(Long id) {
        return storeMapper.selectByPrimaryKey(id);
    }

    @Override
    public void editStore(Store store) {
        storeMapper.updateByPrimaryKey(store);
    }
}
