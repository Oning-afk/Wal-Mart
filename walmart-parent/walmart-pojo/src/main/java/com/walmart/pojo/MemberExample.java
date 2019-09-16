package com.walmart.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MemberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberExample() {
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

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount not between", value1, value2, "amount");
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

        public Criteria andBirthIsNull() {
            addCriterion("birth is null");
            return (Criteria) this;
        }

        public Criteria andBirthIsNotNull() {
            addCriterion("birth is not null");
            return (Criteria) this;
        }

        public Criteria andBirthEqualTo(Date value) {
            addCriterion("birth =", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotEqualTo(Date value) {
            addCriterion("birth <>", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthGreaterThan(Date value) {
            addCriterion("birth >", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthGreaterThanOrEqualTo(Date value) {
            addCriterion("birth >=", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthLessThan(Date value) {
            addCriterion("birth <", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthLessThanOrEqualTo(Date value) {
            addCriterion("birth <=", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthIn(List<Date> values) {
            addCriterion("birth in", values, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotIn(List<Date> values) {
            addCriterion("birth not in", values, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthBetween(Date value1, Date value2) {
            addCriterion("birth between", value1, value2, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotBetween(Date value1, Date value2) {
            addCriterion("birth not between", value1, value2, "birth");
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

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(Integer value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(Integer value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(Integer value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(Integer value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(Integer value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(Integer value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<Integer> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<Integer> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(Integer value1, Integer value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(Integer value1, Integer value2) {
            addCriterion("gender not between", value1, value2, "gender");
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

        public Criteria andPointIsNull() {
            addCriterion("point is null");
            return (Criteria) this;
        }

        public Criteria andPointIsNotNull() {
            addCriterion("point is not null");
            return (Criteria) this;
        }

        public Criteria andPointEqualTo(Long value) {
            addCriterion("point =", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotEqualTo(Long value) {
            addCriterion("point <>", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointGreaterThan(Long value) {
            addCriterion("point >", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointGreaterThanOrEqualTo(Long value) {
            addCriterion("point >=", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointLessThan(Long value) {
            addCriterion("point <", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointLessThanOrEqualTo(Long value) {
            addCriterion("point <=", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointIn(List<Long> values) {
            addCriterion("point in", values, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotIn(List<Long> values) {
            addCriterion("point not in", values, "point");
            return (Criteria) this;
        }

        public Criteria andPointBetween(Long value1, Long value2) {
            addCriterion("point between", value1, value2, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotBetween(Long value1, Long value2) {
            addCriterion("point not between", value1, value2, "point");
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

        public Criteria andZipcodeIsNull() {
            addCriterion("zipCode is null");
            return (Criteria) this;
        }

        public Criteria andZipcodeIsNotNull() {
            addCriterion("zipCode is not null");
            return (Criteria) this;
        }

        public Criteria andZipcodeEqualTo(String value) {
            addCriterion("zipCode =", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeNotEqualTo(String value) {
            addCriterion("zipCode <>", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeGreaterThan(String value) {
            addCriterion("zipCode >", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeGreaterThanOrEqualTo(String value) {
            addCriterion("zipCode >=", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeLessThan(String value) {
            addCriterion("zipCode <", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeLessThanOrEqualTo(String value) {
            addCriterion("zipCode <=", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeLike(String value) {
            addCriterion("zipCode like", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeNotLike(String value) {
            addCriterion("zipCode not like", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeIn(List<String> values) {
            addCriterion("zipCode in", values, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeNotIn(List<String> values) {
            addCriterion("zipCode not in", values, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeBetween(String value1, String value2) {
            addCriterion("zipCode between", value1, value2, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeNotBetween(String value1, String value2) {
            addCriterion("zipCode not between", value1, value2, "zipcode");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNull() {
            addCriterion("area_id is null");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNotNull() {
            addCriterion("area_id is not null");
            return (Criteria) this;
        }

        public Criteria andAreaIdEqualTo(Long value) {
            addCriterion("area_id =", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotEqualTo(Long value) {
            addCriterion("area_id <>", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThan(Long value) {
            addCriterion("area_id >", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThanOrEqualTo(Long value) {
            addCriterion("area_id >=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThan(Long value) {
            addCriterion("area_id <", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThanOrEqualTo(Long value) {
            addCriterion("area_id <=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIn(List<Long> values) {
            addCriterion("area_id in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotIn(List<Long> values) {
            addCriterion("area_id not in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdBetween(Long value1, Long value2) {
            addCriterion("area_id between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotBetween(Long value1, Long value2) {
            addCriterion("area_id not between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andMemberrankIdIsNull() {
            addCriterion("memberRank_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberrankIdIsNotNull() {
            addCriterion("memberRank_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberrankIdEqualTo(Long value) {
            addCriterion("memberRank_id =", value, "memberrankId");
            return (Criteria) this;
        }

        public Criteria andMemberrankIdNotEqualTo(Long value) {
            addCriterion("memberRank_id <>", value, "memberrankId");
            return (Criteria) this;
        }

        public Criteria andMemberrankIdGreaterThan(Long value) {
            addCriterion("memberRank_id >", value, "memberrankId");
            return (Criteria) this;
        }

        public Criteria andMemberrankIdGreaterThanOrEqualTo(Long value) {
            addCriterion("memberRank_id >=", value, "memberrankId");
            return (Criteria) this;
        }

        public Criteria andMemberrankIdLessThan(Long value) {
            addCriterion("memberRank_id <", value, "memberrankId");
            return (Criteria) this;
        }

        public Criteria andMemberrankIdLessThanOrEqualTo(Long value) {
            addCriterion("memberRank_id <=", value, "memberrankId");
            return (Criteria) this;
        }

        public Criteria andMemberrankIdIn(List<Long> values) {
            addCriterion("memberRank_id in", values, "memberrankId");
            return (Criteria) this;
        }

        public Criteria andMemberrankIdNotIn(List<Long> values) {
            addCriterion("memberRank_id not in", values, "memberrankId");
            return (Criteria) this;
        }

        public Criteria andMemberrankIdBetween(Long value1, Long value2) {
            addCriterion("memberRank_id between", value1, value2, "memberrankId");
            return (Criteria) this;
        }

        public Criteria andMemberrankIdNotBetween(Long value1, Long value2) {
            addCriterion("memberRank_id not between", value1, value2, "memberrankId");
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