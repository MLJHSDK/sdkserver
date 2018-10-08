package com.sdkserver.channel.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.sdkserver.channel.common.generator.IDUtils;
import com.sdkserver.channel.common.redis.RedisTemplateUtil;
import com.sdkserver.channel.mapper.ChannelMasterMapper;
import com.sdkserver.channel.model.ChannelMaster;
import com.sdkserver.channel.service.ChannelMasterService;

import com.sdkserver.common.empty.Verify;
import com.sdkserver.common.result.FindBean;
import com.sdkserver.common.result.PageBean;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.data.redis.core.StringRedisTemplate;
//import org.springframework.data.redis.core.ValueOperations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ChannelMasterServiceImpl implements ChannelMasterService {


    @Resource
    private ChannelMasterMapper channelMasterMapper;

    @Resource
    private IDUtils idUtils;


    @Override
    public PageBean<ChannelMaster> findPageChannelMaster(FindBean findBean) {

        Page page = PageHelper.startPage(findBean.getCurrentPage(),findBean.getPageSize(),true);
        List<ChannelMaster> list = channelMasterMapper.findPageChannelMaster(findBean.getKeyword(),findBean.getKind());

        return new PageBean(findBean, (int)page.getTotal(), list);

    }

    @Override
    public void insert(ChannelMaster channelMaster) {

    //  redisTemplate.opsForValue().increment("CHANNEL_ID",1);
       // channelMaster.setMasterID((int) (new IDUtils()).RID());
        //获取redis的id
        channelMaster.setMasterID((int)idUtils.RID());
        channelMasterMapper.insert(channelMaster);
    }

    @Override
    public int updateChannelMaster(ChannelMaster channelMaster) {

        return channelMasterMapper.updateBySelective(channelMaster);

    }

    @Override
    public ChannelMaster selectByPrimaryKey(Integer masterID) {
        return channelMasterMapper.selectByPrimaryKey(masterID);
    }

    @Override
    public int deleteChannelMaster(int id) {
        return channelMasterMapper.deleteByPrimaryKey(id);
    }

    @Override
    public ChannelMaster verifyObject(int id) {

        ChannelMaster channelMaster = channelMasterMapper.selectByPrimaryKey(id);

        //1 判断对象是否为空，如果为空跑出NullObjectException
        Verify.objectNull(channelMaster);
        //2 不为空则返回对象
        return channelMaster;
    }
    //获取渠道商信息（渠道商ID以及渠道商名称）
    @Override
    public Map<Integer, String> findAllChannelMaster() {
        Map<Integer, String> map = new HashMap<>();
        List<ChannelMaster> allChannelMaster = channelMasterMapper.findAllChannelMaster();
        for (ChannelMaster channelMaster: allChannelMaster) {
            map.put(channelMaster.getMasterID(),channelMaster.getMasterName());
        }
        return map;
    }
    /**
     * @Author zwj
     * @Description //TODO 如果findBean中的kind是渠道名称的话，则需要将它转化为对应的masterId，这个方法就是跟渠道名称来获得渠道商ID
     * @Date 2018/9/27 21:25
     * @Param [keyword]
     * @return java.lang.String
     **/
    @Override
    public String findMasterIdByName(String keyword) {
        return channelMasterMapper.findMasterIdByName(keyword);
    }
}
