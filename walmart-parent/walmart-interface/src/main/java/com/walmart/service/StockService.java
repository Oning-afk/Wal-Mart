package com.walmart.service;

import com.walmart.entity.PageResult;
import com.walmart.pojogroup.StocklogSkuGroupBean;

import java.util.List;

public interface StockService {


    PageResult findStockAll(Integer page, Integer rows);

    List<StocklogSkuGroupBean> findStockAll();
}
