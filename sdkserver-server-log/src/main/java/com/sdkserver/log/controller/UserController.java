package com.sdkserver.log.controller;

import com.sdkserver.log.Service.UserService;
import com.sdkserver.log.model.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RefreshScope
public class UserController {

    @Resource
    private UserService  userService;

//    @Value("${zwj}")
//    private String zwj;


    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public User add() {
        return userService.get(1);
    }

//    @RequestMapping("/zwj")
//    public String getPort() {
//        return zwj;
//    }

}
