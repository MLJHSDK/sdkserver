package com.sdkserver.log.Service;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * @ClassName ChannelProcess
 * @Description TODO
 * @Author Administrator
 * @Date 2018/9/19 14:28
 * @Version 1.0
 **/

public interface ChannelProcess {

    public static final String OUTPUT = "mljhsdk_output";
//    public static final String INPUT = "";

    @Output(ChannelProcess.OUTPUT)
    public MessageChannel output();

}
