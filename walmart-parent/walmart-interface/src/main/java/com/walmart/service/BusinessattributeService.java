package com.walmart.service;

import com.walmart.entity.PageResult;
import com.walmart.pojo.Businessattribute;

import java.util.List;

public interface BusinessattributeService {
    /**
     * 商家注册项 分页查询
     * @param businessattribute
     * @param pageSize
     * @param pageNum
     * @return
     */
    PageResult findPageBusinessattribute(Businessattribute businessattribute, int pageSize, int pageNum);

    /**
     * 商家注册项批删
     * @param ids
     */
    void deleteBusinessattribute(Long[] ids);

    /**
     * 商家注册项编辑
     * @param businessattribute
     * @return
     */
    boolean updateBusinessattribute(Businessattribute businessattribute);

    Businessattribute searchBusinessattributeById(Long id);

    void addBusinessattribute(Businessattribute businessattribute);

    List<Businessattribute> findPage();
}
