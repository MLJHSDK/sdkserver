package com.sdkserver.channel.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.sdkserver.channel.mapper.ChannelMapper;
import com.sdkserver.channel.model.Channel;
import com.sdkserver.channel.service.ChannelService;
import com.sdkserver.common.empty.Verify;
import com.sdkserver.common.result.FindBean;
import com.sdkserver.common.result.PageBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ChannelServiceImpl implements ChannelService {

    @Resource
    private ChannelMapper channelMapper;

    @Override
    public List<Channel> findAllChannels() {

        return channelMapper.findAllChannels();
    }

    @Override
    public void addChannel(Channel channel) {
        channelMapper.addChannel(channel);
    }

    @Override
    public Channel queryChannelById(Integer channelID) {
        //以后需要从缓存中取
        Channel channel = channelMapper.queryChannelByID(channelID);
        //1 判断对象是否为空，如果为空跑出NullObjectException
        Verify.objectNull(channel);
        //2 不为空则返回对象
        return channel;
    }

    @Override
    public void deleteChannelById(Integer channelId) {
        channelMapper.deleteChannelById(channelId);
    }

    @Override
    public Integer findChannelCountByAppId(Integer appId) {
        return channelMapper.findChannelCountByAppId(appId);
    }

    @Override
    public void updateChannel(Channel channel) {
        channelMapper.updateChannel(channel);
    }

    @Override
    public PageBean<Channel> findPageChannels(FindBean findBean) {
        PageBean<Channel> pageChannels = new PageBean<>();
        Page page = PageHelper.startPage(findBean.getCurrentPage(),findBean.getPageSize(),true);
        List<Channel> ChannelList = channelMapper.findPageChannels(findBean.getKind(),findBean.getKeyword());
        Integer totalNum = Long.valueOf(page.getTotal()).intValue();
        return pageChannels.setCurrentPage(findBean.getCurrentPage()).setPageSize(findBean.getPageSize()).setTotalNum(totalNum).setListObject(ChannelList);
    }
}
