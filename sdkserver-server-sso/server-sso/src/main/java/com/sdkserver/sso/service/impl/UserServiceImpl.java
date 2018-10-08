package com.sdkserver.sso.service.impl;

import com.sdkserver.sso.mapper.UserMapper;
import com.sdkserver.sso.model.User;
import com.sdkserver.sso.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public boolean saveUser(User user) {
        return userMapper.insert(user);
    }


    @Override
    public User get(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
