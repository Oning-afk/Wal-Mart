package com.walmart.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Sku implements Serializable {
    private Long id;

    private Date createddate;

    private Date lastmodifieddate;

    private Long version;

    private Integer allocatedstock;

    private BigDecimal cost;

    private Long exchangepoint;

    private Boolean isdefault;

    private BigDecimal marketprice;

    private BigDecimal price;

    private Long rewardpoint;

    private String sn;

    private Integer stock;

    private Long productId;

    private String specificationvalues;

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

    public Integer getAllocatedstock() {
        return allocatedstock;
    }

    public void setAllocatedstock(Integer allocatedstock) {
        this.allocatedstock = allocatedstock;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public Long getExchangepoint() {
        return exchangepoint;
    }

    public void setExchangepoint(Long exchangepoint) {
        this.exchangepoint = exchangepoint;
    }

    public Boolean getIsdefault() {
        return isdefault;
    }

    public void setIsdefault(Boolean isdefault) {
        this.isdefault = isdefault;
    }

    public BigDecimal getMarketprice() {
        return marketprice;
    }

    public void setMarketprice(BigDecimal marketprice) {
        this.marketprice = marketprice;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Long getRewardpoint() {
        return rewardpoint;
    }

    public void setRewardpoint(Long rewardpoint) {
        this.rewardpoint = rewardpoint;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn == null ? null : sn.trim();
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getSpecificationvalues() {
        return specificationvalues;
    }

    public void setSpecificationvalues(String specificationvalues) {
        this.specificationvalues = specificationvalues == null ? null : specificationvalues.trim();
    }
}