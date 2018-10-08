package com.sdkserver.channel.controller;

import com.sdkserver.channel.model.Channel;
import com.sdkserver.channel.service.ChannelMasterService;
import com.sdkserver.channel.service.ChannelService;
import com.sdkserver.common.exception.NullObjectException;
import com.sdkserver.common.log.Log;
import com.sdkserver.common.result.ErrCode;
import com.sdkserver.common.result.FindBean;
import com.sdkserver.common.result.PageBean;
import com.sdkserver.common.result.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.net.URI;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/channel")
@RefreshScope
@Api(description = "渠道模块")
@Validated
public class ChannelController {

//    private static final String REST_URL_PREFIX = "http://localhost:8001";
    //注入渠道服务业务对象
    @Resource
    private ChannelService channelService;

    //注入渠道商服务业务对象
    @Resource
    private ChannelMasterService channelMasterService;

    @Resource
    private RestTemplate restTemplate;

//    @Value("${sdkserver-server-game-id}")
//    private static final String REST_URL_PREFIX_GAMESERVER = "http://172.16.20.140:8001";
    private static final String REST_URL_PREFIX_GAMESERVER = "http://localhost:8001";
//    private static final String REST_URL_PREFIX_GAMESERVER = "http://SDKSERVER-GAME";


    @GetMapping("/all")
    @ApiOperation(value = "获取秒乐聚合中所有的渠道信息列表" , notes = "获取秒乐聚合中所有的渠道信息列表")
    public Result findAllChannels() {
        List<Channel> channelList = channelService.findAllChannels();
        return Result.ok(channelList);
    }

    /**
     * @Author zwj
     * @Description //TODO 添加一条渠道信息  当前端跳转到添加渠道信息页面时需要获取到信息
     * 请求信息：请求对应的url即可
     * 响应信息：提供游戏列表信息(需要从游戏服务获取)、提供渠道商列表、提供一个供用户选择的渠道ID（即当前数据库中渠道最大数量+1）
     * @Date 2018/9/26 11:26
     **/
    @GetMapping("/addpage")
    @ApiOperation(value = "当前端跳转到添加渠道信息页面时需要获取到信息" , notes = "当前端跳转到添加渠道信息页面时需要获取到信息")
    public Result toAddPage(Model model) {
        Result gameResult = restTemplate.getForObject(REST_URL_PREFIX_GAMESERVER+"/game/all",Result.class);
        Map<Integer,String> games = (Map<Integer, String>)gameResult.getData();
        Map<Integer,String> channelMasterMap = channelMasterService.findAllChannelMaster();
        model.addAttribute("games",games);
        model.addAttribute("channelMasterMap",channelMasterMap);
        return Result.ok(model);
    }

    /**
     * @Author zwj
     * @Description //TODO 执行添加操作
     * 请求信息：将渠道信息发送到服务器
     * 响应信息：重定向到渠道服务上的获取页面渠道信息的方法
     * @Date 2018/9/27 10:19 
     * @Param [请求方传递过来的渠道信息]
     * @return 响应结果实体
     **/
    @PostMapping("/addchannel")
    @ApiOperation(value = "添加一条渠道信息" , notes = "将请求方传递过来的渠道信息添加到数据库中")
    public Result addChannel(@Valid @RequestBody Channel channel, BindingResult bindingResult) {
        if(channel.getOpenPayFlag() == null){
            channel.setOpenPayFlag(0);
        }
        try {
            channelService.queryChannelById(channel.getChannelID());
        }catch (NullObjectException e) {
            channelService.addChannel(channel);
            return Result.ok();
        }
        return Result.info(ErrCode.CHANNEL_EXISTS.toJson());
    }
    /**
     * @Author zwj
     * @Description //TODO 删除这条渠道记录  请先删除该渠道下面的所有用户数据
     * 请求信息：调用方需要传入删除的id
     * 响应信息：成功或失败消息（前端自个儿重定向到渠道服务上的获取页面渠道信息的方法）
     * @Date 2018/9/27 15:31
     * @Param [channelId 渠道ID]
     * @return com.sdkserver.common.result.Result
     **/
    @DeleteMapping("/{channelId}")
    @ApiOperation(value = "删除一条渠道信息" , notes = "根据请求方传递过来的渠道ID到数据库中删除这条记录")
    public Result deleteChannel(@ApiParam(value = "channelId", name = "channelId", required = true)
                                @Min(value = 1,message = "channelId为大于0整数")
                                @PathVariable("channelId") Integer channelId) {

        /*List<User> lst = this.userManager.getUsersByChannel(this.currChannelID);
        if(lst.size() > 0){
            renderState(false, "请先删除该渠道下面的所有用户数据");
            return;
        }*/
        try {
            channelService.queryChannelById(channelId);
        }catch (NullObjectException e) {
            return Result.info(ErrCode.CHANNEL_NOT_EXISTS.toJson());
        }
        channelService.deleteChannelById(channelId);
        return Result.ok();
    }

    /**
     * @Author zwj
     * @Description //TODO 根据游戏ID来获取当前游戏下有多少条渠道
     * @Date 2018/9/27 16:10
     * @Param [appId 游戏ID]
     **/
    @GetMapping("/count/{appId}")
    @ApiOperation(value = "根据游戏ID来获取当前游戏下有多少条渠道" , notes = "根据游戏ID来获取当前游戏下有多少条渠道")
    public Result getChannelCountByAppId(@ApiParam(value = "appId", name = "appId", required = true)
                                         @Min(value = 1,message = "appId为大于0整数")
                                         @PathVariable("appId") Integer appId) {
        Integer count = channelService.findChannelCountByAppId(appId);
        return Result.ok(count);
    }

    /**
     * @Author zwj
     * @Description //TODO 判断调用方传递过来的渠道号在渠道服务中是否存在对应的渠道记录
     * @Date 2018/9/27 17:02
     * @Param [channelId 渠道ID]
     **/
    @GetMapping("/verify/{channelId}")
    @ApiOperation(value = "判断调用方传递过来的渠道号在渠道服务中是否存在对应的渠道记录,有就返回渠道对象" , notes = "判断调用方传递过来的渠道号在渠道服务中是否存在对应的渠道记录,有就返回渠道对象")
    public Result verifyChannel(@ApiParam(value = "channelId", name = "channelId", required = true)
                                @Min(value = 1,message = "channelId为大于0整数")
                                @PathVariable("channelId") Integer channelId) {
        Channel channel;
        try {
            channel = channelService.queryChannelById(channelId);
        }catch (NullObjectException e) {
            return Result.info(ErrCode.EMPTY_OBJECT.toJson());
        }
        return Result.ok(channel);
    }

    /**
     * @Author zwj
     * @Description //TODO 修改一条渠道信息
     * 发送请求给对应url
     * 请求信息：调用方需要传递一个渠道表中主键ID，以及修改后的信息
     * 响应信息：重定向到渠道服务上的获取页面渠道信息的方法
     * @Date 2018/9/27 17:15
     * @Param [channel]
     **/
    @PutMapping("/update")
    @ApiOperation(value = "修改一条渠道信息",notes = "修改一条渠道信息")
    public Result updateChannel(@Valid @RequestBody Channel channel , BindingResult bindingResult) {

        try {
            channelService.queryChannelById(channel.getChannelID());
        }catch (NullObjectException e) {
            return Result.info(ErrCode.EMPTY_OBJECT.toJson());
        }
        channelService.updateChannel(channel);
        return Result.ok();
    }

    /**
     * @Author zwj
     * @Description //TODO 根据当前页码和一页展示的条数,以及页面上的条件来获取展示的渠道数据
     * @Date 2018/9/27 20:09
     * @Param [com.sdkserver.common.result.FindBean 封装查询条件的实体]
     **/
    @PostMapping("/list")
    @ApiOperation(value = "获取页面渠道展示数据",notes = "根据当前页码和一页展示的条数,以及页面上的条件来获取展示的渠道数据")
    public Result findPageChannels(@Valid @RequestBody FindBean findBean, BindingResult bindingResult) {
        Log.d("findListGame.game.info." + findBean.toString());

        findBean.setCurrentPage(findBean.getCurrentPage() == null ? 1 : findBean.getCurrentPage());
        findBean.setPageSize(findBean.getPageSize() == null ? 10 : findBean.getPageSize());
        //如果请求条件是渠道名称，则需要去ChannelMasterService中寻找对应的masterId
        if ("searchMasterName".equals(findBean.getKind())) {
            //以后加入缓存后要从缓存中进行获取
            findBean.setKeyword(channelMasterService.findMasterIdByName(findBean.getKeyword()));
        }
        //如果请求条件是游戏名称，则需要去游戏服务中寻找对应的appId
        if ("searchGameName".equals(findBean.getKind())) {
//            Map<String,String> requestMap = new HashMap<>();
//            requestMap.put("gameName",findBean.getKeyword());
//            URI uri = URI.create(REST_URL_PREFIX_GAMESERVER+"/game/id/{name}");
            findBean.setKeyword(restTemplate.getForObject(REST_URL_PREFIX_GAMESERVER+"/game/id/{name}",String.class,findBean.getKeyword()));
        }
        Log.d("findListGame.game.info." + findBean.toString());
        PageBean<Channel> pageChannels = channelService.findPageChannels(findBean);
        if (pageChannels == null) {
            return Result.info(ErrCode.EMPTY_OBJECT.toJson());
        }

        return Result.ok(pageChannels);
    }


}
