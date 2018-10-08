package com.sdkserver.channel.mapper;

import com.sdkserver.channel.model.Channel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author zwj
 * @Description //TODO 渠道Dao层mapper接口（mybatis），负责与数据库交互
 * @Date 2018/9/28 21:26
 **/
@Mapper
public interface ChannelMapper {
    /**
     * @Author zwj
     * @Description //TODO 查询所有渠道记录的渠道名称和渠道ID
     * @Date 2018/9/28 21:27
     * @return java.util.List<com.sdkserver.channel.model.Channel>
     **/
    List<Channel> findAllChannels();

    /**
     * @Author zwj
     * @Description //TODO 添加一条渠道信息
     * @Date 2018/9/28 21:28
     * @Param [channel 渠道实体]
     * @return void
     **/
    void addChannel(Channel channel);

    /**
     * @Author zwj
     * @Description //TODO 查询一条渠道记录通过渠道ID
     * @Date 2018/9/28 21:28
     * @Param [channelID 渠道ID]
     * @return com.sdkserver.channel.model.Channel
     **/
    Channel queryChannelByID(Integer channelID);

    /**
     * @Author zwj
     * @Description //TODO 通过渠道ID删除一条渠道记录
     * @Date 2018/9/28 21:28
     * @Param [channelId 渠道ID]
     **/
    void deleteChannelById(Integer channelId);

    /**
     * @Author zwj
     * @Description //TODO 通过app_id来查询当前游戏下的所有渠道
     * @Date 2018/9/28 21:29
     * @Param [appId 游戏ID]
     * @return java.lang.Integer
     **/
    Integer findChannelCountByAppId(Integer appId);

    /**
     * @Author zwj
     * @Description //TODO 更新渠道信息
     * @Date 2018/9/28 21:30
     * @Param [channel 渠道实体]
     * @return void
     **/
    void updateChannel(Channel channel);

    /**
     * @Author zwj
     * @Description //TODO 通过页面传过来的查询种类以及查询关键字来分页查询渠道信息
     * @Date 2018/9/28 21:30
     * @Param [kind 查询条件种类, keyword 查询条件关键字]
     * @return java.util.List<com.sdkserver.channel.model.Channel>
     **/
    List<Channel> findPageChannels(@Param("kind") String kind, @Param("keyword") String keyword);
}
