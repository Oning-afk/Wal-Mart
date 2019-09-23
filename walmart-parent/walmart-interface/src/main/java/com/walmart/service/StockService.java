package com.walmart.service;

import com.walmart.entity.PageResult;
import com.walmart.pojo.Stocklog;
import com.walmart.pojogroup.StocklogSkuGroupBean;

import java.util.List;

public interface StockService {


    PageResult findStockAll(Integer page, Integer rows, Integer skuId, String name);

    List<StocklogSkuGroupBean> findStockAll();
}
