package com.walmart.service;

import com.walmart.entity.PageResult;
import com.walmart.pojo.Brand;

import java.util.List;

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
    /**
     * 品牌管理删除
     * @param ids
     */
    boolean deleteBrand(String[] ids);
    List<Brand> findPage();
}
