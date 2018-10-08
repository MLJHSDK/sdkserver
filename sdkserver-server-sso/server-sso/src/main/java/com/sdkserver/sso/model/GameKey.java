package com.sdkserver.sso.model;

import java.io.Serializable;

public class GameKey implements Serializable {
    private Integer appId;

    private String payCallback;

    private static final long serialVersionUID = 1L;

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public String getPayCallback() {
        return payCallback;
    }

    public void setPayCallback(String payCallback) {
        this.payCallback = payCallback == null ? null : payCallback.trim();
    }
}