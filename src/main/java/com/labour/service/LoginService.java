package com.labour.service;

import com.labour.entity.Result;

public interface LoginService {

    public Result doLogin(String user_name, String password, String verification);

    public Result testLabour();

}
