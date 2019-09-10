package com.walmart.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Store implements Serializable {
    private Long id;

    private Date createddate;

    private Date lastmodifieddate;

    private Long version;

    private String address;

    private BigDecimal bailpaid;

    private Date discountpromotionenddate;

    private String email;

    private Date enddate;

    private Date fullreductionpromotionenddate;

    private Boolean isenabled;

    private String keyword;

    private String logo;

    private String mobile;

    private String name;

    private String phone;

    private Integer status;

    private Integer type;

    private String zipcode;

    private Long businessId;

    private Long storecategoryId;

    private Long storerankId;

    private String introduction;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public BigDecimal getBailpaid() {
        return bailpaid;
    }

    public void setBailpaid(BigDecimal bailpaid) {
        this.bailpaid = bailpaid;
    }

    public Date getDiscountpromotionenddate() {
        return discountpromotionenddate;
    }

    public void setDiscountpromotionenddate(Date discountpromotionenddate) {
        this.discountpromotionenddate = discountpromotionenddate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public Date getFullreductionpromotionenddate() {
        return fullreductionpromotionenddate;
    }

    public void setFullreductionpromotionenddate(Date fullreductionpromotionenddate) {
        this.fullreductionpromotionenddate = fullreductionpromotionenddate;
    }

    public Boolean getIsenabled() {
        return isenabled;
    }

    public void setIsenabled(Boolean isenabled) {
        this.isenabled = isenabled;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode == null ? null : zipcode.trim();
    }

    public Long getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Long businessId) {
        this.businessId = businessId;
    }

    public Long getStorecategoryId() {
        return storecategoryId;
    }

    public void setStorecategoryId(Long storecategoryId) {
        this.storecategoryId = storecategoryId;
    }

    public Long getStorerankId() {
        return storerankId;
    }

    public void setStorerankId(Long storerankId) {
        this.storerankId = storerankId;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }
}