package com.sdkserver.game.controller;

import com.alibaba.fastjson.JSON;
import com.sdkserver.common.log.Log;
import com.sdkserver.common.result.ErrCode;
import com.sdkserver.common.result.FindBean;
import com.sdkserver.common.result.PageBean;
import com.sdkserver.common.result.Result;
import com.sdkserver.game.model.Game;
import com.sdkserver.game.service.GameService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.util.ArrayList;

/**
 * @Author Eric Chan
 * @Description 游戏控制层
 * @Date 2018/9/14 15:45
 * @CLASS GameController
 */
@SuppressWarnings("all")
@RestController
@RequestMapping("/game")
@Validated  //入参中@RequestParam需要校验的情况下就需要加该注解
@Api(description = "游戏模块")
public class GameController {

    @Resource
    private RestTemplate restTemplate;

    @Resource
    private GameService gameService;

    private static final String REST_URL_PREFIX_CHANNELSERVER = "http://localhost:9001";


    @GetMapping("/all")
    @ApiOperation(value = "寻找所有的游戏id和游戏名称（待修改，测试用）" , notes = "寻找所有的游戏id和游戏名称")
    public Result findAllGames() {
        return Result.ok(gameService.findAllGames());
    }


    @PostMapping("/save")
    @ApiOperation(value = "保存游戏", notes = "保存游戏")
    public Result addGame(@Valid @RequestBody Game game , BindingResult bindingResult) {

        Log.d("save.game.info." + JSON.toJSONString(game));

        gameService.saveGame(game.getName(), game.getPayCallback(), game.getPayCallbackDebug(), game.getMsdkPayCallback());

        return Result.ok();

    }

    @PutMapping("/update")
    @ApiOperation(value = "更新游戏", notes = "更新游戏")
    public Result update(@Valid @RequestBody Game game, BindingResult bindingResult) {

        Log.d("save.game.info." + JSON.toJSONString(game));

        Game m = gameService.queryGame(game.getAppID());

        if (m != null) {
            m.setName(game.getName())
                    .setPayCallback(game.getPayCallback())
                    .setPayCallbackDebug(game.getPayCallbackDebug())
                    .setMsdkPayCallback(game.getMsdkPayCallback());
        } else {

            return Result.info(ErrCode.EMPTY_OBJECT.toJson());
        }
        gameService.updateGame(m);
        return Result.ok();

    }


    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除游戏", notes = "通过appID删除")
    public Result delete(@ApiParam(value = "generator", name = "appID", required = true)  @Min(value = 1,message = "appID为大于0整数") @PathVariable(value = "id") int id) {
        Log.d("delete.game.info." + id);
        Result channelCount = restTemplate.getForObject(REST_URL_PREFIX_CHANNELSERVER+"/channel/count/"+id,Result.class);
        Integer count =((ArrayList<Integer>) channelCount.getData()).get(0);
        if(count > 0) {
            return Result.info(ErrCode.HAS_CHANNEL_EXISTS.toJson());
        }
        Game game = gameService.queryGame(id);
        if (game == null) {
            return Result.info(ErrCode.EMPTY_OBJECT.toJson());
        }
        gameService.deleteGame(id);
        return Result.ok();
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "获取游戏", notes = "通过appID获取游戏")
    public Result get(@ApiParam(value = "generator", name = "appID", required = true) @Min(value = 1,  message = "appID必须大于0整数") @PathVariable("id") int id) {
        Log.d("find.game.info." + id);
        Game game = gameService.queryGame(id);
        if (game == null) {
            return Result.info(ErrCode.EMPTY_OBJECT.toJson());
        }
        return Result.ok(game) ;
    }

    @PostMapping("/list")
    @ApiOperation(value = "获取游戏分页数据")
    public Result findListGame(@Valid @RequestBody FindBean findBean, BindingResult bindingResult) {
        Log.d("findListGame.game.info." + findBean.toString());

        Integer currentPage = findBean.getCurrentPage() == null ? 1 : findBean.getCurrentPage();
        Integer pageSize = findBean.getPageSize() == null ? 10 : findBean.getPageSize();

        PageBean<Game> pageGames = gameService.findPageGames(
                                                     currentPage,
                                                     pageSize,
                                                     findBean.getKind(),
                                                     findBean.getKeyword());
        if (pageGames == null) {
            return Result.info(ErrCode.EMPTY_OBJECT.toJson());
        }

        return Result.ok(pageGames);
    }
    @GetMapping("/id/{name}")
    @ApiOperation(value = "通过游戏名称获取游戏ID", notes = "通过游戏名称获取游戏ID")
    public String findAppIdByGameName(@ApiParam(value = "name", name = "gameName", required = true)  @PathVariable("name") String gameName) {
        Integer appID = gameService.queryAppIdByGameName(gameName);
        return ""+appID;
    }


}