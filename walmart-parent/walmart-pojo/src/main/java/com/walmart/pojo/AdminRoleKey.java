package com.walmart.pojo;

import java.io.Serializable;

public class AdminRoleKey implements Serializable {
    private Long adminsId;

    private Long rolesId;

    public Long getAdminsId() {
        return adminsId;
    }

    public void setAdminsId(Long adminsId) {
        this.adminsId = adminsId;
    }

    public Long getRolesId() {
        return rolesId;
    }

    public void setRolesId(Long rolesId) {
        this.rolesId = rolesId;
    }
}