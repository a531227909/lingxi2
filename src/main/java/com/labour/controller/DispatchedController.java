package com.labour.controller;

import com.labour.entity.Result;
import com.labour.model.PagesResult;
import com.labour.service.DispatchedService;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class DispatchedController {

    @Resource
    private DispatchedService dispatchedService;

    @RequestMapping(value="/selectDispatchedByFactor")
    @ResponseBody
    public PagesResult selectDispatchedByFactor(String workAuditStatus, String company_id, String name, String phoneNum, String province_code, String city_code,
                                                String usingCompanyId, String stationName, String workReviewTypeId, String user_id, String page){
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
        pagesResult = dispatchedService.selectDispatchedByFactor(workAuditStatus, company_id, name, phoneNum, province_code, city_code, usingCompanyId, stationName, workReviewTypeId, user_id, page);
        return pagesResult;
    }

    @RequestMapping(value="/selectOneDispatched")
    @ResponseBody
    public Result selectOneDispatched(String workAuditId){
        Result result = new Result();
        if(StringUtils.isBlank(workAuditId)){
            result.setCode("1001");
            result.setMsg("工作审核ID不能为空");
            return result;
        }
        result = dispatchedService.selectOneDispatched(workAuditId);
        return result;
    }

    @RequestMapping(value="/updateWorkAuditIdIsOk")
    @ResponseBody
    public Result updateWorkAuditIdIsOk(String isOk, String audit_info, String workAuditStatus, String workAuditId){
        Result result = new Result();
        if(StringUtils.isBlank(isOk)){
            result.setCode("1001");
            result.setMsg("是否批准不能为空");
            return result;
        }else if(StringUtils.isBlank(workAuditId)){
            result.setCode("1001");
            result.setMsg("工作审核ID不能为空");
            return result;
        }
        result = dispatchedService.updateWorkAuditIdIsOk(isOk, audit_info, workAuditStatus, workAuditId);
        return result;
    }

}
