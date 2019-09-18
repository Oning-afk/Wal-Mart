package com.walmart.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.walmart.entity.PageResult;
import com.walmart.mapper.ProductCategoryBeanMapper;
import com.walmart.mapper.ProductMapper;
import com.walmart.mapper.StoreMapper;
import com.walmart.pojo.Product;
import com.walmart.pojo.ProductCategoryBean;
import com.walmart.pojo.ProductWithBLOBs;
import com.walmart.pojo.Store;
import com.walmart.pojogroup.ProductStoreGroupBean;
import com.walmart.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: Wal-Mart
 * @description: 商品-业务处理层
 * @author: 张晋浩
 * @create: 2019-09-11 09:33
 **/
@Service
public class ProductServiceImpl implements ProductService {


    @Autowired
    private ProductMapper productMapper;

    @Autowired
    private StoreMapper storeMapper;

    @Autowired
    private ProductCategoryBeanMapper productCategoryBeanMapper;



    @Override
    public PageResult findProductList(Integer rows , Integer page) {
        PageHelper.startPage(page,rows);
        PageResult pageResult = new PageResult();
        List<Product> products = productMapper.selectByExample(null);
        int count = productMapper.countByExample(null);
        List<ProductStoreGroupBean> productStoreGroupBeans = new ArrayList<>();
        for (Product product : products) {
            ProductStoreGroupBean productStoreGroupBean = new ProductStoreGroupBean();
            Store store = storeMapper.selectByPrimaryKey(product.getStoreId());
            ProductCategoryBean productCategoryBean = productCategoryBeanMapper.selectByPrimaryKey(product.getProductcategoryId());
            productStoreGroupBean.setStore(store);
            productStoreGroupBean.setProduct(product);
            productStoreGroupBean.setProductCategoryBean(productCategoryBean);
            productStoreGroupBeans.add(productStoreGroupBean);
        }
        pageResult.setTotal(count);
        pageResult.setRows(productStoreGroupBeans);
        return pageResult;
    }

    @Override
    public boolean updateToUp(Long id) {
        ProductWithBLOBs productWithBLOBs = productMapper.selectByPrimaryKey(id);
        productWithBLOBs.setIsmarketable(true);
        return productMapper.updateByPrimaryKeyWithBLOBs(productWithBLOBs) >0;
    }

    @Override
    public boolean updateToDown(Long id) {
        ProductWithBLOBs productWithBLOBs = productMapper.selectByPrimaryKey(id);
        productWithBLOBs.setIsmarketable(false);
        return productMapper.updateByPrimaryKeyWithBLOBs(productWithBLOBs) >0;
    }

    @Override
    public boolean deleteProduct(Long[] ids) {
        for (Long id : ids) {
            productMapper.deleteByPrimaryKey(id);
        }
        return true;
    }
}
