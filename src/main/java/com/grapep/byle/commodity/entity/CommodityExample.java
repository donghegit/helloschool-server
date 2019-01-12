package com.grapep.byle.commodity.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommodityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommodityExample() {
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

        public Criteria andCommodyIdIsNull() {
            addCriterion("commody_id is null");
            return (Criteria) this;
        }

        public Criteria andCommodyIdIsNotNull() {
            addCriterion("commody_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommodyIdEqualTo(Integer value) {
            addCriterion("commody_id =", value, "commodyId");
            return (Criteria) this;
        }

        public Criteria andCommodyIdNotEqualTo(Integer value) {
            addCriterion("commody_id <>", value, "commodyId");
            return (Criteria) this;
        }

        public Criteria andCommodyIdGreaterThan(Integer value) {
            addCriterion("commody_id >", value, "commodyId");
            return (Criteria) this;
        }

        public Criteria andCommodyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("commody_id >=", value, "commodyId");
            return (Criteria) this;
        }

        public Criteria andCommodyIdLessThan(Integer value) {
            addCriterion("commody_id <", value, "commodyId");
            return (Criteria) this;
        }

        public Criteria andCommodyIdLessThanOrEqualTo(Integer value) {
            addCriterion("commody_id <=", value, "commodyId");
            return (Criteria) this;
        }

        public Criteria andCommodyIdIn(List<Integer> values) {
            addCriterion("commody_id in", values, "commodyId");
            return (Criteria) this;
        }

        public Criteria andCommodyIdNotIn(List<Integer> values) {
            addCriterion("commody_id not in", values, "commodyId");
            return (Criteria) this;
        }

        public Criteria andCommodyIdBetween(Integer value1, Integer value2) {
            addCriterion("commody_id between", value1, value2, "commodyId");
            return (Criteria) this;
        }

        public Criteria andCommodyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("commody_id not between", value1, value2, "commodyId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andKindIdIsNull() {
            addCriterion("kind_id is null");
            return (Criteria) this;
        }

        public Criteria andKindIdIsNotNull() {
            addCriterion("kind_id is not null");
            return (Criteria) this;
        }

        public Criteria andKindIdEqualTo(Integer value) {
            addCriterion("kind_id =", value, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdNotEqualTo(Integer value) {
            addCriterion("kind_id <>", value, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdGreaterThan(Integer value) {
            addCriterion("kind_id >", value, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("kind_id >=", value, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdLessThan(Integer value) {
            addCriterion("kind_id <", value, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdLessThanOrEqualTo(Integer value) {
            addCriterion("kind_id <=", value, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdIn(List<Integer> values) {
            addCriterion("kind_id in", values, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdNotIn(List<Integer> values) {
            addCriterion("kind_id not in", values, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdBetween(Integer value1, Integer value2) {
            addCriterion("kind_id between", value1, value2, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdNotBetween(Integer value1, Integer value2) {
            addCriterion("kind_id not between", value1, value2, "kindId");
            return (Criteria) this;
        }

        public Criteria andComdNameIsNull() {
            addCriterion("comd_name is null");
            return (Criteria) this;
        }

        public Criteria andComdNameIsNotNull() {
            addCriterion("comd_name is not null");
            return (Criteria) this;
        }

        public Criteria andComdNameEqualTo(String value) {
            addCriterion("comd_name =", value, "comdName");
            return (Criteria) this;
        }

        public Criteria andComdNameNotEqualTo(String value) {
            addCriterion("comd_name <>", value, "comdName");
            return (Criteria) this;
        }

        public Criteria andComdNameGreaterThan(String value) {
            addCriterion("comd_name >", value, "comdName");
            return (Criteria) this;
        }

        public Criteria andComdNameGreaterThanOrEqualTo(String value) {
            addCriterion("comd_name >=", value, "comdName");
            return (Criteria) this;
        }

        public Criteria andComdNameLessThan(String value) {
            addCriterion("comd_name <", value, "comdName");
            return (Criteria) this;
        }

        public Criteria andComdNameLessThanOrEqualTo(String value) {
            addCriterion("comd_name <=", value, "comdName");
            return (Criteria) this;
        }

        public Criteria andComdNameLike(String value) {
            addCriterion("comd_name like", value, "comdName");
            return (Criteria) this;
        }

        public Criteria andComdNameNotLike(String value) {
            addCriterion("comd_name not like", value, "comdName");
            return (Criteria) this;
        }

        public Criteria andComdNameIn(List<String> values) {
            addCriterion("comd_name in", values, "comdName");
            return (Criteria) this;
        }

        public Criteria andComdNameNotIn(List<String> values) {
            addCriterion("comd_name not in", values, "comdName");
            return (Criteria) this;
        }

        public Criteria andComdNameBetween(String value1, String value2) {
            addCriterion("comd_name between", value1, value2, "comdName");
            return (Criteria) this;
        }

        public Criteria andComdNameNotBetween(String value1, String value2) {
            addCriterion("comd_name not between", value1, value2, "comdName");
            return (Criteria) this;
        }

        public Criteria andComdTitleIsNull() {
            addCriterion("comd_title is null");
            return (Criteria) this;
        }

        public Criteria andComdTitleIsNotNull() {
            addCriterion("comd_title is not null");
            return (Criteria) this;
        }

        public Criteria andComdTitleEqualTo(String value) {
            addCriterion("comd_title =", value, "comdTitle");
            return (Criteria) this;
        }

        public Criteria andComdTitleNotEqualTo(String value) {
            addCriterion("comd_title <>", value, "comdTitle");
            return (Criteria) this;
        }

        public Criteria andComdTitleGreaterThan(String value) {
            addCriterion("comd_title >", value, "comdTitle");
            return (Criteria) this;
        }

        public Criteria andComdTitleGreaterThanOrEqualTo(String value) {
            addCriterion("comd_title >=", value, "comdTitle");
            return (Criteria) this;
        }

        public Criteria andComdTitleLessThan(String value) {
            addCriterion("comd_title <", value, "comdTitle");
            return (Criteria) this;
        }

        public Criteria andComdTitleLessThanOrEqualTo(String value) {
            addCriterion("comd_title <=", value, "comdTitle");
            return (Criteria) this;
        }

        public Criteria andComdTitleLike(String value) {
            addCriterion("comd_title like", value, "comdTitle");
            return (Criteria) this;
        }

        public Criteria andComdTitleNotLike(String value) {
            addCriterion("comd_title not like", value, "comdTitle");
            return (Criteria) this;
        }

        public Criteria andComdTitleIn(List<String> values) {
            addCriterion("comd_title in", values, "comdTitle");
            return (Criteria) this;
        }

        public Criteria andComdTitleNotIn(List<String> values) {
            addCriterion("comd_title not in", values, "comdTitle");
            return (Criteria) this;
        }

        public Criteria andComdTitleBetween(String value1, String value2) {
            addCriterion("comd_title between", value1, value2, "comdTitle");
            return (Criteria) this;
        }

        public Criteria andComdTitleNotBetween(String value1, String value2) {
            addCriterion("comd_title not between", value1, value2, "comdTitle");
            return (Criteria) this;
        }

        public Criteria andComdPriceIsNull() {
            addCriterion("comd_price is null");
            return (Criteria) this;
        }

        public Criteria andComdPriceIsNotNull() {
            addCriterion("comd_price is not null");
            return (Criteria) this;
        }

        public Criteria andComdPriceEqualTo(Long value) {
            addCriterion("comd_price =", value, "comdPrice");
            return (Criteria) this;
        }

        public Criteria andComdPriceNotEqualTo(Long value) {
            addCriterion("comd_price <>", value, "comdPrice");
            return (Criteria) this;
        }

        public Criteria andComdPriceGreaterThan(Long value) {
            addCriterion("comd_price >", value, "comdPrice");
            return (Criteria) this;
        }

        public Criteria andComdPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("comd_price >=", value, "comdPrice");
            return (Criteria) this;
        }

        public Criteria andComdPriceLessThan(Long value) {
            addCriterion("comd_price <", value, "comdPrice");
            return (Criteria) this;
        }

        public Criteria andComdPriceLessThanOrEqualTo(Long value) {
            addCriterion("comd_price <=", value, "comdPrice");
            return (Criteria) this;
        }

        public Criteria andComdPriceIn(List<Long> values) {
            addCriterion("comd_price in", values, "comdPrice");
            return (Criteria) this;
        }

        public Criteria andComdPriceNotIn(List<Long> values) {
            addCriterion("comd_price not in", values, "comdPrice");
            return (Criteria) this;
        }

        public Criteria andComdPriceBetween(Long value1, Long value2) {
            addCriterion("comd_price between", value1, value2, "comdPrice");
            return (Criteria) this;
        }

        public Criteria andComdPriceNotBetween(Long value1, Long value2) {
            addCriterion("comd_price not between", value1, value2, "comdPrice");
            return (Criteria) this;
        }

        public Criteria andComdReleaseTimeIsNull() {
            addCriterion("comd_release_time is null");
            return (Criteria) this;
        }

        public Criteria andComdReleaseTimeIsNotNull() {
            addCriterion("comd_release_time is not null");
            return (Criteria) this;
        }

        public Criteria andComdReleaseTimeEqualTo(Date value) {
            addCriterion("comd_release_time =", value, "comdReleaseTime");
            return (Criteria) this;
        }

        public Criteria andComdReleaseTimeNotEqualTo(Date value) {
            addCriterion("comd_release_time <>", value, "comdReleaseTime");
            return (Criteria) this;
        }

        public Criteria andComdReleaseTimeGreaterThan(Date value) {
            addCriterion("comd_release_time >", value, "comdReleaseTime");
            return (Criteria) this;
        }

        public Criteria andComdReleaseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("comd_release_time >=", value, "comdReleaseTime");
            return (Criteria) this;
        }

        public Criteria andComdReleaseTimeLessThan(Date value) {
            addCriterion("comd_release_time <", value, "comdReleaseTime");
            return (Criteria) this;
        }

        public Criteria andComdReleaseTimeLessThanOrEqualTo(Date value) {
            addCriterion("comd_release_time <=", value, "comdReleaseTime");
            return (Criteria) this;
        }

        public Criteria andComdReleaseTimeIn(List<Date> values) {
            addCriterion("comd_release_time in", values, "comdReleaseTime");
            return (Criteria) this;
        }

        public Criteria andComdReleaseTimeNotIn(List<Date> values) {
            addCriterion("comd_release_time not in", values, "comdReleaseTime");
            return (Criteria) this;
        }

        public Criteria andComdReleaseTimeBetween(Date value1, Date value2) {
            addCriterion("comd_release_time between", value1, value2, "comdReleaseTime");
            return (Criteria) this;
        }

        public Criteria andComdReleaseTimeNotBetween(Date value1, Date value2) {
            addCriterion("comd_release_time not between", value1, value2, "comdReleaseTime");
            return (Criteria) this;
        }

        public Criteria andComodOffShelfTimeIsNull() {
            addCriterion("comod_off_shelf_time is null");
            return (Criteria) this;
        }

        public Criteria andComodOffShelfTimeIsNotNull() {
            addCriterion("comod_off_shelf_time is not null");
            return (Criteria) this;
        }

        public Criteria andComodOffShelfTimeEqualTo(Date value) {
            addCriterion("comod_off_shelf_time =", value, "comodOffShelfTime");
            return (Criteria) this;
        }

        public Criteria andComodOffShelfTimeNotEqualTo(Date value) {
            addCriterion("comod_off_shelf_time <>", value, "comodOffShelfTime");
            return (Criteria) this;
        }

        public Criteria andComodOffShelfTimeGreaterThan(Date value) {
            addCriterion("comod_off_shelf_time >", value, "comodOffShelfTime");
            return (Criteria) this;
        }

        public Criteria andComodOffShelfTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("comod_off_shelf_time >=", value, "comodOffShelfTime");
            return (Criteria) this;
        }

        public Criteria andComodOffShelfTimeLessThan(Date value) {
            addCriterion("comod_off_shelf_time <", value, "comodOffShelfTime");
            return (Criteria) this;
        }

        public Criteria andComodOffShelfTimeLessThanOrEqualTo(Date value) {
            addCriterion("comod_off_shelf_time <=", value, "comodOffShelfTime");
            return (Criteria) this;
        }

        public Criteria andComodOffShelfTimeIn(List<Date> values) {
            addCriterion("comod_off_shelf_time in", values, "comodOffShelfTime");
            return (Criteria) this;
        }

        public Criteria andComodOffShelfTimeNotIn(List<Date> values) {
            addCriterion("comod_off_shelf_time not in", values, "comodOffShelfTime");
            return (Criteria) this;
        }

        public Criteria andComodOffShelfTimeBetween(Date value1, Date value2) {
            addCriterion("comod_off_shelf_time between", value1, value2, "comodOffShelfTime");
            return (Criteria) this;
        }

        public Criteria andComodOffShelfTimeNotBetween(Date value1, Date value2) {
            addCriterion("comod_off_shelf_time not between", value1, value2, "comodOffShelfTime");
            return (Criteria) this;
        }

        public Criteria andComdDeleteTimeIsNull() {
            addCriterion("comd_delete_time is null");
            return (Criteria) this;
        }

        public Criteria andComdDeleteTimeIsNotNull() {
            addCriterion("comd_delete_time is not null");
            return (Criteria) this;
        }

        public Criteria andComdDeleteTimeEqualTo(Date value) {
            addCriterion("comd_delete_time =", value, "comdDeleteTime");
            return (Criteria) this;
        }

        public Criteria andComdDeleteTimeNotEqualTo(Date value) {
            addCriterion("comd_delete_time <>", value, "comdDeleteTime");
            return (Criteria) this;
        }

        public Criteria andComdDeleteTimeGreaterThan(Date value) {
            addCriterion("comd_delete_time >", value, "comdDeleteTime");
            return (Criteria) this;
        }

        public Criteria andComdDeleteTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("comd_delete_time >=", value, "comdDeleteTime");
            return (Criteria) this;
        }

        public Criteria andComdDeleteTimeLessThan(Date value) {
            addCriterion("comd_delete_time <", value, "comdDeleteTime");
            return (Criteria) this;
        }

        public Criteria andComdDeleteTimeLessThanOrEqualTo(Date value) {
            addCriterion("comd_delete_time <=", value, "comdDeleteTime");
            return (Criteria) this;
        }

        public Criteria andComdDeleteTimeIn(List<Date> values) {
            addCriterion("comd_delete_time in", values, "comdDeleteTime");
            return (Criteria) this;
        }

        public Criteria andComdDeleteTimeNotIn(List<Date> values) {
            addCriterion("comd_delete_time not in", values, "comdDeleteTime");
            return (Criteria) this;
        }

        public Criteria andComdDeleteTimeBetween(Date value1, Date value2) {
            addCriterion("comd_delete_time between", value1, value2, "comdDeleteTime");
            return (Criteria) this;
        }

        public Criteria andComdDeleteTimeNotBetween(Date value1, Date value2) {
            addCriterion("comd_delete_time not between", value1, value2, "comdDeleteTime");
            return (Criteria) this;
        }

        public Criteria andComdStateIsNull() {
            addCriterion("comd_state is null");
            return (Criteria) this;
        }

        public Criteria andComdStateIsNotNull() {
            addCriterion("comd_state is not null");
            return (Criteria) this;
        }

        public Criteria andComdStateEqualTo(String value) {
            addCriterion("comd_state =", value, "comdState");
            return (Criteria) this;
        }

        public Criteria andComdStateNotEqualTo(String value) {
            addCriterion("comd_state <>", value, "comdState");
            return (Criteria) this;
        }

        public Criteria andComdStateGreaterThan(String value) {
            addCriterion("comd_state >", value, "comdState");
            return (Criteria) this;
        }

        public Criteria andComdStateGreaterThanOrEqualTo(String value) {
            addCriterion("comd_state >=", value, "comdState");
            return (Criteria) this;
        }

        public Criteria andComdStateLessThan(String value) {
            addCriterion("comd_state <", value, "comdState");
            return (Criteria) this;
        }

        public Criteria andComdStateLessThanOrEqualTo(String value) {
            addCriterion("comd_state <=", value, "comdState");
            return (Criteria) this;
        }

        public Criteria andComdStateLike(String value) {
            addCriterion("comd_state like", value, "comdState");
            return (Criteria) this;
        }

        public Criteria andComdStateNotLike(String value) {
            addCriterion("comd_state not like", value, "comdState");
            return (Criteria) this;
        }

        public Criteria andComdStateIn(List<String> values) {
            addCriterion("comd_state in", values, "comdState");
            return (Criteria) this;
        }

        public Criteria andComdStateNotIn(List<String> values) {
            addCriterion("comd_state not in", values, "comdState");
            return (Criteria) this;
        }

        public Criteria andComdStateBetween(String value1, String value2) {
            addCriterion("comd_state between", value1, value2, "comdState");
            return (Criteria) this;
        }

        public Criteria andComdStateNotBetween(String value1, String value2) {
            addCriterion("comd_state not between", value1, value2, "comdState");
            return (Criteria) this;
        }

        public Criteria andComdLastPriceIsNull() {
            addCriterion("comd_last_price is null");
            return (Criteria) this;
        }

        public Criteria andComdLastPriceIsNotNull() {
            addCriterion("comd_last_price is not null");
            return (Criteria) this;
        }

        public Criteria andComdLastPriceEqualTo(Long value) {
            addCriterion("comd_last_price =", value, "comdLastPrice");
            return (Criteria) this;
        }

        public Criteria andComdLastPriceNotEqualTo(Long value) {
            addCriterion("comd_last_price <>", value, "comdLastPrice");
            return (Criteria) this;
        }

        public Criteria andComdLastPriceGreaterThan(Long value) {
            addCriterion("comd_last_price >", value, "comdLastPrice");
            return (Criteria) this;
        }

        public Criteria andComdLastPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("comd_last_price >=", value, "comdLastPrice");
            return (Criteria) this;
        }

        public Criteria andComdLastPriceLessThan(Long value) {
            addCriterion("comd_last_price <", value, "comdLastPrice");
            return (Criteria) this;
        }

        public Criteria andComdLastPriceLessThanOrEqualTo(Long value) {
            addCriterion("comd_last_price <=", value, "comdLastPrice");
            return (Criteria) this;
        }

        public Criteria andComdLastPriceIn(List<Long> values) {
            addCriterion("comd_last_price in", values, "comdLastPrice");
            return (Criteria) this;
        }

        public Criteria andComdLastPriceNotIn(List<Long> values) {
            addCriterion("comd_last_price not in", values, "comdLastPrice");
            return (Criteria) this;
        }

        public Criteria andComdLastPriceBetween(Long value1, Long value2) {
            addCriterion("comd_last_price between", value1, value2, "comdLastPrice");
            return (Criteria) this;
        }

        public Criteria andComdLastPriceNotBetween(Long value1, Long value2) {
            addCriterion("comd_last_price not between", value1, value2, "comdLastPrice");
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