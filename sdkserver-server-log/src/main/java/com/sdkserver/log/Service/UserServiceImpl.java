package com.sdkserver.log.Service;

import com.sdkserver.log.mapper.UserMapper;
import com.sdkserver.log.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService{

//    @Resource
//    private UserMapper userMapper;
//
    @Override
    public User get(int i) {
//        return userMapper.selectByPrimaryKey(1);
        return new User();
    }
}
