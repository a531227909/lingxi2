package com.labour.service.impl;

import com.labour.dao.CompanyDao;
import com.labour.dao.UserDao;
import com.labour.entity.Company;
import com.labour.entity.Result;
import com.labour.entity.User;
import com.labour.model.PagesResult;
import com.labour.model.UserType;
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

    @Resource
    private CompanyDao companyDao;

    @Override
    public Result addOneUser(String user_name, String password, String name, String user_type_id, String company_id, String create_user_id, String create_user_name) {
        Result result = new Result();
        User user = userDao.selectOneUser(user_name);
        if(user != null){
            result.setCode("1001");
            result.setMsg("添加失败，用户已存在");
            return result;
        }
        Company company = companyDao.selectOneCompany(company_id);
        if(company == null){
            result.setCode("1001");
            result.setMsg("添加失败，公司ID不存在");
            return result;
        }
        int i = userDao.addOneUser(user_name, Md5Utils.string2Md5(password), name, user_type_id, create_user_id, create_user_name, "1");
        if(i == 1){
            User acount = userDao.selectOneUser(user_name);
            int j = userDao.addUserCompany(acount.getUser_id(), acount.getUser_name(), company_id, company.getCompany_full_name());
            if(j == 1){
                result.setCode("1000");
                result.setMsg("添加用户成功");
            }else{
                result.setCode("1001");
                result.setMsg("系统故障，添加用户公司失败");
            }
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
        List<UserType> userTypes = userDao.selectAllUserType();
        result.setCode("1000");
        result.setMsg("查询成功");
        result.setData(userTypes);
        return result;
    }

    @Override
    public Result updatePassword(String user_name, String password) {
        Result result = new Result();
        User user = userDao.selectOneUser(user_name);
        if(user == null){
            result.setCode("1001");
            result.setMsg("更新失败，用户不存在");
            return result;
        }
        int i = userDao.updatePassword(user_name, Md5Utils.string2Md5(password));
        if(i == 1){
            result.setCode("1000");
            result.setMsg("更改密码成功");
        }else{
            result.setCode("1001");
            result.setMsg("系统故障，更改密码失败");
        }
        return result;
    }

    @Override
    public Result updateStatus(String user_name, String status) {
        Result result = new Result();
        User user = userDao.selectOneUser(user_name);
        if(user == null){
            result.setCode("1001");
            result.setMsg("更新失败，用户不存在");
            return result;
        }
        int i = userDao.updateStatus(user_name, status);
        if(i == 1){
            result.setCode("1000");
            result.setMsg("更新状态成功");
        }else{
            result.setCode("1001");
            result.setMsg("系统故障，更改密码失败");
        }
        return result;
    }

    @Override
    public PagesResult selectUserByFactor(String company_id, String name, String user_name, String user_type_id, String page) {
        PagesResult pagesResult = new PagesResult();
        int star_num = (Integer.parseInt(page)-1)*10;
        int pageSize = 10;
        int count = userDao.selectCountByFactor(company_id, name, user_name, user_type_id);
        List<User> users = userDao.selectUserByFactor(company_id, name, user_name, user_type_id, star_num, pageSize);
        String pages = String.valueOf(count/pageSize + 1);
        pagesResult.setCode("1000");
        pagesResult.setMsg("查询成功");
        pagesResult.setPages(pages);
        pagesResult.setData(users);
        pagesResult.setCount(String.valueOf(count));
        return pagesResult;
    }

    @Override
    public Result selectUsersCount(String status, String company_id) {
        Result result = new Result();
        List<UserType> userTypes = userDao.selectUsersCount(status, company_id);
        result.setCode("1000");
        result.setMsg("查询成功");
        result.setData(userTypes);
        return result;
    }

}
