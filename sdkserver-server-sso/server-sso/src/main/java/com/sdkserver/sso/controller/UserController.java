package com.sdkserver.sso.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.sdkserver.sso.model.User;
import com.sdkserver.sso.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user/add", method = RequestMethod.POST)
    public boolean add(@RequestBody User user) {
        return userService.saveUser(user);

    }

    @RequestMapping(value = "/user/get/{id}", method = RequestMethod.GET)
    //一旦调用服务方法失败并抛出了错误信息后，会自动调用@HystrixCommand标注好的fallbackMethod调用类中的指定方法
    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    public User get(@PathVariable("id") Integer id) {

        User user = userService.get(id);
        if (null == user) {
            throw new RuntimeException("该ID：" + id + "没有没有对应的信息");
        }

        return user;
    }

    public User processHystrix_Get(@PathVariable("id") Integer id) {
        return new User("该ID：" + id + "没有没有对应的信息,null--@HystrixCommand");
    }
}
