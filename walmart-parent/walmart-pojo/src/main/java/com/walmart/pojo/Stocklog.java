package com.walmart.pojo;

import java.io.Serializable;
import java.util.Date;

public class Stocklog implements Serializable {
    private Long id;

    private Date createddate;

    private Date lastmodifieddate;

    private Long version;

    private Integer inquantity;

    private String memo;

    private Integer outquantity;

    private Integer stock;

    private Integer type;

    private Long skuId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateddate() {
        return createddate;
    }

    public void setCreateddate(Date createddate) {
        this.createddate = createddate;
    }

    public Date getLastmodifieddate() {
        return lastmodifieddate;
    }

    public void setLastmodifieddate(Date lastmodifieddate) {
        this.lastmodifieddate = lastmodifieddate;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public Integer getInquantity() {
        return inquantity;
    }

    public void setInquantity(Integer inquantity) {
        this.inquantity = inquantity;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public Integer getOutquantity() {
        return outquantity;
    }

    public void setOutquantity(Integer outquantity) {
        this.outquantity = outquantity;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }
}