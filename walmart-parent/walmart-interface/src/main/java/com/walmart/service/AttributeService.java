package com.walmart.service;

import com.walmart.entity.PageResult;
import com.walmart.pojo.Attribute;
import com.walmart.pojo.AttributeAndProductCategoryBeanMapper;

import java.util.List;

public interface AttributeService {

    /**
     * 商品属性 查询分页
     * @param attribute
     * @param pageSize
     * @param pageNum
     * @return
     */
    PageResult findAttributeService(Attribute attribute,Integer pageSize,Integer pageNum);

    /**
     * 商品属性 批量删除
     * @param ids
     * @return
     */
    boolean delAttribute(String [] ids);

    /**
     * 商品属性 新增
     * @param attribute
     */
    public void addAttribute(Attribute attribute);

    public List<Attribute> attributeQuery();

    /**
     * 商品属性 回显
     * @param id
     * @return
     */
    Attribute seachAttribute(Long id);

    /**
     * 商品属性 修改
     * @param attribute
     * @return
     */
    boolean edAttribute(Attribute attribute);

    public List<AttributeAndProductCategoryBeanMapper> findStockAll();
}
