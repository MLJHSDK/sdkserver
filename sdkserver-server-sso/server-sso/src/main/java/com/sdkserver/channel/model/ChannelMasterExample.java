package com.sdkserver.channel.model;

import java.util.ArrayList;
import java.util.List;

public class ChannelMasterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChannelMasterExample() {
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

        public Criteria andMasterIdIsNull() {
            addCriterion("master_id is null");
            return (Criteria) this;
        }

        public Criteria andMasterIdIsNotNull() {
            addCriterion("master_id is not null");
            return (Criteria) this;
        }

        public Criteria andMasterIdEqualTo(Integer value) {
            addCriterion("master_id =", value, "masterId");
            return (Criteria) this;
        }

        public Criteria andMasterIdNotEqualTo(Integer value) {
            addCriterion("master_id <>", value, "masterId");
            return (Criteria) this;
        }

        public Criteria andMasterIdGreaterThan(Integer value) {
            addCriterion("master_id >", value, "masterId");
            return (Criteria) this;
        }

        public Criteria andMasterIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("master_id >=", value, "masterId");
            return (Criteria) this;
        }

        public Criteria andMasterIdLessThan(Integer value) {
            addCriterion("master_id <", value, "masterId");
            return (Criteria) this;
        }

        public Criteria andMasterIdLessThanOrEqualTo(Integer value) {
            addCriterion("master_id <=", value, "masterId");
            return (Criteria) this;
        }

        public Criteria andMasterIdIn(List<Integer> values) {
            addCriterion("master_id in", values, "masterId");
            return (Criteria) this;
        }

        public Criteria andMasterIdNotIn(List<Integer> values) {
            addCriterion("master_id not in", values, "masterId");
            return (Criteria) this;
        }

        public Criteria andMasterIdBetween(Integer value1, Integer value2) {
            addCriterion("master_id between", value1, value2, "masterId");
            return (Criteria) this;
        }

        public Criteria andMasterIdNotBetween(Integer value1, Integer value2) {
            addCriterion("master_id not between", value1, value2, "masterId");
            return (Criteria) this;
        }

        public Criteria andAuthUrlIsNull() {
            addCriterion("auth_url is null");
            return (Criteria) this;
        }

        public Criteria andAuthUrlIsNotNull() {
            addCriterion("auth_url is not null");
            return (Criteria) this;
        }

        public Criteria andAuthUrlEqualTo(String value) {
            addCriterion("auth_url =", value, "authUrl");
            return (Criteria) this;
        }

        public Criteria andAuthUrlNotEqualTo(String value) {
            addCriterion("auth_url <>", value, "authUrl");
            return (Criteria) this;
        }

        public Criteria andAuthUrlGreaterThan(String value) {
            addCriterion("auth_url >", value, "authUrl");
            return (Criteria) this;
        }

        public Criteria andAuthUrlGreaterThanOrEqualTo(String value) {
            addCriterion("auth_url >=", value, "authUrl");
            return (Criteria) this;
        }

        public Criteria andAuthUrlLessThan(String value) {
            addCriterion("auth_url <", value, "authUrl");
            return (Criteria) this;
        }

        public Criteria andAuthUrlLessThanOrEqualTo(String value) {
            addCriterion("auth_url <=", value, "authUrl");
            return (Criteria) this;
        }

        public Criteria andAuthUrlLike(String value) {
            addCriterion("auth_url like", value, "authUrl");
            return (Criteria) this;
        }

        public Criteria andAuthUrlNotLike(String value) {
            addCriterion("auth_url not like", value, "authUrl");
            return (Criteria) this;
        }

        public Criteria andAuthUrlIn(List<String> values) {
            addCriterion("auth_url in", values, "authUrl");
            return (Criteria) this;
        }

        public Criteria andAuthUrlNotIn(List<String> values) {
            addCriterion("auth_url not in", values, "authUrl");
            return (Criteria) this;
        }

        public Criteria andAuthUrlBetween(String value1, String value2) {
            addCriterion("auth_url between", value1, value2, "authUrl");
            return (Criteria) this;
        }

        public Criteria andAuthUrlNotBetween(String value1, String value2) {
            addCriterion("auth_url not between", value1, value2, "authUrl");
            return (Criteria) this;
        }

        public Criteria andMasterNameIsNull() {
            addCriterion("master_name is null");
            return (Criteria) this;
        }

        public Criteria andMasterNameIsNotNull() {
            addCriterion("master_name is not null");
            return (Criteria) this;
        }

        public Criteria andMasterNameEqualTo(String value) {
            addCriterion("master_name =", value, "masterName");
            return (Criteria) this;
        }

        public Criteria andMasterNameNotEqualTo(String value) {
            addCriterion("master_name <>", value, "masterName");
            return (Criteria) this;
        }

        public Criteria andMasterNameGreaterThan(String value) {
            addCriterion("master_name >", value, "masterName");
            return (Criteria) this;
        }

        public Criteria andMasterNameGreaterThanOrEqualTo(String value) {
            addCriterion("master_name >=", value, "masterName");
            return (Criteria) this;
        }

        public Criteria andMasterNameLessThan(String value) {
            addCriterion("master_name <", value, "masterName");
            return (Criteria) this;
        }

        public Criteria andMasterNameLessThanOrEqualTo(String value) {
            addCriterion("master_name <=", value, "masterName");
            return (Criteria) this;
        }

        public Criteria andMasterNameLike(String value) {
            addCriterion("master_name like", value, "masterName");
            return (Criteria) this;
        }

        public Criteria andMasterNameNotLike(String value) {
            addCriterion("master_name not like", value, "masterName");
            return (Criteria) this;
        }

        public Criteria andMasterNameIn(List<String> values) {
            addCriterion("master_name in", values, "masterName");
            return (Criteria) this;
        }

        public Criteria andMasterNameNotIn(List<String> values) {
            addCriterion("master_name not in", values, "masterName");
            return (Criteria) this;
        }

        public Criteria andMasterNameBetween(String value1, String value2) {
            addCriterion("master_name between", value1, value2, "masterName");
            return (Criteria) this;
        }

        public Criteria andMasterNameNotBetween(String value1, String value2) {
            addCriterion("master_name not between", value1, value2, "masterName");
            return (Criteria) this;
        }

        public Criteria andSdkNameIsNull() {
            addCriterion("sdk_name is null");
            return (Criteria) this;
        }

        public Criteria andSdkNameIsNotNull() {
            addCriterion("sdk_name is not null");
            return (Criteria) this;
        }

        public Criteria andSdkNameEqualTo(String value) {
            addCriterion("sdk_name =", value, "sdkName");
            return (Criteria) this;
        }

        public Criteria andSdkNameNotEqualTo(String value) {
            addCriterion("sdk_name <>", value, "sdkName");
            return (Criteria) this;
        }

        public Criteria andSdkNameGreaterThan(String value) {
            addCriterion("sdk_name >", value, "sdkName");
            return (Criteria) this;
        }

        public Criteria andSdkNameGreaterThanOrEqualTo(String value) {
            addCriterion("sdk_name >=", value, "sdkName");
            return (Criteria) this;
        }

        public Criteria andSdkNameLessThan(String value) {
            addCriterion("sdk_name <", value, "sdkName");
            return (Criteria) this;
        }

        public Criteria andSdkNameLessThanOrEqualTo(String value) {
            addCriterion("sdk_name <=", value, "sdkName");
            return (Criteria) this;
        }

        public Criteria andSdkNameLike(String value) {
            addCriterion("sdk_name like", value, "sdkName");
            return (Criteria) this;
        }

        public Criteria andSdkNameNotLike(String value) {
            addCriterion("sdk_name not like", value, "sdkName");
            return (Criteria) this;
        }

        public Criteria andSdkNameIn(List<String> values) {
            addCriterion("sdk_name in", values, "sdkName");
            return (Criteria) this;
        }

        public Criteria andSdkNameNotIn(List<String> values) {
            addCriterion("sdk_name not in", values, "sdkName");
            return (Criteria) this;
        }

        public Criteria andSdkNameBetween(String value1, String value2) {
            addCriterion("sdk_name between", value1, value2, "sdkName");
            return (Criteria) this;
        }

        public Criteria andSdkNameNotBetween(String value1, String value2) {
            addCriterion("sdk_name not between", value1, value2, "sdkName");
            return (Criteria) this;
        }

        public Criteria andNameSuffixIsNull() {
            addCriterion("name_suffix is null");
            return (Criteria) this;
        }

        public Criteria andNameSuffixIsNotNull() {
            addCriterion("name_suffix is not null");
            return (Criteria) this;
        }

        public Criteria andNameSuffixEqualTo(String value) {
            addCriterion("name_suffix =", value, "nameSuffix");
            return (Criteria) this;
        }

        public Criteria andNameSuffixNotEqualTo(String value) {
            addCriterion("name_suffix <>", value, "nameSuffix");
            return (Criteria) this;
        }

        public Criteria andNameSuffixGreaterThan(String value) {
            addCriterion("name_suffix >", value, "nameSuffix");
            return (Criteria) this;
        }

        public Criteria andNameSuffixGreaterThanOrEqualTo(String value) {
            addCriterion("name_suffix >=", value, "nameSuffix");
            return (Criteria) this;
        }

        public Criteria andNameSuffixLessThan(String value) {
            addCriterion("name_suffix <", value, "nameSuffix");
            return (Criteria) this;
        }

        public Criteria andNameSuffixLessThanOrEqualTo(String value) {
            addCriterion("name_suffix <=", value, "nameSuffix");
            return (Criteria) this;
        }

        public Criteria andNameSuffixLike(String value) {
            addCriterion("name_suffix like", value, "nameSuffix");
            return (Criteria) this;
        }

        public Criteria andNameSuffixNotLike(String value) {
            addCriterion("name_suffix not like", value, "nameSuffix");
            return (Criteria) this;
        }

        public Criteria andNameSuffixIn(List<String> values) {
            addCriterion("name_suffix in", values, "nameSuffix");
            return (Criteria) this;
        }

        public Criteria andNameSuffixNotIn(List<String> values) {
            addCriterion("name_suffix not in", values, "nameSuffix");
            return (Criteria) this;
        }

        public Criteria andNameSuffixBetween(String value1, String value2) {
            addCriterion("name_suffix between", value1, value2, "nameSuffix");
            return (Criteria) this;
        }

        public Criteria andNameSuffixNotBetween(String value1, String value2) {
            addCriterion("name_suffix not between", value1, value2, "nameSuffix");
            return (Criteria) this;
        }

        public Criteria andPayCallbackUrlIsNull() {
            addCriterion("pay_callback_url is null");
            return (Criteria) this;
        }

        public Criteria andPayCallbackUrlIsNotNull() {
            addCriterion("pay_callback_url is not null");
            return (Criteria) this;
        }

        public Criteria andPayCallbackUrlEqualTo(String value) {
            addCriterion("pay_callback_url =", value, "payCallbackUrl");
            return (Criteria) this;
        }

        public Criteria andPayCallbackUrlNotEqualTo(String value) {
            addCriterion("pay_callback_url <>", value, "payCallbackUrl");
            return (Criteria) this;
        }

        public Criteria andPayCallbackUrlGreaterThan(String value) {
            addCriterion("pay_callback_url >", value, "payCallbackUrl");
            return (Criteria) this;
        }

        public Criteria andPayCallbackUrlGreaterThanOrEqualTo(String value) {
            addCriterion("pay_callback_url >=", value, "payCallbackUrl");
            return (Criteria) this;
        }

        public Criteria andPayCallbackUrlLessThan(String value) {
            addCriterion("pay_callback_url <", value, "payCallbackUrl");
            return (Criteria) this;
        }

        public Criteria andPayCallbackUrlLessThanOrEqualTo(String value) {
            addCriterion("pay_callback_url <=", value, "payCallbackUrl");
            return (Criteria) this;
        }

        public Criteria andPayCallbackUrlLike(String value) {
            addCriterion("pay_callback_url like", value, "payCallbackUrl");
            return (Criteria) this;
        }

        public Criteria andPayCallbackUrlNotLike(String value) {
            addCriterion("pay_callback_url not like", value, "payCallbackUrl");
            return (Criteria) this;
        }

        public Criteria andPayCallbackUrlIn(List<String> values) {
            addCriterion("pay_callback_url in", values, "payCallbackUrl");
            return (Criteria) this;
        }

        public Criteria andPayCallbackUrlNotIn(List<String> values) {
            addCriterion("pay_callback_url not in", values, "payCallbackUrl");
            return (Criteria) this;
        }

        public Criteria andPayCallbackUrlBetween(String value1, String value2) {
            addCriterion("pay_callback_url between", value1, value2, "payCallbackUrl");
            return (Criteria) this;
        }

        public Criteria andPayCallbackUrlNotBetween(String value1, String value2) {
            addCriterion("pay_callback_url not between", value1, value2, "payCallbackUrl");
            return (Criteria) this;
        }

        public Criteria andVerifyClassIsNull() {
            addCriterion("verify_class is null");
            return (Criteria) this;
        }

        public Criteria andVerifyClassIsNotNull() {
            addCriterion("verify_class is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyClassEqualTo(String value) {
            addCriterion("verify_class =", value, "verifyClass");
            return (Criteria) this;
        }

        public Criteria andVerifyClassNotEqualTo(String value) {
            addCriterion("verify_class <>", value, "verifyClass");
            return (Criteria) this;
        }

        public Criteria andVerifyClassGreaterThan(String value) {
            addCriterion("verify_class >", value, "verifyClass");
            return (Criteria) this;
        }

        public Criteria andVerifyClassGreaterThanOrEqualTo(String value) {
            addCriterion("verify_class >=", value, "verifyClass");
            return (Criteria) this;
        }

        public Criteria andVerifyClassLessThan(String value) {
            addCriterion("verify_class <", value, "verifyClass");
            return (Criteria) this;
        }

        public Criteria andVerifyClassLessThanOrEqualTo(String value) {
            addCriterion("verify_class <=", value, "verifyClass");
            return (Criteria) this;
        }

        public Criteria andVerifyClassLike(String value) {
            addCriterion("verify_class like", value, "verifyClass");
            return (Criteria) this;
        }

        public Criteria andVerifyClassNotLike(String value) {
            addCriterion("verify_class not like", value, "verifyClass");
            return (Criteria) this;
        }

        public Criteria andVerifyClassIn(List<String> values) {
            addCriterion("verify_class in", values, "verifyClass");
            return (Criteria) this;
        }

        public Criteria andVerifyClassNotIn(List<String> values) {
            addCriterion("verify_class not in", values, "verifyClass");
            return (Criteria) this;
        }

        public Criteria andVerifyClassBetween(String value1, String value2) {
            addCriterion("verify_class between", value1, value2, "verifyClass");
            return (Criteria) this;
        }

        public Criteria andVerifyClassNotBetween(String value1, String value2) {
            addCriterion("verify_class not between", value1, value2, "verifyClass");
            return (Criteria) this;
        }

        public Criteria andOrderUrlIsNull() {
            addCriterion("order_url is null");
            return (Criteria) this;
        }

        public Criteria andOrderUrlIsNotNull() {
            addCriterion("order_url is not null");
            return (Criteria) this;
        }

        public Criteria andOrderUrlEqualTo(String value) {
            addCriterion("order_url =", value, "orderUrl");
            return (Criteria) this;
        }

        public Criteria andOrderUrlNotEqualTo(String value) {
            addCriterion("order_url <>", value, "orderUrl");
            return (Criteria) this;
        }

        public Criteria andOrderUrlGreaterThan(String value) {
            addCriterion("order_url >", value, "orderUrl");
            return (Criteria) this;
        }

        public Criteria andOrderUrlGreaterThanOrEqualTo(String value) {
            addCriterion("order_url >=", value, "orderUrl");
            return (Criteria) this;
        }

        public Criteria andOrderUrlLessThan(String value) {
            addCriterion("order_url <", value, "orderUrl");
            return (Criteria) this;
        }

        public Criteria andOrderUrlLessThanOrEqualTo(String value) {
            addCriterion("order_url <=", value, "orderUrl");
            return (Criteria) this;
        }

        public Criteria andOrderUrlLike(String value) {
            addCriterion("order_url like", value, "orderUrl");
            return (Criteria) this;
        }

        public Criteria andOrderUrlNotLike(String value) {
            addCriterion("order_url not like", value, "orderUrl");
            return (Criteria) this;
        }

        public Criteria andOrderUrlIn(List<String> values) {
            addCriterion("order_url in", values, "orderUrl");
            return (Criteria) this;
        }

        public Criteria andOrderUrlNotIn(List<String> values) {
            addCriterion("order_url not in", values, "orderUrl");
            return (Criteria) this;
        }

        public Criteria andOrderUrlBetween(String value1, String value2) {
            addCriterion("order_url between", value1, value2, "orderUrl");
            return (Criteria) this;
        }

        public Criteria andOrderUrlNotBetween(String value1, String value2) {
            addCriterion("order_url not between", value1, value2, "orderUrl");
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