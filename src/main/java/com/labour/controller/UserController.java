package com.labour.controller;

import com.labour.entity.Result;
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
    public Result addOneUser(String user_name, String password, String name, String user_type, String create_user_id, String create_user_name){
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
        }else if(StringUtils.isBlank(user_type)){
            result.setCode("1001");
            result.setMsg("用户类型不能为空");
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
        result = userService.addOneUser(user_name, password, name, user_type,create_user_id, create_user_name);
        return result;
    }

    @RequestMapping(value="/selectAllUserType")
    @ResponseBody
    public Result selectAllUserType(){
        Result result = new Result();
        result = userService.selectAllUserType();
        return result;
    }

}
