package com.walmart.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
@Data
public class Businessattribute implements Serializable {
    private Long id;

    private Date createddate;

    private Date lastmodifieddate;

    private Long version;

    private Integer orders;

    private Integer isenabled;

    private Integer isrequired;

    private String name;

    private String pattern;

    private Integer propertyindex;

    private Integer type;

    private String options;


}