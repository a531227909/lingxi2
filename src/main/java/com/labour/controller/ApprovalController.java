package com.labour.controller;

import com.labour.entity.Result;
import com.labour.service.ApprovalService;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class ApprovalController {

    @Resource
    private ApprovalService approvalService;

    @RequestMapping(value="/selectOneEntryApproval")
    @ResponseBody
    public Result selectOneEntryApproval(String company_id, String user_id){
        Result result = new Result();
        if(StringUtils.isBlank(company_id)){
            result.setCode("1001");
            result.setMsg("公司ID不能为空");
            return result;
        }else if(StringUtils.isBlank(user_id)){
            result.setCode("1001");
            result.setMsg("用户ID不能为空");
            return result;
        }
        result = approvalService.selectOneEntryApproval(company_id, user_id);
        return result;
    }

    @RequestMapping(value="/selectOneRaApproval")
    @ResponseBody
    public Result selectOneRaApproval(String company_id, String user_id){
        Result result = new Result();
        if(StringUtils.isBlank(company_id)){
            result.setCode("1001");
            result.setMsg("公司ID不能为空");
            return result;
        }else if(StringUtils.isBlank(user_id)){
            result.setCode("1001");
            result.setMsg("用户ID不能为空");
            return result;
        }
        result = approvalService.selectOneRaApproval(company_id, user_id);
        return result;
    }

    @RequestMapping(value="/selectOnePaApproval")
    @ResponseBody
    public Result selectOnePaApproval(String company_id, String user_id){
        Result result = new Result();
        if(StringUtils.isBlank(company_id)){
            result.setCode("1001");
            result.setMsg("公司ID不能为空");
            return result;
        }else if(StringUtils.isBlank(user_id)){
            result.setCode("1001");
            result.setMsg("用户ID不能为空");
            return result;
        }
        result = approvalService.selectOnePaApproval(company_id, user_id);
        return result;
    }

    @RequestMapping(value="/selectEntryApprovals")
    @ResponseBody
    public Result selectEntryApprovals(String company_id){
        Result result = new Result();
        if(StringUtils.isBlank(company_id)){
            result.setCode("1001");
            result.setMsg("公司ID不能为空");
            return result;
        }
        result = approvalService.selectEntryApprovals(company_id);
        return result;
    }

    @RequestMapping(value="/selectRaApprovals")
    @ResponseBody
    public Result selectRaApprovals(String company_id){
        Result result = new Result();
        if(StringUtils.isBlank(company_id)){
            result.setCode("1001");
            result.setMsg("公司ID不能为空");
            return result;
        }
        result = approvalService.selectRaApprovals(company_id);
        return result;
    }

    @RequestMapping(value="/selectPaApprovals")
    @ResponseBody
    public Result selectPaApprovals(String company_id){
        Result result = new Result();
        if(StringUtils.isBlank(company_id)){
            result.setCode("1001");
            result.setMsg("公司ID不能为空");
            return result;
        }
        result = approvalService.selectPaApprovals(company_id);
        return result;
    }

    @RequestMapping(value="/insertOneEnApproval")
    @ResponseBody
    public Result insertOneEnApproval(String company_id, String parentId, String user_id){
        Result result = new Result();
        if(StringUtils.isBlank(user_id)){
            result.setCode("1001");
            result.setMsg("用户ID不能为空");
            return result;
        }else if(StringUtils.isBlank(company_id)){
            result.setCode("1001");
            result.setMsg("公司ID不能为空");
            return result;
        }else if(StringUtils.isBlank(parentId)){
            result.setCode("1001");
            result.setMsg("上级审核权限ID不能为空");
            return result;
        }
        result = approvalService.insertOneEnApproval(company_id, parentId, user_id);
        return result;
    }

    @RequestMapping(value="/insertOneRaApproval")
    @ResponseBody
    public Result insertOneRaApproval(String company_id, String parentId, String user_id){
        Result result = new Result();
        if(StringUtils.isBlank(user_id)){
            result.setCode("1001");
            result.setMsg("用户ID不能为空");
            return result;
        }else if(StringUtils.isBlank(company_id)){
            result.setCode("1001");
            result.setMsg("公司ID不能为空");
            return result;
        }else if(StringUtils.isBlank(parentId)){
            result.setCode("1001");
            result.setMsg("上级审核权限ID不能为空");
            return result;
        }
        result = approvalService.insertOneRaApproval(company_id, parentId, user_id);
        return result;
    }

    @RequestMapping(value="/insertOnePaApproval")
    @ResponseBody
    public Result insertOnePaApproval(String company_id, String parentId, String user_id){
        Result result = new Result();
        if(StringUtils.isBlank(user_id)){
            result.setCode("1001");
            result.setMsg("用户ID不能为空");
            return result;
        }else if(StringUtils.isBlank(company_id)){
            result.setCode("1001");
            result.setMsg("公司ID不能为空");
            return result;
        }else if(StringUtils.isBlank(parentId)){
            result.setCode("1001");
            result.setMsg("上级审核权限ID不能为空");
            return result;
        }
        result = approvalService.insertOnePaApproval(company_id, parentId, user_id);
        return result;
    }

    @RequestMapping(value="/deleteOneEnApproval")
    @ResponseBody
    public Result deleteOneEnApproval(String entryApprovalId, String company_id, String parentId){
        Result result = new Result();
        if(StringUtils.isBlank(entryApprovalId)){
            result.setCode("1001");
            result.setMsg("入职审核权限ID不能为空");
            return result;
        }else if(StringUtils.isBlank(company_id)){
            result.setCode("1001");
            result.setMsg("公司ID不能为空");
            return result;
        }else if(StringUtils.isBlank(parentId)){
            result.setCode("1001");
            result.setMsg("上级审核权限ID不能为空");
            return result;
        }
        result = approvalService.deleteOneEnApproval(entryApprovalId, company_id, parentId);
        return result;
    }

    @RequestMapping(value="/deleteOneRaApproval")
    @ResponseBody
    public Result deleteOneRaApproval(String resignationApprovalId, String company_id, String parentId){
        Result result = new Result();
        if(StringUtils.isBlank(resignationApprovalId)){
            result.setCode("1001");
            result.setMsg("离职审核权限ID不能为空");
            return result;
        }else if(StringUtils.isBlank(company_id)){
            result.setCode("1001");
            result.setMsg("公司ID不能为空");
            return result;
        }else if(StringUtils.isBlank(parentId)){
            result.setCode("1001");
            result.setMsg("上级审核权限ID不能为空");
            return result;
        }
        result = approvalService.deleteOneRaApproval(resignationApprovalId, company_id, parentId);
        return result;
    }

    @RequestMapping(value="/deleteOnePaApproval")
    @ResponseBody
    public Result deleteOnePaApproval(String payAdvanceApprovalId, String company_id, String parentId){
        Result result = new Result();
        if(StringUtils.isBlank(payAdvanceApprovalId)){
            result.setCode("1001");
            result.setMsg("入职审核权限ID不能为空");
            return result;
        }else if(StringUtils.isBlank(company_id)){
            result.setCode("1001");
            result.setMsg("公司ID不能为空");
            return result;
        }else if(StringUtils.isBlank(parentId)){
            result.setCode("1001");
            result.setMsg("上级审核权限ID不能为空");
            return result;
        }
        result = approvalService.deleteOnePaApproval(payAdvanceApprovalId, company_id, parentId);
        return result;
    }
}
