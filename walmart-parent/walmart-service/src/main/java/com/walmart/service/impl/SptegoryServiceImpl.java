package com.walmart.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.walmart.entity.PageResult;
import com.walmart.mapper.StoreproductcategoryMapper;
import com.walmart.pojo.Storeproductcategory;
import com.walmart.pojo.StoreproducttagExample;
import com.walmart.service.SptegoryService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Service
public class SptegoryServiceImpl implements SptegoryService {
    @Autowired
    private StoreproductcategoryMapper  storeproductcategoryMapper;
    @Override
    public List<Storeproductcategory> findsproductcategory() {
        return storeproductcategoryMapper.selectByExample(null);
    }

    @Override
    public void savesproductcategory(Storeproductcategory storeproductcategory) {
        storeproductcategoryMapper.insert(storeproductcategory);
    }

    @Override
    public void delsproductcategoryall(Long[] id) {
        for (long id7:id
             ) {
            storeproductcategoryMapper.deleteByPrimaryKey(id7);
        }
    }

    @Override
    public PageResult findAll(Storeproductcategory storeproductcategory, Integer page, Integer rows) {
        PageHelper.startPage(page,rows);
        StoreproducttagExample example=new StoreproducttagExample();
        StoreproducttagExample.Criteria criteria=example.createCriteria();
        Page<Storeproductcategory> pagew= (Page<Storeproductcategory>) storeproductcategoryMapper.selectByExample(null);
        long totalpage=(int) Math.ceil(pagew.getTotal()/pagew.getPageSize());

        return new PageResult(pagew.getTotal(),pagew.getResult(),page,rows,totalpage);
    }
}
