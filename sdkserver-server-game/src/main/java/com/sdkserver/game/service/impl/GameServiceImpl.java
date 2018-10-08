package com.sdkserver.game.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.sdkserver.common.result.PageBean;
import com.sdkserver.common.util.IDUtils;
import com.sdkserver.common.util.RSAUtils;
import com.sdkserver.common.util.UGenerator;
import com.sdkserver.game.mapper.GameMapper;
import com.sdkserver.game.model.Game;
import com.sdkserver.game.service.GameService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class GameServiceImpl implements GameService {

    @Value("${define.generator.game}")
    private String GAME_ID;

    @Resource
    private GameMapper gameMapper;

    /**
     * @Author zwj
     * @Description //TODO 查找所有游戏记录的游戏ID和游戏名称，并将其封装到Map集合中
     * @Date 2018/9/28 21:17
     * @return java.util.Map<java.lang.Integer,java.lang.String>
     **/
    @Override
    public Map<Integer,String> findAllGames() {

        List<Game> games = gameMapper.findAllGames();

        Map<Integer,String> map = new HashMap<>(games.size());

        for(Game game : games) {
            map.put(game.getAppID(),game.getName());
        }
        return map;
    }

    /**
     * @Author zwj
     * @Description //TODO 通过游戏ID来查找游戏信息
     * @Date 2018/9/28 21:19
     * @Param [appID 游戏ID]
     * @return com.sdkserver.game.model.Game
     **/
    @Override
    public Game queryGame(Integer appID) {
        return gameMapper.queryGame(appID);
    }

    /**
     * @Author zwj
     * @Description //TODO 根据新传来的游戏信息更新数据库中的游戏信息
     * @Date 2018/9/28 21:19
     * @Param [m 游戏对象]
     * @return void
     **/
    @Override
    public void updateGame(Game game) {
        gameMapper.updateGame(game);

    }
    /**
     * @Author zwj
     * @Description //TODO 新增一条游戏信息
     * @Date 2018/9/28 21:22 
     * @Param [name 游戏名称, payCallback 支付回调地址, payCallbackDebug 测试用的支付回调地址, msdkPayCallback 应用宝回调地址]
     * @return com.sdkserver.game.model.Game
     **/
    @Override
    public Game saveGame(String name, String payCallback, String payCallbackDebug, String msdkPayCallback) {

        Game game = new Game();
        int appID = (int) IDUtils.RID(GAME_ID);
        long currTime = System.currentTimeMillis();
        game.setAppID(appID)
                .setName(name)
            .setAppSecret(UGenerator.generateAppSecret())
            .setAppkey(UGenerator.generateAppKey(appID, currTime))
            .setPayCallbackDebug(payCallback)
            .setPayCallback(payCallbackDebug)
            .setMsdkPayCallback(msdkPayCallback)
            .setCreateTime(new Date());

        try {
            Map<String, Object> keys = RSAUtils.generateKeys();
            game.setAppRSAPubKey(RSAUtils.getPublicKey(keys)).setAppRSAPriKey(RSAUtils.getPrivateKey(keys));
        } catch (Exception e) {
            e.printStackTrace();
        }

         gameMapper.saveGame(game);

        return game;
    }

    /**
     * @Author zwj
     * @Description //TODO 通过游戏ID来删除一条游戏记录
     * @Date 2018/9/28 21:23
     * @Param [appId 游戏ID]
     **/
    @Override
    public void deleteGame(Integer appId) {
        gameMapper.deleteGame(appId);
    }

    /**
     * @Author zwj
     * @Description //TODO 通过页面传递过来的条件对象来分页查找游戏记录信息
     * @Date 2018/9/28 21:24
     * @Param [currentPage 当前页码, pageSize 页面数据条数, kind 条件种类, keyword 条件关键字]
     * @return com.sdkserver.common.result.PageBean<com.sdkserver.game.model.Game>
     **/
    @Override
    public PageBean<Game> findPageGames(Integer currentPage, Integer pageSize, String kind, String keyword) {
        PageBean<Game> pageGames = new PageBean<>();
        Page page = PageHelper.startPage(currentPage,pageSize,true);
        List<Game> gameList = gameMapper.findPageGames(kind,keyword);
        Integer totalNum = Long.valueOf(page.getTotal()).intValue();
        return pageGames.setCurrentPage(currentPage).setPageSize(pageSize).setTotalNum(totalNum).setListObject(gameList);
    }

    /**
     * @Author zwj
     * @Description //TODO 用游戏名称来查找游戏ID
     * @Date 2018/9/28 21:25
     * @Param [gameName 游戏名称]
     * @return java.lang.Integer
     **/
    @Override
    public Integer queryAppIdByGameName(String gameName) {
        return gameMapper.queryAppIdByGameName(gameName);
    }
}
