package com.walmart.service;

import com.walmart.entity.PageResult;
import com.walmart.pojo.Storeproductcategory;

import java.util.List;

public interface SptegoryService {
    List<Storeproductcategory> findsproductcategory();

    void savesproductcategory(Storeproductcategory storeproductcategory);

    void delsproductcategoryall(Long[] id);

    PageResult findAll(Storeproductcategory storeproductcategory, Integer page, Integer rows);
}
