package com.sdkserver.channel.mapper;

import com.sdkserver.channel.model.ChannelMaster;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ChannelMasterMapper {

    List<ChannelMaster> findAllChannelMaster();

    int insert(ChannelMaster channelMaster);

    ChannelMaster selectByPrimaryKey(Integer masterID);

    int updateBySelective(ChannelMaster channelMaster);

    int deleteByPrimaryKey(Integer id);

    List<ChannelMaster> findPageChannelMaster(@Param("keyword")String keyword, @Param("kind")String kind);

    String findMasterIdByName(String keyword);
}
