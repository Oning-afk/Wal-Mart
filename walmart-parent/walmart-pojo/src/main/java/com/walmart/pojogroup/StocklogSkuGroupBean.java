package com.walmart.pojogroup;

import com.walmart.pojo.ProductWithBLOBs;
import com.walmart.pojo.Sku;
import com.walmart.pojo.Stocklog;

import java.io.Serializable;

/**
 * @program: Wal-Mart
 * @description: 商品-库存管理-联合实体bean
 * @author: 张晋浩
 * @create: 2019-09-11 20:57
 **/
public class StocklogSkuGroupBean implements Serializable {

    private Stocklog stocklog;

    private Sku sku;

    private ProductWithBLOBs productWithBLOBs;

    public Stocklog getStocklog() {
        return stocklog;
    }

    public void setStocklog(Stocklog stocklog) {
        this.stocklog = stocklog;
    }

    public Sku getSku() {
        return sku;
    }

    public void setSku(Sku sku) {
        this.sku = sku;
    }

    public ProductWithBLOBs getProductWithBLOBs() {
        return productWithBLOBs;
    }

    public void setProductWithBLOBs(ProductWithBLOBs productWithBLOBs) {
        this.productWithBLOBs = productWithBLOBs;
    }

    @Override
    public String toString() {
        return "StocklogSkuGroupBean{" +
                "stocklog=" + stocklog +
                ", sku=" + sku +
                ", productWithBLOBs=" + productWithBLOBs +
                '}';
    }
}
