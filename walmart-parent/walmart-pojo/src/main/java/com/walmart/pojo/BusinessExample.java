package com.walmart.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BusinessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BusinessExample() {
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

        public Criteria andBalanceIsNull() {
            addCriterion("balance is null");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNotNull() {
            addCriterion("balance is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceEqualTo(BigDecimal value) {
            addCriterion("balance =", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotEqualTo(BigDecimal value) {
            addCriterion("balance <>", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThan(BigDecimal value) {
            addCriterion("balance >", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("balance >=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThan(BigDecimal value) {
            addCriterion("balance <", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("balance <=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceIn(List<BigDecimal> values) {
            addCriterion("balance in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotIn(List<BigDecimal> values) {
            addCriterion("balance not in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("balance between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("balance not between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andBankaccountIsNull() {
            addCriterion("bankAccount is null");
            return (Criteria) this;
        }

        public Criteria andBankaccountIsNotNull() {
            addCriterion("bankAccount is not null");
            return (Criteria) this;
        }

        public Criteria andBankaccountEqualTo(String value) {
            addCriterion("bankAccount =", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountNotEqualTo(String value) {
            addCriterion("bankAccount <>", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountGreaterThan(String value) {
            addCriterion("bankAccount >", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountGreaterThanOrEqualTo(String value) {
            addCriterion("bankAccount >=", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountLessThan(String value) {
            addCriterion("bankAccount <", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountLessThanOrEqualTo(String value) {
            addCriterion("bankAccount <=", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountLike(String value) {
            addCriterion("bankAccount like", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountNotLike(String value) {
            addCriterion("bankAccount not like", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountIn(List<String> values) {
            addCriterion("bankAccount in", values, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountNotIn(List<String> values) {
            addCriterion("bankAccount not in", values, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountBetween(String value1, String value2) {
            addCriterion("bankAccount between", value1, value2, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountNotBetween(String value1, String value2) {
            addCriterion("bankAccount not between", value1, value2, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBanknameIsNull() {
            addCriterion("bankName is null");
            return (Criteria) this;
        }

        public Criteria andBanknameIsNotNull() {
            addCriterion("bankName is not null");
            return (Criteria) this;
        }

        public Criteria andBanknameEqualTo(String value) {
            addCriterion("bankName =", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotEqualTo(String value) {
            addCriterion("bankName <>", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameGreaterThan(String value) {
            addCriterion("bankName >", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameGreaterThanOrEqualTo(String value) {
            addCriterion("bankName >=", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameLessThan(String value) {
            addCriterion("bankName <", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameLessThanOrEqualTo(String value) {
            addCriterion("bankName <=", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameLike(String value) {
            addCriterion("bankName like", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotLike(String value) {
            addCriterion("bankName not like", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameIn(List<String> values) {
            addCriterion("bankName in", values, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotIn(List<String> values) {
            addCriterion("bankName not in", values, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameBetween(String value1, String value2) {
            addCriterion("bankName between", value1, value2, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotBetween(String value1, String value2) {
            addCriterion("bankName not between", value1, value2, "bankname");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEncodedpasswordIsNull() {
            addCriterion("encodedPassword is null");
            return (Criteria) this;
        }

        public Criteria andEncodedpasswordIsNotNull() {
            addCriterion("encodedPassword is not null");
            return (Criteria) this;
        }

        public Criteria andEncodedpasswordEqualTo(String value) {
            addCriterion("encodedPassword =", value, "encodedpassword");
            return (Criteria) this;
        }

        public Criteria andEncodedpasswordNotEqualTo(String value) {
            addCriterion("encodedPassword <>", value, "encodedpassword");
            return (Criteria) this;
        }

        public Criteria andEncodedpasswordGreaterThan(String value) {
            addCriterion("encodedPassword >", value, "encodedpassword");
            return (Criteria) this;
        }

        public Criteria andEncodedpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("encodedPassword >=", value, "encodedpassword");
            return (Criteria) this;
        }

        public Criteria andEncodedpasswordLessThan(String value) {
            addCriterion("encodedPassword <", value, "encodedpassword");
            return (Criteria) this;
        }

        public Criteria andEncodedpasswordLessThanOrEqualTo(String value) {
            addCriterion("encodedPassword <=", value, "encodedpassword");
            return (Criteria) this;
        }

        public Criteria andEncodedpasswordLike(String value) {
            addCriterion("encodedPassword like", value, "encodedpassword");
            return (Criteria) this;
        }

        public Criteria andEncodedpasswordNotLike(String value) {
            addCriterion("encodedPassword not like", value, "encodedpassword");
            return (Criteria) this;
        }

        public Criteria andEncodedpasswordIn(List<String> values) {
            addCriterion("encodedPassword in", values, "encodedpassword");
            return (Criteria) this;
        }

        public Criteria andEncodedpasswordNotIn(List<String> values) {
            addCriterion("encodedPassword not in", values, "encodedpassword");
            return (Criteria) this;
        }

        public Criteria andEncodedpasswordBetween(String value1, String value2) {
            addCriterion("encodedPassword between", value1, value2, "encodedpassword");
            return (Criteria) this;
        }

        public Criteria andEncodedpasswordNotBetween(String value1, String value2) {
            addCriterion("encodedPassword not between", value1, value2, "encodedpassword");
            return (Criteria) this;
        }

        public Criteria andFrozenfundIsNull() {
            addCriterion("frozenFund is null");
            return (Criteria) this;
        }

        public Criteria andFrozenfundIsNotNull() {
            addCriterion("frozenFund is not null");
            return (Criteria) this;
        }

        public Criteria andFrozenfundEqualTo(BigDecimal value) {
            addCriterion("frozenFund =", value, "frozenfund");
            return (Criteria) this;
        }

        public Criteria andFrozenfundNotEqualTo(BigDecimal value) {
            addCriterion("frozenFund <>", value, "frozenfund");
            return (Criteria) this;
        }

        public Criteria andFrozenfundGreaterThan(BigDecimal value) {
            addCriterion("frozenFund >", value, "frozenfund");
            return (Criteria) this;
        }

        public Criteria andFrozenfundGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("frozenFund >=", value, "frozenfund");
            return (Criteria) this;
        }

        public Criteria andFrozenfundLessThan(BigDecimal value) {
            addCriterion("frozenFund <", value, "frozenfund");
            return (Criteria) this;
        }

        public Criteria andFrozenfundLessThanOrEqualTo(BigDecimal value) {
            addCriterion("frozenFund <=", value, "frozenfund");
            return (Criteria) this;
        }

        public Criteria andFrozenfundIn(List<BigDecimal> values) {
            addCriterion("frozenFund in", values, "frozenfund");
            return (Criteria) this;
        }

        public Criteria andFrozenfundNotIn(List<BigDecimal> values) {
            addCriterion("frozenFund not in", values, "frozenfund");
            return (Criteria) this;
        }

        public Criteria andFrozenfundBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("frozenFund between", value1, value2, "frozenfund");
            return (Criteria) this;
        }

        public Criteria andFrozenfundNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("frozenFund not between", value1, value2, "frozenfund");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNull() {
            addCriterion("idCard is null");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNotNull() {
            addCriterion("idCard is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardEqualTo(String value) {
            addCriterion("idCard =", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotEqualTo(String value) {
            addCriterion("idCard <>", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThan(String value) {
            addCriterion("idCard >", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("idCard >=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThan(String value) {
            addCriterion("idCard <", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThanOrEqualTo(String value) {
            addCriterion("idCard <=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLike(String value) {
            addCriterion("idCard like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotLike(String value) {
            addCriterion("idCard not like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardIn(List<String> values) {
            addCriterion("idCard in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotIn(List<String> values) {
            addCriterion("idCard not in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardBetween(String value1, String value2) {
            addCriterion("idCard between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotBetween(String value1, String value2) {
            addCriterion("idCard not between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardimageIsNull() {
            addCriterion("idCardImage is null");
            return (Criteria) this;
        }

        public Criteria andIdcardimageIsNotNull() {
            addCriterion("idCardImage is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardimageEqualTo(String value) {
            addCriterion("idCardImage =", value, "idcardimage");
            return (Criteria) this;
        }

        public Criteria andIdcardimageNotEqualTo(String value) {
            addCriterion("idCardImage <>", value, "idcardimage");
            return (Criteria) this;
        }

        public Criteria andIdcardimageGreaterThan(String value) {
            addCriterion("idCardImage >", value, "idcardimage");
            return (Criteria) this;
        }

        public Criteria andIdcardimageGreaterThanOrEqualTo(String value) {
            addCriterion("idCardImage >=", value, "idcardimage");
            return (Criteria) this;
        }

        public Criteria andIdcardimageLessThan(String value) {
            addCriterion("idCardImage <", value, "idcardimage");
            return (Criteria) this;
        }

        public Criteria andIdcardimageLessThanOrEqualTo(String value) {
            addCriterion("idCardImage <=", value, "idcardimage");
            return (Criteria) this;
        }

        public Criteria andIdcardimageLike(String value) {
            addCriterion("idCardImage like", value, "idcardimage");
            return (Criteria) this;
        }

        public Criteria andIdcardimageNotLike(String value) {
            addCriterion("idCardImage not like", value, "idcardimage");
            return (Criteria) this;
        }

        public Criteria andIdcardimageIn(List<String> values) {
            addCriterion("idCardImage in", values, "idcardimage");
            return (Criteria) this;
        }

        public Criteria andIdcardimageNotIn(List<String> values) {
            addCriterion("idCardImage not in", values, "idcardimage");
            return (Criteria) this;
        }

        public Criteria andIdcardimageBetween(String value1, String value2) {
            addCriterion("idCardImage between", value1, value2, "idcardimage");
            return (Criteria) this;
        }

        public Criteria andIdcardimageNotBetween(String value1, String value2) {
            addCriterion("idCardImage not between", value1, value2, "idcardimage");
            return (Criteria) this;
        }

        public Criteria andIdentificationnumberIsNull() {
            addCriterion("identificationNumber is null");
            return (Criteria) this;
        }

        public Criteria andIdentificationnumberIsNotNull() {
            addCriterion("identificationNumber is not null");
            return (Criteria) this;
        }

        public Criteria andIdentificationnumberEqualTo(String value) {
            addCriterion("identificationNumber =", value, "identificationnumber");
            return (Criteria) this;
        }

        public Criteria andIdentificationnumberNotEqualTo(String value) {
            addCriterion("identificationNumber <>", value, "identificationnumber");
            return (Criteria) this;
        }

        public Criteria andIdentificationnumberGreaterThan(String value) {
            addCriterion("identificationNumber >", value, "identificationnumber");
            return (Criteria) this;
        }

        public Criteria andIdentificationnumberGreaterThanOrEqualTo(String value) {
            addCriterion("identificationNumber >=", value, "identificationnumber");
            return (Criteria) this;
        }

        public Criteria andIdentificationnumberLessThan(String value) {
            addCriterion("identificationNumber <", value, "identificationnumber");
            return (Criteria) this;
        }

        public Criteria andIdentificationnumberLessThanOrEqualTo(String value) {
            addCriterion("identificationNumber <=", value, "identificationnumber");
            return (Criteria) this;
        }

        public Criteria andIdentificationnumberLike(String value) {
            addCriterion("identificationNumber like", value, "identificationnumber");
            return (Criteria) this;
        }

        public Criteria andIdentificationnumberNotLike(String value) {
            addCriterion("identificationNumber not like", value, "identificationnumber");
            return (Criteria) this;
        }

        public Criteria andIdentificationnumberIn(List<String> values) {
            addCriterion("identificationNumber in", values, "identificationnumber");
            return (Criteria) this;
        }

        public Criteria andIdentificationnumberNotIn(List<String> values) {
            addCriterion("identificationNumber not in", values, "identificationnumber");
            return (Criteria) this;
        }

        public Criteria andIdentificationnumberBetween(String value1, String value2) {
            addCriterion("identificationNumber between", value1, value2, "identificationnumber");
            return (Criteria) this;
        }

        public Criteria andIdentificationnumberNotBetween(String value1, String value2) {
            addCriterion("identificationNumber not between", value1, value2, "identificationnumber");
            return (Criteria) this;
        }

        public Criteria andLegalpersonIsNull() {
            addCriterion("legalPerson is null");
            return (Criteria) this;
        }

        public Criteria andLegalpersonIsNotNull() {
            addCriterion("legalPerson is not null");
            return (Criteria) this;
        }

        public Criteria andLegalpersonEqualTo(String value) {
            addCriterion("legalPerson =", value, "legalperson");
            return (Criteria) this;
        }

        public Criteria andLegalpersonNotEqualTo(String value) {
            addCriterion("legalPerson <>", value, "legalperson");
            return (Criteria) this;
        }

        public Criteria andLegalpersonGreaterThan(String value) {
            addCriterion("legalPerson >", value, "legalperson");
            return (Criteria) this;
        }

        public Criteria andLegalpersonGreaterThanOrEqualTo(String value) {
            addCriterion("legalPerson >=", value, "legalperson");
            return (Criteria) this;
        }

        public Criteria andLegalpersonLessThan(String value) {
            addCriterion("legalPerson <", value, "legalperson");
            return (Criteria) this;
        }

        public Criteria andLegalpersonLessThanOrEqualTo(String value) {
            addCriterion("legalPerson <=", value, "legalperson");
            return (Criteria) this;
        }

        public Criteria andLegalpersonLike(String value) {
            addCriterion("legalPerson like", value, "legalperson");
            return (Criteria) this;
        }

        public Criteria andLegalpersonNotLike(String value) {
            addCriterion("legalPerson not like", value, "legalperson");
            return (Criteria) this;
        }

        public Criteria andLegalpersonIn(List<String> values) {
            addCriterion("legalPerson in", values, "legalperson");
            return (Criteria) this;
        }

        public Criteria andLegalpersonNotIn(List<String> values) {
            addCriterion("legalPerson not in", values, "legalperson");
            return (Criteria) this;
        }

        public Criteria andLegalpersonBetween(String value1, String value2) {
            addCriterion("legalPerson between", value1, value2, "legalperson");
            return (Criteria) this;
        }

        public Criteria andLegalpersonNotBetween(String value1, String value2) {
            addCriterion("legalPerson not between", value1, value2, "legalperson");
            return (Criteria) this;
        }

        public Criteria andLicenseimageIsNull() {
            addCriterion("licenseImage is null");
            return (Criteria) this;
        }

        public Criteria andLicenseimageIsNotNull() {
            addCriterion("licenseImage is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseimageEqualTo(String value) {
            addCriterion("licenseImage =", value, "licenseimage");
            return (Criteria) this;
        }

        public Criteria andLicenseimageNotEqualTo(String value) {
            addCriterion("licenseImage <>", value, "licenseimage");
            return (Criteria) this;
        }

        public Criteria andLicenseimageGreaterThan(String value) {
            addCriterion("licenseImage >", value, "licenseimage");
            return (Criteria) this;
        }

        public Criteria andLicenseimageGreaterThanOrEqualTo(String value) {
            addCriterion("licenseImage >=", value, "licenseimage");
            return (Criteria) this;
        }

        public Criteria andLicenseimageLessThan(String value) {
            addCriterion("licenseImage <", value, "licenseimage");
            return (Criteria) this;
        }

        public Criteria andLicenseimageLessThanOrEqualTo(String value) {
            addCriterion("licenseImage <=", value, "licenseimage");
            return (Criteria) this;
        }

        public Criteria andLicenseimageLike(String value) {
            addCriterion("licenseImage like", value, "licenseimage");
            return (Criteria) this;
        }

        public Criteria andLicenseimageNotLike(String value) {
            addCriterion("licenseImage not like", value, "licenseimage");
            return (Criteria) this;
        }

        public Criteria andLicenseimageIn(List<String> values) {
            addCriterion("licenseImage in", values, "licenseimage");
            return (Criteria) this;
        }

        public Criteria andLicenseimageNotIn(List<String> values) {
            addCriterion("licenseImage not in", values, "licenseimage");
            return (Criteria) this;
        }

        public Criteria andLicenseimageBetween(String value1, String value2) {
            addCriterion("licenseImage between", value1, value2, "licenseimage");
            return (Criteria) this;
        }

        public Criteria andLicenseimageNotBetween(String value1, String value2) {
            addCriterion("licenseImage not between", value1, value2, "licenseimage");
            return (Criteria) this;
        }

        public Criteria andLicensenumberIsNull() {
            addCriterion("licenseNumber is null");
            return (Criteria) this;
        }

        public Criteria andLicensenumberIsNotNull() {
            addCriterion("licenseNumber is not null");
            return (Criteria) this;
        }

        public Criteria andLicensenumberEqualTo(String value) {
            addCriterion("licenseNumber =", value, "licensenumber");
            return (Criteria) this;
        }

        public Criteria andLicensenumberNotEqualTo(String value) {
            addCriterion("licenseNumber <>", value, "licensenumber");
            return (Criteria) this;
        }

        public Criteria andLicensenumberGreaterThan(String value) {
            addCriterion("licenseNumber >", value, "licensenumber");
            return (Criteria) this;
        }

        public Criteria andLicensenumberGreaterThanOrEqualTo(String value) {
            addCriterion("licenseNumber >=", value, "licensenumber");
            return (Criteria) this;
        }

        public Criteria andLicensenumberLessThan(String value) {
            addCriterion("licenseNumber <", value, "licensenumber");
            return (Criteria) this;
        }

        public Criteria andLicensenumberLessThanOrEqualTo(String value) {
            addCriterion("licenseNumber <=", value, "licensenumber");
            return (Criteria) this;
        }

        public Criteria andLicensenumberLike(String value) {
            addCriterion("licenseNumber like", value, "licensenumber");
            return (Criteria) this;
        }

        public Criteria andLicensenumberNotLike(String value) {
            addCriterion("licenseNumber not like", value, "licensenumber");
            return (Criteria) this;
        }

        public Criteria andLicensenumberIn(List<String> values) {
            addCriterion("licenseNumber in", values, "licensenumber");
            return (Criteria) this;
        }

        public Criteria andLicensenumberNotIn(List<String> values) {
            addCriterion("licenseNumber not in", values, "licensenumber");
            return (Criteria) this;
        }

        public Criteria andLicensenumberBetween(String value1, String value2) {
            addCriterion("licenseNumber between", value1, value2, "licensenumber");
            return (Criteria) this;
        }

        public Criteria andLicensenumberNotBetween(String value1, String value2) {
            addCriterion("licenseNumber not between", value1, value2, "licensenumber");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
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

        public Criteria andOrganizationcodeIsNull() {
            addCriterion("organizationCode is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeIsNotNull() {
            addCriterion("organizationCode is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeEqualTo(String value) {
            addCriterion("organizationCode =", value, "organizationcode");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeNotEqualTo(String value) {
            addCriterion("organizationCode <>", value, "organizationcode");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeGreaterThan(String value) {
            addCriterion("organizationCode >", value, "organizationcode");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeGreaterThanOrEqualTo(String value) {
            addCriterion("organizationCode >=", value, "organizationcode");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeLessThan(String value) {
            addCriterion("organizationCode <", value, "organizationcode");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeLessThanOrEqualTo(String value) {
            addCriterion("organizationCode <=", value, "organizationcode");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeLike(String value) {
            addCriterion("organizationCode like", value, "organizationcode");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeNotLike(String value) {
            addCriterion("organizationCode not like", value, "organizationcode");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeIn(List<String> values) {
            addCriterion("organizationCode in", values, "organizationcode");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeNotIn(List<String> values) {
            addCriterion("organizationCode not in", values, "organizationcode");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeBetween(String value1, String value2) {
            addCriterion("organizationCode between", value1, value2, "organizationcode");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeNotBetween(String value1, String value2) {
            addCriterion("organizationCode not between", value1, value2, "organizationcode");
            return (Criteria) this;
        }

        public Criteria andOrganizationimageIsNull() {
            addCriterion("organizationImage is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationimageIsNotNull() {
            addCriterion("organizationImage is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationimageEqualTo(String value) {
            addCriterion("organizationImage =", value, "organizationimage");
            return (Criteria) this;
        }

        public Criteria andOrganizationimageNotEqualTo(String value) {
            addCriterion("organizationImage <>", value, "organizationimage");
            return (Criteria) this;
        }

        public Criteria andOrganizationimageGreaterThan(String value) {
            addCriterion("organizationImage >", value, "organizationimage");
            return (Criteria) this;
        }

        public Criteria andOrganizationimageGreaterThanOrEqualTo(String value) {
            addCriterion("organizationImage >=", value, "organizationimage");
            return (Criteria) this;
        }

        public Criteria andOrganizationimageLessThan(String value) {
            addCriterion("organizationImage <", value, "organizationimage");
            return (Criteria) this;
        }

        public Criteria andOrganizationimageLessThanOrEqualTo(String value) {
            addCriterion("organizationImage <=", value, "organizationimage");
            return (Criteria) this;
        }

        public Criteria andOrganizationimageLike(String value) {
            addCriterion("organizationImage like", value, "organizationimage");
            return (Criteria) this;
        }

        public Criteria andOrganizationimageNotLike(String value) {
            addCriterion("organizationImage not like", value, "organizationimage");
            return (Criteria) this;
        }

        public Criteria andOrganizationimageIn(List<String> values) {
            addCriterion("organizationImage in", values, "organizationimage");
            return (Criteria) this;
        }

        public Criteria andOrganizationimageNotIn(List<String> values) {
            addCriterion("organizationImage not in", values, "organizationimage");
            return (Criteria) this;
        }

        public Criteria andOrganizationimageBetween(String value1, String value2) {
            addCriterion("organizationImage between", value1, value2, "organizationimage");
            return (Criteria) this;
        }

        public Criteria andOrganizationimageNotBetween(String value1, String value2) {
            addCriterion("organizationImage not between", value1, value2, "organizationimage");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andSafekeyexpireIsNull() {
            addCriterion("safeKeyExpire is null");
            return (Criteria) this;
        }

        public Criteria andSafekeyexpireIsNotNull() {
            addCriterion("safeKeyExpire is not null");
            return (Criteria) this;
        }

        public Criteria andSafekeyexpireEqualTo(Date value) {
            addCriterion("safeKeyExpire =", value, "safekeyexpire");
            return (Criteria) this;
        }

        public Criteria andSafekeyexpireNotEqualTo(Date value) {
            addCriterion("safeKeyExpire <>", value, "safekeyexpire");
            return (Criteria) this;
        }

        public Criteria andSafekeyexpireGreaterThan(Date value) {
            addCriterion("safeKeyExpire >", value, "safekeyexpire");
            return (Criteria) this;
        }

        public Criteria andSafekeyexpireGreaterThanOrEqualTo(Date value) {
            addCriterion("safeKeyExpire >=", value, "safekeyexpire");
            return (Criteria) this;
        }

        public Criteria andSafekeyexpireLessThan(Date value) {
            addCriterion("safeKeyExpire <", value, "safekeyexpire");
            return (Criteria) this;
        }

        public Criteria andSafekeyexpireLessThanOrEqualTo(Date value) {
            addCriterion("safeKeyExpire <=", value, "safekeyexpire");
            return (Criteria) this;
        }

        public Criteria andSafekeyexpireIn(List<Date> values) {
            addCriterion("safeKeyExpire in", values, "safekeyexpire");
            return (Criteria) this;
        }

        public Criteria andSafekeyexpireNotIn(List<Date> values) {
            addCriterion("safeKeyExpire not in", values, "safekeyexpire");
            return (Criteria) this;
        }

        public Criteria andSafekeyexpireBetween(Date value1, Date value2) {
            addCriterion("safeKeyExpire between", value1, value2, "safekeyexpire");
            return (Criteria) this;
        }

        public Criteria andSafekeyexpireNotBetween(Date value1, Date value2) {
            addCriterion("safeKeyExpire not between", value1, value2, "safekeyexpire");
            return (Criteria) this;
        }

        public Criteria andSafekeyvalueIsNull() {
            addCriterion("safeKeyValue is null");
            return (Criteria) this;
        }

        public Criteria andSafekeyvalueIsNotNull() {
            addCriterion("safeKeyValue is not null");
            return (Criteria) this;
        }

        public Criteria andSafekeyvalueEqualTo(String value) {
            addCriterion("safeKeyValue =", value, "safekeyvalue");
            return (Criteria) this;
        }

        public Criteria andSafekeyvalueNotEqualTo(String value) {
            addCriterion("safeKeyValue <>", value, "safekeyvalue");
            return (Criteria) this;
        }

        public Criteria andSafekeyvalueGreaterThan(String value) {
            addCriterion("safeKeyValue >", value, "safekeyvalue");
            return (Criteria) this;
        }

        public Criteria andSafekeyvalueGreaterThanOrEqualTo(String value) {
            addCriterion("safeKeyValue >=", value, "safekeyvalue");
            return (Criteria) this;
        }

        public Criteria andSafekeyvalueLessThan(String value) {
            addCriterion("safeKeyValue <", value, "safekeyvalue");
            return (Criteria) this;
        }

        public Criteria andSafekeyvalueLessThanOrEqualTo(String value) {
            addCriterion("safeKeyValue <=", value, "safekeyvalue");
            return (Criteria) this;
        }

        public Criteria andSafekeyvalueLike(String value) {
            addCriterion("safeKeyValue like", value, "safekeyvalue");
            return (Criteria) this;
        }

        public Criteria andSafekeyvalueNotLike(String value) {
            addCriterion("safeKeyValue not like", value, "safekeyvalue");
            return (Criteria) this;
        }

        public Criteria andSafekeyvalueIn(List<String> values) {
            addCriterion("safeKeyValue in", values, "safekeyvalue");
            return (Criteria) this;
        }

        public Criteria andSafekeyvalueNotIn(List<String> values) {
            addCriterion("safeKeyValue not in", values, "safekeyvalue");
            return (Criteria) this;
        }

        public Criteria andSafekeyvalueBetween(String value1, String value2) {
            addCriterion("safeKeyValue between", value1, value2, "safekeyvalue");
            return (Criteria) this;
        }

        public Criteria andSafekeyvalueNotBetween(String value1, String value2) {
            addCriterion("safeKeyValue not between", value1, value2, "safekeyvalue");
            return (Criteria) this;
        }

        public Criteria andTaximageIsNull() {
            addCriterion("taxImage is null");
            return (Criteria) this;
        }

        public Criteria andTaximageIsNotNull() {
            addCriterion("taxImage is not null");
            return (Criteria) this;
        }

        public Criteria andTaximageEqualTo(String value) {
            addCriterion("taxImage =", value, "taximage");
            return (Criteria) this;
        }

        public Criteria andTaximageNotEqualTo(String value) {
            addCriterion("taxImage <>", value, "taximage");
            return (Criteria) this;
        }

        public Criteria andTaximageGreaterThan(String value) {
            addCriterion("taxImage >", value, "taximage");
            return (Criteria) this;
        }

        public Criteria andTaximageGreaterThanOrEqualTo(String value) {
            addCriterion("taxImage >=", value, "taximage");
            return (Criteria) this;
        }

        public Criteria andTaximageLessThan(String value) {
            addCriterion("taxImage <", value, "taximage");
            return (Criteria) this;
        }

        public Criteria andTaximageLessThanOrEqualTo(String value) {
            addCriterion("taxImage <=", value, "taximage");
            return (Criteria) this;
        }

        public Criteria andTaximageLike(String value) {
            addCriterion("taxImage like", value, "taximage");
            return (Criteria) this;
        }

        public Criteria andTaximageNotLike(String value) {
            addCriterion("taxImage not like", value, "taximage");
            return (Criteria) this;
        }

        public Criteria andTaximageIn(List<String> values) {
            addCriterion("taxImage in", values, "taximage");
            return (Criteria) this;
        }

        public Criteria andTaximageNotIn(List<String> values) {
            addCriterion("taxImage not in", values, "taximage");
            return (Criteria) this;
        }

        public Criteria andTaximageBetween(String value1, String value2) {
            addCriterion("taxImage between", value1, value2, "taximage");
            return (Criteria) this;
        }

        public Criteria andTaximageNotBetween(String value1, String value2) {
            addCriterion("taxImage not between", value1, value2, "taximage");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
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