package com.sdkserver.sso.service;

import com.sdkserver.sso.model.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "sdkserver-server-sso",fallbackFactory=UserClientServiceFallbackFactory.class)
public interface UserClientService {

    @RequestMapping(value = "/user/add", method = RequestMethod.POST)
    public boolean add(User user);

    @RequestMapping(value = "/user/get/{id}", method = RequestMethod.GET)
    public User get(@PathVariable("id") Integer id);
}
