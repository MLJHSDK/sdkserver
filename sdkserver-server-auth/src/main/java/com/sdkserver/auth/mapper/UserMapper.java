package com.sdkserver.auth.mapper;

import com.sdkserver.auth.model.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ClassName UserMapper
 * @Description TODO 秒乐聚合玩家认证服务 Mapper接口
 * @Author zwJ
 * @Date 2018/9/25 17:54
 * @Version 1.0
 **/
@Mapper
public interface UserMapper {
    /**
     * @Author zwj
     * @Description //TODO  通过玩家Id去秒乐聚合中查找一个玩家实例
     * @Date 2018/9/25 17:58
     * @Param [玩家ID]
     * @return com.sdkserver.auth.model.User
     **/
    User queryUserById(int id);
    
    /**
     * @Author zwj
     * @Description //TODO 通过玩家Id去秒乐聚合中删除一条玩家记录
     * @Date 2018/9/25 18:01 
     * @Param [玩家ID]
     * @return void
     **/
    void deleteUserById(int id);
}
