package com.sdkserver.sso.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GameExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GameExample() {
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

        public Criteria andAppIdIsNull() {
            addCriterion("app_id is null");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNotNull() {
            addCriterion("app_id is not null");
            return (Criteria) this;
        }

        public Criteria andAppIdEqualTo(Integer value) {
            addCriterion("app_id =", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotEqualTo(Integer value) {
            addCriterion("app_id <>", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThan(Integer value) {
            addCriterion("app_id >", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("app_id >=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThan(Integer value) {
            addCriterion("app_id <", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThanOrEqualTo(Integer value) {
            addCriterion("app_id <=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdIn(List<Integer> values) {
            addCriterion("app_id in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotIn(List<Integer> values) {
            addCriterion("app_id not in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdBetween(Integer value1, Integer value2) {
            addCriterion("app_id between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotBetween(Integer value1, Integer value2) {
            addCriterion("app_id not between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andPayCallbackIsNull() {
            addCriterion("pay_callback is null");
            return (Criteria) this;
        }

        public Criteria andPayCallbackIsNotNull() {
            addCriterion("pay_callback is not null");
            return (Criteria) this;
        }

        public Criteria andPayCallbackEqualTo(String value) {
            addCriterion("pay_callback =", value, "payCallback");
            return (Criteria) this;
        }

        public Criteria andPayCallbackNotEqualTo(String value) {
            addCriterion("pay_callback <>", value, "payCallback");
            return (Criteria) this;
        }

        public Criteria andPayCallbackGreaterThan(String value) {
            addCriterion("pay_callback >", value, "payCallback");
            return (Criteria) this;
        }

        public Criteria andPayCallbackGreaterThanOrEqualTo(String value) {
            addCriterion("pay_callback >=", value, "payCallback");
            return (Criteria) this;
        }

        public Criteria andPayCallbackLessThan(String value) {
            addCriterion("pay_callback <", value, "payCallback");
            return (Criteria) this;
        }

        public Criteria andPayCallbackLessThanOrEqualTo(String value) {
            addCriterion("pay_callback <=", value, "payCallback");
            return (Criteria) this;
        }

        public Criteria andPayCallbackLike(String value) {
            addCriterion("pay_callback like", value, "payCallback");
            return (Criteria) this;
        }

        public Criteria andPayCallbackNotLike(String value) {
            addCriterion("pay_callback not like", value, "payCallback");
            return (Criteria) this;
        }

        public Criteria andPayCallbackIn(List<String> values) {
            addCriterion("pay_callback in", values, "payCallback");
            return (Criteria) this;
        }

        public Criteria andPayCallbackNotIn(List<String> values) {
            addCriterion("pay_callback not in", values, "payCallback");
            return (Criteria) this;
        }

        public Criteria andPayCallbackBetween(String value1, String value2) {
            addCriterion("pay_callback between", value1, value2, "payCallback");
            return (Criteria) this;
        }

        public Criteria andPayCallbackNotBetween(String value1, String value2) {
            addCriterion("pay_callback not between", value1, value2, "payCallback");
            return (Criteria) this;
        }

        public Criteria andAppKeyIsNull() {
            addCriterion("app_key is null");
            return (Criteria) this;
        }

        public Criteria andAppKeyIsNotNull() {
            addCriterion("app_key is not null");
            return (Criteria) this;
        }

        public Criteria andAppKeyEqualTo(String value) {
            addCriterion("app_key =", value, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyNotEqualTo(String value) {
            addCriterion("app_key <>", value, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyGreaterThan(String value) {
            addCriterion("app_key >", value, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyGreaterThanOrEqualTo(String value) {
            addCriterion("app_key >=", value, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyLessThan(String value) {
            addCriterion("app_key <", value, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyLessThanOrEqualTo(String value) {
            addCriterion("app_key <=", value, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyLike(String value) {
            addCriterion("app_key like", value, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyNotLike(String value) {
            addCriterion("app_key not like", value, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyIn(List<String> values) {
            addCriterion("app_key in", values, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyNotIn(List<String> values) {
            addCriterion("app_key not in", values, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyBetween(String value1, String value2) {
            addCriterion("app_key between", value1, value2, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyNotBetween(String value1, String value2) {
            addCriterion("app_key not between", value1, value2, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppSecretIsNull() {
            addCriterion("app_secret is null");
            return (Criteria) this;
        }

        public Criteria andAppSecretIsNotNull() {
            addCriterion("app_secret is not null");
            return (Criteria) this;
        }

        public Criteria andAppSecretEqualTo(String value) {
            addCriterion("app_secret =", value, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretNotEqualTo(String value) {
            addCriterion("app_secret <>", value, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretGreaterThan(String value) {
            addCriterion("app_secret >", value, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretGreaterThanOrEqualTo(String value) {
            addCriterion("app_secret >=", value, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretLessThan(String value) {
            addCriterion("app_secret <", value, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretLessThanOrEqualTo(String value) {
            addCriterion("app_secret <=", value, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretLike(String value) {
            addCriterion("app_secret like", value, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretNotLike(String value) {
            addCriterion("app_secret not like", value, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretIn(List<String> values) {
            addCriterion("app_secret in", values, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretNotIn(List<String> values) {
            addCriterion("app_secret not in", values, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretBetween(String value1, String value2) {
            addCriterion("app_secret between", value1, value2, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretNotBetween(String value1, String value2) {
            addCriterion("app_secret not between", value1, value2, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppRsaPubkeyIsNull() {
            addCriterion("app_rsa_pubkey is null");
            return (Criteria) this;
        }

        public Criteria andAppRsaPubkeyIsNotNull() {
            addCriterion("app_rsa_pubkey is not null");
            return (Criteria) this;
        }

        public Criteria andAppRsaPubkeyEqualTo(String value) {
            addCriterion("app_rsa_pubkey =", value, "appRsaPubkey");
            return (Criteria) this;
        }

        public Criteria andAppRsaPubkeyNotEqualTo(String value) {
            addCriterion("app_rsa_pubkey <>", value, "appRsaPubkey");
            return (Criteria) this;
        }

        public Criteria andAppRsaPubkeyGreaterThan(String value) {
            addCriterion("app_rsa_pubkey >", value, "appRsaPubkey");
            return (Criteria) this;
        }

        public Criteria andAppRsaPubkeyGreaterThanOrEqualTo(String value) {
            addCriterion("app_rsa_pubkey >=", value, "appRsaPubkey");
            return (Criteria) this;
        }

        public Criteria andAppRsaPubkeyLessThan(String value) {
            addCriterion("app_rsa_pubkey <", value, "appRsaPubkey");
            return (Criteria) this;
        }

        public Criteria andAppRsaPubkeyLessThanOrEqualTo(String value) {
            addCriterion("app_rsa_pubkey <=", value, "appRsaPubkey");
            return (Criteria) this;
        }

        public Criteria andAppRsaPubkeyLike(String value) {
            addCriterion("app_rsa_pubkey like", value, "appRsaPubkey");
            return (Criteria) this;
        }

        public Criteria andAppRsaPubkeyNotLike(String value) {
            addCriterion("app_rsa_pubkey not like", value, "appRsaPubkey");
            return (Criteria) this;
        }

        public Criteria andAppRsaPubkeyIn(List<String> values) {
            addCriterion("app_rsa_pubkey in", values, "appRsaPubkey");
            return (Criteria) this;
        }

        public Criteria andAppRsaPubkeyNotIn(List<String> values) {
            addCriterion("app_rsa_pubkey not in", values, "appRsaPubkey");
            return (Criteria) this;
        }

        public Criteria andAppRsaPubkeyBetween(String value1, String value2) {
            addCriterion("app_rsa_pubkey between", value1, value2, "appRsaPubkey");
            return (Criteria) this;
        }

        public Criteria andAppRsaPubkeyNotBetween(String value1, String value2) {
            addCriterion("app_rsa_pubkey not between", value1, value2, "appRsaPubkey");
            return (Criteria) this;
        }

        public Criteria andAppRsaPrikeyIsNull() {
            addCriterion("app_rsa_prikey is null");
            return (Criteria) this;
        }

        public Criteria andAppRsaPrikeyIsNotNull() {
            addCriterion("app_rsa_prikey is not null");
            return (Criteria) this;
        }

        public Criteria andAppRsaPrikeyEqualTo(String value) {
            addCriterion("app_rsa_prikey =", value, "appRsaPrikey");
            return (Criteria) this;
        }

        public Criteria andAppRsaPrikeyNotEqualTo(String value) {
            addCriterion("app_rsa_prikey <>", value, "appRsaPrikey");
            return (Criteria) this;
        }

        public Criteria andAppRsaPrikeyGreaterThan(String value) {
            addCriterion("app_rsa_prikey >", value, "appRsaPrikey");
            return (Criteria) this;
        }

        public Criteria andAppRsaPrikeyGreaterThanOrEqualTo(String value) {
            addCriterion("app_rsa_prikey >=", value, "appRsaPrikey");
            return (Criteria) this;
        }

        public Criteria andAppRsaPrikeyLessThan(String value) {
            addCriterion("app_rsa_prikey <", value, "appRsaPrikey");
            return (Criteria) this;
        }

        public Criteria andAppRsaPrikeyLessThanOrEqualTo(String value) {
            addCriterion("app_rsa_prikey <=", value, "appRsaPrikey");
            return (Criteria) this;
        }

        public Criteria andAppRsaPrikeyLike(String value) {
            addCriterion("app_rsa_prikey like", value, "appRsaPrikey");
            return (Criteria) this;
        }

        public Criteria andAppRsaPrikeyNotLike(String value) {
            addCriterion("app_rsa_prikey not like", value, "appRsaPrikey");
            return (Criteria) this;
        }

        public Criteria andAppRsaPrikeyIn(List<String> values) {
            addCriterion("app_rsa_prikey in", values, "appRsaPrikey");
            return (Criteria) this;
        }

        public Criteria andAppRsaPrikeyNotIn(List<String> values) {
            addCriterion("app_rsa_prikey not in", values, "appRsaPrikey");
            return (Criteria) this;
        }

        public Criteria andAppRsaPrikeyBetween(String value1, String value2) {
            addCriterion("app_rsa_prikey between", value1, value2, "appRsaPrikey");
            return (Criteria) this;
        }

        public Criteria andAppRsaPrikeyNotBetween(String value1, String value2) {
            addCriterion("app_rsa_prikey not between", value1, value2, "appRsaPrikey");
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

        public Criteria andPayCallbackDebugIsNull() {
            addCriterion("pay_callback_debug is null");
            return (Criteria) this;
        }

        public Criteria andPayCallbackDebugIsNotNull() {
            addCriterion("pay_callback_debug is not null");
            return (Criteria) this;
        }

        public Criteria andPayCallbackDebugEqualTo(String value) {
            addCriterion("pay_callback_debug =", value, "payCallbackDebug");
            return (Criteria) this;
        }

        public Criteria andPayCallbackDebugNotEqualTo(String value) {
            addCriterion("pay_callback_debug <>", value, "payCallbackDebug");
            return (Criteria) this;
        }

        public Criteria andPayCallbackDebugGreaterThan(String value) {
            addCriterion("pay_callback_debug >", value, "payCallbackDebug");
            return (Criteria) this;
        }

        public Criteria andPayCallbackDebugGreaterThanOrEqualTo(String value) {
            addCriterion("pay_callback_debug >=", value, "payCallbackDebug");
            return (Criteria) this;
        }

        public Criteria andPayCallbackDebugLessThan(String value) {
            addCriterion("pay_callback_debug <", value, "payCallbackDebug");
            return (Criteria) this;
        }

        public Criteria andPayCallbackDebugLessThanOrEqualTo(String value) {
            addCriterion("pay_callback_debug <=", value, "payCallbackDebug");
            return (Criteria) this;
        }

        public Criteria andPayCallbackDebugLike(String value) {
            addCriterion("pay_callback_debug like", value, "payCallbackDebug");
            return (Criteria) this;
        }

        public Criteria andPayCallbackDebugNotLike(String value) {
            addCriterion("pay_callback_debug not like", value, "payCallbackDebug");
            return (Criteria) this;
        }

        public Criteria andPayCallbackDebugIn(List<String> values) {
            addCriterion("pay_callback_debug in", values, "payCallbackDebug");
            return (Criteria) this;
        }

        public Criteria andPayCallbackDebugNotIn(List<String> values) {
            addCriterion("pay_callback_debug not in", values, "payCallbackDebug");
            return (Criteria) this;
        }

        public Criteria andPayCallbackDebugBetween(String value1, String value2) {
            addCriterion("pay_callback_debug between", value1, value2, "payCallbackDebug");
            return (Criteria) this;
        }

        public Criteria andPayCallbackDebugNotBetween(String value1, String value2) {
            addCriterion("pay_callback_debug not between", value1, value2, "payCallbackDebug");
            return (Criteria) this;
        }

        public Criteria andMsdkPayCallbackIsNull() {
            addCriterion("msdk_pay_callback is null");
            return (Criteria) this;
        }

        public Criteria andMsdkPayCallbackIsNotNull() {
            addCriterion("msdk_pay_callback is not null");
            return (Criteria) this;
        }

        public Criteria andMsdkPayCallbackEqualTo(String value) {
            addCriterion("msdk_pay_callback =", value, "msdkPayCallback");
            return (Criteria) this;
        }

        public Criteria andMsdkPayCallbackNotEqualTo(String value) {
            addCriterion("msdk_pay_callback <>", value, "msdkPayCallback");
            return (Criteria) this;
        }

        public Criteria andMsdkPayCallbackGreaterThan(String value) {
            addCriterion("msdk_pay_callback >", value, "msdkPayCallback");
            return (Criteria) this;
        }

        public Criteria andMsdkPayCallbackGreaterThanOrEqualTo(String value) {
            addCriterion("msdk_pay_callback >=", value, "msdkPayCallback");
            return (Criteria) this;
        }

        public Criteria andMsdkPayCallbackLessThan(String value) {
            addCriterion("msdk_pay_callback <", value, "msdkPayCallback");
            return (Criteria) this;
        }

        public Criteria andMsdkPayCallbackLessThanOrEqualTo(String value) {
            addCriterion("msdk_pay_callback <=", value, "msdkPayCallback");
            return (Criteria) this;
        }

        public Criteria andMsdkPayCallbackLike(String value) {
            addCriterion("msdk_pay_callback like", value, "msdkPayCallback");
            return (Criteria) this;
        }

        public Criteria andMsdkPayCallbackNotLike(String value) {
            addCriterion("msdk_pay_callback not like", value, "msdkPayCallback");
            return (Criteria) this;
        }

        public Criteria andMsdkPayCallbackIn(List<String> values) {
            addCriterion("msdk_pay_callback in", values, "msdkPayCallback");
            return (Criteria) this;
        }

        public Criteria andMsdkPayCallbackNotIn(List<String> values) {
            addCriterion("msdk_pay_callback not in", values, "msdkPayCallback");
            return (Criteria) this;
        }

        public Criteria andMsdkPayCallbackBetween(String value1, String value2) {
            addCriterion("msdk_pay_callback between", value1, value2, "msdkPayCallback");
            return (Criteria) this;
        }

        public Criteria andMsdkPayCallbackNotBetween(String value1, String value2) {
            addCriterion("msdk_pay_callback not between", value1, value2, "msdkPayCallback");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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