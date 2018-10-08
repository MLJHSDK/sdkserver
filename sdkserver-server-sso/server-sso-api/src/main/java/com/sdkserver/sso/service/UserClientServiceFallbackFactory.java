package com.sdkserver.sso.service;

import com.sdkserver.sso.model.User;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class UserClientServiceFallbackFactory implements FallbackFactory<UserClientService> {
    @Override
    public UserClientService create(Throwable throwable) {
        return new UserClientService() {

            @Override
            public boolean add(User user) {
                return false;
            }

            @Override
            public User get(Integer id) {
                return new User("该ID："+id+"没有没有对应的信息,Consumer客户端提供的降级信息,此刻服务Provider已经关闭");
            }
        };
    }
}
