package com.sdkserver.channel.model;

import java.util.ArrayList;
import java.util.List;

public class ChannelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChannelExample() {
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

        public Criteria andChannelIdIsNull() {
            addCriterion("channel_id is null");
            return (Criteria) this;
        }

        public Criteria andChannelIdIsNotNull() {
            addCriterion("channel_id is not null");
            return (Criteria) this;
        }

        public Criteria andChannelIdEqualTo(Integer value) {
            addCriterion("channel_id =", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotEqualTo(Integer value) {
            addCriterion("channel_id <>", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdGreaterThan(Integer value) {
            addCriterion("channel_id >", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("channel_id >=", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLessThan(Integer value) {
            addCriterion("channel_id <", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLessThanOrEqualTo(Integer value) {
            addCriterion("channel_id <=", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdIn(List<Integer> values) {
            addCriterion("channel_id in", values, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotIn(List<Integer> values) {
            addCriterion("channel_id not in", values, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdBetween(Integer value1, Integer value2) {
            addCriterion("channel_id between", value1, value2, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("channel_id not between", value1, value2, "channelId");
            return (Criteria) this;
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

        public Criteria andCpAppIdIsNull() {
            addCriterion("cp_app_id is null");
            return (Criteria) this;
        }

        public Criteria andCpAppIdIsNotNull() {
            addCriterion("cp_app_id is not null");
            return (Criteria) this;
        }

        public Criteria andCpAppIdEqualTo(String value) {
            addCriterion("cp_app_id =", value, "cpAppId");
            return (Criteria) this;
        }

        public Criteria andCpAppIdNotEqualTo(String value) {
            addCriterion("cp_app_id <>", value, "cpAppId");
            return (Criteria) this;
        }

        public Criteria andCpAppIdGreaterThan(String value) {
            addCriterion("cp_app_id >", value, "cpAppId");
            return (Criteria) this;
        }

        public Criteria andCpAppIdGreaterThanOrEqualTo(String value) {
            addCriterion("cp_app_id >=", value, "cpAppId");
            return (Criteria) this;
        }

        public Criteria andCpAppIdLessThan(String value) {
            addCriterion("cp_app_id <", value, "cpAppId");
            return (Criteria) this;
        }

        public Criteria andCpAppIdLessThanOrEqualTo(String value) {
            addCriterion("cp_app_id <=", value, "cpAppId");
            return (Criteria) this;
        }

        public Criteria andCpAppIdLike(String value) {
            addCriterion("cp_app_id like", value, "cpAppId");
            return (Criteria) this;
        }

        public Criteria andCpAppIdNotLike(String value) {
            addCriterion("cp_app_id not like", value, "cpAppId");
            return (Criteria) this;
        }

        public Criteria andCpAppIdIn(List<String> values) {
            addCriterion("cp_app_id in", values, "cpAppId");
            return (Criteria) this;
        }

        public Criteria andCpAppIdNotIn(List<String> values) {
            addCriterion("cp_app_id not in", values, "cpAppId");
            return (Criteria) this;
        }

        public Criteria andCpAppIdBetween(String value1, String value2) {
            addCriterion("cp_app_id between", value1, value2, "cpAppId");
            return (Criteria) this;
        }

        public Criteria andCpAppIdNotBetween(String value1, String value2) {
            addCriterion("cp_app_id not between", value1, value2, "cpAppId");
            return (Criteria) this;
        }

        public Criteria andCpAppKeyIsNull() {
            addCriterion("cp_app_key is null");
            return (Criteria) this;
        }

        public Criteria andCpAppKeyIsNotNull() {
            addCriterion("cp_app_key is not null");
            return (Criteria) this;
        }

        public Criteria andCpAppKeyEqualTo(String value) {
            addCriterion("cp_app_key =", value, "cpAppKey");
            return (Criteria) this;
        }

        public Criteria andCpAppKeyNotEqualTo(String value) {
            addCriterion("cp_app_key <>", value, "cpAppKey");
            return (Criteria) this;
        }

        public Criteria andCpAppKeyGreaterThan(String value) {
            addCriterion("cp_app_key >", value, "cpAppKey");
            return (Criteria) this;
        }

        public Criteria andCpAppKeyGreaterThanOrEqualTo(String value) {
            addCriterion("cp_app_key >=", value, "cpAppKey");
            return (Criteria) this;
        }

        public Criteria andCpAppKeyLessThan(String value) {
            addCriterion("cp_app_key <", value, "cpAppKey");
            return (Criteria) this;
        }

        public Criteria andCpAppKeyLessThanOrEqualTo(String value) {
            addCriterion("cp_app_key <=", value, "cpAppKey");
            return (Criteria) this;
        }

        public Criteria andCpAppKeyLike(String value) {
            addCriterion("cp_app_key like", value, "cpAppKey");
            return (Criteria) this;
        }

        public Criteria andCpAppKeyNotLike(String value) {
            addCriterion("cp_app_key not like", value, "cpAppKey");
            return (Criteria) this;
        }

        public Criteria andCpAppKeyIn(List<String> values) {
            addCriterion("cp_app_key in", values, "cpAppKey");
            return (Criteria) this;
        }

        public Criteria andCpAppKeyNotIn(List<String> values) {
            addCriterion("cp_app_key not in", values, "cpAppKey");
            return (Criteria) this;
        }

        public Criteria andCpAppKeyBetween(String value1, String value2) {
            addCriterion("cp_app_key between", value1, value2, "cpAppKey");
            return (Criteria) this;
        }

        public Criteria andCpAppKeyNotBetween(String value1, String value2) {
            addCriterion("cp_app_key not between", value1, value2, "cpAppKey");
            return (Criteria) this;
        }

        public Criteria andCpAppSecretIsNull() {
            addCriterion("cp_app_secret is null");
            return (Criteria) this;
        }

        public Criteria andCpAppSecretIsNotNull() {
            addCriterion("cp_app_secret is not null");
            return (Criteria) this;
        }

        public Criteria andCpAppSecretEqualTo(String value) {
            addCriterion("cp_app_secret =", value, "cpAppSecret");
            return (Criteria) this;
        }

        public Criteria andCpAppSecretNotEqualTo(String value) {
            addCriterion("cp_app_secret <>", value, "cpAppSecret");
            return (Criteria) this;
        }

        public Criteria andCpAppSecretGreaterThan(String value) {
            addCriterion("cp_app_secret >", value, "cpAppSecret");
            return (Criteria) this;
        }

        public Criteria andCpAppSecretGreaterThanOrEqualTo(String value) {
            addCriterion("cp_app_secret >=", value, "cpAppSecret");
            return (Criteria) this;
        }

        public Criteria andCpAppSecretLessThan(String value) {
            addCriterion("cp_app_secret <", value, "cpAppSecret");
            return (Criteria) this;
        }

        public Criteria andCpAppSecretLessThanOrEqualTo(String value) {
            addCriterion("cp_app_secret <=", value, "cpAppSecret");
            return (Criteria) this;
        }

        public Criteria andCpAppSecretLike(String value) {
            addCriterion("cp_app_secret like", value, "cpAppSecret");
            return (Criteria) this;
        }

        public Criteria andCpAppSecretNotLike(String value) {
            addCriterion("cp_app_secret not like", value, "cpAppSecret");
            return (Criteria) this;
        }

        public Criteria andCpAppSecretIn(List<String> values) {
            addCriterion("cp_app_secret in", values, "cpAppSecret");
            return (Criteria) this;
        }

        public Criteria andCpAppSecretNotIn(List<String> values) {
            addCriterion("cp_app_secret not in", values, "cpAppSecret");
            return (Criteria) this;
        }

        public Criteria andCpAppSecretBetween(String value1, String value2) {
            addCriterion("cp_app_secret between", value1, value2, "cpAppSecret");
            return (Criteria) this;
        }

        public Criteria andCpAppSecretNotBetween(String value1, String value2) {
            addCriterion("cp_app_secret not between", value1, value2, "cpAppSecret");
            return (Criteria) this;
        }

        public Criteria andCpIdIsNull() {
            addCriterion("cp_id is null");
            return (Criteria) this;
        }

        public Criteria andCpIdIsNotNull() {
            addCriterion("cp_id is not null");
            return (Criteria) this;
        }

        public Criteria andCpIdEqualTo(String value) {
            addCriterion("cp_id =", value, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdNotEqualTo(String value) {
            addCriterion("cp_id <>", value, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdGreaterThan(String value) {
            addCriterion("cp_id >", value, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdGreaterThanOrEqualTo(String value) {
            addCriterion("cp_id >=", value, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdLessThan(String value) {
            addCriterion("cp_id <", value, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdLessThanOrEqualTo(String value) {
            addCriterion("cp_id <=", value, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdLike(String value) {
            addCriterion("cp_id like", value, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdNotLike(String value) {
            addCriterion("cp_id not like", value, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdIn(List<String> values) {
            addCriterion("cp_id in", values, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdNotIn(List<String> values) {
            addCriterion("cp_id not in", values, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdBetween(String value1, String value2) {
            addCriterion("cp_id between", value1, value2, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdNotBetween(String value1, String value2) {
            addCriterion("cp_id not between", value1, value2, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpPayIdIsNull() {
            addCriterion("cp_pay_id is null");
            return (Criteria) this;
        }

        public Criteria andCpPayIdIsNotNull() {
            addCriterion("cp_pay_id is not null");
            return (Criteria) this;
        }

        public Criteria andCpPayIdEqualTo(String value) {
            addCriterion("cp_pay_id =", value, "cpPayId");
            return (Criteria) this;
        }

        public Criteria andCpPayIdNotEqualTo(String value) {
            addCriterion("cp_pay_id <>", value, "cpPayId");
            return (Criteria) this;
        }

        public Criteria andCpPayIdGreaterThan(String value) {
            addCriterion("cp_pay_id >", value, "cpPayId");
            return (Criteria) this;
        }

        public Criteria andCpPayIdGreaterThanOrEqualTo(String value) {
            addCriterion("cp_pay_id >=", value, "cpPayId");
            return (Criteria) this;
        }

        public Criteria andCpPayIdLessThan(String value) {
            addCriterion("cp_pay_id <", value, "cpPayId");
            return (Criteria) this;
        }

        public Criteria andCpPayIdLessThanOrEqualTo(String value) {
            addCriterion("cp_pay_id <=", value, "cpPayId");
            return (Criteria) this;
        }

        public Criteria andCpPayIdLike(String value) {
            addCriterion("cp_pay_id like", value, "cpPayId");
            return (Criteria) this;
        }

        public Criteria andCpPayIdNotLike(String value) {
            addCriterion("cp_pay_id not like", value, "cpPayId");
            return (Criteria) this;
        }

        public Criteria andCpPayIdIn(List<String> values) {
            addCriterion("cp_pay_id in", values, "cpPayId");
            return (Criteria) this;
        }

        public Criteria andCpPayIdNotIn(List<String> values) {
            addCriterion("cp_pay_id not in", values, "cpPayId");
            return (Criteria) this;
        }

        public Criteria andCpPayIdBetween(String value1, String value2) {
            addCriterion("cp_pay_id between", value1, value2, "cpPayId");
            return (Criteria) this;
        }

        public Criteria andCpPayIdNotBetween(String value1, String value2) {
            addCriterion("cp_pay_id not between", value1, value2, "cpPayId");
            return (Criteria) this;
        }

        public Criteria andCpPayKeyIsNull() {
            addCriterion("cp_pay_key is null");
            return (Criteria) this;
        }

        public Criteria andCpPayKeyIsNotNull() {
            addCriterion("cp_pay_key is not null");
            return (Criteria) this;
        }

        public Criteria andCpPayKeyEqualTo(String value) {
            addCriterion("cp_pay_key =", value, "cpPayKey");
            return (Criteria) this;
        }

        public Criteria andCpPayKeyNotEqualTo(String value) {
            addCriterion("cp_pay_key <>", value, "cpPayKey");
            return (Criteria) this;
        }

        public Criteria andCpPayKeyGreaterThan(String value) {
            addCriterion("cp_pay_key >", value, "cpPayKey");
            return (Criteria) this;
        }

        public Criteria andCpPayKeyGreaterThanOrEqualTo(String value) {
            addCriterion("cp_pay_key >=", value, "cpPayKey");
            return (Criteria) this;
        }

        public Criteria andCpPayKeyLessThan(String value) {
            addCriterion("cp_pay_key <", value, "cpPayKey");
            return (Criteria) this;
        }

        public Criteria andCpPayKeyLessThanOrEqualTo(String value) {
            addCriterion("cp_pay_key <=", value, "cpPayKey");
            return (Criteria) this;
        }

        public Criteria andCpPayKeyLike(String value) {
            addCriterion("cp_pay_key like", value, "cpPayKey");
            return (Criteria) this;
        }

        public Criteria andCpPayKeyNotLike(String value) {
            addCriterion("cp_pay_key not like", value, "cpPayKey");
            return (Criteria) this;
        }

        public Criteria andCpPayKeyIn(List<String> values) {
            addCriterion("cp_pay_key in", values, "cpPayKey");
            return (Criteria) this;
        }

        public Criteria andCpPayKeyNotIn(List<String> values) {
            addCriterion("cp_pay_key not in", values, "cpPayKey");
            return (Criteria) this;
        }

        public Criteria andCpPayKeyBetween(String value1, String value2) {
            addCriterion("cp_pay_key between", value1, value2, "cpPayKey");
            return (Criteria) this;
        }

        public Criteria andCpPayKeyNotBetween(String value1, String value2) {
            addCriterion("cp_pay_key not between", value1, value2, "cpPayKey");
            return (Criteria) this;
        }

        public Criteria andCpPayPriKeyIsNull() {
            addCriterion("cp_pay_pri_key is null");
            return (Criteria) this;
        }

        public Criteria andCpPayPriKeyIsNotNull() {
            addCriterion("cp_pay_pri_key is not null");
            return (Criteria) this;
        }

        public Criteria andCpPayPriKeyEqualTo(String value) {
            addCriterion("cp_pay_pri_key =", value, "cpPayPriKey");
            return (Criteria) this;
        }

        public Criteria andCpPayPriKeyNotEqualTo(String value) {
            addCriterion("cp_pay_pri_key <>", value, "cpPayPriKey");
            return (Criteria) this;
        }

        public Criteria andCpPayPriKeyGreaterThan(String value) {
            addCriterion("cp_pay_pri_key >", value, "cpPayPriKey");
            return (Criteria) this;
        }

        public Criteria andCpPayPriKeyGreaterThanOrEqualTo(String value) {
            addCriterion("cp_pay_pri_key >=", value, "cpPayPriKey");
            return (Criteria) this;
        }

        public Criteria andCpPayPriKeyLessThan(String value) {
            addCriterion("cp_pay_pri_key <", value, "cpPayPriKey");
            return (Criteria) this;
        }

        public Criteria andCpPayPriKeyLessThanOrEqualTo(String value) {
            addCriterion("cp_pay_pri_key <=", value, "cpPayPriKey");
            return (Criteria) this;
        }

        public Criteria andCpPayPriKeyLike(String value) {
            addCriterion("cp_pay_pri_key like", value, "cpPayPriKey");
            return (Criteria) this;
        }

        public Criteria andCpPayPriKeyNotLike(String value) {
            addCriterion("cp_pay_pri_key not like", value, "cpPayPriKey");
            return (Criteria) this;
        }

        public Criteria andCpPayPriKeyIn(List<String> values) {
            addCriterion("cp_pay_pri_key in", values, "cpPayPriKey");
            return (Criteria) this;
        }

        public Criteria andCpPayPriKeyNotIn(List<String> values) {
            addCriterion("cp_pay_pri_key not in", values, "cpPayPriKey");
            return (Criteria) this;
        }

        public Criteria andCpPayPriKeyBetween(String value1, String value2) {
            addCriterion("cp_pay_pri_key between", value1, value2, "cpPayPriKey");
            return (Criteria) this;
        }

        public Criteria andCpPayPriKeyNotBetween(String value1, String value2) {
            addCriterion("cp_pay_pri_key not between", value1, value2, "cpPayPriKey");
            return (Criteria) this;
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

        public Criteria andCpConfigIsNull() {
            addCriterion("cp_config is null");
            return (Criteria) this;
        }

        public Criteria andCpConfigIsNotNull() {
            addCriterion("cp_config is not null");
            return (Criteria) this;
        }

        public Criteria andCpConfigEqualTo(String value) {
            addCriterion("cp_config =", value, "cpConfig");
            return (Criteria) this;
        }

        public Criteria andCpConfigNotEqualTo(String value) {
            addCriterion("cp_config <>", value, "cpConfig");
            return (Criteria) this;
        }

        public Criteria andCpConfigGreaterThan(String value) {
            addCriterion("cp_config >", value, "cpConfig");
            return (Criteria) this;
        }

        public Criteria andCpConfigGreaterThanOrEqualTo(String value) {
            addCriterion("cp_config >=", value, "cpConfig");
            return (Criteria) this;
        }

        public Criteria andCpConfigLessThan(String value) {
            addCriterion("cp_config <", value, "cpConfig");
            return (Criteria) this;
        }

        public Criteria andCpConfigLessThanOrEqualTo(String value) {
            addCriterion("cp_config <=", value, "cpConfig");
            return (Criteria) this;
        }

        public Criteria andCpConfigLike(String value) {
            addCriterion("cp_config like", value, "cpConfig");
            return (Criteria) this;
        }

        public Criteria andCpConfigNotLike(String value) {
            addCriterion("cp_config not like", value, "cpConfig");
            return (Criteria) this;
        }

        public Criteria andCpConfigIn(List<String> values) {
            addCriterion("cp_config in", values, "cpConfig");
            return (Criteria) this;
        }

        public Criteria andCpConfigNotIn(List<String> values) {
            addCriterion("cp_config not in", values, "cpConfig");
            return (Criteria) this;
        }

        public Criteria andCpConfigBetween(String value1, String value2) {
            addCriterion("cp_config between", value1, value2, "cpConfig");
            return (Criteria) this;
        }

        public Criteria andCpConfigNotBetween(String value1, String value2) {
            addCriterion("cp_config not between", value1, value2, "cpConfig");
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

        public Criteria andOpenPayFlagIsNull() {
            addCriterion("open_pay_flag is null");
            return (Criteria) this;
        }

        public Criteria andOpenPayFlagIsNotNull() {
            addCriterion("open_pay_flag is not null");
            return (Criteria) this;
        }

        public Criteria andOpenPayFlagEqualTo(Integer value) {
            addCriterion("open_pay_flag =", value, "openPayFlag");
            return (Criteria) this;
        }

        public Criteria andOpenPayFlagNotEqualTo(Integer value) {
            addCriterion("open_pay_flag <>", value, "openPayFlag");
            return (Criteria) this;
        }

        public Criteria andOpenPayFlagGreaterThan(Integer value) {
            addCriterion("open_pay_flag >", value, "openPayFlag");
            return (Criteria) this;
        }

        public Criteria andOpenPayFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("open_pay_flag >=", value, "openPayFlag");
            return (Criteria) this;
        }

        public Criteria andOpenPayFlagLessThan(Integer value) {
            addCriterion("open_pay_flag <", value, "openPayFlag");
            return (Criteria) this;
        }

        public Criteria andOpenPayFlagLessThanOrEqualTo(Integer value) {
            addCriterion("open_pay_flag <=", value, "openPayFlag");
            return (Criteria) this;
        }

        public Criteria andOpenPayFlagIn(List<Integer> values) {
            addCriterion("open_pay_flag in", values, "openPayFlag");
            return (Criteria) this;
        }

        public Criteria andOpenPayFlagNotIn(List<Integer> values) {
            addCriterion("open_pay_flag not in", values, "openPayFlag");
            return (Criteria) this;
        }

        public Criteria andOpenPayFlagBetween(Integer value1, Integer value2) {
            addCriterion("open_pay_flag between", value1, value2, "openPayFlag");
            return (Criteria) this;
        }

        public Criteria andOpenPayFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("open_pay_flag not between", value1, value2, "openPayFlag");
            return (Criteria) this;
        }

        public Criteria andOpenOwnPayChannelIsNull() {
            addCriterion("open_own_pay_channel is null");
            return (Criteria) this;
        }

        public Criteria andOpenOwnPayChannelIsNotNull() {
            addCriterion("open_own_pay_channel is not null");
            return (Criteria) this;
        }

        public Criteria andOpenOwnPayChannelEqualTo(Integer value) {
            addCriterion("open_own_pay_channel =", value, "openOwnPayChannel");
            return (Criteria) this;
        }

        public Criteria andOpenOwnPayChannelNotEqualTo(Integer value) {
            addCriterion("open_own_pay_channel <>", value, "openOwnPayChannel");
            return (Criteria) this;
        }

        public Criteria andOpenOwnPayChannelGreaterThan(Integer value) {
            addCriterion("open_own_pay_channel >", value, "openOwnPayChannel");
            return (Criteria) this;
        }

        public Criteria andOpenOwnPayChannelGreaterThanOrEqualTo(Integer value) {
            addCriterion("open_own_pay_channel >=", value, "openOwnPayChannel");
            return (Criteria) this;
        }

        public Criteria andOpenOwnPayChannelLessThan(Integer value) {
            addCriterion("open_own_pay_channel <", value, "openOwnPayChannel");
            return (Criteria) this;
        }

        public Criteria andOpenOwnPayChannelLessThanOrEqualTo(Integer value) {
            addCriterion("open_own_pay_channel <=", value, "openOwnPayChannel");
            return (Criteria) this;
        }

        public Criteria andOpenOwnPayChannelIn(List<Integer> values) {
            addCriterion("open_own_pay_channel in", values, "openOwnPayChannel");
            return (Criteria) this;
        }

        public Criteria andOpenOwnPayChannelNotIn(List<Integer> values) {
            addCriterion("open_own_pay_channel not in", values, "openOwnPayChannel");
            return (Criteria) this;
        }

        public Criteria andOpenOwnPayChannelBetween(Integer value1, Integer value2) {
            addCriterion("open_own_pay_channel between", value1, value2, "openOwnPayChannel");
            return (Criteria) this;
        }

        public Criteria andOpenOwnPayChannelNotBetween(Integer value1, Integer value2) {
            addCriterion("open_own_pay_channel not between", value1, value2, "openOwnPayChannel");
            return (Criteria) this;
        }

        public Criteria andPlatIdIsNull() {
            addCriterion("plat_id is null");
            return (Criteria) this;
        }

        public Criteria andPlatIdIsNotNull() {
            addCriterion("plat_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlatIdEqualTo(Integer value) {
            addCriterion("plat_id =", value, "platId");
            return (Criteria) this;
        }

        public Criteria andPlatIdNotEqualTo(Integer value) {
            addCriterion("plat_id <>", value, "platId");
            return (Criteria) this;
        }

        public Criteria andPlatIdGreaterThan(Integer value) {
            addCriterion("plat_id >", value, "platId");
            return (Criteria) this;
        }

        public Criteria andPlatIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("plat_id >=", value, "platId");
            return (Criteria) this;
        }

        public Criteria andPlatIdLessThan(Integer value) {
            addCriterion("plat_id <", value, "platId");
            return (Criteria) this;
        }

        public Criteria andPlatIdLessThanOrEqualTo(Integer value) {
            addCriterion("plat_id <=", value, "platId");
            return (Criteria) this;
        }

        public Criteria andPlatIdIn(List<Integer> values) {
            addCriterion("plat_id in", values, "platId");
            return (Criteria) this;
        }

        public Criteria andPlatIdNotIn(List<Integer> values) {
            addCriterion("plat_id not in", values, "platId");
            return (Criteria) this;
        }

        public Criteria andPlatIdBetween(Integer value1, Integer value2) {
            addCriterion("plat_id between", value1, value2, "platId");
            return (Criteria) this;
        }

        public Criteria andPlatIdNotBetween(Integer value1, Integer value2) {
            addCriterion("plat_id not between", value1, value2, "platId");
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