package com.grapep.byle.school.entity;

import java.util.ArrayList;
import java.util.List;

public class SchoolExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SchoolExample() {
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

        public Criteria andSchoolIdIsNull() {
            addCriterion("school_id is null");
            return (Criteria) this;
        }

        public Criteria andSchoolIdIsNotNull() {
            addCriterion("school_id is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolIdEqualTo(Integer value) {
            addCriterion("school_id =", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdNotEqualTo(Integer value) {
            addCriterion("school_id <>", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdGreaterThan(Integer value) {
            addCriterion("school_id >", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("school_id >=", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdLessThan(Integer value) {
            addCriterion("school_id <", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdLessThanOrEqualTo(Integer value) {
            addCriterion("school_id <=", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdIn(List<Integer> values) {
            addCriterion("school_id in", values, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdNotIn(List<Integer> values) {
            addCriterion("school_id not in", values, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdBetween(Integer value1, Integer value2) {
            addCriterion("school_id between", value1, value2, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdNotBetween(Integer value1, Integer value2) {
            addCriterion("school_id not between", value1, value2, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolNameIsNull() {
            addCriterion("school_name is null");
            return (Criteria) this;
        }

        public Criteria andSchoolNameIsNotNull() {
            addCriterion("school_name is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolNameEqualTo(String value) {
            addCriterion("school_name =", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameNotEqualTo(String value) {
            addCriterion("school_name <>", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameGreaterThan(String value) {
            addCriterion("school_name >", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameGreaterThanOrEqualTo(String value) {
            addCriterion("school_name >=", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameLessThan(String value) {
            addCriterion("school_name <", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameLessThanOrEqualTo(String value) {
            addCriterion("school_name <=", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameLike(String value) {
            addCriterion("school_name like", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameNotLike(String value) {
            addCriterion("school_name not like", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameIn(List<String> values) {
            addCriterion("school_name in", values, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameNotIn(List<String> values) {
            addCriterion("school_name not in", values, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameBetween(String value1, String value2) {
            addCriterion("school_name between", value1, value2, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameNotBetween(String value1, String value2) {
            addCriterion("school_name not between", value1, value2, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolAddressIsNull() {
            addCriterion("school_address is null");
            return (Criteria) this;
        }

        public Criteria andSchoolAddressIsNotNull() {
            addCriterion("school_address is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolAddressEqualTo(String value) {
            addCriterion("school_address =", value, "schoolAddress");
            return (Criteria) this;
        }

        public Criteria andSchoolAddressNotEqualTo(String value) {
            addCriterion("school_address <>", value, "schoolAddress");
            return (Criteria) this;
        }

        public Criteria andSchoolAddressGreaterThan(String value) {
            addCriterion("school_address >", value, "schoolAddress");
            return (Criteria) this;
        }

        public Criteria andSchoolAddressGreaterThanOrEqualTo(String value) {
            addCriterion("school_address >=", value, "schoolAddress");
            return (Criteria) this;
        }

        public Criteria andSchoolAddressLessThan(String value) {
            addCriterion("school_address <", value, "schoolAddress");
            return (Criteria) this;
        }

        public Criteria andSchoolAddressLessThanOrEqualTo(String value) {
            addCriterion("school_address <=", value, "schoolAddress");
            return (Criteria) this;
        }

        public Criteria andSchoolAddressLike(String value) {
            addCriterion("school_address like", value, "schoolAddress");
            return (Criteria) this;
        }

        public Criteria andSchoolAddressNotLike(String value) {
            addCriterion("school_address not like", value, "schoolAddress");
            return (Criteria) this;
        }

        public Criteria andSchoolAddressIn(List<String> values) {
            addCriterion("school_address in", values, "schoolAddress");
            return (Criteria) this;
        }

        public Criteria andSchoolAddressNotIn(List<String> values) {
            addCriterion("school_address not in", values, "schoolAddress");
            return (Criteria) this;
        }

        public Criteria andSchoolAddressBetween(String value1, String value2) {
            addCriterion("school_address between", value1, value2, "schoolAddress");
            return (Criteria) this;
        }

        public Criteria andSchoolAddressNotBetween(String value1, String value2) {
            addCriterion("school_address not between", value1, value2, "schoolAddress");
            return (Criteria) this;
        }

        public Criteria andSchoolStateIsNull() {
            addCriterion("school_state is null");
            return (Criteria) this;
        }

        public Criteria andSchoolStateIsNotNull() {
            addCriterion("school_state is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolStateEqualTo(String value) {
            addCriterion("school_state =", value, "schoolState");
            return (Criteria) this;
        }

        public Criteria andSchoolStateNotEqualTo(String value) {
            addCriterion("school_state <>", value, "schoolState");
            return (Criteria) this;
        }

        public Criteria andSchoolStateGreaterThan(String value) {
            addCriterion("school_state >", value, "schoolState");
            return (Criteria) this;
        }

        public Criteria andSchoolStateGreaterThanOrEqualTo(String value) {
            addCriterion("school_state >=", value, "schoolState");
            return (Criteria) this;
        }

        public Criteria andSchoolStateLessThan(String value) {
            addCriterion("school_state <", value, "schoolState");
            return (Criteria) this;
        }

        public Criteria andSchoolStateLessThanOrEqualTo(String value) {
            addCriterion("school_state <=", value, "schoolState");
            return (Criteria) this;
        }

        public Criteria andSchoolStateLike(String value) {
            addCriterion("school_state like", value, "schoolState");
            return (Criteria) this;
        }

        public Criteria andSchoolStateNotLike(String value) {
            addCriterion("school_state not like", value, "schoolState");
            return (Criteria) this;
        }

        public Criteria andSchoolStateIn(List<String> values) {
            addCriterion("school_state in", values, "schoolState");
            return (Criteria) this;
        }

        public Criteria andSchoolStateNotIn(List<String> values) {
            addCriterion("school_state not in", values, "schoolState");
            return (Criteria) this;
        }

        public Criteria andSchoolStateBetween(String value1, String value2) {
            addCriterion("school_state between", value1, value2, "schoolState");
            return (Criteria) this;
        }

        public Criteria andSchoolStateNotBetween(String value1, String value2) {
            addCriterion("school_state not between", value1, value2, "schoolState");
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