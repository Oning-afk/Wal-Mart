package com.walmart.service;

import com.walmart.entity.PageResult;

/**
 * @program: Wal-Mart
 * @description: 商品-service
 * @author: 张晋浩
 * @create: 2019-09-11 09:19
 **/
public interface ProductService {

    PageResult findProductList(Integer rows, Integer page);

    boolean updateToUp(Long id);

    boolean updateToDown(Long id);
}
