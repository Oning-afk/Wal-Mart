package com.walmart.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.walmart.mapper.ProductcategoryMapper;
import com.walmart.pojo.Productcategory;
import com.walmart.service.ProductcategoryService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

@Service
public class ProductcategoryServiceImpl implements ProductcategoryService {

  @Autowired
  private ProductcategoryMapper productcategoryMapper;

  @Override
  public List<Productcategory> Productcategoryquery() {
    return productcategoryMapper.selectByExample(null);
  }

  @Override
  public void add(Productcategory productcategory) {
    productcategory.setCreateddate(new Date());
    productcategory.setLastmodifieddate(new Date());
    productcategory.setVersion((long)0);
    productcategory.setGrade(0);
    productcategory.setTreepath("0");
    productcategoryMapper.insert(productcategory);
  }

  @Override
  public void delete(Long id) {
    productcategoryMapper.deleteByPrimaryKey(id);
  }

  @Override
  public Productcategory findOne(Long id) {
    return productcategoryMapper.selectByPrimaryKey(id);
  }

  @Override
  public void update(Productcategory productcategory) {
    productcategory.setCreateddate(new Date());
    productcategory.setLastmodifieddate(new Date());
    productcategory.setVersion((long)0);
    productcategory.setGrade(0);
    productcategory.setTreepath("0");
    productcategoryMapper.updateByPrimaryKey(productcategory);
  }

}
