package com.pay.controller;

import com.pay.model.User;
import com.pay.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user/add", method = RequestMethod.GET)
    public boolean add()
    {
        User u = new User();
      //  u.setId(1);
        u.setName("aaa");
        u.setNumber("1324569871");
        userService.saveUser(u);
        return true;
    }
}
