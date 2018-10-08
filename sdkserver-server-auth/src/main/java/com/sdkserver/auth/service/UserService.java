package com.sdkserver.auth.service;

import com.sdkserver.auth.model.User;

/**
 * @ClassName UserService
 * @Description TODO //秒乐聚合玩家认证服务 业务层抽象类
 * @Author Administrator
 * @Date 2018/9/25 17:46
 * @Version 1.0
 **/
public interface UserService {

    /**
     * @Author zwj
     * @Description //在秒乐聚合中查找一个玩家
     * @Date 2018/9/25 17:49 
     * @Param [用户Id]
     * @return com.sdkserver.auth.model.User
     **/
    User queryUserById(int id);
    
    /**
     * @Author zwj
     * @Description //在秒乐聚合中删除一个玩家
     * @Date 2018/9/25 17:51 
     * @Param [用户Id]
     * @return
     **/
    void deleteUserById(int id);
}
