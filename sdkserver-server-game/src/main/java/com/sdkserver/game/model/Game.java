package com.sdkserver.game.model;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

/**
 * @Author Eric Chan
 * @Description  游戏对象,zwJ修改于2018/9/20
 * @Date 2018/9/19 11:32
 * @CLASS Game
 */
@NoArgsConstructor
@Data
@AllArgsConstructor
@Accessors(chain = true)
@SuppressWarnings("all")
@ApiModel("游戏实体")
public class Game implements Serializable{
// @ApiModelProperty(name = "返回码",value = "返回码",dataType = "Integer",example = "10000")
    @ApiModelProperty(name = "每款游戏唯一ID", value = "游戏ID【修改】【返回】",dataType = "Integer")
    private Integer appID;          //每款游戏唯一ID

    @ApiModelProperty(name = "根据appID等信息md5生成的游戏唯一标识", value = "游戏标识【返回】",dataType = "String",example = "mljhsdkappkey")
    private String appkey;          //根据appID等信息md5生成的游戏唯一标识

    @ApiModelProperty(name = "token生成密钥", value = "游戏服务器端和U8Server生成token使用、不要将该参数放在客户端【返回】",dataType = "String",example = "mljhsdkappSecret")
    private String appSecret;       //游戏服务器端和U8Server生成token使用。不要将该参数放在客户端

    @ApiModelProperty(name = "RSA公钥", value = "在登录认证和支付回调的时候使用RSA签名【返回】",dataType = "String",example = "mljhsdkappRSAPubKey")
    private String appRSAPubKey;    //RSA公钥 在登录认证和支付回调的时候使用RSA签名

    @ApiModelProperty(name = "RSA密钥", value = "在登录认证和支付回调的时候使用RSA签名【返回】",dataType = "String",example = "mljhsdkappRSAPriKey")
    private String appRSAPriKey;    //RSA密钥
    @NotNull
    @ApiModelProperty(name = "游戏名称", value = "游戏名称",dataType = "String",example = "mljhsdkappname",required = true)
    private String name;            //游戏名称

    @ApiModelProperty(name = "创建时间", value = "创建时间【返回】",dataType = "Date")
    private Date createTime;        //创建时间

    @ApiModelProperty(name = "支付回调地址", value = "支付回调地址",dataType = "String",example = "www.baidu.com")
    private String payCallback;     //支付回调地址

    @ApiModelProperty(name = "应用宝回调地址", value = "应用宝回调地址",dataType = "String",example = "www.baidu.com")
    private String msdkPayCallback; //应用宝回调地址

    @ApiModelProperty(name = "支付回调地址，调试", value = "支付回调地址，调试",dataType = "String",example = "www.baidu.com")
    private String payCallbackDebug;//支付回调地址，调试

}
