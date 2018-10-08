package com.sdkserverserverlog.stream.service;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
//import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * @ClassName MessageListener
 * @Description TODO
 * @Author zwj
 * @Date 2018/9/19 10:33
 * @Version 1.0
 **/
@Component
@EnableBinding(ChannelProcess.class)
public class MessageListener {

    @StreamListener(ChannelProcess.INPUT)
    public void receiveMessage(Message message) {
        System.err.println("接受到消息：     "+ message.getPayload().toString());
    }
}
