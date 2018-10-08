package com.sdkserver.channel.model;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;


/**
 * @Author Eric Chan
 * @Description 渠道商对象(比如UC，当乐。。。)
 * @Date 2018/9/20 16:32
 * @CLASS ChannelMaster
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@ApiModel("渠道商实体")
public class ChannelMaster {


    @Min(value = 1,message = "masterID必须大于0的整数")
    @ApiModelProperty(name = "渠道商ID号",value = "渠道商ID号",example = "1")
    private Integer masterID;       //渠道商ID号

    @ApiModelProperty(name = "sdk名称",value = "sdk名称",example = "UC",required = true)
    @NotBlank(message = "SDK名称不能为空！")
    private String sdkName;         //当前渠道商所使用的sdk名称

    @ApiModelProperty(name = "渠道商名称",value = "渠道商名称",example = "uc",required = true)
    @NotBlank(message = "渠道商名称不能为空！")
    private String masterName;      //当前渠道商名称

    @ApiModelProperty(name = "用户名后缀",value = "用户名后缀",example = ".uc",required = true)
    @Pattern(regexp = "^.\\w+$",message = "用户名后缀格式不正确")
    @NotBlank(message = "用户名后缀不能为空！")
    private String nameSuffix;      //用户名渠道商后缀

    @URL
    @NotBlank(message = "登录认证地址不能为空！")
    @ApiModelProperty(name = "登录认证地址",value = "登录认证地址",example = "http://sdk.g.uc.cn/ss/account.verifySession",required = true)
    private String authUrl;         //当前SDK登录认证地址

    @Pattern(regexp = "^((/\\w+)+|none)$",message = "支付回调地址格式不正确")
    @NotBlank(message = "支付回调地址不能为空！")
    @ApiModelProperty(name = "SDK支付通知回调地址",value = "SDK支付通知回调地址,没有就为none",example = "none",required = true)
    private String payCallbackUrl;  //当前SDK支付通知回调地址

    @Pattern(regexp = "^\\w+(.\\w+)+$",message = "脚本类路径格式不正确")
    @NotBlank(message = "脚本类路径不能为空！")
    @ApiModelProperty(name = "脚本类路径",value = "脚本类路径",example = "com.u8.server.sdk.uc.UCSDK",required = true)
    private String verifyClass;     //当前SDK的验证处理类的全类名

    @Pattern(regexp = "^((/\\w+)+|none)$",message = "SDK订单号获取地址格式不正确")
    @NotBlank(message = "SDK订单号获取地址不能为空！")
    @ApiModelProperty(name = "SDK订单号获取地址",value = "SDK订单号获取地址,没有则为none",example = "none",required = true)
    private String orderUrl;        //SDK订单号获取地址，没有则为空

}
