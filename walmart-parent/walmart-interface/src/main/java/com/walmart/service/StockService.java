package com.walmart.service;

import com.walmart.entity.PageResult;

public interface StockService {


    PageResult findStockAll(Integer page, Integer rows);
}
