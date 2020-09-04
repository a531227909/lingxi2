package com.labour.service;

import com.labour.entity.Result;

public interface UserService {

    public Result selectAllUserType();

    public Result addOneUser(String user_name, String password, String name, String user_type, String create_user_id, String create_user_name);

}
