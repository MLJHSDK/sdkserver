package com.pay.service.impl;

import com.pay.service.UserService;
import com.pay.mapper.UserMapper;
import com.pay.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper mapper;

    @Override
    public void saveUser(User user) {
        mapper.insert(user);
    }
}
