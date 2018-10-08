package com.sdkserverserverlog.stream.service;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.SubscribableChannel;

/**
 * @ClassName ChannelProcess
 * @Description TODO
 * @Author Administrator
 * @Date 2018/9/19 14:28
 * @Version 1.0
 **/

public interface ChannelProcess {

    public static final String INPUT = "MEJHSDK_INPUT";
//    public static final String INPUT = "";

    @Input(ChannelProcess.INPUT)
    public SubscribableChannel input();

}
