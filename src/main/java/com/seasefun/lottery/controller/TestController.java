package com.seasefun.lottery.controller;

import com.seasefun.lottery.entity.Result;
import com.seasefun.lottery.service.TestService;
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

    @RequestMapping(value="/testLottery")
    @ResponseBody
    public Result testLottery(){
        Result result = new Result();
        result = testService.testLottery();
        return result;
    }

}
