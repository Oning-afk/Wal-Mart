package com.walmart.pojo;

import java.io.Serializable;

public class Admin implements Serializable {
    private Long id;

    private String department;

    private String email;

    private String encodedpassword;

    private String name;

    private String username;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }
}