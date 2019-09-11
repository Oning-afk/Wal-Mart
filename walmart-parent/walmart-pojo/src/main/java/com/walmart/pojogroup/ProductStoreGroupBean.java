package com.walmart.pojogroup;

import com.walmart.pojo.Product;
import com.walmart.pojo.ProductCategoryBean;
import com.walmart.pojo.Store;

import java.io.Serializable;

/**
 * @program: Wal-Mart
 * @description: 商品-商品管理联合实体类
 * @author: 张晋浩
 * @create: 2019-09-11 09:28
 **/
public class ProductStoreGroupBean implements Serializable {

    private Product product;

    private Store store;

    private ProductCategoryBean productCategoryBean;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public ProductCategoryBean getProductCategoryBean() {
        return productCategoryBean;
    }

    public void setProductCategoryBean(ProductCategoryBean productCategoryBean) {
        this.productCategoryBean = productCategoryBean;
    }

    @Override
    public String toString() {
        return "ProductStoreGroupBean{" +
                "product=" + product +
                ", store=" + store +
                ", productCategoryBean=" + productCategoryBean +
                '}';
    }
}
