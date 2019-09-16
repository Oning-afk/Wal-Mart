package com.walmart.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Member implements Serializable {
    private Long id;

    private String address;

    private BigDecimal amount;

    private String attributevalue0;

    private String attributevalue1;

    private String attributevalue2;

    private String attributevalue3;

    private String attributevalue4;

    private String attributevalue5;

    private String attributevalue6;

    private String attributevalue7;

    private String attributevalue8;

    private String attributevalue9;

    private BigDecimal balance;

    private Date birth;

    private String email;

    private String encodedpassword;

    private Integer gender;

    private String mobile;

    private String name;

    private String phone;

    private Long point;

    private Date safekeyexpire;

    private String safekeyvalue;

    private String username;

    private String zipcode;

    private Long areaId;

    private Long memberrankId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getAttributevalue0() {
        return attributevalue0;
    }

    public void setAttributevalue0(String attributevalue0) {
        this.attributevalue0 = attributevalue0 == null ? null : attributevalue0.trim();
    }

    public String getAttributevalue1() {
        return attributevalue1;
    }

    public void setAttributevalue1(String attributevalue1) {
        this.attributevalue1 = attributevalue1 == null ? null : attributevalue1.trim();
    }

    public String getAttributevalue2() {
        return attributevalue2;
    }

    public void setAttributevalue2(String attributevalue2) {
        this.attributevalue2 = attributevalue2 == null ? null : attributevalue2.trim();
    }

    public String getAttributevalue3() {
        return attributevalue3;
    }

    public void setAttributevalue3(String attributevalue3) {
        this.attributevalue3 = attributevalue3 == null ? null : attributevalue3.trim();
    }

    public String getAttributevalue4() {
        return attributevalue4;
    }

    public void setAttributevalue4(String attributevalue4) {
        this.attributevalue4 = attributevalue4 == null ? null : attributevalue4.trim();
    }

    public String getAttributevalue5() {
        return attributevalue5;
    }

    public void setAttributevalue5(String attributevalue5) {
        this.attributevalue5 = attributevalue5 == null ? null : attributevalue5.trim();
    }

    public String getAttributevalue6() {
        return attributevalue6;
    }

    public void setAttributevalue6(String attributevalue6) {
        this.attributevalue6 = attributevalue6 == null ? null : attributevalue6.trim();
    }

    public String getAttributevalue7() {
        return attributevalue7;
    }

    public void setAttributevalue7(String attributevalue7) {
        this.attributevalue7 = attributevalue7 == null ? null : attributevalue7.trim();
    }

    public String getAttributevalue8() {
        return attributevalue8;
    }

    public void setAttributevalue8(String attributevalue8) {
        this.attributevalue8 = attributevalue8 == null ? null : attributevalue8.trim();
    }

    public String getAttributevalue9() {
        return attributevalue9;
    }

    public void setAttributevalue9(String attributevalue9) {
        this.attributevalue9 = attributevalue9 == null ? null : attributevalue9.trim();
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getEncodedpassword() {
        return encodedpassword;
    }

    public void setEncodedpassword(String encodedpassword) {
        this.encodedpassword = encodedpassword == null ? null : encodedpassword.trim();
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
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

    public Long getPoint() {
        return point;
    }

    public void setPoint(Long point) {
        this.point = point;
    }

    public Date getSafekeyexpire() {
        return safekeyexpire;
    }

    public void setSafekeyexpire(Date safekeyexpire) {
        this.safekeyexpire = safekeyexpire;
    }

    public String getSafekeyvalue() {
        return safekeyvalue;
    }

    public void setSafekeyvalue(String safekeyvalue) {
        this.safekeyvalue = safekeyvalue == null ? null : safekeyvalue.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode == null ? null : zipcode.trim();
    }

    public Long getAreaId() {
        return areaId;
    }

    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }

    public Long getMemberrankId() {
        return memberrankId;
    }

    public void setMemberrankId(Long memberrankId) {
        this.memberrankId = memberrankId;
    }
}