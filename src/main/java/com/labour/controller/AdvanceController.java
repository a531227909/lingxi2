package com.labour.controller;

import com.labour.entity.Result;
import com.labour.model.PagesResult;
import com.labour.service.AdvanceService;
import com.labour.service.DispatchedService;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class AdvanceController {

    @Resource
    private AdvanceService advanceService;

    @RequestMapping(value="/selectAdvanceByFactor")
    @ResponseBody
    public PagesResult selectAdvanceByFactor(String name, String gender, String phoneNum, String province_code, String city_code, String company_id, String usingCompanyId, String stationName, String page){
        PagesResult pagesResult = new PagesResult();
        if(StringUtils.isBlank(company_id)){
            pagesResult.setCode("1001");
            pagesResult.setMsg("公司ID不能为空");
            return pagesResult;
        }else if(StringUtils.isBlank(page)){
            pagesResult.setCode("1001");
            pagesResult.setMsg("页码不能为空");
            return pagesResult;
        }
        pagesResult = advanceService.selectAdvanceByFactor(name, gender, phoneNum, province_code, city_code, company_id, usingCompanyId, stationName, page);
        return pagesResult;
    }

    @RequestMapping(value="/selectOneAdvance")
    @ResponseBody
    public Result selectOneAdvance(String advanceId){
        Result result = new Result();
        if(StringUtils.isBlank(advanceId)){
            result.setCode("1001");
            result.setMsg("预支审核权限ID不能为空");
            return result;
        }
        result = advanceService.selectOneAdvance(advanceId);
        return result;
    }

    @RequestMapping(value="/updateAdvanceStatus")
    @ResponseBody
    public Result updateAdvanceStatus(String status, String advanceId){
        Result result = new Result();
        if(StringUtils.isBlank(status)){
            result.setCode("1001");
            result.setMsg("是否批准不能为空");
            return result;
        }else if(StringUtils.isBlank(advanceId)){
            result.setCode("1001");
            result.setMsg("预支审核权限ID不能为空");
            return result;
        }
        result = advanceService.updateAdvanceStatus(status, advanceId);
        return result;
    }

}
