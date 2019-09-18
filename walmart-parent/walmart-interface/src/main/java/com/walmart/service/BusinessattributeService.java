package com.walmart.service;

import com.walmart.entity.PageResult;
import com.walmart.pojo.Businessattribute;

public interface BusinessattributeService {
    /**
     * 商家注册项 分页查询
     * @param businessattribute
     * @param pageSize
     * @param pageNum
     * @return
     */
    PageResult findPageBusinessattribute(Businessattribute businessattribute, int pageSize , int pageNum);

    /**
     * 商家注册项批删
     * @param ids
     */
    void deleteBusinessattribute(Long[] ids);
}
