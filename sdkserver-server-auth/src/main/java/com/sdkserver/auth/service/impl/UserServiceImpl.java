package com.sdkserver.auth.service.impl;

import com.sdkserver.auth.mapper.UserMapper;
import com.sdkserver.auth.model.User;
import com.sdkserver.auth.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author Administrator
 * @Date 2018/9/25 17:47
 * @Version 1.0
 **/
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User queryUserById(int id) {
        return userMapper.queryUserById(id);
    }

    @Override
    public void deleteUserById(int id) {
        userMapper.deleteUserById(id);
    }
}
