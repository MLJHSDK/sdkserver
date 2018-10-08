package com.sdkserver.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.validation.constraints.Pattern;
import java.io.Serializable;
import java.util.Date;

/**
 * 订单对象
 */

@NoArgsConstructor
@Data
@AllArgsConstructor
@Accessors(chain = true)
@ApiModel(value = "订单信息实体类")
public class Order implements Serializable {

    @ApiModelProperty(name = "订单号", value = "订单号【返回】",dataType = "Long")
    private Long orderID;       //订单号

    @ApiModelProperty(name = "当前所属游戏ID", value = "当前所属游戏ID",dataType = "Integer")
    private Integer appID;          //当前所属游戏ID

    @ApiModelProperty(name = "当前所属渠道ID", value = "当前所属渠道ID",dataType = "Integer")
    private Integer channelID;      //当前所属渠道ID

    @ApiModelProperty(name = "U8Server这边对应的用户ID", value = "U8Server这边对应的用户ID",dataType = "Integer")
    private Integer userID;         //U8Server这边对应的用户ID

    @ApiModelProperty(name = "U8Server这边生成的用户名", value = "U8Server这边生成的用户名",dataType = "String")
    private String username;    //U8Server这边生成的用户名

    @ApiModelProperty(name = "游戏中商品ID", value = "游戏中商品ID",dataType = "String")
    private String productID;   //游戏中商品ID

    @ApiModelProperty(name = "游戏中商品名称", value = "游戏中商品名称",dataType = "String")
    private String productName; //游戏中商品名称

    @ApiModelProperty(name = "游戏中商品描述", value = "游戏中商品描述",dataType = "String")
    private String productDesc; //游戏中商品描述

    @ApiModelProperty(name = "下单时收到的金额", value = "下单时收到的金额，实际充值的金额以这个为准",dataType = "Integer")
    private Integer money;  //单位 分, 下单时收到的金额，实际充值的金额以这个为准

    @ApiModelProperty(name = "渠道SDK支付回调通知返回的金额", value = "渠道SDK支付回调通知返回的金额，记录，留作查账",dataType = "Integer")
    private Integer realMoney;  //单位 分，渠道SDK支付回调通知返回的金额，记录，留作查账

    @ApiModelProperty(name = "币种", value = "币种",dataType = "String")
    private String currency; //币种

    @ApiModelProperty(name = "游戏中角色ID", value = "游戏中角色ID",dataType = "String")
    private String roleID;      //游戏中角色ID

    @ApiModelProperty(name = "游戏中角色名称", value = "游戏中角色名称",dataType = "String")
    private String roleName;    //游戏中角色名称

    @ApiModelProperty(name = "服务器ID", value = "服务器ID",dataType = "String")
    private String serverID;    //服务器ID

    @ApiModelProperty(name = "服务器名称", value = "服务器名称",dataType = "String")
    private String serverName;  //服务器名称

    @ApiModelProperty(name = "订单状态", value = "订单状态",dataType = "Integer")
    private Integer state;          //订单状态

    @ApiModelProperty(name = "渠道SDK对应的订单号", value = "渠道SDK对应的订单号",dataType = "String")
    private String channelOrderID;  //渠道SDK对应的订单号

    @ApiModelProperty(name = "扩展数据", value = "扩展数据",dataType = "String")
    private String extension;       //扩展数据

    @ApiModelProperty(name = "订单创建时间", value = "订单创建时间",dataType = "Date")
    private Date createdTime;       //订单创建时间

    @ApiModelProperty(name = "渠道SDK那边订单交易时间", value = "渠道SDK那边订单交易时间",dataType = "String")
    private String sdkOrderTime;          //渠道SDK那边订单交易时间

    @ApiModelProperty(name = "订单完成时间", value = "订单完成时间",dataType = "Date")
    private Date completeTime;          //订单完成时间

    @Pattern(regexp = "^((/\\w+)+|none)$",message = "SDK订单号获取地址格式不正确")
    @ApiModelProperty(name = "通知到游戏服务器的地址", value = "通知到游戏服务器的地址，没有设置的话，默认走后台游戏管理中配置的固定通知回调地址",dataType = "String")
    private String notifyUrl;       //游戏下单的时候，可以携带notifyUrl过来，作为渠道支付回调时，通知到游戏服务器的地址，没有设置的话，默认走后台游戏管理中配置的固定通知回调地址

}
