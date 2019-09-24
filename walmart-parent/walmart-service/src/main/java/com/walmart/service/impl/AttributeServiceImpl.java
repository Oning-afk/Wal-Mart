package com.walmart.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.walmart.entity.PageResult;
import com.walmart.mapper.AttributeMapper;
import com.walmart.mapper.ProductCategoryBeanMapper;
import com.walmart.pojo.Attribute;
import com.walmart.pojo.AttributeAndProductCategoryBeanMapper;
import com.walmart.pojo.AttributeExample;
import com.walmart.pojo.ProductCategoryBean;
import com.walmart.service.AttributeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class AttributeServiceImpl implements AttributeService {
    @Autowired
    private AttributeMapper attributeMapper;

    @Autowired
    private ProductCategoryBeanMapper productCategoryBeanMapper;

    @Override
    public PageResult findAttributeService(Attribute attribute, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageSize,pageNum);
        AttributeExample attributeExample = new AttributeExample();
        AttributeExample.Criteria criteria = attributeExample.createCriteria();
        if (attribute != null){
            if (attribute.getName() != null && attribute.getName() != ""){
                criteria.andNameLike("%"+attribute.getName()+"%");
            }
        }
        Page<Attribute> attributes = (Page<Attribute>) attributeMapper.selectByExample(attributeExample);
        Page<AttributeAndProductCategoryBeanMapper> attributeAndProductCategoryBeanMappers = new Page<>();
        attributeAndProductCategoryBeanMappers.setTotal(attributes.getTotal());
        for (Attribute attribute1 : attributes){
            AttributeAndProductCategoryBeanMapper attributeAndProductCategoryBeanMapper = new AttributeAndProductCategoryBeanMapper();
            attributeAndProductCategoryBeanMapper.setAttribute(attribute1);
            ProductCategoryBean productCategoryBean = productCategoryBeanMapper.selectByPrimaryKey(attribute1.getProductcategoryId());
            attributeAndProductCategoryBeanMapper.setProductCategoryBean(productCategoryBean);
            attributeAndProductCategoryBeanMappers.add(attributeAndProductCategoryBeanMapper);
        }
        return new PageResult(attributeAndProductCategoryBeanMappers.getTotal(),attributeAndProductCategoryBeanMappers.getResult());
    }

    @Override
    public boolean delAttribute(String[] ids) {
        int i =0;
        for (String id: ids){
            i = attributeMapper.deleteByPrimaryKey(Long.parseLong(id));
        }
        if (i>0){
            return true;
        }else{
            return false;
        }
    }

    }

