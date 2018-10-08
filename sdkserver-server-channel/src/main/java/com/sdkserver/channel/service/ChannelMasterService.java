package com.sdkserver.channel.service;

import com.sdkserver.channel.model.ChannelMaster;
import com.sdkserver.common.result.FindBean;
import com.sdkserver.common.result.PageBean;

import java.util.Map;

public interface ChannelMasterService {
    PageBean<ChannelMaster> findPageChannelMaster(FindBean findBean);

    void insert(ChannelMaster channelMaster);

    int updateChannelMaster(ChannelMaster channelMaster);

    ChannelMaster selectByPrimaryKey(Integer masterID);

    int deleteChannelMaster(int id);

    //查找该对象是否存在，不存在抛出NullObjectException,否则返回该对象
    ChannelMaster verifyObject(int id);

    Map<Integer,String> findAllChannelMaster();

    String findMasterIdByName(String keyword);
}
