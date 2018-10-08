package com.sdkserver.channel.model;

import java.io.Serializable;

public class ChannelMaster implements Serializable {
    private Integer masterId;

    private String authUrl;

    private String masterName;

    private String sdkName;

    private String nameSuffix;

    private String payCallbackUrl;

    private String verifyClass;

    private String orderUrl;

    private static final long serialVersionUID = 1L;

    public Integer getMasterId() {
        return masterId;
    }

    public void setMasterId(Integer masterId) {
        this.masterId = masterId;
    }

    public String getAuthUrl() {
        return authUrl;
    }

    public void setAuthUrl(String authUrl) {
        this.authUrl = authUrl == null ? null : authUrl.trim();
    }

    public String getMasterName() {
        return masterName;
    }

    public void setMasterName(String masterName) {
        this.masterName = masterName == null ? null : masterName.trim();
    }

    public String getSdkName() {
        return sdkName;
    }

    public void setSdkName(String sdkName) {
        this.sdkName = sdkName == null ? null : sdkName.trim();
    }

    public String getNameSuffix() {
        return nameSuffix;
    }

    public void setNameSuffix(String nameSuffix) {
        this.nameSuffix = nameSuffix == null ? null : nameSuffix.trim();
    }

    public String getPayCallbackUrl() {
        return payCallbackUrl;
    }

    public void setPayCallbackUrl(String payCallbackUrl) {
        this.payCallbackUrl = payCallbackUrl == null ? null : payCallbackUrl.trim();
    }

    public String getVerifyClass() {
        return verifyClass;
    }

    public void setVerifyClass(String verifyClass) {
        this.verifyClass = verifyClass == null ? null : verifyClass.trim();
    }

    public String getOrderUrl() {
        return orderUrl;
    }

    public void setOrderUrl(String orderUrl) {
        this.orderUrl = orderUrl == null ? null : orderUrl.trim();
    }
}