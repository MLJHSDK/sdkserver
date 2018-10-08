package com.sdkserver.channel.controller;

import com.sdkserver.channel.model.ChannelMaster;
import com.sdkserver.channel.service.ChannelMasterService;
import com.sdkserver.channel.utils.query.ChannelMaterVerifyQuery;
import com.sdkserver.common.result.FindBean;
import com.sdkserver.common.result.PageBean;
import com.sdkserver.common.result.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import javax.validation.constraints.Min;


@RestController
@RequestMapping("/channel/master")
@Api(description = "渠道商模块")
@Validated
public class ChannelMasterController {

    @Resource
    private ChannelMasterService channelMasterService;


    @PostMapping("/list")
    @ApiOperation(value = "根据条件获取渠道商", notes = "根据条件获取渠渠道商")
    public PageBean<ChannelMaster> findPageChannelMaster(@Valid @RequestBody FindBean findBean, BindingResult bindingResult) {
        //校验查询种类是否存在
        ChannelMaterVerifyQuery.verify(findBean.getKind());

        return channelMasterService.findPageChannelMaster(findBean);
    }

    @PostMapping
    @ApiOperation(value = "保存渠道商", notes = "保存渠道商")
    public Result saveChannelMaster(@Valid @RequestBody ChannelMaster channelMaster, BindingResult bindingResult){

        channelMasterService.insert(channelMaster);

        return Result.ok();
    }

    @PutMapping
    @ApiOperation(value = "更新渠道商", notes = "更新渠道商")
    public Result updateChannelMaster(@Valid @RequestBody ChannelMaster channelMaster, BindingResult bindingResult){

        //判断对象是否存在
        channelMasterService.verifyObject(channelMaster.getMasterID());

        return Result.ok(channelMasterService.updateChannelMaster(channelMaster));
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除渠道商", notes = "删除渠道商")
    public Result deleteChannelMaster(@ApiParam(value = "masterID", name = "generator", required = true)  @Min(value = 1,message = "masterID为大于0整数") @PathVariable(value = "id") int id){

        //判断对象是否存在
        channelMasterService.verifyObject(id);

        return Result.ok(channelMasterService.deleteChannelMaster(id));
    }
}
