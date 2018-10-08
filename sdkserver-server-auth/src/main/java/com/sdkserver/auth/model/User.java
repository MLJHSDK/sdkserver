package com.sdkserver.auth.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName User
 * @Description //用户实体数据对象
 * @Author zwJ
 * @Date 2018/9/25 15:22
 * @Version 1.0
 **/
@NoArgsConstructor
@Data
@AllArgsConstructor
@Accessors(chain = true)
//@SuppressWarnings("all")
@ApiModel("用户实体")
public class User implements Serializable {

    @ApiModelProperty(name = "用户表主键", value = "用户表主键【返回】",dataType = "Integer")
    private Integer id;					//用户表主键
    @NotNull
    @ApiModelProperty(name = "游戏ID", value = "游戏ID",dataType = "Integer")
    private Integer appID;					//游戏ID
    @NotNull
    @ApiModelProperty(name = "渠道ID", value = "渠道ID【请求】",dataType = "Integer")
    private Integer channelID;				//渠道ID
    @ApiModelProperty(name = "玩家名称", value = "玩家名称【返回】",dataType = "String")
    private String name;				//玩家名称
    @ApiModelProperty(name = "渠道玩家ID", value = "渠道玩家ID【返回】",dataType = "String")
    private String channelUserID;		//渠道玩家ID
    @ApiModelProperty(name = "渠道玩家名称", value = "渠道玩家名称【返回】",dataType = "String")
    private String channelUserName;		//渠道玩家名称
    @ApiModelProperty(name = "渠道玩家昵称", value = "渠道玩家昵称",dataType = "String")
    private String channelUserNick;		//渠道玩家昵称
    @ApiModelProperty(name = "玩家账号创建时间", value = "玩家账号创建时间",dataType = "Date")
    private Date createTime;			//玩家账号创建时间
    @ApiModelProperty(name = "最后一次登录时间", value = "最后一次登录时间【返回】",dataType = "Date")
    private Date lastLoginTime;			//最后一次登录时间
    @ApiModelProperty(name = "口令", value = "口令【返回】",dataType = "String")
    private String token;				//口令
    @ApiModelProperty(name = "是否是首冲", value = "是否是首冲",dataType = "Integer")
    private Integer firstCharge;        //是否充值过(没有：0；充值过：1)
    @ApiModelProperty(name = "首冲时间", value = "首冲时间",dataType = "Date")
    private Date firstChargeTime;       //首冲时间
    @ApiModelProperty(name = "设备ID", value = "设备ID",dataType = "String")
    private String deviceID;            //设备ID

}
