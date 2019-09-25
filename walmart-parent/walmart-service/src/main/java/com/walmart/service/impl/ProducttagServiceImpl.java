package com.walmart.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.walmart.entity.PageResult;
import com.walmart.mapper.ProducttagMapper;
import com.walmart.pojo.Producttag;
import com.walmart.pojo.ProducttagExample;
import com.walmart.service.ProducttagService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;


@Service
public class ProducttagServiceImpl implements ProducttagService {
    @Autowired
    private ProducttagMapper producttagMapper;

    @Override
    public PageResult search(Producttag producttag, int pageSize, int pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        ProducttagExample example = new ProducttagExample();
        ProducttagExample.Criteria criteria = example.createCriteria();
        if(producttag != null){
            if(producttag.getName() != null && producttag.getName().length() >=0){
                criteria.andNameLike("%"+producttag.getName()+"%");
            }
        }
        Page<Producttag> page = (Page<Producttag>) producttagMapper.selectByExample(example);
        long totalpage = (int) Math.ceil(page.getTotal()/pageSize) + 1;
        return new PageResult(page.getTotal(),page.getResult(),pageNum,pageSize,totalpage);
    }

    @Override
    public void add(Producttag producttag) {
        producttag.setCreateddate(new Date());
        producttag.setLastmodifieddate(new Date());
        producttag.setVersion((long) 0);
        producttag.setIcon(null);
        producttagMapper.insert(producttag);
    }

    @Override
    public void delete(Long[] ids) {
        for (Long id : ids){
            producttagMapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public Producttag findOne(Long id) {

        return producttagMapper.selectByPrimaryKey(id);
    }

    @Override
    public void updateproducttag(Producttag producttag) {
        producttag.setCreateddate(new Date());
        producttag.setLastmodifieddate(new Date());
        producttag.setVersion((long) 0);
        producttag.setIcon(null);
        producttagMapper.updateByPrimaryKey(producttag);
    }

    @Override
    public List<Producttag> searchquert() {

        return producttagMapper.selectByExample(null);
    }
}
