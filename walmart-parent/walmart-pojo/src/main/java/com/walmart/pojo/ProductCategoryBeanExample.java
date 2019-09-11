package com.walmart.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductCategoryBeanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductCategoryBeanExample() {
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

        public Criteria andOrdersIsNull() {
            addCriterion("orders is null");
            return (Criteria) this;
        }

        public Criteria andOrdersIsNotNull() {
            addCriterion("orders is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersEqualTo(Integer value) {
            addCriterion("orders =", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersNotEqualTo(Integer value) {
            addCriterion("orders <>", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersGreaterThan(Integer value) {
            addCriterion("orders >", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersGreaterThanOrEqualTo(Integer value) {
            addCriterion("orders >=", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersLessThan(Integer value) {
            addCriterion("orders <", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersLessThanOrEqualTo(Integer value) {
            addCriterion("orders <=", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersIn(List<Integer> values) {
            addCriterion("orders in", values, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersNotIn(List<Integer> values) {
            addCriterion("orders not in", values, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersBetween(Integer value1, Integer value2) {
            addCriterion("orders between", value1, value2, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersNotBetween(Integer value1, Integer value2) {
            addCriterion("orders not between", value1, value2, "orders");
            return (Criteria) this;
        }

        public Criteria andGeneralrateIsNull() {
            addCriterion("generalRate is null");
            return (Criteria) this;
        }

        public Criteria andGeneralrateIsNotNull() {
            addCriterion("generalRate is not null");
            return (Criteria) this;
        }

        public Criteria andGeneralrateEqualTo(Double value) {
            addCriterion("generalRate =", value, "generalrate");
            return (Criteria) this;
        }

        public Criteria andGeneralrateNotEqualTo(Double value) {
            addCriterion("generalRate <>", value, "generalrate");
            return (Criteria) this;
        }

        public Criteria andGeneralrateGreaterThan(Double value) {
            addCriterion("generalRate >", value, "generalrate");
            return (Criteria) this;
        }

        public Criteria andGeneralrateGreaterThanOrEqualTo(Double value) {
            addCriterion("generalRate >=", value, "generalrate");
            return (Criteria) this;
        }

        public Criteria andGeneralrateLessThan(Double value) {
            addCriterion("generalRate <", value, "generalrate");
            return (Criteria) this;
        }

        public Criteria andGeneralrateLessThanOrEqualTo(Double value) {
            addCriterion("generalRate <=", value, "generalrate");
            return (Criteria) this;
        }

        public Criteria andGeneralrateIn(List<Double> values) {
            addCriterion("generalRate in", values, "generalrate");
            return (Criteria) this;
        }

        public Criteria andGeneralrateNotIn(List<Double> values) {
            addCriterion("generalRate not in", values, "generalrate");
            return (Criteria) this;
        }

        public Criteria andGeneralrateBetween(Double value1, Double value2) {
            addCriterion("generalRate between", value1, value2, "generalrate");
            return (Criteria) this;
        }

        public Criteria andGeneralrateNotBetween(Double value1, Double value2) {
            addCriterion("generalRate not between", value1, value2, "generalrate");
            return (Criteria) this;
        }

        public Criteria andGradeIsNull() {
            addCriterion("grade is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("grade is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(Integer value) {
            addCriterion("grade =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(Integer value) {
            addCriterion("grade <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(Integer value) {
            addCriterion("grade >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("grade >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(Integer value) {
            addCriterion("grade <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(Integer value) {
            addCriterion("grade <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<Integer> values) {
            addCriterion("grade in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<Integer> values) {
            addCriterion("grade not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(Integer value1, Integer value2) {
            addCriterion("grade between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("grade not between", value1, value2, "grade");
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

        public Criteria andSelfrateIsNull() {
            addCriterion("selfRate is null");
            return (Criteria) this;
        }

        public Criteria andSelfrateIsNotNull() {
            addCriterion("selfRate is not null");
            return (Criteria) this;
        }

        public Criteria andSelfrateEqualTo(Double value) {
            addCriterion("selfRate =", value, "selfrate");
            return (Criteria) this;
        }

        public Criteria andSelfrateNotEqualTo(Double value) {
            addCriterion("selfRate <>", value, "selfrate");
            return (Criteria) this;
        }

        public Criteria andSelfrateGreaterThan(Double value) {
            addCriterion("selfRate >", value, "selfrate");
            return (Criteria) this;
        }

        public Criteria andSelfrateGreaterThanOrEqualTo(Double value) {
            addCriterion("selfRate >=", value, "selfrate");
            return (Criteria) this;
        }

        public Criteria andSelfrateLessThan(Double value) {
            addCriterion("selfRate <", value, "selfrate");
            return (Criteria) this;
        }

        public Criteria andSelfrateLessThanOrEqualTo(Double value) {
            addCriterion("selfRate <=", value, "selfrate");
            return (Criteria) this;
        }

        public Criteria andSelfrateIn(List<Double> values) {
            addCriterion("selfRate in", values, "selfrate");
            return (Criteria) this;
        }

        public Criteria andSelfrateNotIn(List<Double> values) {
            addCriterion("selfRate not in", values, "selfrate");
            return (Criteria) this;
        }

        public Criteria andSelfrateBetween(Double value1, Double value2) {
            addCriterion("selfRate between", value1, value2, "selfrate");
            return (Criteria) this;
        }

        public Criteria andSelfrateNotBetween(Double value1, Double value2) {
            addCriterion("selfRate not between", value1, value2, "selfrate");
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

        public Criteria andTreepathIsNull() {
            addCriterion("treePath is null");
            return (Criteria) this;
        }

        public Criteria andTreepathIsNotNull() {
            addCriterion("treePath is not null");
            return (Criteria) this;
        }

        public Criteria andTreepathEqualTo(String value) {
            addCriterion("treePath =", value, "treepath");
            return (Criteria) this;
        }

        public Criteria andTreepathNotEqualTo(String value) {
            addCriterion("treePath <>", value, "treepath");
            return (Criteria) this;
        }

        public Criteria andTreepathGreaterThan(String value) {
            addCriterion("treePath >", value, "treepath");
            return (Criteria) this;
        }

        public Criteria andTreepathGreaterThanOrEqualTo(String value) {
            addCriterion("treePath >=", value, "treepath");
            return (Criteria) this;
        }

        public Criteria andTreepathLessThan(String value) {
            addCriterion("treePath <", value, "treepath");
            return (Criteria) this;
        }

        public Criteria andTreepathLessThanOrEqualTo(String value) {
            addCriterion("treePath <=", value, "treepath");
            return (Criteria) this;
        }

        public Criteria andTreepathLike(String value) {
            addCriterion("treePath like", value, "treepath");
            return (Criteria) this;
        }

        public Criteria andTreepathNotLike(String value) {
            addCriterion("treePath not like", value, "treepath");
            return (Criteria) this;
        }

        public Criteria andTreepathIn(List<String> values) {
            addCriterion("treePath in", values, "treepath");
            return (Criteria) this;
        }

        public Criteria andTreepathNotIn(List<String> values) {
            addCriterion("treePath not in", values, "treepath");
            return (Criteria) this;
        }

        public Criteria andTreepathBetween(String value1, String value2) {
            addCriterion("treePath between", value1, value2, "treepath");
            return (Criteria) this;
        }

        public Criteria andTreepathNotBetween(String value1, String value2) {
            addCriterion("treePath not between", value1, value2, "treepath");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Long value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Long value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Long value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Long value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Long value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Long> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Long> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Long value1, Long value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Long value1, Long value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
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