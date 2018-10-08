package com.sdkserver.sso.model;

import java.io.Serializable;
import java.util.Date;

public class Game extends GameKey implements Serializable {
    private String appKey;

    private String appSecret;

    private String appRsaPubkey;

    private String appRsaPrikey;

    private String name;

    private String payCallbackDebug;

    private String msdkPayCallback;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey == null ? null : appKey.trim();
    }

    public String getAppSecret() {
        return appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret == null ? null : appSecret.trim();
    }

    public String getAppRsaPubkey() {
        return appRsaPubkey;
    }

    public void setAppRsaPubkey(String appRsaPubkey) {
        this.appRsaPubkey = appRsaPubkey == null ? null : appRsaPubkey.trim();
    }

    public String getAppRsaPrikey() {
        return appRsaPrikey;
    }

    public void setAppRsaPrikey(String appRsaPrikey) {
        this.appRsaPrikey = appRsaPrikey == null ? null : appRsaPrikey.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPayCallbackDebug() {
        return payCallbackDebug;
    }

    public void setPayCallbackDebug(String payCallbackDebug) {
        this.payCallbackDebug = payCallbackDebug == null ? null : payCallbackDebug.trim();
    }

    public String getMsdkPayCallback() {
        return msdkPayCallback;
    }

    public void setMsdkPayCallback(String msdkPayCallback) {
        this.msdkPayCallback = msdkPayCallback == null ? null : msdkPayCallback.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}