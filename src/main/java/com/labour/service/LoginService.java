package com.labour.service;

import com.labour.entity.Result;

public interface LoginService {

    Result doLogin(String user_name, String password, String ip);

    Result testLabour();

    Result selectAllUser(String data);

}
