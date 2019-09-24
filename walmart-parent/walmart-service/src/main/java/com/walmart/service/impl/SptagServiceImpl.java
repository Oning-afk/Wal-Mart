package com.walmart.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.walmart.entity.PageResult;
import com.walmart.mapper.StoreproductcategoryMapper;
import com.walmart.mapper.StoreproducttagMapper;
import com.walmart.pojo.Storeproducttag;
import com.walmart.pojo.StoreproducttagExample;
import com.walmart.service.SptagService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class SptagServiceImpl implements SptagService {
    @Autowired
    private StoreproducttagMapper storeproducttagMapper;

    @Override
    public List<Storeproducttag> findsptag() {

        return storeproducttagMapper.selectByExample(null);
    }

    @Override
    public void savesptag(Storeproducttag storeproducttag) {
        storeproducttagMapper.insert(storeproducttag);
    }

    @Override
    public void delsptagall(Long[] id) {
        for (long id6:id) {
            storeproducttagMapper.deleteByPrimaryKey(id6);
        }
    }

    @Override
    public PageResult findAll(Storeproducttag storeproducttag, Integer page, Integer rows) {
        PageHelper.startPage(page,rows);
        StoreproducttagExample example=new StoreproducttagExample();
        StoreproducttagExample.Criteria criteria=example.createCriteria();
        Page<Storeproducttag> pagew= (Page<Storeproducttag>) storeproducttagMapper.selectByExample(null);
        long totalpage=(int) Math.ceil(pagew.getTotal()/pagew.getPageSize());
        return new PageResult(pagew.getTotal(),pagew.getResult(),page,rows,totalpage);
    }
}
