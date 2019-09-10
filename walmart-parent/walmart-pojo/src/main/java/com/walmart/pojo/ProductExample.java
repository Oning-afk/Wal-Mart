package com.walmart.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductExample() {
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

        public Criteria andAttributevalue0IsNull() {
            addCriterion("attributeValue0 is null");
            return (Criteria) this;
        }

        public Criteria andAttributevalue0IsNotNull() {
            addCriterion("attributeValue0 is not null");
            return (Criteria) this;
        }

        public Criteria andAttributevalue0EqualTo(String value) {
            addCriterion("attributeValue0 =", value, "attributevalue0");
            return (Criteria) this;
        }

        public Criteria andAttributevalue0NotEqualTo(String value) {
            addCriterion("attributeValue0 <>", value, "attributevalue0");
            return (Criteria) this;
        }

        public Criteria andAttributevalue0GreaterThan(String value) {
            addCriterion("attributeValue0 >", value, "attributevalue0");
            return (Criteria) this;
        }

        public Criteria andAttributevalue0GreaterThanOrEqualTo(String value) {
            addCriterion("attributeValue0 >=", value, "attributevalue0");
            return (Criteria) this;
        }

        public Criteria andAttributevalue0LessThan(String value) {
            addCriterion("attributeValue0 <", value, "attributevalue0");
            return (Criteria) this;
        }

        public Criteria andAttributevalue0LessThanOrEqualTo(String value) {
            addCriterion("attributeValue0 <=", value, "attributevalue0");
            return (Criteria) this;
        }

        public Criteria andAttributevalue0Like(String value) {
            addCriterion("attributeValue0 like", value, "attributevalue0");
            return (Criteria) this;
        }

        public Criteria andAttributevalue0NotLike(String value) {
            addCriterion("attributeValue0 not like", value, "attributevalue0");
            return (Criteria) this;
        }

        public Criteria andAttributevalue0In(List<String> values) {
            addCriterion("attributeValue0 in", values, "attributevalue0");
            return (Criteria) this;
        }

        public Criteria andAttributevalue0NotIn(List<String> values) {
            addCriterion("attributeValue0 not in", values, "attributevalue0");
            return (Criteria) this;
        }

        public Criteria andAttributevalue0Between(String value1, String value2) {
            addCriterion("attributeValue0 between", value1, value2, "attributevalue0");
            return (Criteria) this;
        }

        public Criteria andAttributevalue0NotBetween(String value1, String value2) {
            addCriterion("attributeValue0 not between", value1, value2, "attributevalue0");
            return (Criteria) this;
        }

        public Criteria andAttributevalue1IsNull() {
            addCriterion("attributeValue1 is null");
            return (Criteria) this;
        }

        public Criteria andAttributevalue1IsNotNull() {
            addCriterion("attributeValue1 is not null");
            return (Criteria) this;
        }

        public Criteria andAttributevalue1EqualTo(String value) {
            addCriterion("attributeValue1 =", value, "attributevalue1");
            return (Criteria) this;
        }

        public Criteria andAttributevalue1NotEqualTo(String value) {
            addCriterion("attributeValue1 <>", value, "attributevalue1");
            return (Criteria) this;
        }

        public Criteria andAttributevalue1GreaterThan(String value) {
            addCriterion("attributeValue1 >", value, "attributevalue1");
            return (Criteria) this;
        }

        public Criteria andAttributevalue1GreaterThanOrEqualTo(String value) {
            addCriterion("attributeValue1 >=", value, "attributevalue1");
            return (Criteria) this;
        }

        public Criteria andAttributevalue1LessThan(String value) {
            addCriterion("attributeValue1 <", value, "attributevalue1");
            return (Criteria) this;
        }

        public Criteria andAttributevalue1LessThanOrEqualTo(String value) {
            addCriterion("attributeValue1 <=", value, "attributevalue1");
            return (Criteria) this;
        }

        public Criteria andAttributevalue1Like(String value) {
            addCriterion("attributeValue1 like", value, "attributevalue1");
            return (Criteria) this;
        }

        public Criteria andAttributevalue1NotLike(String value) {
            addCriterion("attributeValue1 not like", value, "attributevalue1");
            return (Criteria) this;
        }

        public Criteria andAttributevalue1In(List<String> values) {
            addCriterion("attributeValue1 in", values, "attributevalue1");
            return (Criteria) this;
        }

        public Criteria andAttributevalue1NotIn(List<String> values) {
            addCriterion("attributeValue1 not in", values, "attributevalue1");
            return (Criteria) this;
        }

        public Criteria andAttributevalue1Between(String value1, String value2) {
            addCriterion("attributeValue1 between", value1, value2, "attributevalue1");
            return (Criteria) this;
        }

        public Criteria andAttributevalue1NotBetween(String value1, String value2) {
            addCriterion("attributeValue1 not between", value1, value2, "attributevalue1");
            return (Criteria) this;
        }

        public Criteria andAttributevalue10IsNull() {
            addCriterion("attributeValue10 is null");
            return (Criteria) this;
        }

        public Criteria andAttributevalue10IsNotNull() {
            addCriterion("attributeValue10 is not null");
            return (Criteria) this;
        }

        public Criteria andAttributevalue10EqualTo(String value) {
            addCriterion("attributeValue10 =", value, "attributevalue10");
            return (Criteria) this;
        }

        public Criteria andAttributevalue10NotEqualTo(String value) {
            addCriterion("attributeValue10 <>", value, "attributevalue10");
            return (Criteria) this;
        }

        public Criteria andAttributevalue10GreaterThan(String value) {
            addCriterion("attributeValue10 >", value, "attributevalue10");
            return (Criteria) this;
        }

        public Criteria andAttributevalue10GreaterThanOrEqualTo(String value) {
            addCriterion("attributeValue10 >=", value, "attributevalue10");
            return (Criteria) this;
        }

        public Criteria andAttributevalue10LessThan(String value) {
            addCriterion("attributeValue10 <", value, "attributevalue10");
            return (Criteria) this;
        }

        public Criteria andAttributevalue10LessThanOrEqualTo(String value) {
            addCriterion("attributeValue10 <=", value, "attributevalue10");
            return (Criteria) this;
        }

        public Criteria andAttributevalue10Like(String value) {
            addCriterion("attributeValue10 like", value, "attributevalue10");
            return (Criteria) this;
        }

        public Criteria andAttributevalue10NotLike(String value) {
            addCriterion("attributeValue10 not like", value, "attributevalue10");
            return (Criteria) this;
        }

        public Criteria andAttributevalue10In(List<String> values) {
            addCriterion("attributeValue10 in", values, "attributevalue10");
            return (Criteria) this;
        }

        public Criteria andAttributevalue10NotIn(List<String> values) {
            addCriterion("attributeValue10 not in", values, "attributevalue10");
            return (Criteria) this;
        }

        public Criteria andAttributevalue10Between(String value1, String value2) {
            addCriterion("attributeValue10 between", value1, value2, "attributevalue10");
            return (Criteria) this;
        }

        public Criteria andAttributevalue10NotBetween(String value1, String value2) {
            addCriterion("attributeValue10 not between", value1, value2, "attributevalue10");
            return (Criteria) this;
        }

        public Criteria andAttributevalue11IsNull() {
            addCriterion("attributeValue11 is null");
            return (Criteria) this;
        }

        public Criteria andAttributevalue11IsNotNull() {
            addCriterion("attributeValue11 is not null");
            return (Criteria) this;
        }

        public Criteria andAttributevalue11EqualTo(String value) {
            addCriterion("attributeValue11 =", value, "attributevalue11");
            return (Criteria) this;
        }

        public Criteria andAttributevalue11NotEqualTo(String value) {
            addCriterion("attributeValue11 <>", value, "attributevalue11");
            return (Criteria) this;
        }

        public Criteria andAttributevalue11GreaterThan(String value) {
            addCriterion("attributeValue11 >", value, "attributevalue11");
            return (Criteria) this;
        }

        public Criteria andAttributevalue11GreaterThanOrEqualTo(String value) {
            addCriterion("attributeValue11 >=", value, "attributevalue11");
            return (Criteria) this;
        }

        public Criteria andAttributevalue11LessThan(String value) {
            addCriterion("attributeValue11 <", value, "attributevalue11");
            return (Criteria) this;
        }

        public Criteria andAttributevalue11LessThanOrEqualTo(String value) {
            addCriterion("attributeValue11 <=", value, "attributevalue11");
            return (Criteria) this;
        }

        public Criteria andAttributevalue11Like(String value) {
            addCriterion("attributeValue11 like", value, "attributevalue11");
            return (Criteria) this;
        }

        public Criteria andAttributevalue11NotLike(String value) {
            addCriterion("attributeValue11 not like", value, "attributevalue11");
            return (Criteria) this;
        }

        public Criteria andAttributevalue11In(List<String> values) {
            addCriterion("attributeValue11 in", values, "attributevalue11");
            return (Criteria) this;
        }

        public Criteria andAttributevalue11NotIn(List<String> values) {
            addCriterion("attributeValue11 not in", values, "attributevalue11");
            return (Criteria) this;
        }

        public Criteria andAttributevalue11Between(String value1, String value2) {
            addCriterion("attributeValue11 between", value1, value2, "attributevalue11");
            return (Criteria) this;
        }

        public Criteria andAttributevalue11NotBetween(String value1, String value2) {
            addCriterion("attributeValue11 not between", value1, value2, "attributevalue11");
            return (Criteria) this;
        }

        public Criteria andAttributevalue12IsNull() {
            addCriterion("attributeValue12 is null");
            return (Criteria) this;
        }

        public Criteria andAttributevalue12IsNotNull() {
            addCriterion("attributeValue12 is not null");
            return (Criteria) this;
        }

        public Criteria andAttributevalue12EqualTo(String value) {
            addCriterion("attributeValue12 =", value, "attributevalue12");
            return (Criteria) this;
        }

        public Criteria andAttributevalue12NotEqualTo(String value) {
            addCriterion("attributeValue12 <>", value, "attributevalue12");
            return (Criteria) this;
        }

        public Criteria andAttributevalue12GreaterThan(String value) {
            addCriterion("attributeValue12 >", value, "attributevalue12");
            return (Criteria) this;
        }

        public Criteria andAttributevalue12GreaterThanOrEqualTo(String value) {
            addCriterion("attributeValue12 >=", value, "attributevalue12");
            return (Criteria) this;
        }

        public Criteria andAttributevalue12LessThan(String value) {
            addCriterion("attributeValue12 <", value, "attributevalue12");
            return (Criteria) this;
        }

        public Criteria andAttributevalue12LessThanOrEqualTo(String value) {
            addCriterion("attributeValue12 <=", value, "attributevalue12");
            return (Criteria) this;
        }

        public Criteria andAttributevalue12Like(String value) {
            addCriterion("attributeValue12 like", value, "attributevalue12");
            return (Criteria) this;
        }

        public Criteria andAttributevalue12NotLike(String value) {
            addCriterion("attributeValue12 not like", value, "attributevalue12");
            return (Criteria) this;
        }

        public Criteria andAttributevalue12In(List<String> values) {
            addCriterion("attributeValue12 in", values, "attributevalue12");
            return (Criteria) this;
        }

        public Criteria andAttributevalue12NotIn(List<String> values) {
            addCriterion("attributeValue12 not in", values, "attributevalue12");
            return (Criteria) this;
        }

        public Criteria andAttributevalue12Between(String value1, String value2) {
            addCriterion("attributeValue12 between", value1, value2, "attributevalue12");
            return (Criteria) this;
        }

        public Criteria andAttributevalue12NotBetween(String value1, String value2) {
            addCriterion("attributeValue12 not between", value1, value2, "attributevalue12");
            return (Criteria) this;
        }

        public Criteria andAttributevalue13IsNull() {
            addCriterion("attributeValue13 is null");
            return (Criteria) this;
        }

        public Criteria andAttributevalue13IsNotNull() {
            addCriterion("attributeValue13 is not null");
            return (Criteria) this;
        }

        public Criteria andAttributevalue13EqualTo(String value) {
            addCriterion("attributeValue13 =", value, "attributevalue13");
            return (Criteria) this;
        }

        public Criteria andAttributevalue13NotEqualTo(String value) {
            addCriterion("attributeValue13 <>", value, "attributevalue13");
            return (Criteria) this;
        }

        public Criteria andAttributevalue13GreaterThan(String value) {
            addCriterion("attributeValue13 >", value, "attributevalue13");
            return (Criteria) this;
        }

        public Criteria andAttributevalue13GreaterThanOrEqualTo(String value) {
            addCriterion("attributeValue13 >=", value, "attributevalue13");
            return (Criteria) this;
        }

        public Criteria andAttributevalue13LessThan(String value) {
            addCriterion("attributeValue13 <", value, "attributevalue13");
            return (Criteria) this;
        }

        public Criteria andAttributevalue13LessThanOrEqualTo(String value) {
            addCriterion("attributeValue13 <=", value, "attributevalue13");
            return (Criteria) this;
        }

        public Criteria andAttributevalue13Like(String value) {
            addCriterion("attributeValue13 like", value, "attributevalue13");
            return (Criteria) this;
        }

        public Criteria andAttributevalue13NotLike(String value) {
            addCriterion("attributeValue13 not like", value, "attributevalue13");
            return (Criteria) this;
        }

        public Criteria andAttributevalue13In(List<String> values) {
            addCriterion("attributeValue13 in", values, "attributevalue13");
            return (Criteria) this;
        }

        public Criteria andAttributevalue13NotIn(List<String> values) {
            addCriterion("attributeValue13 not in", values, "attributevalue13");
            return (Criteria) this;
        }

        public Criteria andAttributevalue13Between(String value1, String value2) {
            addCriterion("attributeValue13 between", value1, value2, "attributevalue13");
            return (Criteria) this;
        }

        public Criteria andAttributevalue13NotBetween(String value1, String value2) {
            addCriterion("attributeValue13 not between", value1, value2, "attributevalue13");
            return (Criteria) this;
        }

        public Criteria andAttributevalue14IsNull() {
            addCriterion("attributeValue14 is null");
            return (Criteria) this;
        }

        public Criteria andAttributevalue14IsNotNull() {
            addCriterion("attributeValue14 is not null");
            return (Criteria) this;
        }

        public Criteria andAttributevalue14EqualTo(String value) {
            addCriterion("attributeValue14 =", value, "attributevalue14");
            return (Criteria) this;
        }

        public Criteria andAttributevalue14NotEqualTo(String value) {
            addCriterion("attributeValue14 <>", value, "attributevalue14");
            return (Criteria) this;
        }

        public Criteria andAttributevalue14GreaterThan(String value) {
            addCriterion("attributeValue14 >", value, "attributevalue14");
            return (Criteria) this;
        }

        public Criteria andAttributevalue14GreaterThanOrEqualTo(String value) {
            addCriterion("attributeValue14 >=", value, "attributevalue14");
            return (Criteria) this;
        }

        public Criteria andAttributevalue14LessThan(String value) {
            addCriterion("attributeValue14 <", value, "attributevalue14");
            return (Criteria) this;
        }

        public Criteria andAttributevalue14LessThanOrEqualTo(String value) {
            addCriterion("attributeValue14 <=", value, "attributevalue14");
            return (Criteria) this;
        }

        public Criteria andAttributevalue14Like(String value) {
            addCriterion("attributeValue14 like", value, "attributevalue14");
            return (Criteria) this;
        }

        public Criteria andAttributevalue14NotLike(String value) {
            addCriterion("attributeValue14 not like", value, "attributevalue14");
            return (Criteria) this;
        }

        public Criteria andAttributevalue14In(List<String> values) {
            addCriterion("attributeValue14 in", values, "attributevalue14");
            return (Criteria) this;
        }

        public Criteria andAttributevalue14NotIn(List<String> values) {
            addCriterion("attributeValue14 not in", values, "attributevalue14");
            return (Criteria) this;
        }

        public Criteria andAttributevalue14Between(String value1, String value2) {
            addCriterion("attributeValue14 between", value1, value2, "attributevalue14");
            return (Criteria) this;
        }

        public Criteria andAttributevalue14NotBetween(String value1, String value2) {
            addCriterion("attributeValue14 not between", value1, value2, "attributevalue14");
            return (Criteria) this;
        }

        public Criteria andAttributevalue15IsNull() {
            addCriterion("attributeValue15 is null");
            return (Criteria) this;
        }

        public Criteria andAttributevalue15IsNotNull() {
            addCriterion("attributeValue15 is not null");
            return (Criteria) this;
        }

        public Criteria andAttributevalue15EqualTo(String value) {
            addCriterion("attributeValue15 =", value, "attributevalue15");
            return (Criteria) this;
        }

        public Criteria andAttributevalue15NotEqualTo(String value) {
            addCriterion("attributeValue15 <>", value, "attributevalue15");
            return (Criteria) this;
        }

        public Criteria andAttributevalue15GreaterThan(String value) {
            addCriterion("attributeValue15 >", value, "attributevalue15");
            return (Criteria) this;
        }

        public Criteria andAttributevalue15GreaterThanOrEqualTo(String value) {
            addCriterion("attributeValue15 >=", value, "attributevalue15");
            return (Criteria) this;
        }

        public Criteria andAttributevalue15LessThan(String value) {
            addCriterion("attributeValue15 <", value, "attributevalue15");
            return (Criteria) this;
        }

        public Criteria andAttributevalue15LessThanOrEqualTo(String value) {
            addCriterion("attributeValue15 <=", value, "attributevalue15");
            return (Criteria) this;
        }

        public Criteria andAttributevalue15Like(String value) {
            addCriterion("attributeValue15 like", value, "attributevalue15");
            return (Criteria) this;
        }

        public Criteria andAttributevalue15NotLike(String value) {
            addCriterion("attributeValue15 not like", value, "attributevalue15");
            return (Criteria) this;
        }

        public Criteria andAttributevalue15In(List<String> values) {
            addCriterion("attributeValue15 in", values, "attributevalue15");
            return (Criteria) this;
        }

        public Criteria andAttributevalue15NotIn(List<String> values) {
            addCriterion("attributeValue15 not in", values, "attributevalue15");
            return (Criteria) this;
        }

        public Criteria andAttributevalue15Between(String value1, String value2) {
            addCriterion("attributeValue15 between", value1, value2, "attributevalue15");
            return (Criteria) this;
        }

        public Criteria andAttributevalue15NotBetween(String value1, String value2) {
            addCriterion("attributeValue15 not between", value1, value2, "attributevalue15");
            return (Criteria) this;
        }

        public Criteria andAttributevalue16IsNull() {
            addCriterion("attributeValue16 is null");
            return (Criteria) this;
        }

        public Criteria andAttributevalue16IsNotNull() {
            addCriterion("attributeValue16 is not null");
            return (Criteria) this;
        }

        public Criteria andAttributevalue16EqualTo(String value) {
            addCriterion("attributeValue16 =", value, "attributevalue16");
            return (Criteria) this;
        }

        public Criteria andAttributevalue16NotEqualTo(String value) {
            addCriterion("attributeValue16 <>", value, "attributevalue16");
            return (Criteria) this;
        }

        public Criteria andAttributevalue16GreaterThan(String value) {
            addCriterion("attributeValue16 >", value, "attributevalue16");
            return (Criteria) this;
        }

        public Criteria andAttributevalue16GreaterThanOrEqualTo(String value) {
            addCriterion("attributeValue16 >=", value, "attributevalue16");
            return (Criteria) this;
        }

        public Criteria andAttributevalue16LessThan(String value) {
            addCriterion("attributeValue16 <", value, "attributevalue16");
            return (Criteria) this;
        }

        public Criteria andAttributevalue16LessThanOrEqualTo(String value) {
            addCriterion("attributeValue16 <=", value, "attributevalue16");
            return (Criteria) this;
        }

        public Criteria andAttributevalue16Like(String value) {
            addCriterion("attributeValue16 like", value, "attributevalue16");
            return (Criteria) this;
        }

        public Criteria andAttributevalue16NotLike(String value) {
            addCriterion("attributeValue16 not like", value, "attributevalue16");
            return (Criteria) this;
        }

        public Criteria andAttributevalue16In(List<String> values) {
            addCriterion("attributeValue16 in", values, "attributevalue16");
            return (Criteria) this;
        }

        public Criteria andAttributevalue16NotIn(List<String> values) {
            addCriterion("attributeValue16 not in", values, "attributevalue16");
            return (Criteria) this;
        }

        public Criteria andAttributevalue16Between(String value1, String value2) {
            addCriterion("attributeValue16 between", value1, value2, "attributevalue16");
            return (Criteria) this;
        }

        public Criteria andAttributevalue16NotBetween(String value1, String value2) {
            addCriterion("attributeValue16 not between", value1, value2, "attributevalue16");
            return (Criteria) this;
        }

        public Criteria andAttributevalue17IsNull() {
            addCriterion("attributeValue17 is null");
            return (Criteria) this;
        }

        public Criteria andAttributevalue17IsNotNull() {
            addCriterion("attributeValue17 is not null");
            return (Criteria) this;
        }

        public Criteria andAttributevalue17EqualTo(String value) {
            addCriterion("attributeValue17 =", value, "attributevalue17");
            return (Criteria) this;
        }

        public Criteria andAttributevalue17NotEqualTo(String value) {
            addCriterion("attributeValue17 <>", value, "attributevalue17");
            return (Criteria) this;
        }

        public Criteria andAttributevalue17GreaterThan(String value) {
            addCriterion("attributeValue17 >", value, "attributevalue17");
            return (Criteria) this;
        }

        public Criteria andAttributevalue17GreaterThanOrEqualTo(String value) {
            addCriterion("attributeValue17 >=", value, "attributevalue17");
            return (Criteria) this;
        }

        public Criteria andAttributevalue17LessThan(String value) {
            addCriterion("attributeValue17 <", value, "attributevalue17");
            return (Criteria) this;
        }

        public Criteria andAttributevalue17LessThanOrEqualTo(String value) {
            addCriterion("attributeValue17 <=", value, "attributevalue17");
            return (Criteria) this;
        }

        public Criteria andAttributevalue17Like(String value) {
            addCriterion("attributeValue17 like", value, "attributevalue17");
            return (Criteria) this;
        }

        public Criteria andAttributevalue17NotLike(String value) {
            addCriterion("attributeValue17 not like", value, "attributevalue17");
            return (Criteria) this;
        }

        public Criteria andAttributevalue17In(List<String> values) {
            addCriterion("attributeValue17 in", values, "attributevalue17");
            return (Criteria) this;
        }

        public Criteria andAttributevalue17NotIn(List<String> values) {
            addCriterion("attributeValue17 not in", values, "attributevalue17");
            return (Criteria) this;
        }

        public Criteria andAttributevalue17Between(String value1, String value2) {
            addCriterion("attributeValue17 between", value1, value2, "attributevalue17");
            return (Criteria) this;
        }

        public Criteria andAttributevalue17NotBetween(String value1, String value2) {
            addCriterion("attributeValue17 not between", value1, value2, "attributevalue17");
            return (Criteria) this;
        }

        public Criteria andAttributevalue18IsNull() {
            addCriterion("attributeValue18 is null");
            return (Criteria) this;
        }

        public Criteria andAttributevalue18IsNotNull() {
            addCriterion("attributeValue18 is not null");
            return (Criteria) this;
        }

        public Criteria andAttributevalue18EqualTo(String value) {
            addCriterion("attributeValue18 =", value, "attributevalue18");
            return (Criteria) this;
        }

        public Criteria andAttributevalue18NotEqualTo(String value) {
            addCriterion("attributeValue18 <>", value, "attributevalue18");
            return (Criteria) this;
        }

        public Criteria andAttributevalue18GreaterThan(String value) {
            addCriterion("attributeValue18 >", value, "attributevalue18");
            return (Criteria) this;
        }

        public Criteria andAttributevalue18GreaterThanOrEqualTo(String value) {
            addCriterion("attributeValue18 >=", value, "attributevalue18");
            return (Criteria) this;
        }

        public Criteria andAttributevalue18LessThan(String value) {
            addCriterion("attributeValue18 <", value, "attributevalue18");
            return (Criteria) this;
        }

        public Criteria andAttributevalue18LessThanOrEqualTo(String value) {
            addCriterion("attributeValue18 <=", value, "attributevalue18");
            return (Criteria) this;
        }

        public Criteria andAttributevalue18Like(String value) {
            addCriterion("attributeValue18 like", value, "attributevalue18");
            return (Criteria) this;
        }

        public Criteria andAttributevalue18NotLike(String value) {
            addCriterion("attributeValue18 not like", value, "attributevalue18");
            return (Criteria) this;
        }

        public Criteria andAttributevalue18In(List<String> values) {
            addCriterion("attributeValue18 in", values, "attributevalue18");
            return (Criteria) this;
        }

        public Criteria andAttributevalue18NotIn(List<String> values) {
            addCriterion("attributeValue18 not in", values, "attributevalue18");
            return (Criteria) this;
        }

        public Criteria andAttributevalue18Between(String value1, String value2) {
            addCriterion("attributeValue18 between", value1, value2, "attributevalue18");
            return (Criteria) this;
        }

        public Criteria andAttributevalue18NotBetween(String value1, String value2) {
            addCriterion("attributeValue18 not between", value1, value2, "attributevalue18");
            return (Criteria) this;
        }

        public Criteria andAttributevalue19IsNull() {
            addCriterion("attributeValue19 is null");
            return (Criteria) this;
        }

        public Criteria andAttributevalue19IsNotNull() {
            addCriterion("attributeValue19 is not null");
            return (Criteria) this;
        }

        public Criteria andAttributevalue19EqualTo(String value) {
            addCriterion("attributeValue19 =", value, "attributevalue19");
            return (Criteria) this;
        }

        public Criteria andAttributevalue19NotEqualTo(String value) {
            addCriterion("attributeValue19 <>", value, "attributevalue19");
            return (Criteria) this;
        }

        public Criteria andAttributevalue19GreaterThan(String value) {
            addCriterion("attributeValue19 >", value, "attributevalue19");
            return (Criteria) this;
        }

        public Criteria andAttributevalue19GreaterThanOrEqualTo(String value) {
            addCriterion("attributeValue19 >=", value, "attributevalue19");
            return (Criteria) this;
        }

        public Criteria andAttributevalue19LessThan(String value) {
            addCriterion("attributeValue19 <", value, "attributevalue19");
            return (Criteria) this;
        }

        public Criteria andAttributevalue19LessThanOrEqualTo(String value) {
            addCriterion("attributeValue19 <=", value, "attributevalue19");
            return (Criteria) this;
        }

        public Criteria andAttributevalue19Like(String value) {
            addCriterion("attributeValue19 like", value, "attributevalue19");
            return (Criteria) this;
        }

        public Criteria andAttributevalue19NotLike(String value) {
            addCriterion("attributeValue19 not like", value, "attributevalue19");
            return (Criteria) this;
        }

        public Criteria andAttributevalue19In(List<String> values) {
            addCriterion("attributeValue19 in", values, "attributevalue19");
            return (Criteria) this;
        }

        public Criteria andAttributevalue19NotIn(List<String> values) {
            addCriterion("attributeValue19 not in", values, "attributevalue19");
            return (Criteria) this;
        }

        public Criteria andAttributevalue19Between(String value1, String value2) {
            addCriterion("attributeValue19 between", value1, value2, "attributevalue19");
            return (Criteria) this;
        }

        public Criteria andAttributevalue19NotBetween(String value1, String value2) {
            addCriterion("attributeValue19 not between", value1, value2, "attributevalue19");
            return (Criteria) this;
        }

        public Criteria andAttributevalue2IsNull() {
            addCriterion("attributeValue2 is null");
            return (Criteria) this;
        }

        public Criteria andAttributevalue2IsNotNull() {
            addCriterion("attributeValue2 is not null");
            return (Criteria) this;
        }

        public Criteria andAttributevalue2EqualTo(String value) {
            addCriterion("attributeValue2 =", value, "attributevalue2");
            return (Criteria) this;
        }

        public Criteria andAttributevalue2NotEqualTo(String value) {
            addCriterion("attributeValue2 <>", value, "attributevalue2");
            return (Criteria) this;
        }

        public Criteria andAttributevalue2GreaterThan(String value) {
            addCriterion("attributeValue2 >", value, "attributevalue2");
            return (Criteria) this;
        }

        public Criteria andAttributevalue2GreaterThanOrEqualTo(String value) {
            addCriterion("attributeValue2 >=", value, "attributevalue2");
            return (Criteria) this;
        }

        public Criteria andAttributevalue2LessThan(String value) {
            addCriterion("attributeValue2 <", value, "attributevalue2");
            return (Criteria) this;
        }

        public Criteria andAttributevalue2LessThanOrEqualTo(String value) {
            addCriterion("attributeValue2 <=", value, "attributevalue2");
            return (Criteria) this;
        }

        public Criteria andAttributevalue2Like(String value) {
            addCriterion("attributeValue2 like", value, "attributevalue2");
            return (Criteria) this;
        }

        public Criteria andAttributevalue2NotLike(String value) {
            addCriterion("attributeValue2 not like", value, "attributevalue2");
            return (Criteria) this;
        }

        public Criteria andAttributevalue2In(List<String> values) {
            addCriterion("attributeValue2 in", values, "attributevalue2");
            return (Criteria) this;
        }

        public Criteria andAttributevalue2NotIn(List<String> values) {
            addCriterion("attributeValue2 not in", values, "attributevalue2");
            return (Criteria) this;
        }

        public Criteria andAttributevalue2Between(String value1, String value2) {
            addCriterion("attributeValue2 between", value1, value2, "attributevalue2");
            return (Criteria) this;
        }

        public Criteria andAttributevalue2NotBetween(String value1, String value2) {
            addCriterion("attributeValue2 not between", value1, value2, "attributevalue2");
            return (Criteria) this;
        }

        public Criteria andAttributevalue3IsNull() {
            addCriterion("attributeValue3 is null");
            return (Criteria) this;
        }

        public Criteria andAttributevalue3IsNotNull() {
            addCriterion("attributeValue3 is not null");
            return (Criteria) this;
        }

        public Criteria andAttributevalue3EqualTo(String value) {
            addCriterion("attributeValue3 =", value, "attributevalue3");
            return (Criteria) this;
        }

        public Criteria andAttributevalue3NotEqualTo(String value) {
            addCriterion("attributeValue3 <>", value, "attributevalue3");
            return (Criteria) this;
        }

        public Criteria andAttributevalue3GreaterThan(String value) {
            addCriterion("attributeValue3 >", value, "attributevalue3");
            return (Criteria) this;
        }

        public Criteria andAttributevalue3GreaterThanOrEqualTo(String value) {
            addCriterion("attributeValue3 >=", value, "attributevalue3");
            return (Criteria) this;
        }

        public Criteria andAttributevalue3LessThan(String value) {
            addCriterion("attributeValue3 <", value, "attributevalue3");
            return (Criteria) this;
        }

        public Criteria andAttributevalue3LessThanOrEqualTo(String value) {
            addCriterion("attributeValue3 <=", value, "attributevalue3");
            return (Criteria) this;
        }

        public Criteria andAttributevalue3Like(String value) {
            addCriterion("attributeValue3 like", value, "attributevalue3");
            return (Criteria) this;
        }

        public Criteria andAttributevalue3NotLike(String value) {
            addCriterion("attributeValue3 not like", value, "attributevalue3");
            return (Criteria) this;
        }

        public Criteria andAttributevalue3In(List<String> values) {
            addCriterion("attributeValue3 in", values, "attributevalue3");
            return (Criteria) this;
        }

        public Criteria andAttributevalue3NotIn(List<String> values) {
            addCriterion("attributeValue3 not in", values, "attributevalue3");
            return (Criteria) this;
        }

        public Criteria andAttributevalue3Between(String value1, String value2) {
            addCriterion("attributeValue3 between", value1, value2, "attributevalue3");
            return (Criteria) this;
        }

        public Criteria andAttributevalue3NotBetween(String value1, String value2) {
            addCriterion("attributeValue3 not between", value1, value2, "attributevalue3");
            return (Criteria) this;
        }

        public Criteria andAttributevalue4IsNull() {
            addCriterion("attributeValue4 is null");
            return (Criteria) this;
        }

        public Criteria andAttributevalue4IsNotNull() {
            addCriterion("attributeValue4 is not null");
            return (Criteria) this;
        }

        public Criteria andAttributevalue4EqualTo(String value) {
            addCriterion("attributeValue4 =", value, "attributevalue4");
            return (Criteria) this;
        }

        public Criteria andAttributevalue4NotEqualTo(String value) {
            addCriterion("attributeValue4 <>", value, "attributevalue4");
            return (Criteria) this;
        }

        public Criteria andAttributevalue4GreaterThan(String value) {
            addCriterion("attributeValue4 >", value, "attributevalue4");
            return (Criteria) this;
        }

        public Criteria andAttributevalue4GreaterThanOrEqualTo(String value) {
            addCriterion("attributeValue4 >=", value, "attributevalue4");
            return (Criteria) this;
        }

        public Criteria andAttributevalue4LessThan(String value) {
            addCriterion("attributeValue4 <", value, "attributevalue4");
            return (Criteria) this;
        }

        public Criteria andAttributevalue4LessThanOrEqualTo(String value) {
            addCriterion("attributeValue4 <=", value, "attributevalue4");
            return (Criteria) this;
        }

        public Criteria andAttributevalue4Like(String value) {
            addCriterion("attributeValue4 like", value, "attributevalue4");
            return (Criteria) this;
        }

        public Criteria andAttributevalue4NotLike(String value) {
            addCriterion("attributeValue4 not like", value, "attributevalue4");
            return (Criteria) this;
        }

        public Criteria andAttributevalue4In(List<String> values) {
            addCriterion("attributeValue4 in", values, "attributevalue4");
            return (Criteria) this;
        }

        public Criteria andAttributevalue4NotIn(List<String> values) {
            addCriterion("attributeValue4 not in", values, "attributevalue4");
            return (Criteria) this;
        }

        public Criteria andAttributevalue4Between(String value1, String value2) {
            addCriterion("attributeValue4 between", value1, value2, "attributevalue4");
            return (Criteria) this;
        }

        public Criteria andAttributevalue4NotBetween(String value1, String value2) {
            addCriterion("attributeValue4 not between", value1, value2, "attributevalue4");
            return (Criteria) this;
        }

        public Criteria andAttributevalue5IsNull() {
            addCriterion("attributeValue5 is null");
            return (Criteria) this;
        }

        public Criteria andAttributevalue5IsNotNull() {
            addCriterion("attributeValue5 is not null");
            return (Criteria) this;
        }

        public Criteria andAttributevalue5EqualTo(String value) {
            addCriterion("attributeValue5 =", value, "attributevalue5");
            return (Criteria) this;
        }

        public Criteria andAttributevalue5NotEqualTo(String value) {
            addCriterion("attributeValue5 <>", value, "attributevalue5");
            return (Criteria) this;
        }

        public Criteria andAttributevalue5GreaterThan(String value) {
            addCriterion("attributeValue5 >", value, "attributevalue5");
            return (Criteria) this;
        }

        public Criteria andAttributevalue5GreaterThanOrEqualTo(String value) {
            addCriterion("attributeValue5 >=", value, "attributevalue5");
            return (Criteria) this;
        }

        public Criteria andAttributevalue5LessThan(String value) {
            addCriterion("attributeValue5 <", value, "attributevalue5");
            return (Criteria) this;
        }

        public Criteria andAttributevalue5LessThanOrEqualTo(String value) {
            addCriterion("attributeValue5 <=", value, "attributevalue5");
            return (Criteria) this;
        }

        public Criteria andAttributevalue5Like(String value) {
            addCriterion("attributeValue5 like", value, "attributevalue5");
            return (Criteria) this;
        }

        public Criteria andAttributevalue5NotLike(String value) {
            addCriterion("attributeValue5 not like", value, "attributevalue5");
            return (Criteria) this;
        }

        public Criteria andAttributevalue5In(List<String> values) {
            addCriterion("attributeValue5 in", values, "attributevalue5");
            return (Criteria) this;
        }

        public Criteria andAttributevalue5NotIn(List<String> values) {
            addCriterion("attributeValue5 not in", values, "attributevalue5");
            return (Criteria) this;
        }

        public Criteria andAttributevalue5Between(String value1, String value2) {
            addCriterion("attributeValue5 between", value1, value2, "attributevalue5");
            return (Criteria) this;
        }

        public Criteria andAttributevalue5NotBetween(String value1, String value2) {
            addCriterion("attributeValue5 not between", value1, value2, "attributevalue5");
            return (Criteria) this;
        }

        public Criteria andAttributevalue6IsNull() {
            addCriterion("attributeValue6 is null");
            return (Criteria) this;
        }

        public Criteria andAttributevalue6IsNotNull() {
            addCriterion("attributeValue6 is not null");
            return (Criteria) this;
        }

        public Criteria andAttributevalue6EqualTo(String value) {
            addCriterion("attributeValue6 =", value, "attributevalue6");
            return (Criteria) this;
        }

        public Criteria andAttributevalue6NotEqualTo(String value) {
            addCriterion("attributeValue6 <>", value, "attributevalue6");
            return (Criteria) this;
        }

        public Criteria andAttributevalue6GreaterThan(String value) {
            addCriterion("attributeValue6 >", value, "attributevalue6");
            return (Criteria) this;
        }

        public Criteria andAttributevalue6GreaterThanOrEqualTo(String value) {
            addCriterion("attributeValue6 >=", value, "attributevalue6");
            return (Criteria) this;
        }

        public Criteria andAttributevalue6LessThan(String value) {
            addCriterion("attributeValue6 <", value, "attributevalue6");
            return (Criteria) this;
        }

        public Criteria andAttributevalue6LessThanOrEqualTo(String value) {
            addCriterion("attributeValue6 <=", value, "attributevalue6");
            return (Criteria) this;
        }

        public Criteria andAttributevalue6Like(String value) {
            addCriterion("attributeValue6 like", value, "attributevalue6");
            return (Criteria) this;
        }

        public Criteria andAttributevalue6NotLike(String value) {
            addCriterion("attributeValue6 not like", value, "attributevalue6");
            return (Criteria) this;
        }

        public Criteria andAttributevalue6In(List<String> values) {
            addCriterion("attributeValue6 in", values, "attributevalue6");
            return (Criteria) this;
        }

        public Criteria andAttributevalue6NotIn(List<String> values) {
            addCriterion("attributeValue6 not in", values, "attributevalue6");
            return (Criteria) this;
        }

        public Criteria andAttributevalue6Between(String value1, String value2) {
            addCriterion("attributeValue6 between", value1, value2, "attributevalue6");
            return (Criteria) this;
        }

        public Criteria andAttributevalue6NotBetween(String value1, String value2) {
            addCriterion("attributeValue6 not between", value1, value2, "attributevalue6");
            return (Criteria) this;
        }

        public Criteria andAttributevalue7IsNull() {
            addCriterion("attributeValue7 is null");
            return (Criteria) this;
        }

        public Criteria andAttributevalue7IsNotNull() {
            addCriterion("attributeValue7 is not null");
            return (Criteria) this;
        }

        public Criteria andAttributevalue7EqualTo(String value) {
            addCriterion("attributeValue7 =", value, "attributevalue7");
            return (Criteria) this;
        }

        public Criteria andAttributevalue7NotEqualTo(String value) {
            addCriterion("attributeValue7 <>", value, "attributevalue7");
            return (Criteria) this;
        }

        public Criteria andAttributevalue7GreaterThan(String value) {
            addCriterion("attributeValue7 >", value, "attributevalue7");
            return (Criteria) this;
        }

        public Criteria andAttributevalue7GreaterThanOrEqualTo(String value) {
            addCriterion("attributeValue7 >=", value, "attributevalue7");
            return (Criteria) this;
        }

        public Criteria andAttributevalue7LessThan(String value) {
            addCriterion("attributeValue7 <", value, "attributevalue7");
            return (Criteria) this;
        }

        public Criteria andAttributevalue7LessThanOrEqualTo(String value) {
            addCriterion("attributeValue7 <=", value, "attributevalue7");
            return (Criteria) this;
        }

        public Criteria andAttributevalue7Like(String value) {
            addCriterion("attributeValue7 like", value, "attributevalue7");
            return (Criteria) this;
        }

        public Criteria andAttributevalue7NotLike(String value) {
            addCriterion("attributeValue7 not like", value, "attributevalue7");
            return (Criteria) this;
        }

        public Criteria andAttributevalue7In(List<String> values) {
            addCriterion("attributeValue7 in", values, "attributevalue7");
            return (Criteria) this;
        }

        public Criteria andAttributevalue7NotIn(List<String> values) {
            addCriterion("attributeValue7 not in", values, "attributevalue7");
            return (Criteria) this;
        }

        public Criteria andAttributevalue7Between(String value1, String value2) {
            addCriterion("attributeValue7 between", value1, value2, "attributevalue7");
            return (Criteria) this;
        }

        public Criteria andAttributevalue7NotBetween(String value1, String value2) {
            addCriterion("attributeValue7 not between", value1, value2, "attributevalue7");
            return (Criteria) this;
        }

        public Criteria andAttributevalue8IsNull() {
            addCriterion("attributeValue8 is null");
            return (Criteria) this;
        }

        public Criteria andAttributevalue8IsNotNull() {
            addCriterion("attributeValue8 is not null");
            return (Criteria) this;
        }

        public Criteria andAttributevalue8EqualTo(String value) {
            addCriterion("attributeValue8 =", value, "attributevalue8");
            return (Criteria) this;
        }

        public Criteria andAttributevalue8NotEqualTo(String value) {
            addCriterion("attributeValue8 <>", value, "attributevalue8");
            return (Criteria) this;
        }

        public Criteria andAttributevalue8GreaterThan(String value) {
            addCriterion("attributeValue8 >", value, "attributevalue8");
            return (Criteria) this;
        }

        public Criteria andAttributevalue8GreaterThanOrEqualTo(String value) {
            addCriterion("attributeValue8 >=", value, "attributevalue8");
            return (Criteria) this;
        }

        public Criteria andAttributevalue8LessThan(String value) {
            addCriterion("attributeValue8 <", value, "attributevalue8");
            return (Criteria) this;
        }

        public Criteria andAttributevalue8LessThanOrEqualTo(String value) {
            addCriterion("attributeValue8 <=", value, "attributevalue8");
            return (Criteria) this;
        }

        public Criteria andAttributevalue8Like(String value) {
            addCriterion("attributeValue8 like", value, "attributevalue8");
            return (Criteria) this;
        }

        public Criteria andAttributevalue8NotLike(String value) {
            addCriterion("attributeValue8 not like", value, "attributevalue8");
            return (Criteria) this;
        }

        public Criteria andAttributevalue8In(List<String> values) {
            addCriterion("attributeValue8 in", values, "attributevalue8");
            return (Criteria) this;
        }

        public Criteria andAttributevalue8NotIn(List<String> values) {
            addCriterion("attributeValue8 not in", values, "attributevalue8");
            return (Criteria) this;
        }

        public Criteria andAttributevalue8Between(String value1, String value2) {
            addCriterion("attributeValue8 between", value1, value2, "attributevalue8");
            return (Criteria) this;
        }

        public Criteria andAttributevalue8NotBetween(String value1, String value2) {
            addCriterion("attributeValue8 not between", value1, value2, "attributevalue8");
            return (Criteria) this;
        }

        public Criteria andAttributevalue9IsNull() {
            addCriterion("attributeValue9 is null");
            return (Criteria) this;
        }

        public Criteria andAttributevalue9IsNotNull() {
            addCriterion("attributeValue9 is not null");
            return (Criteria) this;
        }

        public Criteria andAttributevalue9EqualTo(String value) {
            addCriterion("attributeValue9 =", value, "attributevalue9");
            return (Criteria) this;
        }

        public Criteria andAttributevalue9NotEqualTo(String value) {
            addCriterion("attributeValue9 <>", value, "attributevalue9");
            return (Criteria) this;
        }

        public Criteria andAttributevalue9GreaterThan(String value) {
            addCriterion("attributeValue9 >", value, "attributevalue9");
            return (Criteria) this;
        }

        public Criteria andAttributevalue9GreaterThanOrEqualTo(String value) {
            addCriterion("attributeValue9 >=", value, "attributevalue9");
            return (Criteria) this;
        }

        public Criteria andAttributevalue9LessThan(String value) {
            addCriterion("attributeValue9 <", value, "attributevalue9");
            return (Criteria) this;
        }

        public Criteria andAttributevalue9LessThanOrEqualTo(String value) {
            addCriterion("attributeValue9 <=", value, "attributevalue9");
            return (Criteria) this;
        }

        public Criteria andAttributevalue9Like(String value) {
            addCriterion("attributeValue9 like", value, "attributevalue9");
            return (Criteria) this;
        }

        public Criteria andAttributevalue9NotLike(String value) {
            addCriterion("attributeValue9 not like", value, "attributevalue9");
            return (Criteria) this;
        }

        public Criteria andAttributevalue9In(List<String> values) {
            addCriterion("attributeValue9 in", values, "attributevalue9");
            return (Criteria) this;
        }

        public Criteria andAttributevalue9NotIn(List<String> values) {
            addCriterion("attributeValue9 not in", values, "attributevalue9");
            return (Criteria) this;
        }

        public Criteria andAttributevalue9Between(String value1, String value2) {
            addCriterion("attributeValue9 between", value1, value2, "attributevalue9");
            return (Criteria) this;
        }

        public Criteria andAttributevalue9NotBetween(String value1, String value2) {
            addCriterion("attributeValue9 not between", value1, value2, "attributevalue9");
            return (Criteria) this;
        }

        public Criteria andCaptionIsNull() {
            addCriterion("caption is null");
            return (Criteria) this;
        }

        public Criteria andCaptionIsNotNull() {
            addCriterion("caption is not null");
            return (Criteria) this;
        }

        public Criteria andCaptionEqualTo(String value) {
            addCriterion("caption =", value, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionNotEqualTo(String value) {
            addCriterion("caption <>", value, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionGreaterThan(String value) {
            addCriterion("caption >", value, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionGreaterThanOrEqualTo(String value) {
            addCriterion("caption >=", value, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionLessThan(String value) {
            addCriterion("caption <", value, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionLessThanOrEqualTo(String value) {
            addCriterion("caption <=", value, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionLike(String value) {
            addCriterion("caption like", value, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionNotLike(String value) {
            addCriterion("caption not like", value, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionIn(List<String> values) {
            addCriterion("caption in", values, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionNotIn(List<String> values) {
            addCriterion("caption not in", values, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionBetween(String value1, String value2) {
            addCriterion("caption between", value1, value2, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionNotBetween(String value1, String value2) {
            addCriterion("caption not between", value1, value2, "caption");
            return (Criteria) this;
        }

        public Criteria andCostIsNull() {
            addCriterion("cost is null");
            return (Criteria) this;
        }

        public Criteria andCostIsNotNull() {
            addCriterion("cost is not null");
            return (Criteria) this;
        }

        public Criteria andCostEqualTo(BigDecimal value) {
            addCriterion("cost =", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotEqualTo(BigDecimal value) {
            addCriterion("cost <>", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThan(BigDecimal value) {
            addCriterion("cost >", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cost >=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThan(BigDecimal value) {
            addCriterion("cost <", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cost <=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostIn(List<BigDecimal> values) {
            addCriterion("cost in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotIn(List<BigDecimal> values) {
            addCriterion("cost not in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost not between", value1, value2, "cost");
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

        public Criteria andImageIsNull() {
            addCriterion("image is null");
            return (Criteria) this;
        }

        public Criteria andImageIsNotNull() {
            addCriterion("image is not null");
            return (Criteria) this;
        }

        public Criteria andImageEqualTo(String value) {
            addCriterion("image =", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotEqualTo(String value) {
            addCriterion("image <>", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThan(String value) {
            addCriterion("image >", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThanOrEqualTo(String value) {
            addCriterion("image >=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThan(String value) {
            addCriterion("image <", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThanOrEqualTo(String value) {
            addCriterion("image <=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLike(String value) {
            addCriterion("image like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotLike(String value) {
            addCriterion("image not like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageIn(List<String> values) {
            addCriterion("image in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotIn(List<String> values) {
            addCriterion("image not in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageBetween(String value1, String value2) {
            addCriterion("image between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotBetween(String value1, String value2) {
            addCriterion("image not between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andIsactiveIsNull() {
            addCriterion("isActive is null");
            return (Criteria) this;
        }

        public Criteria andIsactiveIsNotNull() {
            addCriterion("isActive is not null");
            return (Criteria) this;
        }

        public Criteria andIsactiveEqualTo(Boolean value) {
            addCriterion("isActive =", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveNotEqualTo(Boolean value) {
            addCriterion("isActive <>", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveGreaterThan(Boolean value) {
            addCriterion("isActive >", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isActive >=", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveLessThan(Boolean value) {
            addCriterion("isActive <", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveLessThanOrEqualTo(Boolean value) {
            addCriterion("isActive <=", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveIn(List<Boolean> values) {
            addCriterion("isActive in", values, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveNotIn(List<Boolean> values) {
            addCriterion("isActive not in", values, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveBetween(Boolean value1, Boolean value2) {
            addCriterion("isActive between", value1, value2, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isActive not between", value1, value2, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsdeliveryIsNull() {
            addCriterion("isDelivery is null");
            return (Criteria) this;
        }

        public Criteria andIsdeliveryIsNotNull() {
            addCriterion("isDelivery is not null");
            return (Criteria) this;
        }

        public Criteria andIsdeliveryEqualTo(Boolean value) {
            addCriterion("isDelivery =", value, "isdelivery");
            return (Criteria) this;
        }

        public Criteria andIsdeliveryNotEqualTo(Boolean value) {
            addCriterion("isDelivery <>", value, "isdelivery");
            return (Criteria) this;
        }

        public Criteria andIsdeliveryGreaterThan(Boolean value) {
            addCriterion("isDelivery >", value, "isdelivery");
            return (Criteria) this;
        }

        public Criteria andIsdeliveryGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isDelivery >=", value, "isdelivery");
            return (Criteria) this;
        }

        public Criteria andIsdeliveryLessThan(Boolean value) {
            addCriterion("isDelivery <", value, "isdelivery");
            return (Criteria) this;
        }

        public Criteria andIsdeliveryLessThanOrEqualTo(Boolean value) {
            addCriterion("isDelivery <=", value, "isdelivery");
            return (Criteria) this;
        }

        public Criteria andIsdeliveryIn(List<Boolean> values) {
            addCriterion("isDelivery in", values, "isdelivery");
            return (Criteria) this;
        }

        public Criteria andIsdeliveryNotIn(List<Boolean> values) {
            addCriterion("isDelivery not in", values, "isdelivery");
            return (Criteria) this;
        }

        public Criteria andIsdeliveryBetween(Boolean value1, Boolean value2) {
            addCriterion("isDelivery between", value1, value2, "isdelivery");
            return (Criteria) this;
        }

        public Criteria andIsdeliveryNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isDelivery not between", value1, value2, "isdelivery");
            return (Criteria) this;
        }

        public Criteria andIslistIsNull() {
            addCriterion("isList is null");
            return (Criteria) this;
        }

        public Criteria andIslistIsNotNull() {
            addCriterion("isList is not null");
            return (Criteria) this;
        }

        public Criteria andIslistEqualTo(Boolean value) {
            addCriterion("isList =", value, "islist");
            return (Criteria) this;
        }

        public Criteria andIslistNotEqualTo(Boolean value) {
            addCriterion("isList <>", value, "islist");
            return (Criteria) this;
        }

        public Criteria andIslistGreaterThan(Boolean value) {
            addCriterion("isList >", value, "islist");
            return (Criteria) this;
        }

        public Criteria andIslistGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isList >=", value, "islist");
            return (Criteria) this;
        }

        public Criteria andIslistLessThan(Boolean value) {
            addCriterion("isList <", value, "islist");
            return (Criteria) this;
        }

        public Criteria andIslistLessThanOrEqualTo(Boolean value) {
            addCriterion("isList <=", value, "islist");
            return (Criteria) this;
        }

        public Criteria andIslistIn(List<Boolean> values) {
            addCriterion("isList in", values, "islist");
            return (Criteria) this;
        }

        public Criteria andIslistNotIn(List<Boolean> values) {
            addCriterion("isList not in", values, "islist");
            return (Criteria) this;
        }

        public Criteria andIslistBetween(Boolean value1, Boolean value2) {
            addCriterion("isList between", value1, value2, "islist");
            return (Criteria) this;
        }

        public Criteria andIslistNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isList not between", value1, value2, "islist");
            return (Criteria) this;
        }

        public Criteria andIsmarketableIsNull() {
            addCriterion("isMarketable is null");
            return (Criteria) this;
        }

        public Criteria andIsmarketableIsNotNull() {
            addCriterion("isMarketable is not null");
            return (Criteria) this;
        }

        public Criteria andIsmarketableEqualTo(Boolean value) {
            addCriterion("isMarketable =", value, "ismarketable");
            return (Criteria) this;
        }

        public Criteria andIsmarketableNotEqualTo(Boolean value) {
            addCriterion("isMarketable <>", value, "ismarketable");
            return (Criteria) this;
        }

        public Criteria andIsmarketableGreaterThan(Boolean value) {
            addCriterion("isMarketable >", value, "ismarketable");
            return (Criteria) this;
        }

        public Criteria andIsmarketableGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isMarketable >=", value, "ismarketable");
            return (Criteria) this;
        }

        public Criteria andIsmarketableLessThan(Boolean value) {
            addCriterion("isMarketable <", value, "ismarketable");
            return (Criteria) this;
        }

        public Criteria andIsmarketableLessThanOrEqualTo(Boolean value) {
            addCriterion("isMarketable <=", value, "ismarketable");
            return (Criteria) this;
        }

        public Criteria andIsmarketableIn(List<Boolean> values) {
            addCriterion("isMarketable in", values, "ismarketable");
            return (Criteria) this;
        }

        public Criteria andIsmarketableNotIn(List<Boolean> values) {
            addCriterion("isMarketable not in", values, "ismarketable");
            return (Criteria) this;
        }

        public Criteria andIsmarketableBetween(Boolean value1, Boolean value2) {
            addCriterion("isMarketable between", value1, value2, "ismarketable");
            return (Criteria) this;
        }

        public Criteria andIsmarketableNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isMarketable not between", value1, value2, "ismarketable");
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

        public Criteria andKeywordIsNull() {
            addCriterion("keyword is null");
            return (Criteria) this;
        }

        public Criteria andKeywordIsNotNull() {
            addCriterion("keyword is not null");
            return (Criteria) this;
        }

        public Criteria andKeywordEqualTo(String value) {
            addCriterion("keyword =", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotEqualTo(String value) {
            addCriterion("keyword <>", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordGreaterThan(String value) {
            addCriterion("keyword >", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordGreaterThanOrEqualTo(String value) {
            addCriterion("keyword >=", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLessThan(String value) {
            addCriterion("keyword <", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLessThanOrEqualTo(String value) {
            addCriterion("keyword <=", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLike(String value) {
            addCriterion("keyword like", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotLike(String value) {
            addCriterion("keyword not like", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordIn(List<String> values) {
            addCriterion("keyword in", values, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotIn(List<String> values) {
            addCriterion("keyword not in", values, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordBetween(String value1, String value2) {
            addCriterion("keyword between", value1, value2, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotBetween(String value1, String value2) {
            addCriterion("keyword not between", value1, value2, "keyword");
            return (Criteria) this;
        }

        public Criteria andMarketpriceIsNull() {
            addCriterion("marketPrice is null");
            return (Criteria) this;
        }

        public Criteria andMarketpriceIsNotNull() {
            addCriterion("marketPrice is not null");
            return (Criteria) this;
        }

        public Criteria andMarketpriceEqualTo(BigDecimal value) {
            addCriterion("marketPrice =", value, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceNotEqualTo(BigDecimal value) {
            addCriterion("marketPrice <>", value, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceGreaterThan(BigDecimal value) {
            addCriterion("marketPrice >", value, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("marketPrice >=", value, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceLessThan(BigDecimal value) {
            addCriterion("marketPrice <", value, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("marketPrice <=", value, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceIn(List<BigDecimal> values) {
            addCriterion("marketPrice in", values, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceNotIn(List<BigDecimal> values) {
            addCriterion("marketPrice not in", values, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("marketPrice between", value1, value2, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("marketPrice not between", value1, value2, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("memo is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("memo is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("memo =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("memo <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("memo >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("memo >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("memo <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("memo <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("memo like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("memo not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("memo in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("memo not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("memo between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("memo not between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMonthhitsIsNull() {
            addCriterion("monthHits is null");
            return (Criteria) this;
        }

        public Criteria andMonthhitsIsNotNull() {
            addCriterion("monthHits is not null");
            return (Criteria) this;
        }

        public Criteria andMonthhitsEqualTo(Long value) {
            addCriterion("monthHits =", value, "monthhits");
            return (Criteria) this;
        }

        public Criteria andMonthhitsNotEqualTo(Long value) {
            addCriterion("monthHits <>", value, "monthhits");
            return (Criteria) this;
        }

        public Criteria andMonthhitsGreaterThan(Long value) {
            addCriterion("monthHits >", value, "monthhits");
            return (Criteria) this;
        }

        public Criteria andMonthhitsGreaterThanOrEqualTo(Long value) {
            addCriterion("monthHits >=", value, "monthhits");
            return (Criteria) this;
        }

        public Criteria andMonthhitsLessThan(Long value) {
            addCriterion("monthHits <", value, "monthhits");
            return (Criteria) this;
        }

        public Criteria andMonthhitsLessThanOrEqualTo(Long value) {
            addCriterion("monthHits <=", value, "monthhits");
            return (Criteria) this;
        }

        public Criteria andMonthhitsIn(List<Long> values) {
            addCriterion("monthHits in", values, "monthhits");
            return (Criteria) this;
        }

        public Criteria andMonthhitsNotIn(List<Long> values) {
            addCriterion("monthHits not in", values, "monthhits");
            return (Criteria) this;
        }

        public Criteria andMonthhitsBetween(Long value1, Long value2) {
            addCriterion("monthHits between", value1, value2, "monthhits");
            return (Criteria) this;
        }

        public Criteria andMonthhitsNotBetween(Long value1, Long value2) {
            addCriterion("monthHits not between", value1, value2, "monthhits");
            return (Criteria) this;
        }

        public Criteria andMonthhitsdateIsNull() {
            addCriterion("monthHitsDate is null");
            return (Criteria) this;
        }

        public Criteria andMonthhitsdateIsNotNull() {
            addCriterion("monthHitsDate is not null");
            return (Criteria) this;
        }

        public Criteria andMonthhitsdateEqualTo(Date value) {
            addCriterion("monthHitsDate =", value, "monthhitsdate");
            return (Criteria) this;
        }

        public Criteria andMonthhitsdateNotEqualTo(Date value) {
            addCriterion("monthHitsDate <>", value, "monthhitsdate");
            return (Criteria) this;
        }

        public Criteria andMonthhitsdateGreaterThan(Date value) {
            addCriterion("monthHitsDate >", value, "monthhitsdate");
            return (Criteria) this;
        }

        public Criteria andMonthhitsdateGreaterThanOrEqualTo(Date value) {
            addCriterion("monthHitsDate >=", value, "monthhitsdate");
            return (Criteria) this;
        }

        public Criteria andMonthhitsdateLessThan(Date value) {
            addCriterion("monthHitsDate <", value, "monthhitsdate");
            return (Criteria) this;
        }

        public Criteria andMonthhitsdateLessThanOrEqualTo(Date value) {
            addCriterion("monthHitsDate <=", value, "monthhitsdate");
            return (Criteria) this;
        }

        public Criteria andMonthhitsdateIn(List<Date> values) {
            addCriterion("monthHitsDate in", values, "monthhitsdate");
            return (Criteria) this;
        }

        public Criteria andMonthhitsdateNotIn(List<Date> values) {
            addCriterion("monthHitsDate not in", values, "monthhitsdate");
            return (Criteria) this;
        }

        public Criteria andMonthhitsdateBetween(Date value1, Date value2) {
            addCriterion("monthHitsDate between", value1, value2, "monthhitsdate");
            return (Criteria) this;
        }

        public Criteria andMonthhitsdateNotBetween(Date value1, Date value2) {
            addCriterion("monthHitsDate not between", value1, value2, "monthhitsdate");
            return (Criteria) this;
        }

        public Criteria andMonthsalesIsNull() {
            addCriterion("monthSales is null");
            return (Criteria) this;
        }

        public Criteria andMonthsalesIsNotNull() {
            addCriterion("monthSales is not null");
            return (Criteria) this;
        }

        public Criteria andMonthsalesEqualTo(Long value) {
            addCriterion("monthSales =", value, "monthsales");
            return (Criteria) this;
        }

        public Criteria andMonthsalesNotEqualTo(Long value) {
            addCriterion("monthSales <>", value, "monthsales");
            return (Criteria) this;
        }

        public Criteria andMonthsalesGreaterThan(Long value) {
            addCriterion("monthSales >", value, "monthsales");
            return (Criteria) this;
        }

        public Criteria andMonthsalesGreaterThanOrEqualTo(Long value) {
            addCriterion("monthSales >=", value, "monthsales");
            return (Criteria) this;
        }

        public Criteria andMonthsalesLessThan(Long value) {
            addCriterion("monthSales <", value, "monthsales");
            return (Criteria) this;
        }

        public Criteria andMonthsalesLessThanOrEqualTo(Long value) {
            addCriterion("monthSales <=", value, "monthsales");
            return (Criteria) this;
        }

        public Criteria andMonthsalesIn(List<Long> values) {
            addCriterion("monthSales in", values, "monthsales");
            return (Criteria) this;
        }

        public Criteria andMonthsalesNotIn(List<Long> values) {
            addCriterion("monthSales not in", values, "monthsales");
            return (Criteria) this;
        }

        public Criteria andMonthsalesBetween(Long value1, Long value2) {
            addCriterion("monthSales between", value1, value2, "monthsales");
            return (Criteria) this;
        }

        public Criteria andMonthsalesNotBetween(Long value1, Long value2) {
            addCriterion("monthSales not between", value1, value2, "monthsales");
            return (Criteria) this;
        }

        public Criteria andMonthsalesdateIsNull() {
            addCriterion("monthSalesDate is null");
            return (Criteria) this;
        }

        public Criteria andMonthsalesdateIsNotNull() {
            addCriterion("monthSalesDate is not null");
            return (Criteria) this;
        }

        public Criteria andMonthsalesdateEqualTo(Date value) {
            addCriterion("monthSalesDate =", value, "monthsalesdate");
            return (Criteria) this;
        }

        public Criteria andMonthsalesdateNotEqualTo(Date value) {
            addCriterion("monthSalesDate <>", value, "monthsalesdate");
            return (Criteria) this;
        }

        public Criteria andMonthsalesdateGreaterThan(Date value) {
            addCriterion("monthSalesDate >", value, "monthsalesdate");
            return (Criteria) this;
        }

        public Criteria andMonthsalesdateGreaterThanOrEqualTo(Date value) {
            addCriterion("monthSalesDate >=", value, "monthsalesdate");
            return (Criteria) this;
        }

        public Criteria andMonthsalesdateLessThan(Date value) {
            addCriterion("monthSalesDate <", value, "monthsalesdate");
            return (Criteria) this;
        }

        public Criteria andMonthsalesdateLessThanOrEqualTo(Date value) {
            addCriterion("monthSalesDate <=", value, "monthsalesdate");
            return (Criteria) this;
        }

        public Criteria andMonthsalesdateIn(List<Date> values) {
            addCriterion("monthSalesDate in", values, "monthsalesdate");
            return (Criteria) this;
        }

        public Criteria andMonthsalesdateNotIn(List<Date> values) {
            addCriterion("monthSalesDate not in", values, "monthsalesdate");
            return (Criteria) this;
        }

        public Criteria andMonthsalesdateBetween(Date value1, Date value2) {
            addCriterion("monthSalesDate between", value1, value2, "monthsalesdate");
            return (Criteria) this;
        }

        public Criteria andMonthsalesdateNotBetween(Date value1, Date value2) {
            addCriterion("monthSalesDate not between", value1, value2, "monthsalesdate");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andSalesIsNull() {
            addCriterion("sales is null");
            return (Criteria) this;
        }

        public Criteria andSalesIsNotNull() {
            addCriterion("sales is not null");
            return (Criteria) this;
        }

        public Criteria andSalesEqualTo(Long value) {
            addCriterion("sales =", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesNotEqualTo(Long value) {
            addCriterion("sales <>", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesGreaterThan(Long value) {
            addCriterion("sales >", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesGreaterThanOrEqualTo(Long value) {
            addCriterion("sales >=", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesLessThan(Long value) {
            addCriterion("sales <", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesLessThanOrEqualTo(Long value) {
            addCriterion("sales <=", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesIn(List<Long> values) {
            addCriterion("sales in", values, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesNotIn(List<Long> values) {
            addCriterion("sales not in", values, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesBetween(Long value1, Long value2) {
            addCriterion("sales between", value1, value2, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesNotBetween(Long value1, Long value2) {
            addCriterion("sales not between", value1, value2, "sales");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Float value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Float value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Float value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Float value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Float value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Float value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Float> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Float> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Float value1, Float value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Float value1, Float value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScorecountIsNull() {
            addCriterion("scoreCount is null");
            return (Criteria) this;
        }

        public Criteria andScorecountIsNotNull() {
            addCriterion("scoreCount is not null");
            return (Criteria) this;
        }

        public Criteria andScorecountEqualTo(Long value) {
            addCriterion("scoreCount =", value, "scorecount");
            return (Criteria) this;
        }

        public Criteria andScorecountNotEqualTo(Long value) {
            addCriterion("scoreCount <>", value, "scorecount");
            return (Criteria) this;
        }

        public Criteria andScorecountGreaterThan(Long value) {
            addCriterion("scoreCount >", value, "scorecount");
            return (Criteria) this;
        }

        public Criteria andScorecountGreaterThanOrEqualTo(Long value) {
            addCriterion("scoreCount >=", value, "scorecount");
            return (Criteria) this;
        }

        public Criteria andScorecountLessThan(Long value) {
            addCriterion("scoreCount <", value, "scorecount");
            return (Criteria) this;
        }

        public Criteria andScorecountLessThanOrEqualTo(Long value) {
            addCriterion("scoreCount <=", value, "scorecount");
            return (Criteria) this;
        }

        public Criteria andScorecountIn(List<Long> values) {
            addCriterion("scoreCount in", values, "scorecount");
            return (Criteria) this;
        }

        public Criteria andScorecountNotIn(List<Long> values) {
            addCriterion("scoreCount not in", values, "scorecount");
            return (Criteria) this;
        }

        public Criteria andScorecountBetween(Long value1, Long value2) {
            addCriterion("scoreCount between", value1, value2, "scorecount");
            return (Criteria) this;
        }

        public Criteria andScorecountNotBetween(Long value1, Long value2) {
            addCriterion("scoreCount not between", value1, value2, "scorecount");
            return (Criteria) this;
        }

        public Criteria andSnIsNull() {
            addCriterion("sn is null");
            return (Criteria) this;
        }

        public Criteria andSnIsNotNull() {
            addCriterion("sn is not null");
            return (Criteria) this;
        }

        public Criteria andSnEqualTo(String value) {
            addCriterion("sn =", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotEqualTo(String value) {
            addCriterion("sn <>", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnGreaterThan(String value) {
            addCriterion("sn >", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnGreaterThanOrEqualTo(String value) {
            addCriterion("sn >=", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLessThan(String value) {
            addCriterion("sn <", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLessThanOrEqualTo(String value) {
            addCriterion("sn <=", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLike(String value) {
            addCriterion("sn like", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotLike(String value) {
            addCriterion("sn not like", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnIn(List<String> values) {
            addCriterion("sn in", values, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotIn(List<String> values) {
            addCriterion("sn not in", values, "sn");
            return (Criteria) this;
        }

        public Criteria andSnBetween(String value1, String value2) {
            addCriterion("sn between", value1, value2, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotBetween(String value1, String value2) {
            addCriterion("sn not between", value1, value2, "sn");
            return (Criteria) this;
        }

        public Criteria andTotalscoreIsNull() {
            addCriterion("totalScore is null");
            return (Criteria) this;
        }

        public Criteria andTotalscoreIsNotNull() {
            addCriterion("totalScore is not null");
            return (Criteria) this;
        }

        public Criteria andTotalscoreEqualTo(Long value) {
            addCriterion("totalScore =", value, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreNotEqualTo(Long value) {
            addCriterion("totalScore <>", value, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreGreaterThan(Long value) {
            addCriterion("totalScore >", value, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreGreaterThanOrEqualTo(Long value) {
            addCriterion("totalScore >=", value, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreLessThan(Long value) {
            addCriterion("totalScore <", value, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreLessThanOrEqualTo(Long value) {
            addCriterion("totalScore <=", value, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreIn(List<Long> values) {
            addCriterion("totalScore in", values, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreNotIn(List<Long> values) {
            addCriterion("totalScore not in", values, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreBetween(Long value1, Long value2) {
            addCriterion("totalScore between", value1, value2, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreNotBetween(Long value1, Long value2) {
            addCriterion("totalScore not between", value1, value2, "totalscore");
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

        public Criteria andUnitIsNull() {
            addCriterion("unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("unit not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andWeekhitsIsNull() {
            addCriterion("weekHits is null");
            return (Criteria) this;
        }

        public Criteria andWeekhitsIsNotNull() {
            addCriterion("weekHits is not null");
            return (Criteria) this;
        }

        public Criteria andWeekhitsEqualTo(Long value) {
            addCriterion("weekHits =", value, "weekhits");
            return (Criteria) this;
        }

        public Criteria andWeekhitsNotEqualTo(Long value) {
            addCriterion("weekHits <>", value, "weekhits");
            return (Criteria) this;
        }

        public Criteria andWeekhitsGreaterThan(Long value) {
            addCriterion("weekHits >", value, "weekhits");
            return (Criteria) this;
        }

        public Criteria andWeekhitsGreaterThanOrEqualTo(Long value) {
            addCriterion("weekHits >=", value, "weekhits");
            return (Criteria) this;
        }

        public Criteria andWeekhitsLessThan(Long value) {
            addCriterion("weekHits <", value, "weekhits");
            return (Criteria) this;
        }

        public Criteria andWeekhitsLessThanOrEqualTo(Long value) {
            addCriterion("weekHits <=", value, "weekhits");
            return (Criteria) this;
        }

        public Criteria andWeekhitsIn(List<Long> values) {
            addCriterion("weekHits in", values, "weekhits");
            return (Criteria) this;
        }

        public Criteria andWeekhitsNotIn(List<Long> values) {
            addCriterion("weekHits not in", values, "weekhits");
            return (Criteria) this;
        }

        public Criteria andWeekhitsBetween(Long value1, Long value2) {
            addCriterion("weekHits between", value1, value2, "weekhits");
            return (Criteria) this;
        }

        public Criteria andWeekhitsNotBetween(Long value1, Long value2) {
            addCriterion("weekHits not between", value1, value2, "weekhits");
            return (Criteria) this;
        }

        public Criteria andWeekhitsdateIsNull() {
            addCriterion("weekHitsDate is null");
            return (Criteria) this;
        }

        public Criteria andWeekhitsdateIsNotNull() {
            addCriterion("weekHitsDate is not null");
            return (Criteria) this;
        }

        public Criteria andWeekhitsdateEqualTo(Date value) {
            addCriterion("weekHitsDate =", value, "weekhitsdate");
            return (Criteria) this;
        }

        public Criteria andWeekhitsdateNotEqualTo(Date value) {
            addCriterion("weekHitsDate <>", value, "weekhitsdate");
            return (Criteria) this;
        }

        public Criteria andWeekhitsdateGreaterThan(Date value) {
            addCriterion("weekHitsDate >", value, "weekhitsdate");
            return (Criteria) this;
        }

        public Criteria andWeekhitsdateGreaterThanOrEqualTo(Date value) {
            addCriterion("weekHitsDate >=", value, "weekhitsdate");
            return (Criteria) this;
        }

        public Criteria andWeekhitsdateLessThan(Date value) {
            addCriterion("weekHitsDate <", value, "weekhitsdate");
            return (Criteria) this;
        }

        public Criteria andWeekhitsdateLessThanOrEqualTo(Date value) {
            addCriterion("weekHitsDate <=", value, "weekhitsdate");
            return (Criteria) this;
        }

        public Criteria andWeekhitsdateIn(List<Date> values) {
            addCriterion("weekHitsDate in", values, "weekhitsdate");
            return (Criteria) this;
        }

        public Criteria andWeekhitsdateNotIn(List<Date> values) {
            addCriterion("weekHitsDate not in", values, "weekhitsdate");
            return (Criteria) this;
        }

        public Criteria andWeekhitsdateBetween(Date value1, Date value2) {
            addCriterion("weekHitsDate between", value1, value2, "weekhitsdate");
            return (Criteria) this;
        }

        public Criteria andWeekhitsdateNotBetween(Date value1, Date value2) {
            addCriterion("weekHitsDate not between", value1, value2, "weekhitsdate");
            return (Criteria) this;
        }

        public Criteria andWeeksalesIsNull() {
            addCriterion("weekSales is null");
            return (Criteria) this;
        }

        public Criteria andWeeksalesIsNotNull() {
            addCriterion("weekSales is not null");
            return (Criteria) this;
        }

        public Criteria andWeeksalesEqualTo(Long value) {
            addCriterion("weekSales =", value, "weeksales");
            return (Criteria) this;
        }

        public Criteria andWeeksalesNotEqualTo(Long value) {
            addCriterion("weekSales <>", value, "weeksales");
            return (Criteria) this;
        }

        public Criteria andWeeksalesGreaterThan(Long value) {
            addCriterion("weekSales >", value, "weeksales");
            return (Criteria) this;
        }

        public Criteria andWeeksalesGreaterThanOrEqualTo(Long value) {
            addCriterion("weekSales >=", value, "weeksales");
            return (Criteria) this;
        }

        public Criteria andWeeksalesLessThan(Long value) {
            addCriterion("weekSales <", value, "weeksales");
            return (Criteria) this;
        }

        public Criteria andWeeksalesLessThanOrEqualTo(Long value) {
            addCriterion("weekSales <=", value, "weeksales");
            return (Criteria) this;
        }

        public Criteria andWeeksalesIn(List<Long> values) {
            addCriterion("weekSales in", values, "weeksales");
            return (Criteria) this;
        }

        public Criteria andWeeksalesNotIn(List<Long> values) {
            addCriterion("weekSales not in", values, "weeksales");
            return (Criteria) this;
        }

        public Criteria andWeeksalesBetween(Long value1, Long value2) {
            addCriterion("weekSales between", value1, value2, "weeksales");
            return (Criteria) this;
        }

        public Criteria andWeeksalesNotBetween(Long value1, Long value2) {
            addCriterion("weekSales not between", value1, value2, "weeksales");
            return (Criteria) this;
        }

        public Criteria andWeeksalesdateIsNull() {
            addCriterion("weekSalesDate is null");
            return (Criteria) this;
        }

        public Criteria andWeeksalesdateIsNotNull() {
            addCriterion("weekSalesDate is not null");
            return (Criteria) this;
        }

        public Criteria andWeeksalesdateEqualTo(Date value) {
            addCriterion("weekSalesDate =", value, "weeksalesdate");
            return (Criteria) this;
        }

        public Criteria andWeeksalesdateNotEqualTo(Date value) {
            addCriterion("weekSalesDate <>", value, "weeksalesdate");
            return (Criteria) this;
        }

        public Criteria andWeeksalesdateGreaterThan(Date value) {
            addCriterion("weekSalesDate >", value, "weeksalesdate");
            return (Criteria) this;
        }

        public Criteria andWeeksalesdateGreaterThanOrEqualTo(Date value) {
            addCriterion("weekSalesDate >=", value, "weeksalesdate");
            return (Criteria) this;
        }

        public Criteria andWeeksalesdateLessThan(Date value) {
            addCriterion("weekSalesDate <", value, "weeksalesdate");
            return (Criteria) this;
        }

        public Criteria andWeeksalesdateLessThanOrEqualTo(Date value) {
            addCriterion("weekSalesDate <=", value, "weeksalesdate");
            return (Criteria) this;
        }

        public Criteria andWeeksalesdateIn(List<Date> values) {
            addCriterion("weekSalesDate in", values, "weeksalesdate");
            return (Criteria) this;
        }

        public Criteria andWeeksalesdateNotIn(List<Date> values) {
            addCriterion("weekSalesDate not in", values, "weeksalesdate");
            return (Criteria) this;
        }

        public Criteria andWeeksalesdateBetween(Date value1, Date value2) {
            addCriterion("weekSalesDate between", value1, value2, "weeksalesdate");
            return (Criteria) this;
        }

        public Criteria andWeeksalesdateNotBetween(Date value1, Date value2) {
            addCriterion("weekSalesDate not between", value1, value2, "weeksalesdate");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(Integer value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(Integer value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(Integer value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(Integer value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(Integer value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<Integer> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<Integer> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(Integer value1, Integer value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(Integer value1, Integer value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNull() {
            addCriterion("brand_id is null");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNotNull() {
            addCriterion("brand_id is not null");
            return (Criteria) this;
        }

        public Criteria andBrandIdEqualTo(Long value) {
            addCriterion("brand_id =", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotEqualTo(Long value) {
            addCriterion("brand_id <>", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThan(Long value) {
            addCriterion("brand_id >", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThanOrEqualTo(Long value) {
            addCriterion("brand_id >=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThan(Long value) {
            addCriterion("brand_id <", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThanOrEqualTo(Long value) {
            addCriterion("brand_id <=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdIn(List<Long> values) {
            addCriterion("brand_id in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotIn(List<Long> values) {
            addCriterion("brand_id not in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdBetween(Long value1, Long value2) {
            addCriterion("brand_id between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotBetween(Long value1, Long value2) {
            addCriterion("brand_id not between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andProductcategoryIdIsNull() {
            addCriterion("productCategory_id is null");
            return (Criteria) this;
        }

        public Criteria andProductcategoryIdIsNotNull() {
            addCriterion("productCategory_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductcategoryIdEqualTo(Long value) {
            addCriterion("productCategory_id =", value, "productcategoryId");
            return (Criteria) this;
        }

        public Criteria andProductcategoryIdNotEqualTo(Long value) {
            addCriterion("productCategory_id <>", value, "productcategoryId");
            return (Criteria) this;
        }

        public Criteria andProductcategoryIdGreaterThan(Long value) {
            addCriterion("productCategory_id >", value, "productcategoryId");
            return (Criteria) this;
        }

        public Criteria andProductcategoryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("productCategory_id >=", value, "productcategoryId");
            return (Criteria) this;
        }

        public Criteria andProductcategoryIdLessThan(Long value) {
            addCriterion("productCategory_id <", value, "productcategoryId");
            return (Criteria) this;
        }

        public Criteria andProductcategoryIdLessThanOrEqualTo(Long value) {
            addCriterion("productCategory_id <=", value, "productcategoryId");
            return (Criteria) this;
        }

        public Criteria andProductcategoryIdIn(List<Long> values) {
            addCriterion("productCategory_id in", values, "productcategoryId");
            return (Criteria) this;
        }

        public Criteria andProductcategoryIdNotIn(List<Long> values) {
            addCriterion("productCategory_id not in", values, "productcategoryId");
            return (Criteria) this;
        }

        public Criteria andProductcategoryIdBetween(Long value1, Long value2) {
            addCriterion("productCategory_id between", value1, value2, "productcategoryId");
            return (Criteria) this;
        }

        public Criteria andProductcategoryIdNotBetween(Long value1, Long value2) {
            addCriterion("productCategory_id not between", value1, value2, "productcategoryId");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNull() {
            addCriterion("store_id is null");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNotNull() {
            addCriterion("store_id is not null");
            return (Criteria) this;
        }

        public Criteria andStoreIdEqualTo(Long value) {
            addCriterion("store_id =", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotEqualTo(Long value) {
            addCriterion("store_id <>", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThan(Long value) {
            addCriterion("store_id >", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThanOrEqualTo(Long value) {
            addCriterion("store_id >=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThan(Long value) {
            addCriterion("store_id <", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThanOrEqualTo(Long value) {
            addCriterion("store_id <=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdIn(List<Long> values) {
            addCriterion("store_id in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotIn(List<Long> values) {
            addCriterion("store_id not in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdBetween(Long value1, Long value2) {
            addCriterion("store_id between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotBetween(Long value1, Long value2) {
            addCriterion("store_id not between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreproductcategoryIdIsNull() {
            addCriterion("storeProductCategory_id is null");
            return (Criteria) this;
        }

        public Criteria andStoreproductcategoryIdIsNotNull() {
            addCriterion("storeProductCategory_id is not null");
            return (Criteria) this;
        }

        public Criteria andStoreproductcategoryIdEqualTo(Long value) {
            addCriterion("storeProductCategory_id =", value, "storeproductcategoryId");
            return (Criteria) this;
        }

        public Criteria andStoreproductcategoryIdNotEqualTo(Long value) {
            addCriterion("storeProductCategory_id <>", value, "storeproductcategoryId");
            return (Criteria) this;
        }

        public Criteria andStoreproductcategoryIdGreaterThan(Long value) {
            addCriterion("storeProductCategory_id >", value, "storeproductcategoryId");
            return (Criteria) this;
        }

        public Criteria andStoreproductcategoryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("storeProductCategory_id >=", value, "storeproductcategoryId");
            return (Criteria) this;
        }

        public Criteria andStoreproductcategoryIdLessThan(Long value) {
            addCriterion("storeProductCategory_id <", value, "storeproductcategoryId");
            return (Criteria) this;
        }

        public Criteria andStoreproductcategoryIdLessThanOrEqualTo(Long value) {
            addCriterion("storeProductCategory_id <=", value, "storeproductcategoryId");
            return (Criteria) this;
        }

        public Criteria andStoreproductcategoryIdIn(List<Long> values) {
            addCriterion("storeProductCategory_id in", values, "storeproductcategoryId");
            return (Criteria) this;
        }

        public Criteria andStoreproductcategoryIdNotIn(List<Long> values) {
            addCriterion("storeProductCategory_id not in", values, "storeproductcategoryId");
            return (Criteria) this;
        }

        public Criteria andStoreproductcategoryIdBetween(Long value1, Long value2) {
            addCriterion("storeProductCategory_id between", value1, value2, "storeproductcategoryId");
            return (Criteria) this;
        }

        public Criteria andStoreproductcategoryIdNotBetween(Long value1, Long value2) {
            addCriterion("storeProductCategory_id not between", value1, value2, "storeproductcategoryId");
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