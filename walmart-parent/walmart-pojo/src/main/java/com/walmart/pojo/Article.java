package com.walmart.pojo;

import java.io.Serializable;
import java.util.Date;

public class Article implements Serializable {
    private Long id;

    private Date createddate;

    private Date lastmodifieddate;

    private Long version;

    private String author;

    private Long hits;

    private Boolean ispublication;

    private Boolean istop;

    private String seodescription;

    private String seokeywords;

    private String seotitle;

    private String title;

    private Integer type;

    private Long articlecategoryId;

    private String content;

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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public Long getHits() {
        return hits;
    }

    public void setHits(Long hits) {
        this.hits = hits;
    }

    public Boolean getIspublication() {
        return ispublication;
    }

    public void setIspublication(Boolean ispublication) {
        this.ispublication = ispublication;
    }

    public Boolean getIstop() {
        return istop;
    }

    public void setIstop(Boolean istop) {
        this.istop = istop;
    }

    public String getSeodescription() {
        return seodescription;
    }

    public void setSeodescription(String seodescription) {
        this.seodescription = seodescription == null ? null : seodescription.trim();
    }

    public String getSeokeywords() {
        return seokeywords;
    }

    public void setSeokeywords(String seokeywords) {
        this.seokeywords = seokeywords == null ? null : seokeywords.trim();
    }

    public String getSeotitle() {
        return seotitle;
    }

    public void setSeotitle(String seotitle) {
        this.seotitle = seotitle == null ? null : seotitle.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Long getArticlecategoryId() {
        return articlecategoryId;
    }

    public void setArticlecategoryId(Long articlecategoryId) {
        this.articlecategoryId = articlecategoryId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}