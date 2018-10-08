package com.sdkserver.auth.controller;

import com.sdkserver.auth.model.User;
import com.sdkserver.auth.service.UserService;
import com.sdkserver.common.log.Log;
import com.sdkserver.common.result.ErrCode;
import com.sdkserver.common.result.FindBean;
import com.sdkserver.common.result.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.constraints.Min;

/**
 * @ClassName UserController
 * @Description TODO //接受游戏客户端的请求，返回token和必要信息
 * @Author zwJ
 * @Date 2018/9/25 16:51
 * @Version 1.0
 **/
@RequestMapping("/auth")
@RestController
@Validated  //入参中@RequestParam需要校验的情况下就需要加该注解
@Api(description = "玩家认证服务")
public class UserController {

    @Resource
    private UserService userServiceImpl;

    @PostMapping("/list")
    public Result findPageUser(FindBean findBean) {

        return Result.ok();
    }

    /**
     * @Author zwj
     * @Description //TODO 通过用户ID删除一条用户记录
     * @Date 2018/9/25 20:39
     * @Param [玩家数据表主键ID]
     * @return com.sdkserver.common.result.Result
     **/
    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除一条用户记录", notes = "通过玩家ID删除一条玩家记录")
    public Result deleteUserById(@ApiParam(value = "id", required = true, name = "id")
                                 @Min(value = 1,message = "玩家ID为大于0整数")
                                 @PathVariable("id") int id) {
        Log.d("delete.user.info." + id);
        User user = userServiceImpl.queryUserById(id);
        if (user == null) {
            return Result.info(ErrCode.EMPTY_OBJECT.toJson());
        }
        userServiceImpl.deleteUserById(id);
        return Result.ok();
    }

    /**
     * @Author zwj
     * @Description //TODO  生成一条玩家数据（一般是游戏服务器那边请求生成）
     * @Date 2018/9/25 21:21
     * @Param  请求信息：调用方需要传入游戏服务器中用户的信息，设备ID，渠道ID
     * @return  响应信息：返回一个成功或失败状态码
     **/
    @PostMapping("/generateUser")
    @ApiOperation(value = "生成一条玩家信息记录", notes = "通过游戏服务器中用户的信息，设备ID，渠道ID")
    public Result generateUser() {



        return Result.ok();
    }

}
