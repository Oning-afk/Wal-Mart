package com.walmart.service.impl;

import com.alibaba.druid.support.json.JSONUtils;
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

import java.util.ArrayList;
import java.util.Date;
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
        Page<Attribute> attributes = (Page<Attribute>) attributeMapper.selectByExampleWithBLOBs(attributeExample);
        Page<AttributeAndProductCategoryBeanMapper> attributeAndProductCategoryBeanMappers = new Page<>();
        attributeAndProductCategoryBeanMappers.setTotal(attributes.getTotal());
        for (Attribute attribute1 : attributes){
            String options = attribute1.getOptions();
            String option = "";
            if(options != null){
                List<String> parse = (List<String>) JSONUtils.parse(options);
                for (String s : parse) {
                    option += s +" ";
                }
            }
            attribute1.setOptions(option);
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

    /**
     * 商品属性 新增
     * @param attribute
     */
    @Override
    public void addAttribute(Attribute attribute) {
        attribute.setCreateddate(new Date());
        attribute.setLastmodifieddate(new Date());
        attribute.setVersion((long) 0);
        attribute.setPropertyindex(0);
        attribute.setProductcategoryId((long) 41);
        attributeMapper.insert(attribute);
    }

    @Override
    public List<Attribute> attributeQuery() {

        return attributeMapper.selectByExample(null);
    }

    @Override
    public Attribute seachAttribute(Long id) {
        return attributeMapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean edAttribute(Attribute attribute) {

        return attributeMapper.updateByPrimaryKeySelective(attribute) > 0;
    }

    @Override
    public List<AttributeAndProductCategoryBeanMapper> findStockAll() {
        List<Attribute> attributes = attributeMapper.selectByExample(null);
        int count = attributeMapper.countByExample(null);
        List<AttributeAndProductCategoryBeanMapper> attributeAndProductCategoryBeanMappers = new ArrayList<>();
        for (Attribute attribute1 : attributes){

            AttributeAndProductCategoryBeanMapper attributeAndProductCategoryBeanMapper = new AttributeAndProductCategoryBeanMapper();
            attributeAndProductCategoryBeanMapper.setAttribute(attribute1);
            ProductCategoryBean productCategoryBean = productCategoryBeanMapper.selectByPrimaryKey(attribute1.getProductcategoryId());
            attributeAndProductCategoryBeanMapper.setProductCategoryBean(productCategoryBean);
            attributeAndProductCategoryBeanMappers.add(attributeAndProductCategoryBeanMapper);
        }
        return attributeAndProductCategoryBeanMappers;
    }

}