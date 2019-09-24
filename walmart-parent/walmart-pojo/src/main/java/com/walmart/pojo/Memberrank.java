package com.walmart.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Memberrank implements Serializable {
    private Long id;

    private Date createddate;

    private Date lastmodifieddate;

    private Long version;

    private BigDecimal amount;

    private Boolean isdefault;

    private Boolean isspecial;

    private String name;

    private Double scale;

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

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Boolean getIsdefault() {
        return isdefault;
    }

    public void setIsdefault(Boolean isdefault) {
        this.isdefault = isdefault;
    }

    public Boolean getIsspecial() {
        return isspecial;
    }

    public void setIsspecial(Boolean isspecial) {
        this.isspecial = isspecial;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Double getScale() {
        return scale;
    }

    public void setScale(Double scale) {
        this.scale = scale;
    }
}