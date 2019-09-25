package com.walmart.service;

import com.walmart.entity.PageResult;
import com.walmart.pojo.Product;
import com.walmart.pojo.ProductWithBLOBs;
import com.walmart.pojogroup.ProductStoreGroupBean;

import java.util.List;

/**
 * @program: Wal-Mart
 * @description: 商品-service
 * @author: 张晋浩
 * @create: 2019-09-11 09:19
 **/
public interface ProductService {

    PageResult findProductList(Integer rows, Integer page,String name);

    boolean updateToUp(Long id);

    boolean updateToDown(Long id);

    boolean deleteProduct(Long[] ids);

    List<ProductStoreGroupBean> findProductAll();

    List<Product> queryHotPhone();

    List<Product> queryHotComputer();

    List<Product> queryHotTv();

    ProductStoreGroupBean queryProductById(Long id);

}
