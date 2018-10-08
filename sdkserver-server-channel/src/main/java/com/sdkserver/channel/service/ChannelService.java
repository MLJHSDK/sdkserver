package com.sdkserver.channel.service;

import com.sdkserver.channel.model.Channel;
import com.sdkserver.common.result.FindBean;
import com.sdkserver.common.result.PageBean;

import java.util.List;

public interface ChannelService {

    List<Channel> findAllChannels();

    void addChannel(Channel channel);

    Channel queryChannelById(Integer channelID);

    void deleteChannelById(Integer channelId);

    Integer findChannelCountByAppId(Integer appId);

    void updateChannel(Channel channel);

    PageBean<Channel> findPageChannels(FindBean findBean);
}
