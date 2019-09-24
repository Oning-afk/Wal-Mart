package com.walmart.service;

import com.walmart.entity.PageResult;
import com.walmart.pojo.Attribute;

public interface AttributeService {

    /**
     * 商品属性 查询分页
     * @param attribute
     * @param pageSize
     * @param pageNum
     * @return
     */
    PageResult findAttributeService(Attribute attribute, Integer pageSize, Integer pageNum);

    /**
     * 规格管理 批量删除
     * @param ids
     * @return
     */
    boolean delAttribute(String[] ids);
}
