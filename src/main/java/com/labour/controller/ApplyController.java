package com.labour.controller;

import com.labour.entity.Result;
import com.labour.entity.UserCompany;
import com.labour.model.PagesResult;
import com.labour.service.ApplyService;
import com.labour.service.DispatchedService;
import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class ApplyController {

    @Resource
    private ApplyService applyService;

    @RequestMapping(value="/insertOneEntryApply")
    @ResponseBody
    public Result insertOneEntryApply(String user_id, String laborDemandId, String workReviewTypeId, String workReviewType, String reviewReason){
        Result result = new Result();
        if(StringUtils.isBlank(user_id)){
            result.setCode("1001");
            result.setMsg("用户ID不能为空");
        }else if(StringUtils.isBlank(laborDemandId)){
            result.setCode("1001");
            result.setMsg("用工需求ID不能为空");
        }else if(StringUtils.isBlank(workReviewTypeId)){
            result.setCode("1001");
            result.setMsg("工作申请类型ID不能为空 1:入职审核 2:离职审核");
        }else if(StringUtils.isBlank(workReviewType)){
            result.setCode("1001");
            result.setMsg("工作申请类型不能为空");
        }
        result = applyService.insertOneEntryApply(user_id, laborDemandId, workReviewTypeId, workReviewType, reviewReason);
        return result;
    }

    @RequestMapping(value="/insertOneRaApply")
    @ResponseBody
    public Result insertOneRaApply(String user_id, String company_id, String workReviewTypeId, String workReviewType, String reviewReason){
        Result result = new Result();
        if(StringUtils.isBlank(user_id)){
            result.setCode("1001");
            result.setMsg("用户ID不能为空");
        }else if(StringUtils.isBlank(company_id)){
            result.setCode("1001");
            result.setMsg("公司ID不能为空");
        }else if(StringUtils.isBlank(workReviewTypeId)){
            result.setCode("1001");
            result.setMsg("工作申请类型ID不能为空 1:入职审核 2:离职审核");
        }else if(StringUtils.isBlank(workReviewType)){
            result.setCode("1001");
            result.setMsg("工作申请类型不能为空");
        }
        result = applyService.insertOneRaApply(user_id, company_id, workReviewTypeId, workReviewType, reviewReason);
        return result;
    }

}
