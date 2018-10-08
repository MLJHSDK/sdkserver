package com.sdkserver.management.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * Created by management on 2017/12/29.
 */
@ApiModel(value = "返回实体",description = "返回实体")
public class RespBean implements Serializable {

    @ApiModelProperty(value = "转态",required = false,dataType = "String")
    private String status;

    @ApiModelProperty(value = "信息",required = false,dataType = "String")
    private String msg;

    public RespBean() {
    }

    public RespBean(String status, String msg) {

        this.status = status;
        this.msg = msg;
    }

    public String getStatus() {

        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
