package com.labour.controller;

import com.labour.entity.Result;
import com.labour.service.UserCompanyService;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class UserCompanyController {

    @Resource
    private UserCompanyService userCompanyService;

    @RequestMapping(value="/selectEntryApproval")
    @ResponseBody
    public Result selectEntryApproval(String company_id, String page){
        Result result = new Result();
        if(StringUtils.isBlank(company_id)){
            result.setCode("1001");
            result.setMsg("公司ID不能为空");
            return result;
        }else if(StringUtils.isBlank(page)){
            result.setCode("1001");
            result.setMsg("页码不能为空");
            return result;
        }
        result = userCompanyService.selectEntryApproval(company_id, page);
        return result;
    }

    @RequestMapping(value="/selectRaApproval")
    @ResponseBody
    public Result selectRaApproval(String company_id, String page){
        Result result = new Result();
        if(StringUtils.isBlank(company_id)){
            result.setCode("1001");
            result.setMsg("公司ID不能为空");
            return result;
        }else if(StringUtils.isBlank(page)){
            result.setCode("1001");
            result.setMsg("页码不能为空");
            return result;
        }
        result = userCompanyService.selectRaApproval(company_id, page);
        return result;
    }

    @RequestMapping(value="/selectAdvanceApproval")
    @ResponseBody
    public Result selectAdvanceApproval(String company_id, String page){
        Result result = new Result();
        if(StringUtils.isBlank(company_id)){
            result.setCode("1001");
            result.setMsg("公司ID不能为空");
            return result;
        }else if(StringUtils.isBlank(page)){
            result.setCode("1001");
            result.setMsg("页码不能为空");
            return result;
        }
        result = userCompanyService.selectAdvanceApproval(company_id, page);
        return result;
    }

}
