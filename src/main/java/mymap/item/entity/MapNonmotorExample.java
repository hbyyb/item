package mymap.item.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MapNonmotorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MapNonmotorExample() {
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

        public Criteria andNonmotorIdIsNull() {
            addCriterion("nonmotor_id is null");
            return (Criteria) this;
        }

        public Criteria andNonmotorIdIsNotNull() {
            addCriterion("nonmotor_id is not null");
            return (Criteria) this;
        }

        public Criteria andNonmotorIdEqualTo(Long value) {
            addCriterion("nonmotor_id =", value, "nonmotorId");
            return (Criteria) this;
        }

        public Criteria andNonmotorIdNotEqualTo(Long value) {
            addCriterion("nonmotor_id <>", value, "nonmotorId");
            return (Criteria) this;
        }

        public Criteria andNonmotorIdGreaterThan(Long value) {
            addCriterion("nonmotor_id >", value, "nonmotorId");
            return (Criteria) this;
        }

        public Criteria andNonmotorIdGreaterThanOrEqualTo(Long value) {
            addCriterion("nonmotor_id >=", value, "nonmotorId");
            return (Criteria) this;
        }

        public Criteria andNonmotorIdLessThan(Long value) {
            addCriterion("nonmotor_id <", value, "nonmotorId");
            return (Criteria) this;
        }

        public Criteria andNonmotorIdLessThanOrEqualTo(Long value) {
            addCriterion("nonmotor_id <=", value, "nonmotorId");
            return (Criteria) this;
        }

        public Criteria andNonmotorIdIn(List<Long> values) {
            addCriterion("nonmotor_id in", values, "nonmotorId");
            return (Criteria) this;
        }

        public Criteria andNonmotorIdNotIn(List<Long> values) {
            addCriterion("nonmotor_id not in", values, "nonmotorId");
            return (Criteria) this;
        }

        public Criteria andNonmotorIdBetween(Long value1, Long value2) {
            addCriterion("nonmotor_id between", value1, value2, "nonmotorId");
            return (Criteria) this;
        }

        public Criteria andNonmotorIdNotBetween(Long value1, Long value2) {
            addCriterion("nonmotor_id not between", value1, value2, "nonmotorId");
            return (Criteria) this;
        }

        public Criteria andNonmotorNameIsNull() {
            addCriterion("nonmotor_name is null");
            return (Criteria) this;
        }

        public Criteria andNonmotorNameIsNotNull() {
            addCriterion("nonmotor_name is not null");
            return (Criteria) this;
        }

        public Criteria andNonmotorNameEqualTo(String value) {
            addCriterion("nonmotor_name =", value, "nonmotorName");
            return (Criteria) this;
        }

        public Criteria andNonmotorNameNotEqualTo(String value) {
            addCriterion("nonmotor_name <>", value, "nonmotorName");
            return (Criteria) this;
        }

        public Criteria andNonmotorNameGreaterThan(String value) {
            addCriterion("nonmotor_name >", value, "nonmotorName");
            return (Criteria) this;
        }

        public Criteria andNonmotorNameGreaterThanOrEqualTo(String value) {
            addCriterion("nonmotor_name >=", value, "nonmotorName");
            return (Criteria) this;
        }

        public Criteria andNonmotorNameLessThan(String value) {
            addCriterion("nonmotor_name <", value, "nonmotorName");
            return (Criteria) this;
        }

        public Criteria andNonmotorNameLessThanOrEqualTo(String value) {
            addCriterion("nonmotor_name <=", value, "nonmotorName");
            return (Criteria) this;
        }

        public Criteria andNonmotorNameLike(String value) {
            addCriterion("nonmotor_name like", value, "nonmotorName");
            return (Criteria) this;
        }

        public Criteria andNonmotorNameNotLike(String value) {
            addCriterion("nonmotor_name not like", value, "nonmotorName");
            return (Criteria) this;
        }

        public Criteria andNonmotorNameIn(List<String> values) {
            addCriterion("nonmotor_name in", values, "nonmotorName");
            return (Criteria) this;
        }

        public Criteria andNonmotorNameNotIn(List<String> values) {
            addCriterion("nonmotor_name not in", values, "nonmotorName");
            return (Criteria) this;
        }

        public Criteria andNonmotorNameBetween(String value1, String value2) {
            addCriterion("nonmotor_name between", value1, value2, "nonmotorName");
            return (Criteria) this;
        }

        public Criteria andNonmotorNameNotBetween(String value1, String value2) {
            addCriterion("nonmotor_name not between", value1, value2, "nonmotorName");
            return (Criteria) this;
        }

        public Criteria andNonmotorAddressIsNull() {
            addCriterion("nonmotor_address is null");
            return (Criteria) this;
        }

        public Criteria andNonmotorAddressIsNotNull() {
            addCriterion("nonmotor_address is not null");
            return (Criteria) this;
        }

        public Criteria andNonmotorAddressEqualTo(String value) {
            addCriterion("nonmotor_address =", value, "nonmotorAddress");
            return (Criteria) this;
        }

        public Criteria andNonmotorAddressNotEqualTo(String value) {
            addCriterion("nonmotor_address <>", value, "nonmotorAddress");
            return (Criteria) this;
        }

        public Criteria andNonmotorAddressGreaterThan(String value) {
            addCriterion("nonmotor_address >", value, "nonmotorAddress");
            return (Criteria) this;
        }

        public Criteria andNonmotorAddressGreaterThanOrEqualTo(String value) {
            addCriterion("nonmotor_address >=", value, "nonmotorAddress");
            return (Criteria) this;
        }

        public Criteria andNonmotorAddressLessThan(String value) {
            addCriterion("nonmotor_address <", value, "nonmotorAddress");
            return (Criteria) this;
        }

        public Criteria andNonmotorAddressLessThanOrEqualTo(String value) {
            addCriterion("nonmotor_address <=", value, "nonmotorAddress");
            return (Criteria) this;
        }

        public Criteria andNonmotorAddressLike(String value) {
            addCriterion("nonmotor_address like", value, "nonmotorAddress");
            return (Criteria) this;
        }

        public Criteria andNonmotorAddressNotLike(String value) {
            addCriterion("nonmotor_address not like", value, "nonmotorAddress");
            return (Criteria) this;
        }

        public Criteria andNonmotorAddressIn(List<String> values) {
            addCriterion("nonmotor_address in", values, "nonmotorAddress");
            return (Criteria) this;
        }

        public Criteria andNonmotorAddressNotIn(List<String> values) {
            addCriterion("nonmotor_address not in", values, "nonmotorAddress");
            return (Criteria) this;
        }

        public Criteria andNonmotorAddressBetween(String value1, String value2) {
            addCriterion("nonmotor_address between", value1, value2, "nonmotorAddress");
            return (Criteria) this;
        }

        public Criteria andNonmotorAddressNotBetween(String value1, String value2) {
            addCriterion("nonmotor_address not between", value1, value2, "nonmotorAddress");
            return (Criteria) this;
        }

        public Criteria andNonmotorAreaIsNull() {
            addCriterion("nonmotor_area is null");
            return (Criteria) this;
        }

        public Criteria andNonmotorAreaIsNotNull() {
            addCriterion("nonmotor_area is not null");
            return (Criteria) this;
        }

        public Criteria andNonmotorAreaEqualTo(Integer value) {
            addCriterion("nonmotor_area =", value, "nonmotorArea");
            return (Criteria) this;
        }

        public Criteria andNonmotorAreaNotEqualTo(Integer value) {
            addCriterion("nonmotor_area <>", value, "nonmotorArea");
            return (Criteria) this;
        }

        public Criteria andNonmotorAreaGreaterThan(Integer value) {
            addCriterion("nonmotor_area >", value, "nonmotorArea");
            return (Criteria) this;
        }

        public Criteria andNonmotorAreaGreaterThanOrEqualTo(Integer value) {
            addCriterion("nonmotor_area >=", value, "nonmotorArea");
            return (Criteria) this;
        }

        public Criteria andNonmotorAreaLessThan(Integer value) {
            addCriterion("nonmotor_area <", value, "nonmotorArea");
            return (Criteria) this;
        }

        public Criteria andNonmotorAreaLessThanOrEqualTo(Integer value) {
            addCriterion("nonmotor_area <=", value, "nonmotorArea");
            return (Criteria) this;
        }

        public Criteria andNonmotorAreaIn(List<Integer> values) {
            addCriterion("nonmotor_area in", values, "nonmotorArea");
            return (Criteria) this;
        }

        public Criteria andNonmotorAreaNotIn(List<Integer> values) {
            addCriterion("nonmotor_area not in", values, "nonmotorArea");
            return (Criteria) this;
        }

        public Criteria andNonmotorAreaBetween(Integer value1, Integer value2) {
            addCriterion("nonmotor_area between", value1, value2, "nonmotorArea");
            return (Criteria) this;
        }

        public Criteria andNonmotorAreaNotBetween(Integer value1, Integer value2) {
            addCriterion("nonmotor_area not between", value1, value2, "nonmotorArea");
            return (Criteria) this;
        }

        public Criteria andNonmotorLaborCompanyIsNull() {
            addCriterion("nonmotor_labor_company is null");
            return (Criteria) this;
        }

        public Criteria andNonmotorLaborCompanyIsNotNull() {
            addCriterion("nonmotor_labor_company is not null");
            return (Criteria) this;
        }

        public Criteria andNonmotorLaborCompanyEqualTo(String value) {
            addCriterion("nonmotor_labor_company =", value, "nonmotorLaborCompany");
            return (Criteria) this;
        }

        public Criteria andNonmotorLaborCompanyNotEqualTo(String value) {
            addCriterion("nonmotor_labor_company <>", value, "nonmotorLaborCompany");
            return (Criteria) this;
        }

        public Criteria andNonmotorLaborCompanyGreaterThan(String value) {
            addCriterion("nonmotor_labor_company >", value, "nonmotorLaborCompany");
            return (Criteria) this;
        }

        public Criteria andNonmotorLaborCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("nonmotor_labor_company >=", value, "nonmotorLaborCompany");
            return (Criteria) this;
        }

        public Criteria andNonmotorLaborCompanyLessThan(String value) {
            addCriterion("nonmotor_labor_company <", value, "nonmotorLaborCompany");
            return (Criteria) this;
        }

        public Criteria andNonmotorLaborCompanyLessThanOrEqualTo(String value) {
            addCriterion("nonmotor_labor_company <=", value, "nonmotorLaborCompany");
            return (Criteria) this;
        }

        public Criteria andNonmotorLaborCompanyLike(String value) {
            addCriterion("nonmotor_labor_company like", value, "nonmotorLaborCompany");
            return (Criteria) this;
        }

        public Criteria andNonmotorLaborCompanyNotLike(String value) {
            addCriterion("nonmotor_labor_company not like", value, "nonmotorLaborCompany");
            return (Criteria) this;
        }

        public Criteria andNonmotorLaborCompanyIn(List<String> values) {
            addCriterion("nonmotor_labor_company in", values, "nonmotorLaborCompany");
            return (Criteria) this;
        }

        public Criteria andNonmotorLaborCompanyNotIn(List<String> values) {
            addCriterion("nonmotor_labor_company not in", values, "nonmotorLaborCompany");
            return (Criteria) this;
        }

        public Criteria andNonmotorLaborCompanyBetween(String value1, String value2) {
            addCriterion("nonmotor_labor_company between", value1, value2, "nonmotorLaborCompany");
            return (Criteria) this;
        }

        public Criteria andNonmotorLaborCompanyNotBetween(String value1, String value2) {
            addCriterion("nonmotor_labor_company not between", value1, value2, "nonmotorLaborCompany");
            return (Criteria) this;
        }

        public Criteria andNonmotorLngIsNull() {
            addCriterion("nonmotor_lng is null");
            return (Criteria) this;
        }

        public Criteria andNonmotorLngIsNotNull() {
            addCriterion("nonmotor_lng is not null");
            return (Criteria) this;
        }

        public Criteria andNonmotorLngEqualTo(BigDecimal value) {
            addCriterion("nonmotor_lng =", value, "nonmotorLng");
            return (Criteria) this;
        }

        public Criteria andNonmotorLngNotEqualTo(BigDecimal value) {
            addCriterion("nonmotor_lng <>", value, "nonmotorLng");
            return (Criteria) this;
        }

        public Criteria andNonmotorLngGreaterThan(BigDecimal value) {
            addCriterion("nonmotor_lng >", value, "nonmotorLng");
            return (Criteria) this;
        }

        public Criteria andNonmotorLngGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("nonmotor_lng >=", value, "nonmotorLng");
            return (Criteria) this;
        }

        public Criteria andNonmotorLngLessThan(BigDecimal value) {
            addCriterion("nonmotor_lng <", value, "nonmotorLng");
            return (Criteria) this;
        }

        public Criteria andNonmotorLngLessThanOrEqualTo(BigDecimal value) {
            addCriterion("nonmotor_lng <=", value, "nonmotorLng");
            return (Criteria) this;
        }

        public Criteria andNonmotorLngIn(List<BigDecimal> values) {
            addCriterion("nonmotor_lng in", values, "nonmotorLng");
            return (Criteria) this;
        }

        public Criteria andNonmotorLngNotIn(List<BigDecimal> values) {
            addCriterion("nonmotor_lng not in", values, "nonmotorLng");
            return (Criteria) this;
        }

        public Criteria andNonmotorLngBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nonmotor_lng between", value1, value2, "nonmotorLng");
            return (Criteria) this;
        }

        public Criteria andNonmotorLngNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nonmotor_lng not between", value1, value2, "nonmotorLng");
            return (Criteria) this;
        }

        public Criteria andNonmotorLatIsNull() {
            addCriterion("nonmotor_lat is null");
            return (Criteria) this;
        }

        public Criteria andNonmotorLatIsNotNull() {
            addCriterion("nonmotor_lat is not null");
            return (Criteria) this;
        }

        public Criteria andNonmotorLatEqualTo(BigDecimal value) {
            addCriterion("nonmotor_lat =", value, "nonmotorLat");
            return (Criteria) this;
        }

        public Criteria andNonmotorLatNotEqualTo(BigDecimal value) {
            addCriterion("nonmotor_lat <>", value, "nonmotorLat");
            return (Criteria) this;
        }

        public Criteria andNonmotorLatGreaterThan(BigDecimal value) {
            addCriterion("nonmotor_lat >", value, "nonmotorLat");
            return (Criteria) this;
        }

        public Criteria andNonmotorLatGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("nonmotor_lat >=", value, "nonmotorLat");
            return (Criteria) this;
        }

        public Criteria andNonmotorLatLessThan(BigDecimal value) {
            addCriterion("nonmotor_lat <", value, "nonmotorLat");
            return (Criteria) this;
        }

        public Criteria andNonmotorLatLessThanOrEqualTo(BigDecimal value) {
            addCriterion("nonmotor_lat <=", value, "nonmotorLat");
            return (Criteria) this;
        }

        public Criteria andNonmotorLatIn(List<BigDecimal> values) {
            addCriterion("nonmotor_lat in", values, "nonmotorLat");
            return (Criteria) this;
        }

        public Criteria andNonmotorLatNotIn(List<BigDecimal> values) {
            addCriterion("nonmotor_lat not in", values, "nonmotorLat");
            return (Criteria) this;
        }

        public Criteria andNonmotorLatBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nonmotor_lat between", value1, value2, "nonmotorLat");
            return (Criteria) this;
        }

        public Criteria andNonmotorLatNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nonmotor_lat not between", value1, value2, "nonmotorLat");
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