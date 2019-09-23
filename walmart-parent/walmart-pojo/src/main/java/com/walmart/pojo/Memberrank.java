package com.walmart.pojo;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
@Data
public class Memberrank implements Serializable {
    private Long id;

    private Date createddate;

    private Date lastmodifieddate;

    private Long version;

    private BigDecimal amount;

    private int isdefault;

    private Boolean isspecial;

    private String name;

    private Double scale;


}