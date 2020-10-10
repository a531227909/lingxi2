package com.labour.controller;

import com.labour.entity.Result;
import com.labour.model.PagesResult;
import com.labour.service.LoginService;
import com.labour.service.UserService;
import com.labour.utils.HttpRequestUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {

    @Resource
    private LoginService loginService;

    @Resource
    private UserService userService;

    @RequestMapping(value="/selectUserByPage")
    @ResponseBody
    public Result selectUserByPage(HttpServletRequest req, String user_name, String password, String verifycode){
        Result result = new Result();
        if(StringUtils.isBlank(user_name)){
            result.setCode("1001");
            result.setMsg("用户名不能为空");
            return result;
        }else if(StringUtils.isBlank(password)){
            result.setCode("1001");
            result.setMsg("密码不能为空");
            return result;
        }else if(StringUtils.isBlank(verifycode)){
            result.setCode("1001");
            result.setMsg("验证码不能为空");
            return result;
        }
        String key = (String) req.getSession().getAttribute("verifycode");
        if(verifycode.equalsIgnoreCase(key)){
            req.getSession().removeAttribute("verifycode");
            //获取登录的IP地址
            String ip = HttpRequestUtils.getIp2(req);
            result = loginService.doLogin(user_name, password, ip);
        }else{
            result.setCode("1001");
            result.setMsg("验证码错误");
        }
        return result;
    }

    @RequestMapping(value="/addOneUser")
    @ResponseBody
    public Result addOneUser(String user_name, String password, String name, String user_type_id, String company_id, String create_user_id, String create_user_name){
        Result result = new Result();
        if(StringUtils.isBlank(user_name)){
            result.setCode("1001");
            result.setMsg("用户名不能为空");
            return result;
        }else if(StringUtils.isBlank(password)){
            result.setCode("1001");
            result.setMsg("密码不能为空");
            return result;
        }else if(StringUtils.isBlank(name)){
            result.setCode("1001");
            result.setMsg("名字不能为空");
            return result;
        }else if(StringUtils.isBlank(user_type_id)){
            result.setCode("1001");
            result.setMsg("用户类型不能为空");
            return result;
        }else if(StringUtils.isBlank(company_id)){
            result.setCode("1001");
            result.setMsg("公司ID不能为空");
            return result;
        }else if(StringUtils.isBlank(create_user_id)){
            result.setCode("1001");
            result.setMsg("创建者ID不能为空");
            return result;
        }else if(StringUtils.isBlank(create_user_name)){
            result.setCode("1001");
            result.setMsg("创建者用户名不能为空");
            return result;
        }
        result = userService.addOneUser(user_name, password, name, user_type_id, company_id, create_user_id, create_user_name);
        return result;
    }

    @RequestMapping(value="/selectAllUserType")
    @ResponseBody
    public Result selectAllUserType(){
        Result result = new Result();
        result = userService.selectAllUserType();
        return result;
    }

    @RequestMapping(value="/selectUserTypeByFactor")
    @ResponseBody
    public Result selectUserTypeByFactor(String user_type_id, String status){
        Result result = new Result();
        result = userService.selectUserTypeByFactor(user_type_id, status);
        return result;
    }

    @RequestMapping(value="/resetUserPassword")
    @ResponseBody
    public Result resetUserPassword(String user_name){
        Result result = new Result();
        if(StringUtils.isBlank(user_name)){
            result.setCode("1001");
            result.setMsg("用户名不能为空");
            return result;
        }
        result = userService.updatePassword(user_name, "123456");
        return result;
    }

    @RequestMapping(value="/updateUserStatus")
    @ResponseBody
    public Result updateUserStatus(String user_name, String status){
        Result result = new Result();
        if(StringUtils.isBlank(user_name)){
            result.setCode("1001");
            result.setMsg("用户名不能为空");
            return result;
        }else if(StringUtils.isBlank(status)){
            result.setCode("1001");
            result.setMsg("用户状态不能为空");
            return result;
        }
        result = userService.updateStatus(user_name, status);
        return result;
    }

    @RequestMapping(value="/selectUserByFactor")
    @ResponseBody
    public PagesResult selectUserByFactor(String company_id, String name, String user_name, String user_type_id, String page){
        PagesResult pagesResult = new PagesResult();
        if(StringUtils.isBlank(page)){
            pagesResult.setCode("1001");
            pagesResult.setMsg("查询页码不能为空");
            return pagesResult;
        }
        pagesResult = userService.selectUserByFactor(company_id, name, user_name, user_type_id, page);
        return pagesResult;
    }

    @RequestMapping(value="/selectUsersCount")
    @ResponseBody
    public Result selectUsersCount(String status, String company_id){
        Result result = new Result();
        if(StringUtils.isBlank(status)){
            result.setCode("1001");
            result.setMsg("身份ID不能为空");
            return result;
        }else if(StringUtils.isBlank(company_id)){
            result.setCode("1001");
            result.setMsg("公司ID不能为空");
            return result;
        }
        result = userService.selectUsersCount(status, company_id);
        return result;
    }

}
