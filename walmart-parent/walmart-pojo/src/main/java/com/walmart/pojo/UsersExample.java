package com.walmart.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UsersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsersExample() {
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

        public Criteria andIsenabledIsNull() {
            addCriterion("isEnabled is null");
            return (Criteria) this;
        }

        public Criteria andIsenabledIsNotNull() {
            addCriterion("isEnabled is not null");
            return (Criteria) this;
        }

        public Criteria andIsenabledEqualTo(Boolean value) {
            addCriterion("isEnabled =", value, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledNotEqualTo(Boolean value) {
            addCriterion("isEnabled <>", value, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledGreaterThan(Boolean value) {
            addCriterion("isEnabled >", value, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isEnabled >=", value, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledLessThan(Boolean value) {
            addCriterion("isEnabled <", value, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledLessThanOrEqualTo(Boolean value) {
            addCriterion("isEnabled <=", value, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledIn(List<Boolean> values) {
            addCriterion("isEnabled in", values, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledNotIn(List<Boolean> values) {
            addCriterion("isEnabled not in", values, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledBetween(Boolean value1, Boolean value2) {
            addCriterion("isEnabled between", value1, value2, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isEnabled not between", value1, value2, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIslockedIsNull() {
            addCriterion("isLocked is null");
            return (Criteria) this;
        }

        public Criteria andIslockedIsNotNull() {
            addCriterion("isLocked is not null");
            return (Criteria) this;
        }

        public Criteria andIslockedEqualTo(Boolean value) {
            addCriterion("isLocked =", value, "islocked");
            return (Criteria) this;
        }

        public Criteria andIslockedNotEqualTo(Boolean value) {
            addCriterion("isLocked <>", value, "islocked");
            return (Criteria) this;
        }

        public Criteria andIslockedGreaterThan(Boolean value) {
            addCriterion("isLocked >", value, "islocked");
            return (Criteria) this;
        }

        public Criteria andIslockedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isLocked >=", value, "islocked");
            return (Criteria) this;
        }

        public Criteria andIslockedLessThan(Boolean value) {
            addCriterion("isLocked <", value, "islocked");
            return (Criteria) this;
        }

        public Criteria andIslockedLessThanOrEqualTo(Boolean value) {
            addCriterion("isLocked <=", value, "islocked");
            return (Criteria) this;
        }

        public Criteria andIslockedIn(List<Boolean> values) {
            addCriterion("isLocked in", values, "islocked");
            return (Criteria) this;
        }

        public Criteria andIslockedNotIn(List<Boolean> values) {
            addCriterion("isLocked not in", values, "islocked");
            return (Criteria) this;
        }

        public Criteria andIslockedBetween(Boolean value1, Boolean value2) {
            addCriterion("isLocked between", value1, value2, "islocked");
            return (Criteria) this;
        }

        public Criteria andIslockedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isLocked not between", value1, value2, "islocked");
            return (Criteria) this;
        }

        public Criteria andLastlogindateIsNull() {
            addCriterion("lastLoginDate is null");
            return (Criteria) this;
        }

        public Criteria andLastlogindateIsNotNull() {
            addCriterion("lastLoginDate is not null");
            return (Criteria) this;
        }

        public Criteria andLastlogindateEqualTo(Date value) {
            addCriterion("lastLoginDate =", value, "lastlogindate");
            return (Criteria) this;
        }

        public Criteria andLastlogindateNotEqualTo(Date value) {
            addCriterion("lastLoginDate <>", value, "lastlogindate");
            return (Criteria) this;
        }

        public Criteria andLastlogindateGreaterThan(Date value) {
            addCriterion("lastLoginDate >", value, "lastlogindate");
            return (Criteria) this;
        }

        public Criteria andLastlogindateGreaterThanOrEqualTo(Date value) {
            addCriterion("lastLoginDate >=", value, "lastlogindate");
            return (Criteria) this;
        }

        public Criteria andLastlogindateLessThan(Date value) {
            addCriterion("lastLoginDate <", value, "lastlogindate");
            return (Criteria) this;
        }

        public Criteria andLastlogindateLessThanOrEqualTo(Date value) {
            addCriterion("lastLoginDate <=", value, "lastlogindate");
            return (Criteria) this;
        }

        public Criteria andLastlogindateIn(List<Date> values) {
            addCriterion("lastLoginDate in", values, "lastlogindate");
            return (Criteria) this;
        }

        public Criteria andLastlogindateNotIn(List<Date> values) {
            addCriterion("lastLoginDate not in", values, "lastlogindate");
            return (Criteria) this;
        }

        public Criteria andLastlogindateBetween(Date value1, Date value2) {
            addCriterion("lastLoginDate between", value1, value2, "lastlogindate");
            return (Criteria) this;
        }

        public Criteria andLastlogindateNotBetween(Date value1, Date value2) {
            addCriterion("lastLoginDate not between", value1, value2, "lastlogindate");
            return (Criteria) this;
        }

        public Criteria andLastloginipIsNull() {
            addCriterion("lastLoginIp is null");
            return (Criteria) this;
        }

        public Criteria andLastloginipIsNotNull() {
            addCriterion("lastLoginIp is not null");
            return (Criteria) this;
        }

        public Criteria andLastloginipEqualTo(String value) {
            addCriterion("lastLoginIp =", value, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipNotEqualTo(String value) {
            addCriterion("lastLoginIp <>", value, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipGreaterThan(String value) {
            addCriterion("lastLoginIp >", value, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipGreaterThanOrEqualTo(String value) {
            addCriterion("lastLoginIp >=", value, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipLessThan(String value) {
            addCriterion("lastLoginIp <", value, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipLessThanOrEqualTo(String value) {
            addCriterion("lastLoginIp <=", value, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipLike(String value) {
            addCriterion("lastLoginIp like", value, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipNotLike(String value) {
            addCriterion("lastLoginIp not like", value, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipIn(List<String> values) {
            addCriterion("lastLoginIp in", values, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipNotIn(List<String> values) {
            addCriterion("lastLoginIp not in", values, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipBetween(String value1, String value2) {
            addCriterion("lastLoginIp between", value1, value2, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipNotBetween(String value1, String value2) {
            addCriterion("lastLoginIp not between", value1, value2, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLockdateIsNull() {
            addCriterion("lockDate is null");
            return (Criteria) this;
        }

        public Criteria andLockdateIsNotNull() {
            addCriterion("lockDate is not null");
            return (Criteria) this;
        }

        public Criteria andLockdateEqualTo(Date value) {
            addCriterion("lockDate =", value, "lockdate");
            return (Criteria) this;
        }

        public Criteria andLockdateNotEqualTo(Date value) {
            addCriterion("lockDate <>", value, "lockdate");
            return (Criteria) this;
        }

        public Criteria andLockdateGreaterThan(Date value) {
            addCriterion("lockDate >", value, "lockdate");
            return (Criteria) this;
        }

        public Criteria andLockdateGreaterThanOrEqualTo(Date value) {
            addCriterion("lockDate >=", value, "lockdate");
            return (Criteria) this;
        }

        public Criteria andLockdateLessThan(Date value) {
            addCriterion("lockDate <", value, "lockdate");
            return (Criteria) this;
        }

        public Criteria andLockdateLessThanOrEqualTo(Date value) {
            addCriterion("lockDate <=", value, "lockdate");
            return (Criteria) this;
        }

        public Criteria andLockdateIn(List<Date> values) {
            addCriterion("lockDate in", values, "lockdate");
            return (Criteria) this;
        }

        public Criteria andLockdateNotIn(List<Date> values) {
            addCriterion("lockDate not in", values, "lockdate");
            return (Criteria) this;
        }

        public Criteria andLockdateBetween(Date value1, Date value2) {
            addCriterion("lockDate between", value1, value2, "lockdate");
            return (Criteria) this;
        }

        public Criteria andLockdateNotBetween(Date value1, Date value2) {
            addCriterion("lockDate not between", value1, value2, "lockdate");
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