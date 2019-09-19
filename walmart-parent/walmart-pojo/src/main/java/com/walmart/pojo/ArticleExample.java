package com.walmart.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArticleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArticleExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCreateddateIsNull() {
            addCriterion("createdDate is null");
            return (Criteria) this;
        }

        public Criteria andCreateddateIsNotNull() {
            addCriterion("createdDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreateddateEqualTo(Date value) {
            addCriterion("createdDate =", value, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateNotEqualTo(Date value) {
            addCriterion("createdDate <>", value, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateGreaterThan(Date value) {
            addCriterion("createdDate >", value, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateGreaterThanOrEqualTo(Date value) {
            addCriterion("createdDate >=", value, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateLessThan(Date value) {
            addCriterion("createdDate <", value, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateLessThanOrEqualTo(Date value) {
            addCriterion("createdDate <=", value, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateIn(List<Date> values) {
            addCriterion("createdDate in", values, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateNotIn(List<Date> values) {
            addCriterion("createdDate not in", values, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateBetween(Date value1, Date value2) {
            addCriterion("createdDate between", value1, value2, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateNotBetween(Date value1, Date value2) {
            addCriterion("createdDate not between", value1, value2, "createddate");
            return (Criteria) this;
        }

        public Criteria andLastmodifieddateIsNull() {
            addCriterion("lastModifiedDate is null");
            return (Criteria) this;
        }

        public Criteria andLastmodifieddateIsNotNull() {
            addCriterion("lastModifiedDate is not null");
            return (Criteria) this;
        }

        public Criteria andLastmodifieddateEqualTo(Date value) {
            addCriterion("lastModifiedDate =", value, "lastmodifieddate");
            return (Criteria) this;
        }

        public Criteria andLastmodifieddateNotEqualTo(Date value) {
            addCriterion("lastModifiedDate <>", value, "lastmodifieddate");
            return (Criteria) this;
        }

        public Criteria andLastmodifieddateGreaterThan(Date value) {
            addCriterion("lastModifiedDate >", value, "lastmodifieddate");
            return (Criteria) this;
        }

        public Criteria andLastmodifieddateGreaterThanOrEqualTo(Date value) {
            addCriterion("lastModifiedDate >=", value, "lastmodifieddate");
            return (Criteria) this;
        }

        public Criteria andLastmodifieddateLessThan(Date value) {
            addCriterion("lastModifiedDate <", value, "lastmodifieddate");
            return (Criteria) this;
        }

        public Criteria andLastmodifieddateLessThanOrEqualTo(Date value) {
            addCriterion("lastModifiedDate <=", value, "lastmodifieddate");
            return (Criteria) this;
        }

        public Criteria andLastmodifieddateIn(List<Date> values) {
            addCriterion("lastModifiedDate in", values, "lastmodifieddate");
            return (Criteria) this;
        }

        public Criteria andLastmodifieddateNotIn(List<Date> values) {
            addCriterion("lastModifiedDate not in", values, "lastmodifieddate");
            return (Criteria) this;
        }

        public Criteria andLastmodifieddateBetween(Date value1, Date value2) {
            addCriterion("lastModifiedDate between", value1, value2, "lastmodifieddate");
            return (Criteria) this;
        }

        public Criteria andLastmodifieddateNotBetween(Date value1, Date value2) {
            addCriterion("lastModifiedDate not between", value1, value2, "lastmodifieddate");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Long value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Long value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Long value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Long value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Long value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Long value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Long> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Long> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Long value1, Long value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Long value1, Long value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNull() {
            addCriterion("author is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNotNull() {
            addCriterion("author is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorEqualTo(String value) {
            addCriterion("author =", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotEqualTo(String value) {
            addCriterion("author <>", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThan(String value) {
            addCriterion("author >", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("author >=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThan(String value) {
            addCriterion("author <", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThanOrEqualTo(String value) {
            addCriterion("author <=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLike(String value) {
            addCriterion("author like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotLike(String value) {
            addCriterion("author not like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorIn(List<String> values) {
            addCriterion("author in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotIn(List<String> values) {
            addCriterion("author not in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorBetween(String value1, String value2) {
            addCriterion("author between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotBetween(String value1, String value2) {
            addCriterion("author not between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andHitsIsNull() {
            addCriterion("hits is null");
            return (Criteria) this;
        }

        public Criteria andHitsIsNotNull() {
            addCriterion("hits is not null");
            return (Criteria) this;
        }

        public Criteria andHitsEqualTo(Long value) {
            addCriterion("hits =", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsNotEqualTo(Long value) {
            addCriterion("hits <>", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsGreaterThan(Long value) {
            addCriterion("hits >", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsGreaterThanOrEqualTo(Long value) {
            addCriterion("hits >=", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsLessThan(Long value) {
            addCriterion("hits <", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsLessThanOrEqualTo(Long value) {
            addCriterion("hits <=", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsIn(List<Long> values) {
            addCriterion("hits in", values, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsNotIn(List<Long> values) {
            addCriterion("hits not in", values, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsBetween(Long value1, Long value2) {
            addCriterion("hits between", value1, value2, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsNotBetween(Long value1, Long value2) {
            addCriterion("hits not between", value1, value2, "hits");
            return (Criteria) this;
        }

        public Criteria andIspublicationIsNull() {
            addCriterion("isPublication is null");
            return (Criteria) this;
        }

        public Criteria andIspublicationIsNotNull() {
            addCriterion("isPublication is not null");
            return (Criteria) this;
        }

        public Criteria andIspublicationEqualTo(Boolean value) {
            addCriterion("isPublication =", value, "ispublication");
            return (Criteria) this;
        }

        public Criteria andIspublicationNotEqualTo(Boolean value) {
            addCriterion("isPublication <>", value, "ispublication");
            return (Criteria) this;
        }

        public Criteria andIspublicationGreaterThan(Boolean value) {
            addCriterion("isPublication >", value, "ispublication");
            return (Criteria) this;
        }

        public Criteria andIspublicationGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isPublication >=", value, "ispublication");
            return (Criteria) this;
        }

        public Criteria andIspublicationLessThan(Boolean value) {
            addCriterion("isPublication <", value, "ispublication");
            return (Criteria) this;
        }

        public Criteria andIspublicationLessThanOrEqualTo(Boolean value) {
            addCriterion("isPublication <=", value, "ispublication");
            return (Criteria) this;
        }

        public Criteria andIspublicationIn(List<Boolean> values) {
            addCriterion("isPublication in", values, "ispublication");
            return (Criteria) this;
        }

        public Criteria andIspublicationNotIn(List<Boolean> values) {
            addCriterion("isPublication not in", values, "ispublication");
            return (Criteria) this;
        }

        public Criteria andIspublicationBetween(Boolean value1, Boolean value2) {
            addCriterion("isPublication between", value1, value2, "ispublication");
            return (Criteria) this;
        }

        public Criteria andIspublicationNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isPublication not between", value1, value2, "ispublication");
            return (Criteria) this;
        }

        public Criteria andIstopIsNull() {
            addCriterion("isTop is null");
            return (Criteria) this;
        }

        public Criteria andIstopIsNotNull() {
            addCriterion("isTop is not null");
            return (Criteria) this;
        }

        public Criteria andIstopEqualTo(Boolean value) {
            addCriterion("isTop =", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopNotEqualTo(Boolean value) {
            addCriterion("isTop <>", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopGreaterThan(Boolean value) {
            addCriterion("isTop >", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isTop >=", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopLessThan(Boolean value) {
            addCriterion("isTop <", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopLessThanOrEqualTo(Boolean value) {
            addCriterion("isTop <=", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopIn(List<Boolean> values) {
            addCriterion("isTop in", values, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopNotIn(List<Boolean> values) {
            addCriterion("isTop not in", values, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopBetween(Boolean value1, Boolean value2) {
            addCriterion("isTop between", value1, value2, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isTop not between", value1, value2, "istop");
            return (Criteria) this;
        }

        public Criteria andSeodescriptionIsNull() {
            addCriterion("seoDescription is null");
            return (Criteria) this;
        }

        public Criteria andSeodescriptionIsNotNull() {
            addCriterion("seoDescription is not null");
            return (Criteria) this;
        }

        public Criteria andSeodescriptionEqualTo(String value) {
            addCriterion("seoDescription =", value, "seodescription");
            return (Criteria) this;
        }

        public Criteria andSeodescriptionNotEqualTo(String value) {
            addCriterion("seoDescription <>", value, "seodescription");
            return (Criteria) this;
        }

        public Criteria andSeodescriptionGreaterThan(String value) {
            addCriterion("seoDescription >", value, "seodescription");
            return (Criteria) this;
        }

        public Criteria andSeodescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("seoDescription >=", value, "seodescription");
            return (Criteria) this;
        }

        public Criteria andSeodescriptionLessThan(String value) {
            addCriterion("seoDescription <", value, "seodescription");
            return (Criteria) this;
        }

        public Criteria andSeodescriptionLessThanOrEqualTo(String value) {
            addCriterion("seoDescription <=", value, "seodescription");
            return (Criteria) this;
        }

        public Criteria andSeodescriptionLike(String value) {
            addCriterion("seoDescription like", value, "seodescription");
            return (Criteria) this;
        }

        public Criteria andSeodescriptionNotLike(String value) {
            addCriterion("seoDescription not like", value, "seodescription");
            return (Criteria) this;
        }

        public Criteria andSeodescriptionIn(List<String> values) {
            addCriterion("seoDescription in", values, "seodescription");
            return (Criteria) this;
        }

        public Criteria andSeodescriptionNotIn(List<String> values) {
            addCriterion("seoDescription not in", values, "seodescription");
            return (Criteria) this;
        }

        public Criteria andSeodescriptionBetween(String value1, String value2) {
            addCriterion("seoDescription between", value1, value2, "seodescription");
            return (Criteria) this;
        }

        public Criteria andSeodescriptionNotBetween(String value1, String value2) {
            addCriterion("seoDescription not between", value1, value2, "seodescription");
            return (Criteria) this;
        }

        public Criteria andSeokeywordsIsNull() {
            addCriterion("seoKeywords is null");
            return (Criteria) this;
        }

        public Criteria andSeokeywordsIsNotNull() {
            addCriterion("seoKeywords is not null");
            return (Criteria) this;
        }

        public Criteria andSeokeywordsEqualTo(String value) {
            addCriterion("seoKeywords =", value, "seokeywords");
            return (Criteria) this;
        }

        public Criteria andSeokeywordsNotEqualTo(String value) {
            addCriterion("seoKeywords <>", value, "seokeywords");
            return (Criteria) this;
        }

        public Criteria andSeokeywordsGreaterThan(String value) {
            addCriterion("seoKeywords >", value, "seokeywords");
            return (Criteria) this;
        }

        public Criteria andSeokeywordsGreaterThanOrEqualTo(String value) {
            addCriterion("seoKeywords >=", value, "seokeywords");
            return (Criteria) this;
        }

        public Criteria andSeokeywordsLessThan(String value) {
            addCriterion("seoKeywords <", value, "seokeywords");
            return (Criteria) this;
        }

        public Criteria andSeokeywordsLessThanOrEqualTo(String value) {
            addCriterion("seoKeywords <=", value, "seokeywords");
            return (Criteria) this;
        }

        public Criteria andSeokeywordsLike(String value) {
            addCriterion("seoKeywords like", value, "seokeywords");
            return (Criteria) this;
        }

        public Criteria andSeokeywordsNotLike(String value) {
            addCriterion("seoKeywords not like", value, "seokeywords");
            return (Criteria) this;
        }

        public Criteria andSeokeywordsIn(List<String> values) {
            addCriterion("seoKeywords in", values, "seokeywords");
            return (Criteria) this;
        }

        public Criteria andSeokeywordsNotIn(List<String> values) {
            addCriterion("seoKeywords not in", values, "seokeywords");
            return (Criteria) this;
        }

        public Criteria andSeokeywordsBetween(String value1, String value2) {
            addCriterion("seoKeywords between", value1, value2, "seokeywords");
            return (Criteria) this;
        }

        public Criteria andSeokeywordsNotBetween(String value1, String value2) {
            addCriterion("seoKeywords not between", value1, value2, "seokeywords");
            return (Criteria) this;
        }

        public Criteria andSeotitleIsNull() {
            addCriterion("seoTitle is null");
            return (Criteria) this;
        }

        public Criteria andSeotitleIsNotNull() {
            addCriterion("seoTitle is not null");
            return (Criteria) this;
        }

        public Criteria andSeotitleEqualTo(String value) {
            addCriterion("seoTitle =", value, "seotitle");
            return (Criteria) this;
        }

        public Criteria andSeotitleNotEqualTo(String value) {
            addCriterion("seoTitle <>", value, "seotitle");
            return (Criteria) this;
        }

        public Criteria andSeotitleGreaterThan(String value) {
            addCriterion("seoTitle >", value, "seotitle");
            return (Criteria) this;
        }

        public Criteria andSeotitleGreaterThanOrEqualTo(String value) {
            addCriterion("seoTitle >=", value, "seotitle");
            return (Criteria) this;
        }

        public Criteria andSeotitleLessThan(String value) {
            addCriterion("seoTitle <", value, "seotitle");
            return (Criteria) this;
        }

        public Criteria andSeotitleLessThanOrEqualTo(String value) {
            addCriterion("seoTitle <=", value, "seotitle");
            return (Criteria) this;
        }

        public Criteria andSeotitleLike(String value) {
            addCriterion("seoTitle like", value, "seotitle");
            return (Criteria) this;
        }

        public Criteria andSeotitleNotLike(String value) {
            addCriterion("seoTitle not like", value, "seotitle");
            return (Criteria) this;
        }

        public Criteria andSeotitleIn(List<String> values) {
            addCriterion("seoTitle in", values, "seotitle");
            return (Criteria) this;
        }

        public Criteria andSeotitleNotIn(List<String> values) {
            addCriterion("seoTitle not in", values, "seotitle");
            return (Criteria) this;
        }

        public Criteria andSeotitleBetween(String value1, String value2) {
            addCriterion("seoTitle between", value1, value2, "seotitle");
            return (Criteria) this;
        }

        public Criteria andSeotitleNotBetween(String value1, String value2) {
            addCriterion("seoTitle not between", value1, value2, "seotitle");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andArticlecategoryIdIsNull() {
            addCriterion("articleCategory_id is null");
            return (Criteria) this;
        }

        public Criteria andArticlecategoryIdIsNotNull() {
            addCriterion("articleCategory_id is not null");
            return (Criteria) this;
        }

        public Criteria andArticlecategoryIdEqualTo(Long value) {
            addCriterion("articleCategory_id =", value, "articlecategoryId");
            return (Criteria) this;
        }

        public Criteria andArticlecategoryIdNotEqualTo(Long value) {
            addCriterion("articleCategory_id <>", value, "articlecategoryId");
            return (Criteria) this;
        }

        public Criteria andArticlecategoryIdGreaterThan(Long value) {
            addCriterion("articleCategory_id >", value, "articlecategoryId");
            return (Criteria) this;
        }

        public Criteria andArticlecategoryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("articleCategory_id >=", value, "articlecategoryId");
            return (Criteria) this;
        }

        public Criteria andArticlecategoryIdLessThan(Long value) {
            addCriterion("articleCategory_id <", value, "articlecategoryId");
            return (Criteria) this;
        }

        public Criteria andArticlecategoryIdLessThanOrEqualTo(Long value) {
            addCriterion("articleCategory_id <=", value, "articlecategoryId");
            return (Criteria) this;
        }

        public Criteria andArticlecategoryIdIn(List<Long> values) {
            addCriterion("articleCategory_id in", values, "articlecategoryId");
            return (Criteria) this;
        }

        public Criteria andArticlecategoryIdNotIn(List<Long> values) {
            addCriterion("articleCategory_id not in", values, "articlecategoryId");
            return (Criteria) this;
        }

        public Criteria andArticlecategoryIdBetween(Long value1, Long value2) {
            addCriterion("articleCategory_id between", value1, value2, "articlecategoryId");
            return (Criteria) this;
        }

        public Criteria andArticlecategoryIdNotBetween(Long value1, Long value2) {
            addCriterion("articleCategory_id not between", value1, value2, "articlecategoryId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}