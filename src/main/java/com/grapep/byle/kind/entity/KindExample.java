package com.grapep.byle.kind.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class KindExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KindExample() {
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

        public Criteria andKindNameIsNull() {
            addCriterion("kind_name is null");
            return (Criteria) this;
        }

        public Criteria andKindNameIsNotNull() {
            addCriterion("kind_name is not null");
            return (Criteria) this;
        }

        public Criteria andKindNameEqualTo(String value) {
            addCriterion("kind_name =", value, "kindName");
            return (Criteria) this;
        }

        public Criteria andKindNameNotEqualTo(String value) {
            addCriterion("kind_name <>", value, "kindName");
            return (Criteria) this;
        }

        public Criteria andKindNameGreaterThan(String value) {
            addCriterion("kind_name >", value, "kindName");
            return (Criteria) this;
        }

        public Criteria andKindNameGreaterThanOrEqualTo(String value) {
            addCriterion("kind_name >=", value, "kindName");
            return (Criteria) this;
        }

        public Criteria andKindNameLessThan(String value) {
            addCriterion("kind_name <", value, "kindName");
            return (Criteria) this;
        }

        public Criteria andKindNameLessThanOrEqualTo(String value) {
            addCriterion("kind_name <=", value, "kindName");
            return (Criteria) this;
        }

        public Criteria andKindNameLike(String value) {
            addCriterion("kind_name like", value, "kindName");
            return (Criteria) this;
        }

        public Criteria andKindNameNotLike(String value) {
            addCriterion("kind_name not like", value, "kindName");
            return (Criteria) this;
        }

        public Criteria andKindNameIn(List<String> values) {
            addCriterion("kind_name in", values, "kindName");
            return (Criteria) this;
        }

        public Criteria andKindNameNotIn(List<String> values) {
            addCriterion("kind_name not in", values, "kindName");
            return (Criteria) this;
        }

        public Criteria andKindNameBetween(String value1, String value2) {
            addCriterion("kind_name between", value1, value2, "kindName");
            return (Criteria) this;
        }

        public Criteria andKindNameNotBetween(String value1, String value2) {
            addCriterion("kind_name not between", value1, value2, "kindName");
            return (Criteria) this;
        }

        public Criteria andKindStateIsNull() {
            addCriterion("kind_state is null");
            return (Criteria) this;
        }

        public Criteria andKindStateIsNotNull() {
            addCriterion("kind_state is not null");
            return (Criteria) this;
        }

        public Criteria andKindStateEqualTo(String value) {
            addCriterion("kind_state =", value, "kindState");
            return (Criteria) this;
        }

        public Criteria andKindStateNotEqualTo(String value) {
            addCriterion("kind_state <>", value, "kindState");
            return (Criteria) this;
        }

        public Criteria andKindStateGreaterThan(String value) {
            addCriterion("kind_state >", value, "kindState");
            return (Criteria) this;
        }

        public Criteria andKindStateGreaterThanOrEqualTo(String value) {
            addCriterion("kind_state >=", value, "kindState");
            return (Criteria) this;
        }

        public Criteria andKindStateLessThan(String value) {
            addCriterion("kind_state <", value, "kindState");
            return (Criteria) this;
        }

        public Criteria andKindStateLessThanOrEqualTo(String value) {
            addCriterion("kind_state <=", value, "kindState");
            return (Criteria) this;
        }

        public Criteria andKindStateLike(String value) {
            addCriterion("kind_state like", value, "kindState");
            return (Criteria) this;
        }

        public Criteria andKindStateNotLike(String value) {
            addCriterion("kind_state not like", value, "kindState");
            return (Criteria) this;
        }

        public Criteria andKindStateIn(List<String> values) {
            addCriterion("kind_state in", values, "kindState");
            return (Criteria) this;
        }

        public Criteria andKindStateNotIn(List<String> values) {
            addCriterion("kind_state not in", values, "kindState");
            return (Criteria) this;
        }

        public Criteria andKindStateBetween(String value1, String value2) {
            addCriterion("kind_state between", value1, value2, "kindState");
            return (Criteria) this;
        }

        public Criteria andKindStateNotBetween(String value1, String value2) {
            addCriterion("kind_state not between", value1, value2, "kindState");
            return (Criteria) this;
        }

        public Criteria andKindOneIsNull() {
            addCriterion("kind_one is null");
            return (Criteria) this;
        }

        public Criteria andKindOneIsNotNull() {
            addCriterion("kind_one is not null");
            return (Criteria) this;
        }

        public Criteria andKindOneEqualTo(String value) {
            addCriterion("kind_one =", value, "kindOne");
            return (Criteria) this;
        }

        public Criteria andKindOneNotEqualTo(String value) {
            addCriterion("kind_one <>", value, "kindOne");
            return (Criteria) this;
        }

        public Criteria andKindOneGreaterThan(String value) {
            addCriterion("kind_one >", value, "kindOne");
            return (Criteria) this;
        }

        public Criteria andKindOneGreaterThanOrEqualTo(String value) {
            addCriterion("kind_one >=", value, "kindOne");
            return (Criteria) this;
        }

        public Criteria andKindOneLessThan(String value) {
            addCriterion("kind_one <", value, "kindOne");
            return (Criteria) this;
        }

        public Criteria andKindOneLessThanOrEqualTo(String value) {
            addCriterion("kind_one <=", value, "kindOne");
            return (Criteria) this;
        }

        public Criteria andKindOneLike(String value) {
            addCriterion("kind_one like", value, "kindOne");
            return (Criteria) this;
        }

        public Criteria andKindOneNotLike(String value) {
            addCriterion("kind_one not like", value, "kindOne");
            return (Criteria) this;
        }

        public Criteria andKindOneIn(List<String> values) {
            addCriterion("kind_one in", values, "kindOne");
            return (Criteria) this;
        }

        public Criteria andKindOneNotIn(List<String> values) {
            addCriterion("kind_one not in", values, "kindOne");
            return (Criteria) this;
        }

        public Criteria andKindOneBetween(String value1, String value2) {
            addCriterion("kind_one between", value1, value2, "kindOne");
            return (Criteria) this;
        }

        public Criteria andKindOneNotBetween(String value1, String value2) {
            addCriterion("kind_one not between", value1, value2, "kindOne");
            return (Criteria) this;
        }

        public Criteria andKindTwoIsNull() {
            addCriterion("kind_two is null");
            return (Criteria) this;
        }

        public Criteria andKindTwoIsNotNull() {
            addCriterion("kind_two is not null");
            return (Criteria) this;
        }

        public Criteria andKindTwoEqualTo(String value) {
            addCriterion("kind_two =", value, "kindTwo");
            return (Criteria) this;
        }

        public Criteria andKindTwoNotEqualTo(String value) {
            addCriterion("kind_two <>", value, "kindTwo");
            return (Criteria) this;
        }

        public Criteria andKindTwoGreaterThan(String value) {
            addCriterion("kind_two >", value, "kindTwo");
            return (Criteria) this;
        }

        public Criteria andKindTwoGreaterThanOrEqualTo(String value) {
            addCriterion("kind_two >=", value, "kindTwo");
            return (Criteria) this;
        }

        public Criteria andKindTwoLessThan(String value) {
            addCriterion("kind_two <", value, "kindTwo");
            return (Criteria) this;
        }

        public Criteria andKindTwoLessThanOrEqualTo(String value) {
            addCriterion("kind_two <=", value, "kindTwo");
            return (Criteria) this;
        }

        public Criteria andKindTwoLike(String value) {
            addCriterion("kind_two like", value, "kindTwo");
            return (Criteria) this;
        }

        public Criteria andKindTwoNotLike(String value) {
            addCriterion("kind_two not like", value, "kindTwo");
            return (Criteria) this;
        }

        public Criteria andKindTwoIn(List<String> values) {
            addCriterion("kind_two in", values, "kindTwo");
            return (Criteria) this;
        }

        public Criteria andKindTwoNotIn(List<String> values) {
            addCriterion("kind_two not in", values, "kindTwo");
            return (Criteria) this;
        }

        public Criteria andKindTwoBetween(String value1, String value2) {
            addCriterion("kind_two between", value1, value2, "kindTwo");
            return (Criteria) this;
        }

        public Criteria andKindTwoNotBetween(String value1, String value2) {
            addCriterion("kind_two not between", value1, value2, "kindTwo");
            return (Criteria) this;
        }

        public Criteria andKindThreeIsNull() {
            addCriterion("kind_three is null");
            return (Criteria) this;
        }

        public Criteria andKindThreeIsNotNull() {
            addCriterion("kind_three is not null");
            return (Criteria) this;
        }

        public Criteria andKindThreeEqualTo(String value) {
            addCriterion("kind_three =", value, "kindThree");
            return (Criteria) this;
        }

        public Criteria andKindThreeNotEqualTo(String value) {
            addCriterion("kind_three <>", value, "kindThree");
            return (Criteria) this;
        }

        public Criteria andKindThreeGreaterThan(String value) {
            addCriterion("kind_three >", value, "kindThree");
            return (Criteria) this;
        }

        public Criteria andKindThreeGreaterThanOrEqualTo(String value) {
            addCriterion("kind_three >=", value, "kindThree");
            return (Criteria) this;
        }

        public Criteria andKindThreeLessThan(String value) {
            addCriterion("kind_three <", value, "kindThree");
            return (Criteria) this;
        }

        public Criteria andKindThreeLessThanOrEqualTo(String value) {
            addCriterion("kind_three <=", value, "kindThree");
            return (Criteria) this;
        }

        public Criteria andKindThreeLike(String value) {
            addCriterion("kind_three like", value, "kindThree");
            return (Criteria) this;
        }

        public Criteria andKindThreeNotLike(String value) {
            addCriterion("kind_three not like", value, "kindThree");
            return (Criteria) this;
        }

        public Criteria andKindThreeIn(List<String> values) {
            addCriterion("kind_three in", values, "kindThree");
            return (Criteria) this;
        }

        public Criteria andKindThreeNotIn(List<String> values) {
            addCriterion("kind_three not in", values, "kindThree");
            return (Criteria) this;
        }

        public Criteria andKindThreeBetween(String value1, String value2) {
            addCriterion("kind_three between", value1, value2, "kindThree");
            return (Criteria) this;
        }

        public Criteria andKindThreeNotBetween(String value1, String value2) {
            addCriterion("kind_three not between", value1, value2, "kindThree");
            return (Criteria) this;
        }

        public Criteria andKindFourIsNull() {
            addCriterion("kind_four is null");
            return (Criteria) this;
        }

        public Criteria andKindFourIsNotNull() {
            addCriterion("kind_four is not null");
            return (Criteria) this;
        }

        public Criteria andKindFourEqualTo(String value) {
            addCriterion("kind_four =", value, "kindFour");
            return (Criteria) this;
        }

        public Criteria andKindFourNotEqualTo(String value) {
            addCriterion("kind_four <>", value, "kindFour");
            return (Criteria) this;
        }

        public Criteria andKindFourGreaterThan(String value) {
            addCriterion("kind_four >", value, "kindFour");
            return (Criteria) this;
        }

        public Criteria andKindFourGreaterThanOrEqualTo(String value) {
            addCriterion("kind_four >=", value, "kindFour");
            return (Criteria) this;
        }

        public Criteria andKindFourLessThan(String value) {
            addCriterion("kind_four <", value, "kindFour");
            return (Criteria) this;
        }

        public Criteria andKindFourLessThanOrEqualTo(String value) {
            addCriterion("kind_four <=", value, "kindFour");
            return (Criteria) this;
        }

        public Criteria andKindFourLike(String value) {
            addCriterion("kind_four like", value, "kindFour");
            return (Criteria) this;
        }

        public Criteria andKindFourNotLike(String value) {
            addCriterion("kind_four not like", value, "kindFour");
            return (Criteria) this;
        }

        public Criteria andKindFourIn(List<String> values) {
            addCriterion("kind_four in", values, "kindFour");
            return (Criteria) this;
        }

        public Criteria andKindFourNotIn(List<String> values) {
            addCriterion("kind_four not in", values, "kindFour");
            return (Criteria) this;
        }

        public Criteria andKindFourBetween(String value1, String value2) {
            addCriterion("kind_four between", value1, value2, "kindFour");
            return (Criteria) this;
        }

        public Criteria andKindFourNotBetween(String value1, String value2) {
            addCriterion("kind_four not between", value1, value2, "kindFour");
            return (Criteria) this;
        }

        public Criteria andKindFiveIsNull() {
            addCriterion("kind_five is null");
            return (Criteria) this;
        }

        public Criteria andKindFiveIsNotNull() {
            addCriterion("kind_five is not null");
            return (Criteria) this;
        }

        public Criteria andKindFiveEqualTo(String value) {
            addCriterion("kind_five =", value, "kindFive");
            return (Criteria) this;
        }

        public Criteria andKindFiveNotEqualTo(String value) {
            addCriterion("kind_five <>", value, "kindFive");
            return (Criteria) this;
        }

        public Criteria andKindFiveGreaterThan(String value) {
            addCriterion("kind_five >", value, "kindFive");
            return (Criteria) this;
        }

        public Criteria andKindFiveGreaterThanOrEqualTo(String value) {
            addCriterion("kind_five >=", value, "kindFive");
            return (Criteria) this;
        }

        public Criteria andKindFiveLessThan(String value) {
            addCriterion("kind_five <", value, "kindFive");
            return (Criteria) this;
        }

        public Criteria andKindFiveLessThanOrEqualTo(String value) {
            addCriterion("kind_five <=", value, "kindFive");
            return (Criteria) this;
        }

        public Criteria andKindFiveLike(String value) {
            addCriterion("kind_five like", value, "kindFive");
            return (Criteria) this;
        }

        public Criteria andKindFiveNotLike(String value) {
            addCriterion("kind_five not like", value, "kindFive");
            return (Criteria) this;
        }

        public Criteria andKindFiveIn(List<String> values) {
            addCriterion("kind_five in", values, "kindFive");
            return (Criteria) this;
        }

        public Criteria andKindFiveNotIn(List<String> values) {
            addCriterion("kind_five not in", values, "kindFive");
            return (Criteria) this;
        }

        public Criteria andKindFiveBetween(String value1, String value2) {
            addCriterion("kind_five between", value1, value2, "kindFive");
            return (Criteria) this;
        }

        public Criteria andKindFiveNotBetween(String value1, String value2) {
            addCriterion("kind_five not between", value1, value2, "kindFive");
            return (Criteria) this;
        }

        public Criteria andKindSixIsNull() {
            addCriterion("kind_six is null");
            return (Criteria) this;
        }

        public Criteria andKindSixIsNotNull() {
            addCriterion("kind_six is not null");
            return (Criteria) this;
        }

        public Criteria andKindSixEqualTo(String value) {
            addCriterion("kind_six =", value, "kindSix");
            return (Criteria) this;
        }

        public Criteria andKindSixNotEqualTo(String value) {
            addCriterion("kind_six <>", value, "kindSix");
            return (Criteria) this;
        }

        public Criteria andKindSixGreaterThan(String value) {
            addCriterion("kind_six >", value, "kindSix");
            return (Criteria) this;
        }

        public Criteria andKindSixGreaterThanOrEqualTo(String value) {
            addCriterion("kind_six >=", value, "kindSix");
            return (Criteria) this;
        }

        public Criteria andKindSixLessThan(String value) {
            addCriterion("kind_six <", value, "kindSix");
            return (Criteria) this;
        }

        public Criteria andKindSixLessThanOrEqualTo(String value) {
            addCriterion("kind_six <=", value, "kindSix");
            return (Criteria) this;
        }

        public Criteria andKindSixLike(String value) {
            addCriterion("kind_six like", value, "kindSix");
            return (Criteria) this;
        }

        public Criteria andKindSixNotLike(String value) {
            addCriterion("kind_six not like", value, "kindSix");
            return (Criteria) this;
        }

        public Criteria andKindSixIn(List<String> values) {
            addCriterion("kind_six in", values, "kindSix");
            return (Criteria) this;
        }

        public Criteria andKindSixNotIn(List<String> values) {
            addCriterion("kind_six not in", values, "kindSix");
            return (Criteria) this;
        }

        public Criteria andKindSixBetween(String value1, String value2) {
            addCriterion("kind_six between", value1, value2, "kindSix");
            return (Criteria) this;
        }

        public Criteria andKindSixNotBetween(String value1, String value2) {
            addCriterion("kind_six not between", value1, value2, "kindSix");
            return (Criteria) this;
        }

        public Criteria andKindSevenIsNull() {
            addCriterion("kind_seven is null");
            return (Criteria) this;
        }

        public Criteria andKindSevenIsNotNull() {
            addCriterion("kind_seven is not null");
            return (Criteria) this;
        }

        public Criteria andKindSevenEqualTo(String value) {
            addCriterion("kind_seven =", value, "kindSeven");
            return (Criteria) this;
        }

        public Criteria andKindSevenNotEqualTo(String value) {
            addCriterion("kind_seven <>", value, "kindSeven");
            return (Criteria) this;
        }

        public Criteria andKindSevenGreaterThan(String value) {
            addCriterion("kind_seven >", value, "kindSeven");
            return (Criteria) this;
        }

        public Criteria andKindSevenGreaterThanOrEqualTo(String value) {
            addCriterion("kind_seven >=", value, "kindSeven");
            return (Criteria) this;
        }

        public Criteria andKindSevenLessThan(String value) {
            addCriterion("kind_seven <", value, "kindSeven");
            return (Criteria) this;
        }

        public Criteria andKindSevenLessThanOrEqualTo(String value) {
            addCriterion("kind_seven <=", value, "kindSeven");
            return (Criteria) this;
        }

        public Criteria andKindSevenLike(String value) {
            addCriterion("kind_seven like", value, "kindSeven");
            return (Criteria) this;
        }

        public Criteria andKindSevenNotLike(String value) {
            addCriterion("kind_seven not like", value, "kindSeven");
            return (Criteria) this;
        }

        public Criteria andKindSevenIn(List<String> values) {
            addCriterion("kind_seven in", values, "kindSeven");
            return (Criteria) this;
        }

        public Criteria andKindSevenNotIn(List<String> values) {
            addCriterion("kind_seven not in", values, "kindSeven");
            return (Criteria) this;
        }

        public Criteria andKindSevenBetween(String value1, String value2) {
            addCriterion("kind_seven between", value1, value2, "kindSeven");
            return (Criteria) this;
        }

        public Criteria andKindSevenNotBetween(String value1, String value2) {
            addCriterion("kind_seven not between", value1, value2, "kindSeven");
            return (Criteria) this;
        }

        public Criteria andKindEightIsNull() {
            addCriterion("kind_eight is null");
            return (Criteria) this;
        }

        public Criteria andKindEightIsNotNull() {
            addCriterion("kind_eight is not null");
            return (Criteria) this;
        }

        public Criteria andKindEightEqualTo(Date value) {
            addCriterion("kind_eight =", value, "kindEight");
            return (Criteria) this;
        }

        public Criteria andKindEightNotEqualTo(Date value) {
            addCriterion("kind_eight <>", value, "kindEight");
            return (Criteria) this;
        }

        public Criteria andKindEightGreaterThan(Date value) {
            addCriterion("kind_eight >", value, "kindEight");
            return (Criteria) this;
        }

        public Criteria andKindEightGreaterThanOrEqualTo(Date value) {
            addCriterion("kind_eight >=", value, "kindEight");
            return (Criteria) this;
        }

        public Criteria andKindEightLessThan(Date value) {
            addCriterion("kind_eight <", value, "kindEight");
            return (Criteria) this;
        }

        public Criteria andKindEightLessThanOrEqualTo(Date value) {
            addCriterion("kind_eight <=", value, "kindEight");
            return (Criteria) this;
        }

        public Criteria andKindEightIn(List<Date> values) {
            addCriterion("kind_eight in", values, "kindEight");
            return (Criteria) this;
        }

        public Criteria andKindEightNotIn(List<Date> values) {
            addCriterion("kind_eight not in", values, "kindEight");
            return (Criteria) this;
        }

        public Criteria andKindEightBetween(Date value1, Date value2) {
            addCriterion("kind_eight between", value1, value2, "kindEight");
            return (Criteria) this;
        }

        public Criteria andKindEightNotBetween(Date value1, Date value2) {
            addCriterion("kind_eight not between", value1, value2, "kindEight");
            return (Criteria) this;
        }

        public Criteria andKindNineIsNull() {
            addCriterion("kind_nine is null");
            return (Criteria) this;
        }

        public Criteria andKindNineIsNotNull() {
            addCriterion("kind_nine is not null");
            return (Criteria) this;
        }

        public Criteria andKindNineEqualTo(Date value) {
            addCriterion("kind_nine =", value, "kindNine");
            return (Criteria) this;
        }

        public Criteria andKindNineNotEqualTo(Date value) {
            addCriterion("kind_nine <>", value, "kindNine");
            return (Criteria) this;
        }

        public Criteria andKindNineGreaterThan(Date value) {
            addCriterion("kind_nine >", value, "kindNine");
            return (Criteria) this;
        }

        public Criteria andKindNineGreaterThanOrEqualTo(Date value) {
            addCriterion("kind_nine >=", value, "kindNine");
            return (Criteria) this;
        }

        public Criteria andKindNineLessThan(Date value) {
            addCriterion("kind_nine <", value, "kindNine");
            return (Criteria) this;
        }

        public Criteria andKindNineLessThanOrEqualTo(Date value) {
            addCriterion("kind_nine <=", value, "kindNine");
            return (Criteria) this;
        }

        public Criteria andKindNineIn(List<Date> values) {
            addCriterion("kind_nine in", values, "kindNine");
            return (Criteria) this;
        }

        public Criteria andKindNineNotIn(List<Date> values) {
            addCriterion("kind_nine not in", values, "kindNine");
            return (Criteria) this;
        }

        public Criteria andKindNineBetween(Date value1, Date value2) {
            addCriterion("kind_nine between", value1, value2, "kindNine");
            return (Criteria) this;
        }

        public Criteria andKindNineNotBetween(Date value1, Date value2) {
            addCriterion("kind_nine not between", value1, value2, "kindNine");
            return (Criteria) this;
        }

        public Criteria andKindTenIsNull() {
            addCriterion("kind_ten is null");
            return (Criteria) this;
        }

        public Criteria andKindTenIsNotNull() {
            addCriterion("kind_ten is not null");
            return (Criteria) this;
        }

        public Criteria andKindTenEqualTo(Date value) {
            addCriterion("kind_ten =", value, "kindTen");
            return (Criteria) this;
        }

        public Criteria andKindTenNotEqualTo(Date value) {
            addCriterion("kind_ten <>", value, "kindTen");
            return (Criteria) this;
        }

        public Criteria andKindTenGreaterThan(Date value) {
            addCriterion("kind_ten >", value, "kindTen");
            return (Criteria) this;
        }

        public Criteria andKindTenGreaterThanOrEqualTo(Date value) {
            addCriterion("kind_ten >=", value, "kindTen");
            return (Criteria) this;
        }

        public Criteria andKindTenLessThan(Date value) {
            addCriterion("kind_ten <", value, "kindTen");
            return (Criteria) this;
        }

        public Criteria andKindTenLessThanOrEqualTo(Date value) {
            addCriterion("kind_ten <=", value, "kindTen");
            return (Criteria) this;
        }

        public Criteria andKindTenIn(List<Date> values) {
            addCriterion("kind_ten in", values, "kindTen");
            return (Criteria) this;
        }

        public Criteria andKindTenNotIn(List<Date> values) {
            addCriterion("kind_ten not in", values, "kindTen");
            return (Criteria) this;
        }

        public Criteria andKindTenBetween(Date value1, Date value2) {
            addCriterion("kind_ten between", value1, value2, "kindTen");
            return (Criteria) this;
        }

        public Criteria andKindTenNotBetween(Date value1, Date value2) {
            addCriterion("kind_ten not between", value1, value2, "kindTen");
            return (Criteria) this;
        }

        public Criteria andKindElevenIsNull() {
            addCriterion("kind_eleven is null");
            return (Criteria) this;
        }

        public Criteria andKindElevenIsNotNull() {
            addCriterion("kind_eleven is not null");
            return (Criteria) this;
        }

        public Criteria andKindElevenEqualTo(Integer value) {
            addCriterion("kind_eleven =", value, "kindEleven");
            return (Criteria) this;
        }

        public Criteria andKindElevenNotEqualTo(Integer value) {
            addCriterion("kind_eleven <>", value, "kindEleven");
            return (Criteria) this;
        }

        public Criteria andKindElevenGreaterThan(Integer value) {
            addCriterion("kind_eleven >", value, "kindEleven");
            return (Criteria) this;
        }

        public Criteria andKindElevenGreaterThanOrEqualTo(Integer value) {
            addCriterion("kind_eleven >=", value, "kindEleven");
            return (Criteria) this;
        }

        public Criteria andKindElevenLessThan(Integer value) {
            addCriterion("kind_eleven <", value, "kindEleven");
            return (Criteria) this;
        }

        public Criteria andKindElevenLessThanOrEqualTo(Integer value) {
            addCriterion("kind_eleven <=", value, "kindEleven");
            return (Criteria) this;
        }

        public Criteria andKindElevenIn(List<Integer> values) {
            addCriterion("kind_eleven in", values, "kindEleven");
            return (Criteria) this;
        }

        public Criteria andKindElevenNotIn(List<Integer> values) {
            addCriterion("kind_eleven not in", values, "kindEleven");
            return (Criteria) this;
        }

        public Criteria andKindElevenBetween(Integer value1, Integer value2) {
            addCriterion("kind_eleven between", value1, value2, "kindEleven");
            return (Criteria) this;
        }

        public Criteria andKindElevenNotBetween(Integer value1, Integer value2) {
            addCriterion("kind_eleven not between", value1, value2, "kindEleven");
            return (Criteria) this;
        }

        public Criteria andKindTwelveIsNull() {
            addCriterion("kind_twelve is null");
            return (Criteria) this;
        }

        public Criteria andKindTwelveIsNotNull() {
            addCriterion("kind_twelve is not null");
            return (Criteria) this;
        }

        public Criteria andKindTwelveEqualTo(Integer value) {
            addCriterion("kind_twelve =", value, "kindTwelve");
            return (Criteria) this;
        }

        public Criteria andKindTwelveNotEqualTo(Integer value) {
            addCriterion("kind_twelve <>", value, "kindTwelve");
            return (Criteria) this;
        }

        public Criteria andKindTwelveGreaterThan(Integer value) {
            addCriterion("kind_twelve >", value, "kindTwelve");
            return (Criteria) this;
        }

        public Criteria andKindTwelveGreaterThanOrEqualTo(Integer value) {
            addCriterion("kind_twelve >=", value, "kindTwelve");
            return (Criteria) this;
        }

        public Criteria andKindTwelveLessThan(Integer value) {
            addCriterion("kind_twelve <", value, "kindTwelve");
            return (Criteria) this;
        }

        public Criteria andKindTwelveLessThanOrEqualTo(Integer value) {
            addCriterion("kind_twelve <=", value, "kindTwelve");
            return (Criteria) this;
        }

        public Criteria andKindTwelveIn(List<Integer> values) {
            addCriterion("kind_twelve in", values, "kindTwelve");
            return (Criteria) this;
        }

        public Criteria andKindTwelveNotIn(List<Integer> values) {
            addCriterion("kind_twelve not in", values, "kindTwelve");
            return (Criteria) this;
        }

        public Criteria andKindTwelveBetween(Integer value1, Integer value2) {
            addCriterion("kind_twelve between", value1, value2, "kindTwelve");
            return (Criteria) this;
        }

        public Criteria andKindTwelveNotBetween(Integer value1, Integer value2) {
            addCriterion("kind_twelve not between", value1, value2, "kindTwelve");
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