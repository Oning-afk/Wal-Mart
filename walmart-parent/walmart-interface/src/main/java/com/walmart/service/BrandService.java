package com.walmart.service;

import com.walmart.entity.PageResult;
import com.walmart.pojo.Brand;

public interface BrandService {

    /**
     * 品牌管理查询
     * @param brand
     * @param pageSize
     * @param pageNum
     * @return
     */
    PageResult findPageBrand(Brand brand, int pageSize, int pageNum);

    /**
     * 品牌管理新增
     * @param brand
     */
    void addBrand(Brand brand);
}
