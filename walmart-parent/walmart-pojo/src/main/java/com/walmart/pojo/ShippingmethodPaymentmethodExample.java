package com.walmart.pojo;

import java.util.ArrayList;
import java.util.List;

public class ShippingmethodPaymentmethodExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShippingmethodPaymentmethodExample() {
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

        public Criteria andShippingmethodsIdIsNull() {
            addCriterion("shippingMethods_id is null");
            return (Criteria) this;
        }

        public Criteria andShippingmethodsIdIsNotNull() {
            addCriterion("shippingMethods_id is not null");
            return (Criteria) this;
        }

        public Criteria andShippingmethodsIdEqualTo(Long value) {
            addCriterion("shippingMethods_id =", value, "shippingmethodsId");
            return (Criteria) this;
        }

        public Criteria andShippingmethodsIdNotEqualTo(Long value) {
            addCriterion("shippingMethods_id <>", value, "shippingmethodsId");
            return (Criteria) this;
        }

        public Criteria andShippingmethodsIdGreaterThan(Long value) {
            addCriterion("shippingMethods_id >", value, "shippingmethodsId");
            return (Criteria) this;
        }

        public Criteria andShippingmethodsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("shippingMethods_id >=", value, "shippingmethodsId");
            return (Criteria) this;
        }

        public Criteria andShippingmethodsIdLessThan(Long value) {
            addCriterion("shippingMethods_id <", value, "shippingmethodsId");
            return (Criteria) this;
        }

        public Criteria andShippingmethodsIdLessThanOrEqualTo(Long value) {
            addCriterion("shippingMethods_id <=", value, "shippingmethodsId");
            return (Criteria) this;
        }

        public Criteria andShippingmethodsIdIn(List<Long> values) {
            addCriterion("shippingMethods_id in", values, "shippingmethodsId");
            return (Criteria) this;
        }

        public Criteria andShippingmethodsIdNotIn(List<Long> values) {
            addCriterion("shippingMethods_id not in", values, "shippingmethodsId");
            return (Criteria) this;
        }

        public Criteria andShippingmethodsIdBetween(Long value1, Long value2) {
            addCriterion("shippingMethods_id between", value1, value2, "shippingmethodsId");
            return (Criteria) this;
        }

        public Criteria andShippingmethodsIdNotBetween(Long value1, Long value2) {
            addCriterion("shippingMethods_id not between", value1, value2, "shippingmethodsId");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodsIdIsNull() {
            addCriterion("paymentMethods_id is null");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodsIdIsNotNull() {
            addCriterion("paymentMethods_id is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodsIdEqualTo(Long value) {
            addCriterion("paymentMethods_id =", value, "paymentmethodsId");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodsIdNotEqualTo(Long value) {
            addCriterion("paymentMethods_id <>", value, "paymentmethodsId");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodsIdGreaterThan(Long value) {
            addCriterion("paymentMethods_id >", value, "paymentmethodsId");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("paymentMethods_id >=", value, "paymentmethodsId");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodsIdLessThan(Long value) {
            addCriterion("paymentMethods_id <", value, "paymentmethodsId");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodsIdLessThanOrEqualTo(Long value) {
            addCriterion("paymentMethods_id <=", value, "paymentmethodsId");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodsIdIn(List<Long> values) {
            addCriterion("paymentMethods_id in", values, "paymentmethodsId");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodsIdNotIn(List<Long> values) {
            addCriterion("paymentMethods_id not in", values, "paymentmethodsId");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodsIdBetween(Long value1, Long value2) {
            addCriterion("paymentMethods_id between", value1, value2, "paymentmethodsId");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodsIdNotBetween(Long value1, Long value2) {
            addCriterion("paymentMethods_id not between", value1, value2, "paymentmethodsId");
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