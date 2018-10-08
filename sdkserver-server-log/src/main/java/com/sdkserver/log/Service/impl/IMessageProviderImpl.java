package com.sdkserver.log.Service.impl;

import com.sdkserver.log.Service.ChannelProcess;
import com.sdkserver.log.Service.IMessageProvider;
import com.sdkserver.log.model.User;
import org.springframework.cloud.stream.annotation.EnableBinding;
//import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;

import javax.annotation.Resource;

/**
 * @ClassName IMessageProviderImpl
 * @Description TODO
 * @Author Administrator
 * @Date 2018/9/18 20:41
 * @Version 1.0
 **/
@EnableBinding(ChannelProcess.class) //可以理解为是一个消息的发送管道的定义
public class IMessageProviderImpl implements IMessageProvider {

    @Resource
    private MessageChannel mljhsdk_output;  //消息的发送管道

    @Override
    public void send(User user) {
        //创建并发送消息
        this.mljhsdk_output.send(MessageBuilder.withPayload(user).build());
    }
}
