package mymap.item.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MapTagExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MapTagExample() {
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

        public Criteria andTagIdIsNull() {
            addCriterion("tag_id is null");
            return (Criteria) this;
        }

        public Criteria andTagIdIsNotNull() {
            addCriterion("tag_id is not null");
            return (Criteria) this;
        }

        public Criteria andTagIdEqualTo(Long value) {
            addCriterion("tag_id =", value, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdNotEqualTo(Long value) {
            addCriterion("tag_id <>", value, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdGreaterThan(Long value) {
            addCriterion("tag_id >", value, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tag_id >=", value, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdLessThan(Long value) {
            addCriterion("tag_id <", value, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdLessThanOrEqualTo(Long value) {
            addCriterion("tag_id <=", value, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdIn(List<Long> values) {
            addCriterion("tag_id in", values, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdNotIn(List<Long> values) {
            addCriterion("tag_id not in", values, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdBetween(Long value1, Long value2) {
            addCriterion("tag_id between", value1, value2, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdNotBetween(Long value1, Long value2) {
            addCriterion("tag_id not between", value1, value2, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagNameIsNull() {
            addCriterion("tag_name is null");
            return (Criteria) this;
        }

        public Criteria andTagNameIsNotNull() {
            addCriterion("tag_name is not null");
            return (Criteria) this;
        }

        public Criteria andTagNameEqualTo(String value) {
            addCriterion("tag_name =", value, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagNameNotEqualTo(String value) {
            addCriterion("tag_name <>", value, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagNameGreaterThan(String value) {
            addCriterion("tag_name >", value, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagNameGreaterThanOrEqualTo(String value) {
            addCriterion("tag_name >=", value, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagNameLessThan(String value) {
            addCriterion("tag_name <", value, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagNameLessThanOrEqualTo(String value) {
            addCriterion("tag_name <=", value, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagNameLike(String value) {
            addCriterion("tag_name like", value, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagNameNotLike(String value) {
            addCriterion("tag_name not like", value, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagNameIn(List<String> values) {
            addCriterion("tag_name in", values, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagNameNotIn(List<String> values) {
            addCriterion("tag_name not in", values, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagNameBetween(String value1, String value2) {
            addCriterion("tag_name between", value1, value2, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagNameNotBetween(String value1, String value2) {
            addCriterion("tag_name not between", value1, value2, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagAddressIsNull() {
            addCriterion("tag_address is null");
            return (Criteria) this;
        }

        public Criteria andTagAddressIsNotNull() {
            addCriterion("tag_address is not null");
            return (Criteria) this;
        }

        public Criteria andTagAddressEqualTo(String value) {
            addCriterion("tag_address =", value, "tagAddress");
            return (Criteria) this;
        }

        public Criteria andTagAddressNotEqualTo(String value) {
            addCriterion("tag_address <>", value, "tagAddress");
            return (Criteria) this;
        }

        public Criteria andTagAddressGreaterThan(String value) {
            addCriterion("tag_address >", value, "tagAddress");
            return (Criteria) this;
        }

        public Criteria andTagAddressGreaterThanOrEqualTo(String value) {
            addCriterion("tag_address >=", value, "tagAddress");
            return (Criteria) this;
        }

        public Criteria andTagAddressLessThan(String value) {
            addCriterion("tag_address <", value, "tagAddress");
            return (Criteria) this;
        }

        public Criteria andTagAddressLessThanOrEqualTo(String value) {
            addCriterion("tag_address <=", value, "tagAddress");
            return (Criteria) this;
        }

        public Criteria andTagAddressLike(String value) {
            addCriterion("tag_address like", value, "tagAddress");
            return (Criteria) this;
        }

        public Criteria andTagAddressNotLike(String value) {
            addCriterion("tag_address not like", value, "tagAddress");
            return (Criteria) this;
        }

        public Criteria andTagAddressIn(List<String> values) {
            addCriterion("tag_address in", values, "tagAddress");
            return (Criteria) this;
        }

        public Criteria andTagAddressNotIn(List<String> values) {
            addCriterion("tag_address not in", values, "tagAddress");
            return (Criteria) this;
        }

        public Criteria andTagAddressBetween(String value1, String value2) {
            addCriterion("tag_address between", value1, value2, "tagAddress");
            return (Criteria) this;
        }

        public Criteria andTagAddressNotBetween(String value1, String value2) {
            addCriterion("tag_address not between", value1, value2, "tagAddress");
            return (Criteria) this;
        }

        public Criteria andTagRulesIsNull() {
            addCriterion("tag_rules is null");
            return (Criteria) this;
        }

        public Criteria andTagRulesIsNotNull() {
            addCriterion("tag_rules is not null");
            return (Criteria) this;
        }

        public Criteria andTagRulesEqualTo(String value) {
            addCriterion("tag_rules =", value, "tagRules");
            return (Criteria) this;
        }

        public Criteria andTagRulesNotEqualTo(String value) {
            addCriterion("tag_rules <>", value, "tagRules");
            return (Criteria) this;
        }

        public Criteria andTagRulesGreaterThan(String value) {
            addCriterion("tag_rules >", value, "tagRules");
            return (Criteria) this;
        }

        public Criteria andTagRulesGreaterThanOrEqualTo(String value) {
            addCriterion("tag_rules >=", value, "tagRules");
            return (Criteria) this;
        }

        public Criteria andTagRulesLessThan(String value) {
            addCriterion("tag_rules <", value, "tagRules");
            return (Criteria) this;
        }

        public Criteria andTagRulesLessThanOrEqualTo(String value) {
            addCriterion("tag_rules <=", value, "tagRules");
            return (Criteria) this;
        }

        public Criteria andTagRulesLike(String value) {
            addCriterion("tag_rules like", value, "tagRules");
            return (Criteria) this;
        }

        public Criteria andTagRulesNotLike(String value) {
            addCriterion("tag_rules not like", value, "tagRules");
            return (Criteria) this;
        }

        public Criteria andTagRulesIn(List<String> values) {
            addCriterion("tag_rules in", values, "tagRules");
            return (Criteria) this;
        }

        public Criteria andTagRulesNotIn(List<String> values) {
            addCriterion("tag_rules not in", values, "tagRules");
            return (Criteria) this;
        }

        public Criteria andTagRulesBetween(String value1, String value2) {
            addCriterion("tag_rules between", value1, value2, "tagRules");
            return (Criteria) this;
        }

        public Criteria andTagRulesNotBetween(String value1, String value2) {
            addCriterion("tag_rules not between", value1, value2, "tagRules");
            return (Criteria) this;
        }

        public Criteria andTagLngIsNull() {
            addCriterion("tag_lng is null");
            return (Criteria) this;
        }

        public Criteria andTagLngIsNotNull() {
            addCriterion("tag_lng is not null");
            return (Criteria) this;
        }

        public Criteria andTagLngEqualTo(BigDecimal value) {
            addCriterion("tag_lng =", value, "tagLng");
            return (Criteria) this;
        }

        public Criteria andTagLngNotEqualTo(BigDecimal value) {
            addCriterion("tag_lng <>", value, "tagLng");
            return (Criteria) this;
        }

        public Criteria andTagLngGreaterThan(BigDecimal value) {
            addCriterion("tag_lng >", value, "tagLng");
            return (Criteria) this;
        }

        public Criteria andTagLngGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tag_lng >=", value, "tagLng");
            return (Criteria) this;
        }

        public Criteria andTagLngLessThan(BigDecimal value) {
            addCriterion("tag_lng <", value, "tagLng");
            return (Criteria) this;
        }

        public Criteria andTagLngLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tag_lng <=", value, "tagLng");
            return (Criteria) this;
        }

        public Criteria andTagLngIn(List<BigDecimal> values) {
            addCriterion("tag_lng in", values, "tagLng");
            return (Criteria) this;
        }

        public Criteria andTagLngNotIn(List<BigDecimal> values) {
            addCriterion("tag_lng not in", values, "tagLng");
            return (Criteria) this;
        }

        public Criteria andTagLngBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tag_lng between", value1, value2, "tagLng");
            return (Criteria) this;
        }

        public Criteria andTagLngNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tag_lng not between", value1, value2, "tagLng");
            return (Criteria) this;
        }

        public Criteria andTagLatIsNull() {
            addCriterion("tag_lat is null");
            return (Criteria) this;
        }

        public Criteria andTagLatIsNotNull() {
            addCriterion("tag_lat is not null");
            return (Criteria) this;
        }

        public Criteria andTagLatEqualTo(BigDecimal value) {
            addCriterion("tag_lat =", value, "tagLat");
            return (Criteria) this;
        }

        public Criteria andTagLatNotEqualTo(BigDecimal value) {
            addCriterion("tag_lat <>", value, "tagLat");
            return (Criteria) this;
        }

        public Criteria andTagLatGreaterThan(BigDecimal value) {
            addCriterion("tag_lat >", value, "tagLat");
            return (Criteria) this;
        }

        public Criteria andTagLatGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tag_lat >=", value, "tagLat");
            return (Criteria) this;
        }

        public Criteria andTagLatLessThan(BigDecimal value) {
            addCriterion("tag_lat <", value, "tagLat");
            return (Criteria) this;
        }

        public Criteria andTagLatLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tag_lat <=", value, "tagLat");
            return (Criteria) this;
        }

        public Criteria andTagLatIn(List<BigDecimal> values) {
            addCriterion("tag_lat in", values, "tagLat");
            return (Criteria) this;
        }

        public Criteria andTagLatNotIn(List<BigDecimal> values) {
            addCriterion("tag_lat not in", values, "tagLat");
            return (Criteria) this;
        }

        public Criteria andTagLatBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tag_lat between", value1, value2, "tagLat");
            return (Criteria) this;
        }

        public Criteria andTagLatNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tag_lat not between", value1, value2, "tagLat");
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