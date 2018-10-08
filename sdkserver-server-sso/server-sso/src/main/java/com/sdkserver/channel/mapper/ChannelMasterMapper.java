package com.sdkserver.channel.mapper;

import com.sdkserver.channel.model.ChannelMaster;
import com.sdkserver.channel.model.ChannelMasterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChannelMasterMapper {
    int countByExample(ChannelMasterExample example);

    int deleteByExample(ChannelMasterExample example);

    int deleteByPrimaryKey(Integer masterId);

    int insert(ChannelMaster record);

    int insertSelective(ChannelMaster record);

    List<ChannelMaster> selectByExample(ChannelMasterExample example);

    ChannelMaster selectByPrimaryKey(Integer masterId);

    int updateByExampleSelective(@Param("record") ChannelMaster record, @Param("example") ChannelMasterExample example);

    int updateByExample(@Param("record") ChannelMaster record, @Param("example") ChannelMasterExample example);

    int updateByPrimaryKeySelective(ChannelMaster record);

    int updateByPrimaryKey(ChannelMaster record);
}