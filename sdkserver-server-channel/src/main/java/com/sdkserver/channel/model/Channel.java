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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

/**
 * @Author zwj
 * @Description //TODO 渠道信息实体类
 * @Date 2018/9/26 11:19
 **/

@NoArgsConstructor
@Data
@AllArgsConstructor
@Accessors(chain = true)
@ApiModel(value = "渠道信息实体类")
public class Channel implements Serializable {
//    @ApiModelProperty(name = "数据表中ID", value = "数据表中ID【由系统生成返回】",dataType = "Integer")
//    private Integer id;                 //数据表中ID
    @NotNull
    @Min(value = 1,message = "channelID必须大于零")
    @ApiModelProperty(name = "每个渠道唯一ID", value = "渠道ID【修改】【返回】",dataType = "Integer",required = true)
    private Integer channelID;              //渠道ID 和客户端一致

    @NotNull
    @Min(value = 1,message = "appID必须大于零")
    @ApiModelProperty(name = "每款游戏唯一ID", value = "游戏ID【添加】【修改】【返回】",dataType = "Integer",required = true)
    private Integer appID;                  //游戏ID

    @NotNull
    @Min(value = 1,message = "masterID必须大于零")
    @ApiModelProperty(name = "每个渠道的渠道商唯一ID", value = "渠道商ID【添加】【修改】【返回】",dataType = "Integer",required = true)
    private Integer masterID;               //渠道商ID

    @ApiModelProperty(name = "渠道分配给游戏的cpID", value = "游戏的cpID【添加】【修改】【返回】",dataType = "String")
    private String cpID;                //渠道分配给游戏的cpID
    @ApiModelProperty(name = "渠道分配给游戏的cpID", value = "游戏的cpID【添加】【修改】【返回】",dataType = "String")
    private String cpAppID;             //渠道分配给游戏的appID
    @ApiModelProperty(name = "渠道分配给游戏的AppKey", value = "游戏的AppKey【添加】【修改】【返回】",dataType = "String")
    private String cpAppKey;            //渠道分配给游戏的AppKey
    @ApiModelProperty(name = "渠道分配给游戏的AppSecret", value = "游戏的AppSecret【添加】【修改】【返回】",dataType = "String")
    private String cpAppSecret;         //渠道分配给游戏的AppSecret
    @ApiModelProperty(name = "渠道分配给游戏的支付ID", value = "游戏的支付ID【添加】【修改】【返回】",dataType = "String")
    private String cpPayID;             //渠道分配给游戏的支付ID
    @ApiModelProperty(name = "渠道分配给游戏的支付公钥", value = "游戏的支付公钥【添加】【修改】【返回】",dataType = "String")
    private String cpPayKey;            //渠道分配给游戏的支付公钥
    @ApiModelProperty(name = "渠道分配给游戏的支付私钥", value = "游戏的支付私钥【添加】【修改】【返回】",dataType = "String")
    private String cpPayPriKey;         //渠道分配给游戏的支付私钥
    @ApiModelProperty(name = "部分渠道可能有特殊配置信息，设置在该字段中", value = "部分渠道的特殊配置信息【添加】【修改】【返回】",dataType = "String")
    private String cpConfig;            //部分渠道可能有特殊配置信息，设置在该字段中
    @ApiModelProperty(name = "充值功能状态，0：开放；1：关闭。关闭之后，该渠道获取订单号会返回一个错误", value = "充值功能状态，0：开放；1：关闭【添加】【修改】【返回】",dataType = "Integer")
    private Integer openPayFlag;            //充值功能状态，0：开放；1：关闭。关闭之后，该渠道获取订单号会返回一个错误

    @NotNull
    @ApiModelProperty(name = "功能未知", value = "功能未知，但数据库中表存在的列",dataType = "Integer")
    private Integer openOwnPayChannel;

    @ApiModelProperty(name = "功能未知", value = "功能未知，但数据库中表存在的列",dataType = "Integer")
    private Integer platID;

    //下面这几个参数，可以覆盖channelmaster中的。
    @URL
    @NotBlank(message = "登录认证地址不能为空！")
    @ApiModelProperty(name = "SDK登录认证地址",value = "SDK登录认证地址 【添加】【修改】【返回】",example = "http://sdk.g.uc.cn/ss/account.verifySession",required = true)
    private String authUrl;         //当前SDK登录认证地址

    @Pattern(regexp = "^((/\\w+)+|none)$",message = "支付回调地址格式不正确")
    @NotBlank(message = "支付回调地址不能为空！")
    @ApiModelProperty(name = "SDK支付通知回调地址",value = "SDK支付通知回调地址,没有就为none",example = "none",required = true)
    private String payCallbackUrl;  //当前SDK支付通知回调地址

    @Pattern(regexp = "^\\w+(.\\w+)+$",message = "脚本类路径格式不正确")
    @NotBlank(message = "脚本类路径不能为空！")
    @ApiModelProperty(name = "当前SDK的验证处理类的全类名",value = "脚本类路径",example = "com.u8.server.sdk.uc.UCSDK",required = true)
    private String verifyClass;     //当前SDK的验证处理类的全类名

    @Pattern(regexp = "^((/\\w+)+|none)$",message = "SDK订单号获取地址格式不正确")
    @NotBlank(message = "SDK订单号获取地址不能为空！")
    @ApiModelProperty(name = "SDK订单号获取地址",value = "SDK订单号获取地址,没有则为none",example = "none",required = true)
    private String orderUrl;        //SDK订单号获取地址，没有则为空

//    public ChannelMaster getMaster(){
//
//        return CacheManager.getInstance().getMaster(masterID);
//    }
//
//    public UGame getGame(){
//
//        return CacheManager.getInstance().getGame(appID);
//    }

    //获取当前渠道的登录认证地址
//    public String getChannelAuthUrl(){
//        if(this.authUrl == null || this.authUrl.trim().length() == 0){
//            return  getMaster().getAuthUrl();
//        }
//        return this.authUrl;
//    }

    //获取当前渠道的SDK处理类的名称
//    public String getChannelVerifyClass(){
//        if(this.verifyClass == null || this.verifyClass.trim().length() == 0){
//            return getMaster().getVerifyClass();
//        }
//        return this.verifyClass;
//    }

    //获取当前渠道的SDK处理类的下单地址
//    public String getChannelOrderUrl() {
//        if (this.orderUrl == null || this.orderUrl.trim().length() == 0) {
//            return getMaster().getOrderUrl();
//        }
//        return this.orderUrl;
//    }

    //获取当前渠道的支付回调地址
//    public String getPayCallbackUrl(){
//        String baseUrl = getMaster().getPayCallbackUrl();
//        if(this.payCallbackUrl != null && this.payCallbackUrl.trim().length() > 0){
//            baseUrl = this.payCallbackUrl;
//        }
//
//        if (!baseUrl.startsWith("http:")){
//
//            //加上根地址
//            if(!baseUrl.startsWith("/")){
//                baseUrl = "/" + baseUrl;
//            }
//
//            baseUrl = GlobalConfig.BASE_URL + baseUrl;
//
//        }
//
//        if(baseUrl.contains(""+channelID)){
//
//            return baseUrl;
//        }
//
//        if (!baseUrl.endsWith("/")){
//            baseUrl += "/";
//        }
//        return baseUrl + channelID;
//    }

    //当前渠道是否开放充值
//    public boolean isPayOpen(){
//
//        return this.openPayFlag == 0;
//    }
//
/*    public JSONObject toJSON(){
        JSONObject json = new JSONObject();
        json.put("generator", id);
        json.put("channelID", channelID);
        json.put("appID", appID);

        UGame game = getGame();

        json.put("appName", game == null ? "" : game.getName());
        json.put("appName", appID);
        json.put("masterID", masterID);

        ChannelMaster master = getMaster();
        json.put("masterName", master == null ? "" : master.getMasterName());
        json.put("masterName", masterID);
        json.put("cpID", cpID);
        json.put("cpAppID", cpAppID);
        json.put("cpAppKey", cpAppKey);
        json.put("cpAppSecret", cpAppSecret);
        json.put("cpPayID", cpPayID);
        json.put("cpPayKey", cpPayKey);
        json.put("cpPayPriKey", cpPayPriKey);
        json.put("cpConfig",cpConfig);
        json.put("openPayFlag", openPayFlag);
        json.put("authUrl", authUrl);
        json.put("payCallbackUrl", payCallbackUrl);
        json.put("verifyClass", verifyClass);
        json.put("orderUrl", orderUrl);

        return json;
    }*/

}

