package mymap.item.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MapOnroadExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MapOnroadExample() {
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

        public Criteria andOnroadIdIsNull() {
            addCriterion("onroad_id is null");
            return (Criteria) this;
        }

        public Criteria andOnroadIdIsNotNull() {
            addCriterion("onroad_id is not null");
            return (Criteria) this;
        }

        public Criteria andOnroadIdEqualTo(Long value) {
            addCriterion("onroad_id =", value, "onroadId");
            return (Criteria) this;
        }

        public Criteria andOnroadIdNotEqualTo(Long value) {
            addCriterion("onroad_id <>", value, "onroadId");
            return (Criteria) this;
        }

        public Criteria andOnroadIdGreaterThan(Long value) {
            addCriterion("onroad_id >", value, "onroadId");
            return (Criteria) this;
        }

        public Criteria andOnroadIdGreaterThanOrEqualTo(Long value) {
            addCriterion("onroad_id >=", value, "onroadId");
            return (Criteria) this;
        }

        public Criteria andOnroadIdLessThan(Long value) {
            addCriterion("onroad_id <", value, "onroadId");
            return (Criteria) this;
        }

        public Criteria andOnroadIdLessThanOrEqualTo(Long value) {
            addCriterion("onroad_id <=", value, "onroadId");
            return (Criteria) this;
        }

        public Criteria andOnroadIdIn(List<Long> values) {
            addCriterion("onroad_id in", values, "onroadId");
            return (Criteria) this;
        }

        public Criteria andOnroadIdNotIn(List<Long> values) {
            addCriterion("onroad_id not in", values, "onroadId");
            return (Criteria) this;
        }

        public Criteria andOnroadIdBetween(Long value1, Long value2) {
            addCriterion("onroad_id between", value1, value2, "onroadId");
            return (Criteria) this;
        }

        public Criteria andOnroadIdNotBetween(Long value1, Long value2) {
            addCriterion("onroad_id not between", value1, value2, "onroadId");
            return (Criteria) this;
        }

        public Criteria andOnroadNameIsNull() {
            addCriterion("onroad_name is null");
            return (Criteria) this;
        }

        public Criteria andOnroadNameIsNotNull() {
            addCriterion("onroad_name is not null");
            return (Criteria) this;
        }

        public Criteria andOnroadNameEqualTo(String value) {
            addCriterion("onroad_name =", value, "onroadName");
            return (Criteria) this;
        }

        public Criteria andOnroadNameNotEqualTo(String value) {
            addCriterion("onroad_name <>", value, "onroadName");
            return (Criteria) this;
        }

        public Criteria andOnroadNameGreaterThan(String value) {
            addCriterion("onroad_name >", value, "onroadName");
            return (Criteria) this;
        }

        public Criteria andOnroadNameGreaterThanOrEqualTo(String value) {
            addCriterion("onroad_name >=", value, "onroadName");
            return (Criteria) this;
        }

        public Criteria andOnroadNameLessThan(String value) {
            addCriterion("onroad_name <", value, "onroadName");
            return (Criteria) this;
        }

        public Criteria andOnroadNameLessThanOrEqualTo(String value) {
            addCriterion("onroad_name <=", value, "onroadName");
            return (Criteria) this;
        }

        public Criteria andOnroadNameLike(String value) {
            addCriterion("onroad_name like", value, "onroadName");
            return (Criteria) this;
        }

        public Criteria andOnroadNameNotLike(String value) {
            addCriterion("onroad_name not like", value, "onroadName");
            return (Criteria) this;
        }

        public Criteria andOnroadNameIn(List<String> values) {
            addCriterion("onroad_name in", values, "onroadName");
            return (Criteria) this;
        }

        public Criteria andOnroadNameNotIn(List<String> values) {
            addCriterion("onroad_name not in", values, "onroadName");
            return (Criteria) this;
        }

        public Criteria andOnroadNameBetween(String value1, String value2) {
            addCriterion("onroad_name between", value1, value2, "onroadName");
            return (Criteria) this;
        }

        public Criteria andOnroadNameNotBetween(String value1, String value2) {
            addCriterion("onroad_name not between", value1, value2, "onroadName");
            return (Criteria) this;
        }

        public Criteria andOnroadNumberIsNull() {
            addCriterion("onroad_number is null");
            return (Criteria) this;
        }

        public Criteria andOnroadNumberIsNotNull() {
            addCriterion("onroad_number is not null");
            return (Criteria) this;
        }

        public Criteria andOnroadNumberEqualTo(Integer value) {
            addCriterion("onroad_number =", value, "onroadNumber");
            return (Criteria) this;
        }

        public Criteria andOnroadNumberNotEqualTo(Integer value) {
            addCriterion("onroad_number <>", value, "onroadNumber");
            return (Criteria) this;
        }

        public Criteria andOnroadNumberGreaterThan(Integer value) {
            addCriterion("onroad_number >", value, "onroadNumber");
            return (Criteria) this;
        }

        public Criteria andOnroadNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("onroad_number >=", value, "onroadNumber");
            return (Criteria) this;
        }

        public Criteria andOnroadNumberLessThan(Integer value) {
            addCriterion("onroad_number <", value, "onroadNumber");
            return (Criteria) this;
        }

        public Criteria andOnroadNumberLessThanOrEqualTo(Integer value) {
            addCriterion("onroad_number <=", value, "onroadNumber");
            return (Criteria) this;
        }

        public Criteria andOnroadNumberIn(List<Integer> values) {
            addCriterion("onroad_number in", values, "onroadNumber");
            return (Criteria) this;
        }

        public Criteria andOnroadNumberNotIn(List<Integer> values) {
            addCriterion("onroad_number not in", values, "onroadNumber");
            return (Criteria) this;
        }

        public Criteria andOnroadNumberBetween(Integer value1, Integer value2) {
            addCriterion("onroad_number between", value1, value2, "onroadNumber");
            return (Criteria) this;
        }

        public Criteria andOnroadNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("onroad_number not between", value1, value2, "onroadNumber");
            return (Criteria) this;
        }

        public Criteria andOnroadAddressIsNull() {
            addCriterion("onroad_address is null");
            return (Criteria) this;
        }

        public Criteria andOnroadAddressIsNotNull() {
            addCriterion("onroad_address is not null");
            return (Criteria) this;
        }

        public Criteria andOnroadAddressEqualTo(String value) {
            addCriterion("onroad_address =", value, "onroadAddress");
            return (Criteria) this;
        }

        public Criteria andOnroadAddressNotEqualTo(String value) {
            addCriterion("onroad_address <>", value, "onroadAddress");
            return (Criteria) this;
        }

        public Criteria andOnroadAddressGreaterThan(String value) {
            addCriterion("onroad_address >", value, "onroadAddress");
            return (Criteria) this;
        }

        public Criteria andOnroadAddressGreaterThanOrEqualTo(String value) {
            addCriterion("onroad_address >=", value, "onroadAddress");
            return (Criteria) this;
        }

        public Criteria andOnroadAddressLessThan(String value) {
            addCriterion("onroad_address <", value, "onroadAddress");
            return (Criteria) this;
        }

        public Criteria andOnroadAddressLessThanOrEqualTo(String value) {
            addCriterion("onroad_address <=", value, "onroadAddress");
            return (Criteria) this;
        }

        public Criteria andOnroadAddressLike(String value) {
            addCriterion("onroad_address like", value, "onroadAddress");
            return (Criteria) this;
        }

        public Criteria andOnroadAddressNotLike(String value) {
            addCriterion("onroad_address not like", value, "onroadAddress");
            return (Criteria) this;
        }

        public Criteria andOnroadAddressIn(List<String> values) {
            addCriterion("onroad_address in", values, "onroadAddress");
            return (Criteria) this;
        }

        public Criteria andOnroadAddressNotIn(List<String> values) {
            addCriterion("onroad_address not in", values, "onroadAddress");
            return (Criteria) this;
        }

        public Criteria andOnroadAddressBetween(String value1, String value2) {
            addCriterion("onroad_address between", value1, value2, "onroadAddress");
            return (Criteria) this;
        }

        public Criteria andOnroadAddressNotBetween(String value1, String value2) {
            addCriterion("onroad_address not between", value1, value2, "onroadAddress");
            return (Criteria) this;
        }

        public Criteria andOnroadRulesIsNull() {
            addCriterion("onroad_rules is null");
            return (Criteria) this;
        }

        public Criteria andOnroadRulesIsNotNull() {
            addCriterion("onroad_rules is not null");
            return (Criteria) this;
        }

        public Criteria andOnroadRulesEqualTo(String value) {
            addCriterion("onroad_rules =", value, "onroadRules");
            return (Criteria) this;
        }

        public Criteria andOnroadRulesNotEqualTo(String value) {
            addCriterion("onroad_rules <>", value, "onroadRules");
            return (Criteria) this;
        }

        public Criteria andOnroadRulesGreaterThan(String value) {
            addCriterion("onroad_rules >", value, "onroadRules");
            return (Criteria) this;
        }

        public Criteria andOnroadRulesGreaterThanOrEqualTo(String value) {
            addCriterion("onroad_rules >=", value, "onroadRules");
            return (Criteria) this;
        }

        public Criteria andOnroadRulesLessThan(String value) {
            addCriterion("onroad_rules <", value, "onroadRules");
            return (Criteria) this;
        }

        public Criteria andOnroadRulesLessThanOrEqualTo(String value) {
            addCriterion("onroad_rules <=", value, "onroadRules");
            return (Criteria) this;
        }

        public Criteria andOnroadRulesLike(String value) {
            addCriterion("onroad_rules like", value, "onroadRules");
            return (Criteria) this;
        }

        public Criteria andOnroadRulesNotLike(String value) {
            addCriterion("onroad_rules not like", value, "onroadRules");
            return (Criteria) this;
        }

        public Criteria andOnroadRulesIn(List<String> values) {
            addCriterion("onroad_rules in", values, "onroadRules");
            return (Criteria) this;
        }

        public Criteria andOnroadRulesNotIn(List<String> values) {
            addCriterion("onroad_rules not in", values, "onroadRules");
            return (Criteria) this;
        }

        public Criteria andOnroadRulesBetween(String value1, String value2) {
            addCriterion("onroad_rules between", value1, value2, "onroadRules");
            return (Criteria) this;
        }

        public Criteria andOnroadRulesNotBetween(String value1, String value2) {
            addCriterion("onroad_rules not between", value1, value2, "onroadRules");
            return (Criteria) this;
        }

        public Criteria andOnroadTypeIsNull() {
            addCriterion("onroad_type is null");
            return (Criteria) this;
        }

        public Criteria andOnroadTypeIsNotNull() {
            addCriterion("onroad_type is not null");
            return (Criteria) this;
        }

        public Criteria andOnroadTypeEqualTo(String value) {
            addCriterion("onroad_type =", value, "onroadType");
            return (Criteria) this;
        }

        public Criteria andOnroadTypeNotEqualTo(String value) {
            addCriterion("onroad_type <>", value, "onroadType");
            return (Criteria) this;
        }

        public Criteria andOnroadTypeGreaterThan(String value) {
            addCriterion("onroad_type >", value, "onroadType");
            return (Criteria) this;
        }

        public Criteria andOnroadTypeGreaterThanOrEqualTo(String value) {
            addCriterion("onroad_type >=", value, "onroadType");
            return (Criteria) this;
        }

        public Criteria andOnroadTypeLessThan(String value) {
            addCriterion("onroad_type <", value, "onroadType");
            return (Criteria) this;
        }

        public Criteria andOnroadTypeLessThanOrEqualTo(String value) {
            addCriterion("onroad_type <=", value, "onroadType");
            return (Criteria) this;
        }

        public Criteria andOnroadTypeLike(String value) {
            addCriterion("onroad_type like", value, "onroadType");
            return (Criteria) this;
        }

        public Criteria andOnroadTypeNotLike(String value) {
            addCriterion("onroad_type not like", value, "onroadType");
            return (Criteria) this;
        }

        public Criteria andOnroadTypeIn(List<String> values) {
            addCriterion("onroad_type in", values, "onroadType");
            return (Criteria) this;
        }

        public Criteria andOnroadTypeNotIn(List<String> values) {
            addCriterion("onroad_type not in", values, "onroadType");
            return (Criteria) this;
        }

        public Criteria andOnroadTypeBetween(String value1, String value2) {
            addCriterion("onroad_type between", value1, value2, "onroadType");
            return (Criteria) this;
        }

        public Criteria andOnroadTypeNotBetween(String value1, String value2) {
            addCriterion("onroad_type not between", value1, value2, "onroadType");
            return (Criteria) this;
        }

        public Criteria andOnroadLngIsNull() {
            addCriterion("onroad_lng is null");
            return (Criteria) this;
        }

        public Criteria andOnroadLngIsNotNull() {
            addCriterion("onroad_lng is not null");
            return (Criteria) this;
        }

        public Criteria andOnroadLngEqualTo(BigDecimal value) {
            addCriterion("onroad_lng =", value, "onroadLng");
            return (Criteria) this;
        }

        public Criteria andOnroadLngNotEqualTo(BigDecimal value) {
            addCriterion("onroad_lng <>", value, "onroadLng");
            return (Criteria) this;
        }

        public Criteria andOnroadLngGreaterThan(BigDecimal value) {
            addCriterion("onroad_lng >", value, "onroadLng");
            return (Criteria) this;
        }

        public Criteria andOnroadLngGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("onroad_lng >=", value, "onroadLng");
            return (Criteria) this;
        }

        public Criteria andOnroadLngLessThan(BigDecimal value) {
            addCriterion("onroad_lng <", value, "onroadLng");
            return (Criteria) this;
        }

        public Criteria andOnroadLngLessThanOrEqualTo(BigDecimal value) {
            addCriterion("onroad_lng <=", value, "onroadLng");
            return (Criteria) this;
        }

        public Criteria andOnroadLngIn(List<BigDecimal> values) {
            addCriterion("onroad_lng in", values, "onroadLng");
            return (Criteria) this;
        }

        public Criteria andOnroadLngNotIn(List<BigDecimal> values) {
            addCriterion("onroad_lng not in", values, "onroadLng");
            return (Criteria) this;
        }

        public Criteria andOnroadLngBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("onroad_lng between", value1, value2, "onroadLng");
            return (Criteria) this;
        }

        public Criteria andOnroadLngNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("onroad_lng not between", value1, value2, "onroadLng");
            return (Criteria) this;
        }

        public Criteria andOnroadLatIsNull() {
            addCriterion("onroad_lat is null");
            return (Criteria) this;
        }

        public Criteria andOnroadLatIsNotNull() {
            addCriterion("onroad_lat is not null");
            return (Criteria) this;
        }

        public Criteria andOnroadLatEqualTo(BigDecimal value) {
            addCriterion("onroad_lat =", value, "onroadLat");
            return (Criteria) this;
        }

        public Criteria andOnroadLatNotEqualTo(BigDecimal value) {
            addCriterion("onroad_lat <>", value, "onroadLat");
            return (Criteria) this;
        }

        public Criteria andOnroadLatGreaterThan(BigDecimal value) {
            addCriterion("onroad_lat >", value, "onroadLat");
            return (Criteria) this;
        }

        public Criteria andOnroadLatGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("onroad_lat >=", value, "onroadLat");
            return (Criteria) this;
        }

        public Criteria andOnroadLatLessThan(BigDecimal value) {
            addCriterion("onroad_lat <", value, "onroadLat");
            return (Criteria) this;
        }

        public Criteria andOnroadLatLessThanOrEqualTo(BigDecimal value) {
            addCriterion("onroad_lat <=", value, "onroadLat");
            return (Criteria) this;
        }

        public Criteria andOnroadLatIn(List<BigDecimal> values) {
            addCriterion("onroad_lat in", values, "onroadLat");
            return (Criteria) this;
        }

        public Criteria andOnroadLatNotIn(List<BigDecimal> values) {
            addCriterion("onroad_lat not in", values, "onroadLat");
            return (Criteria) this;
        }

        public Criteria andOnroadLatBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("onroad_lat between", value1, value2, "onroadLat");
            return (Criteria) this;
        }

        public Criteria andOnroadLatNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("onroad_lat not between", value1, value2, "onroadLat");
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