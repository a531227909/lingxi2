package com.labour.service;

import com.labour.entity.Result;
import com.labour.model.PagesResult;

public interface UserService {

    public Result selectAllUserType();

    public Result addOneUser(String user_name, String password, String name, String user_type_id, String company_id, String create_user_id, String create_user_name);

    public Result updatePassword(String user_name, String password);

    public Result updateStatus(String user_name, String status);

    public PagesResult selectUserByFactor(String company_id, String name, String user_name, String user_type_id, String page);

    public Result selectUsersCount(String status, String company_id);
}
