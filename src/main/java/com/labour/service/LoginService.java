package com.labour.service;

import com.labour.entity.Result;
import com.labour.entity.User;

public interface LoginService {

    Result doLogin(String user_name, String password, String ip);

    Result testLabour();

    Result selectAllUser(String data);

    Result doWechatLogin(String weChatId, String headImage, String petName, String ip);

}
