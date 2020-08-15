package com.labour.controller;

import com.labour.entity.Result;
import com.labour.service.LoginService;
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
    @RequestMapping(value="/test007")
    @ResponseBody
    public Result test007(){
        Result result = new Result();
        result.setCode("1000");
        result.setMsg("test007");
        return result;
    }

}
