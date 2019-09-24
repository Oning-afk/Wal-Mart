package com.walmart.pojo;

import java.io.Serializable;

/**
 * @program: walmart-parent
 * @description: 产品数量实体bean
 * @author: 张晋浩
 * @create: 2019-09-24 14:04
 **/
public class ProductEnmu implements Serializable {

    private long skuId;

    private Integer quantity;

    public long getSkuId() {
        return skuId;
    }

    public void setSkuId(long skuId) {
        this.skuId = skuId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "ProductEnmu{" +
                "skuId=" + skuId +
                ", quantity=" + quantity +
                '}';
    }
}
