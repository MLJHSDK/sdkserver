package com.sdkserver.game.mapper;

import com.sdkserver.game.model.Game;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
 * @Author zwj
 * @Description //TODO 游戏Dao层mapper接口（mybatis），负责与数据库交互
 * @Date 2018/9/28 16:28
 **/
@Mapper
public interface GameMapper {
    /**
     * @Author zwj
     * @Description //TODO 查询所有游戏信息
     * @Date 2018/9/28 16:28
     * @return java.util.List<com.sdkserver.game.model.Game>
     **/
    List<Game> findAllGames();
    /**
     * @Author zwj
     * @Description //TODO 通过AppID查询对应的游戏信息
     * @Date 2018/9/28 16:30
     * @Param [appID 游戏ID]
     * @return com.sdkserver.game.model.Game
     **/
    Game queryGame(Integer appID);
    /**
     * @Author zwj
     * @Description //TODO 修改游戏信息
     * @Date 2018/9/28 16:31
     * @Param [游戏对象]
     **/
    void updateGame(Game game);
    /**
     * @Author zwj
     * @Description //TODO  保存一条游戏记录
     * @Date 2018/9/28 16:31
     * @Param [游戏对象]
     **/
    void saveGame(Game game);
    /**
     * @Author zwj
     * @Description //TODO 根据游戏ID删除一条游戏记录
     * @Date 2018/9/28 16:32
     * @Param [appId]
     * @return void
     **/
    void deleteGame(int appId);

    /**
     * @Author zwj
     * @Description //TODO 获取表中有多少条游戏记录
     * @Date 2018/9/28 16:33
     **/
    Integer getGameTotalNum();

//    List<Game> findPageGames(@Param("startIndex") Integer startIndex, @Param("pageSize") Integer pageSize,
//                             @Param("kind") String kind, @Param("keyword") String keyword);
    /**
     * @Author zwj
     * @Description //TODO 根据分页条件来获取页面游戏数据
     * @Date 2018/9/28 16:34
     * @Param [查询种类, 查询关键字]
     * @return java.util.List<com.sdkserver.game.model.Game>
     **/
    List<Game> findPageGames(@Param("kind") String kind, @Param("keyword") String keyword);

    /**
     * @Author zwj
     * @Description //TODO 通过游戏名称查游戏ID
     * @Date 2018/9/28 16:35
     * @Param [游戏名称]
     * @return java.lang.Integer
     **/
    Integer queryAppIdByGameName(String gameName);
}
