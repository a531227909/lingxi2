package com.labour.controller;

import com.labour.entity.Result;
import com.labour.service.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class TestController {

    @Resource
    private TestService testService;

    @RequestMapping(value="/dologin")
    @ResponseBody
    public Result login(String account_id){
        Result result = new Result();
        result = testService.testdoLogin(account_id);
        return result;
    }

    @RequestMapping(value="/testLabour")
    @ResponseBody
    public Result testLabour(){
        Result result = new Result();
        result = testService.testLabour();
        return result;
    }

}
