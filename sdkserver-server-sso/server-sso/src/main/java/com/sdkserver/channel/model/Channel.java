package com.sdkserver.channel.model;

import java.io.Serializable;

public class Channel implements Serializable {
    private Integer channelId;

    private Integer appId;

    private String cpAppId;

    private String cpAppKey;

    private String cpAppSecret;

    private String cpId;

    private String cpPayId;

    private String cpPayKey;

    private String cpPayPriKey;

    private Integer masterId;

    private String cpConfig;

    private String authUrl;

    private String payCallbackUrl;

    private String orderUrl;

    private String verifyClass;

    private Integer openPayFlag;

    private Integer openOwnPayChannel;

    private Integer platId;

    private static final long serialVersionUID = 1L;

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public String getCpAppId() {
        return cpAppId;
    }

    public void setCpAppId(String cpAppId) {
        this.cpAppId = cpAppId == null ? null : cpAppId.trim();
    }

    public String getCpAppKey() {
        return cpAppKey;
    }

    public void setCpAppKey(String cpAppKey) {
        this.cpAppKey = cpAppKey == null ? null : cpAppKey.trim();
    }

    public String getCpAppSecret() {
        return cpAppSecret;
    }

    public void setCpAppSecret(String cpAppSecret) {
        this.cpAppSecret = cpAppSecret == null ? null : cpAppSecret.trim();
    }

    public String getCpId() {
        return cpId;
    }

    public void setCpId(String cpId) {
        this.cpId = cpId == null ? null : cpId.trim();
    }

    public String getCpPayId() {
        return cpPayId;
    }

    public void setCpPayId(String cpPayId) {
        this.cpPayId = cpPayId == null ? null : cpPayId.trim();
    }

    public String getCpPayKey() {
        return cpPayKey;
    }

    public void setCpPayKey(String cpPayKey) {
        this.cpPayKey = cpPayKey == null ? null : cpPayKey.trim();
    }

    public String getCpPayPriKey() {
        return cpPayPriKey;
    }

    public void setCpPayPriKey(String cpPayPriKey) {
        this.cpPayPriKey = cpPayPriKey == null ? null : cpPayPriKey.trim();
    }

    public Integer getMasterId() {
        return masterId;
    }

    public void setMasterId(Integer masterId) {
        this.masterId = masterId;
    }

    public String getCpConfig() {
        return cpConfig;
    }

    public void setCpConfig(String cpConfig) {
        this.cpConfig = cpConfig == null ? null : cpConfig.trim();
    }

    public String getAuthUrl() {
        return authUrl;
    }

    public void setAuthUrl(String authUrl) {
        this.authUrl = authUrl == null ? null : authUrl.trim();
    }

    public String getPayCallbackUrl() {
        return payCallbackUrl;
    }

    public void setPayCallbackUrl(String payCallbackUrl) {
        this.payCallbackUrl = payCallbackUrl == null ? null : payCallbackUrl.trim();
    }

    public String getOrderUrl() {
        return orderUrl;
    }

    public void setOrderUrl(String orderUrl) {
        this.orderUrl = orderUrl == null ? null : orderUrl.trim();
    }

    public String getVerifyClass() {
        return verifyClass;
    }

    public void setVerifyClass(String verifyClass) {
        this.verifyClass = verifyClass == null ? null : verifyClass.trim();
    }

    public Integer getOpenPayFlag() {
        return openPayFlag;
    }

    public void setOpenPayFlag(Integer openPayFlag) {
        this.openPayFlag = openPayFlag;
    }

    public Integer getOpenOwnPayChannel() {
        return openOwnPayChannel;
    }

    public void setOpenOwnPayChannel(Integer openOwnPayChannel) {
        this.openOwnPayChannel = openOwnPayChannel;
    }

    public Integer getPlatId() {
        return platId;
    }

    public void setPlatId(Integer platId) {
        this.platId = platId;
    }
}