package com.labour.service.impl;

import com.labour.dao.UserDao;
import com.labour.entity.Result;
import com.labour.entity.User;
import com.labour.entity.UserType;
import com.labour.service.UserService;
import com.labour.utils.Md5Utils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.support.ApplicationObjectSupport;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl extends ApplicationObjectSupport implements UserService {

    private static Logger logger = LogManager.getLogger("org.springframework");

    @Resource
    private UserDao userDao;

    @Override
    public Result addOneUser(String user_name, String password, String name, String user_type, String create_user_id, String create_user_name) {
        Result result = new Result();
        User user = userDao.selectOneUser(user_name);
        if(user!=null){
            result.setCode("1001");
            result.setMsg("添加失败，用户已存在");
            return result;
        }
        int i = userDao.addOneUser(user_name, Md5Utils.string2Md5(password), name, user_type, create_user_id, create_user_name, "1");
        if(i == 1){
            result.setCode("1000");
            result.setMsg("添加用户成功");
        }else{
            result.setCode("1001");
            result.setMsg("系统故障，添加用户失败");
        }
        return result;
    }

    @Override
    public Result selectAllUserType() {
        Result result = new Result();
        List<UserType> userTypes = new ArrayList<>();
        userTypes = userDao.selectAllUserType();
        result.setCode("1000");
        result.setMsg("查询成功");
        result.setData(userTypes);
        return result;
    }

}
