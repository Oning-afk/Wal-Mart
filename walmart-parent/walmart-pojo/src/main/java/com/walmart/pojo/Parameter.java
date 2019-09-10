package com.walmart.pojo;

import java.io.Serializable;
import java.util.Date;

public class Parameter implements Serializable {
    private Long id;

    private Date createddate;

    private Date lastmodifieddate;

    private Long version;

    private Integer orders;

    private String parametergroup;

    private Long productcategoryId;

    private String names;

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

    public Integer getOrders() {
        return orders;
    }

    public void setOrders(Integer orders) {
        this.orders = orders;
    }

    public String getParametergroup() {
        return parametergroup;
    }

    public void setParametergroup(String parametergroup) {
        this.parametergroup = parametergroup == null ? null : parametergroup.trim();
    }

    public Long getProductcategoryId() {
        return productcategoryId;
    }

    public void setProductcategoryId(Long productcategoryId) {
        this.productcategoryId = productcategoryId;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names == null ? null : names.trim();
    }
}