package com.sdkserver.log.Service;

import com.sdkserver.log.model.User;

/**
 * @ClassName IMessageProvider
 * @Description TODO
 * @Author zwJ
 * @Date 2018/9/18 20:35
 * @Version 1.0
 **/

public interface IMessageProvider {
    /**
     * @Author zwj
     * @Date 2018/9/18 20:41
     * @Param [user]
     **/
    public void send(User user);
}
