package mymap.item.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MapPublicpakExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MapPublicpakExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andPublicparkIdIsNull() {
            addCriterion("publicpark_id is null");
            return (Criteria) this;
        }

        public Criteria andPublicparkIdIsNotNull() {
            addCriterion("publicpark_id is not null");
            return (Criteria) this;
        }

        public Criteria andPublicparkIdEqualTo(Long value) {
            addCriterion("publicpark_id =", value, "publicparkId");
            return (Criteria) this;
        }

        public Criteria andPublicparkIdNotEqualTo(Long value) {
            addCriterion("publicpark_id <>", value, "publicparkId");
            return (Criteria) this;
        }

        public Criteria andPublicparkIdGreaterThan(Long value) {
            addCriterion("publicpark_id >", value, "publicparkId");
            return (Criteria) this;
        }

        public Criteria andPublicparkIdGreaterThanOrEqualTo(Long value) {
            addCriterion("publicpark_id >=", value, "publicparkId");
            return (Criteria) this;
        }

        public Criteria andPublicparkIdLessThan(Long value) {
            addCriterion("publicpark_id <", value, "publicparkId");
            return (Criteria) this;
        }

        public Criteria andPublicparkIdLessThanOrEqualTo(Long value) {
            addCriterion("publicpark_id <=", value, "publicparkId");
            return (Criteria) this;
        }

        public Criteria andPublicparkIdIn(List<Long> values) {
            addCriterion("publicpark_id in", values, "publicparkId");
            return (Criteria) this;
        }

        public Criteria andPublicparkIdNotIn(List<Long> values) {
            addCriterion("publicpark_id not in", values, "publicparkId");
            return (Criteria) this;
        }

        public Criteria andPublicparkIdBetween(Long value1, Long value2) {
            addCriterion("publicpark_id between", value1, value2, "publicparkId");
            return (Criteria) this;
        }

        public Criteria andPublicparkIdNotBetween(Long value1, Long value2) {
            addCriterion("publicpark_id not between", value1, value2, "publicparkId");
            return (Criteria) this;
        }

        public Criteria andPublicparkNameIsNull() {
            addCriterion("publicpark_name is null");
            return (Criteria) this;
        }

        public Criteria andPublicparkNameIsNotNull() {
            addCriterion("publicpark_name is not null");
            return (Criteria) this;
        }

        public Criteria andPublicparkNameEqualTo(String value) {
            addCriterion("publicpark_name =", value, "publicparkName");
            return (Criteria) this;
        }

        public Criteria andPublicparkNameNotEqualTo(String value) {
            addCriterion("publicpark_name <>", value, "publicparkName");
            return (Criteria) this;
        }

        public Criteria andPublicparkNameGreaterThan(String value) {
            addCriterion("publicpark_name >", value, "publicparkName");
            return (Criteria) this;
        }

        public Criteria andPublicparkNameGreaterThanOrEqualTo(String value) {
            addCriterion("publicpark_name >=", value, "publicparkName");
            return (Criteria) this;
        }

        public Criteria andPublicparkNameLessThan(String value) {
            addCriterion("publicpark_name <", value, "publicparkName");
            return (Criteria) this;
        }

        public Criteria andPublicparkNameLessThanOrEqualTo(String value) {
            addCriterion("publicpark_name <=", value, "publicparkName");
            return (Criteria) this;
        }

        public Criteria andPublicparkNameLike(String value) {
            addCriterion("publicpark_name like", value, "publicparkName");
            return (Criteria) this;
        }

        public Criteria andPublicparkNameNotLike(String value) {
            addCriterion("publicpark_name not like", value, "publicparkName");
            return (Criteria) this;
        }

        public Criteria andPublicparkNameIn(List<String> values) {
            addCriterion("publicpark_name in", values, "publicparkName");
            return (Criteria) this;
        }

        public Criteria andPublicparkNameNotIn(List<String> values) {
            addCriterion("publicpark_name not in", values, "publicparkName");
            return (Criteria) this;
        }

        public Criteria andPublicparkNameBetween(String value1, String value2) {
            addCriterion("publicpark_name between", value1, value2, "publicparkName");
            return (Criteria) this;
        }

        public Criteria andPublicparkNameNotBetween(String value1, String value2) {
            addCriterion("publicpark_name not between", value1, value2, "publicparkName");
            return (Criteria) this;
        }

        public Criteria andPublicparkAddressIsNull() {
            addCriterion("publicpark_address is null");
            return (Criteria) this;
        }

        public Criteria andPublicparkAddressIsNotNull() {
            addCriterion("publicpark_address is not null");
            return (Criteria) this;
        }

        public Criteria andPublicparkAddressEqualTo(String value) {
            addCriterion("publicpark_address =", value, "publicparkAddress");
            return (Criteria) this;
        }

        public Criteria andPublicparkAddressNotEqualTo(String value) {
            addCriterion("publicpark_address <>", value, "publicparkAddress");
            return (Criteria) this;
        }

        public Criteria andPublicparkAddressGreaterThan(String value) {
            addCriterion("publicpark_address >", value, "publicparkAddress");
            return (Criteria) this;
        }

        public Criteria andPublicparkAddressGreaterThanOrEqualTo(String value) {
            addCriterion("publicpark_address >=", value, "publicparkAddress");
            return (Criteria) this;
        }

        public Criteria andPublicparkAddressLessThan(String value) {
            addCriterion("publicpark_address <", value, "publicparkAddress");
            return (Criteria) this;
        }

        public Criteria andPublicparkAddressLessThanOrEqualTo(String value) {
            addCriterion("publicpark_address <=", value, "publicparkAddress");
            return (Criteria) this;
        }

        public Criteria andPublicparkAddressLike(String value) {
            addCriterion("publicpark_address like", value, "publicparkAddress");
            return (Criteria) this;
        }

        public Criteria andPublicparkAddressNotLike(String value) {
            addCriterion("publicpark_address not like", value, "publicparkAddress");
            return (Criteria) this;
        }

        public Criteria andPublicparkAddressIn(List<String> values) {
            addCriterion("publicpark_address in", values, "publicparkAddress");
            return (Criteria) this;
        }

        public Criteria andPublicparkAddressNotIn(List<String> values) {
            addCriterion("publicpark_address not in", values, "publicparkAddress");
            return (Criteria) this;
        }

        public Criteria andPublicparkAddressBetween(String value1, String value2) {
            addCriterion("publicpark_address between", value1, value2, "publicparkAddress");
            return (Criteria) this;
        }

        public Criteria andPublicparkAddressNotBetween(String value1, String value2) {
            addCriterion("publicpark_address not between", value1, value2, "publicparkAddress");
            return (Criteria) this;
        }

        public Criteria andPublicparkAreaIsNull() {
            addCriterion("publicpark_area is null");
            return (Criteria) this;
        }

        public Criteria andPublicparkAreaIsNotNull() {
            addCriterion("publicpark_area is not null");
            return (Criteria) this;
        }

        public Criteria andPublicparkAreaEqualTo(Date value) {
            addCriterionForJDBCDate("publicpark_area =", value, "publicparkArea");
            return (Criteria) this;
        }

        public Criteria andPublicparkAreaNotEqualTo(Date value) {
            addCriterionForJDBCDate("publicpark_area <>", value, "publicparkArea");
            return (Criteria) this;
        }

        public Criteria andPublicparkAreaGreaterThan(Date value) {
            addCriterionForJDBCDate("publicpark_area >", value, "publicparkArea");
            return (Criteria) this;
        }

        public Criteria andPublicparkAreaGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("publicpark_area >=", value, "publicparkArea");
            return (Criteria) this;
        }

        public Criteria andPublicparkAreaLessThan(Date value) {
            addCriterionForJDBCDate("publicpark_area <", value, "publicparkArea");
            return (Criteria) this;
        }

        public Criteria andPublicparkAreaLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("publicpark_area <=", value, "publicparkArea");
            return (Criteria) this;
        }

        public Criteria andPublicparkAreaIn(List<Date> values) {
            addCriterionForJDBCDate("publicpark_area in", values, "publicparkArea");
            return (Criteria) this;
        }

        public Criteria andPublicparkAreaNotIn(List<Date> values) {
            addCriterionForJDBCDate("publicpark_area not in", values, "publicparkArea");
            return (Criteria) this;
        }

        public Criteria andPublicparkAreaBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("publicpark_area between", value1, value2, "publicparkArea");
            return (Criteria) this;
        }

        public Criteria andPublicparkAreaNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("publicpark_area not between", value1, value2, "publicparkArea");
            return (Criteria) this;
        }

        public Criteria andPublicparkLaborCompanyIsNull() {
            addCriterion("publicpark_labor_company is null");
            return (Criteria) this;
        }

        public Criteria andPublicparkLaborCompanyIsNotNull() {
            addCriterion("publicpark_labor_company is not null");
            return (Criteria) this;
        }

        public Criteria andPublicparkLaborCompanyEqualTo(Integer value) {
            addCriterion("publicpark_labor_company =", value, "publicparkLaborCompany");
            return (Criteria) this;
        }

        public Criteria andPublicparkLaborCompanyNotEqualTo(Integer value) {
            addCriterion("publicpark_labor_company <>", value, "publicparkLaborCompany");
            return (Criteria) this;
        }

        public Criteria andPublicparkLaborCompanyGreaterThan(Integer value) {
            addCriterion("publicpark_labor_company >", value, "publicparkLaborCompany");
            return (Criteria) this;
        }

        public Criteria andPublicparkLaborCompanyGreaterThanOrEqualTo(Integer value) {
            addCriterion("publicpark_labor_company >=", value, "publicparkLaborCompany");
            return (Criteria) this;
        }

        public Criteria andPublicparkLaborCompanyLessThan(Integer value) {
            addCriterion("publicpark_labor_company <", value, "publicparkLaborCompany");
            return (Criteria) this;
        }

        public Criteria andPublicparkLaborCompanyLessThanOrEqualTo(Integer value) {
            addCriterion("publicpark_labor_company <=", value, "publicparkLaborCompany");
            return (Criteria) this;
        }

        public Criteria andPublicparkLaborCompanyIn(List<Integer> values) {
            addCriterion("publicpark_labor_company in", values, "publicparkLaborCompany");
            return (Criteria) this;
        }

        public Criteria andPublicparkLaborCompanyNotIn(List<Integer> values) {
            addCriterion("publicpark_labor_company not in", values, "publicparkLaborCompany");
            return (Criteria) this;
        }

        public Criteria andPublicparkLaborCompanyBetween(Integer value1, Integer value2) {
            addCriterion("publicpark_labor_company between", value1, value2, "publicparkLaborCompany");
            return (Criteria) this;
        }

        public Criteria andPublicparkLaborCompanyNotBetween(Integer value1, Integer value2) {
            addCriterion("publicpark_labor_company not between", value1, value2, "publicparkLaborCompany");
            return (Criteria) this;
        }

        public Criteria andPublicparkLngIsNull() {
            addCriterion("publicpark_lng is null");
            return (Criteria) this;
        }

        public Criteria andPublicparkLngIsNotNull() {
            addCriterion("publicpark_lng is not null");
            return (Criteria) this;
        }

        public Criteria andPublicparkLngEqualTo(BigDecimal value) {
            addCriterion("publicpark_lng =", value, "publicparkLng");
            return (Criteria) this;
        }

        public Criteria andPublicparkLngNotEqualTo(BigDecimal value) {
            addCriterion("publicpark_lng <>", value, "publicparkLng");
            return (Criteria) this;
        }

        public Criteria andPublicparkLngGreaterThan(BigDecimal value) {
            addCriterion("publicpark_lng >", value, "publicparkLng");
            return (Criteria) this;
        }

        public Criteria andPublicparkLngGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("publicpark_lng >=", value, "publicparkLng");
            return (Criteria) this;
        }

        public Criteria andPublicparkLngLessThan(BigDecimal value) {
            addCriterion("publicpark_lng <", value, "publicparkLng");
            return (Criteria) this;
        }

        public Criteria andPublicparkLngLessThanOrEqualTo(BigDecimal value) {
            addCriterion("publicpark_lng <=", value, "publicparkLng");
            return (Criteria) this;
        }

        public Criteria andPublicparkLngIn(List<BigDecimal> values) {
            addCriterion("publicpark_lng in", values, "publicparkLng");
            return (Criteria) this;
        }

        public Criteria andPublicparkLngNotIn(List<BigDecimal> values) {
            addCriterion("publicpark_lng not in", values, "publicparkLng");
            return (Criteria) this;
        }

        public Criteria andPublicparkLngBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("publicpark_lng between", value1, value2, "publicparkLng");
            return (Criteria) this;
        }

        public Criteria andPublicparkLngNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("publicpark_lng not between", value1, value2, "publicparkLng");
            return (Criteria) this;
        }

        public Criteria andPublicparkLatIsNull() {
            addCriterion("publicpark_lat is null");
            return (Criteria) this;
        }

        public Criteria andPublicparkLatIsNotNull() {
            addCriterion("publicpark_lat is not null");
            return (Criteria) this;
        }

        public Criteria andPublicparkLatEqualTo(BigDecimal value) {
            addCriterion("publicpark_lat =", value, "publicparkLat");
            return (Criteria) this;
        }

        public Criteria andPublicparkLatNotEqualTo(BigDecimal value) {
            addCriterion("publicpark_lat <>", value, "publicparkLat");
            return (Criteria) this;
        }

        public Criteria andPublicparkLatGreaterThan(BigDecimal value) {
            addCriterion("publicpark_lat >", value, "publicparkLat");
            return (Criteria) this;
        }

        public Criteria andPublicparkLatGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("publicpark_lat >=", value, "publicparkLat");
            return (Criteria) this;
        }

        public Criteria andPublicparkLatLessThan(BigDecimal value) {
            addCriterion("publicpark_lat <", value, "publicparkLat");
            return (Criteria) this;
        }

        public Criteria andPublicparkLatLessThanOrEqualTo(BigDecimal value) {
            addCriterion("publicpark_lat <=", value, "publicparkLat");
            return (Criteria) this;
        }

        public Criteria andPublicparkLatIn(List<BigDecimal> values) {
            addCriterion("publicpark_lat in", values, "publicparkLat");
            return (Criteria) this;
        }

        public Criteria andPublicparkLatNotIn(List<BigDecimal> values) {
            addCriterion("publicpark_lat not in", values, "publicparkLat");
            return (Criteria) this;
        }

        public Criteria andPublicparkLatBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("publicpark_lat between", value1, value2, "publicparkLat");
            return (Criteria) this;
        }

        public Criteria andPublicparkLatNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("publicpark_lat not between", value1, value2, "publicparkLat");
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