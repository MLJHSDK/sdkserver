package com.sdkserver.sso.service;

import com.sdkserver.sso.model.User;

public interface UserService {
    public boolean saveUser(User user);

    User get(Integer id);
}
