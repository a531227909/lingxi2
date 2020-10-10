package com.labour.controller;

import com.labour.entity.Result;
import com.labour.model.LaborDemand;
import com.labour.model.PagesResult;
import com.labour.service.LaborDemandService;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class LaborDemandController {

    @Resource
    private LaborDemandService laborDemandService;

    @RequestMapping(value="/insertLaborDemand")
    @ResponseBody
    public Result insertLaborDemand(LaborDemand laborDemand){
        Result result = new Result();
        System.out.println(laborDemand.toString());
//        if(StringUtils.isBlank(user_name)){
//            result.setCode("1001");
//            result.setMsg("用户名不能为空");
//            return result;
//        }
        result = laborDemandService.insertLaborDemand(laborDemand);
        return result;
    }
    @RequestMapping(value="/updateLaborDemand")
    @ResponseBody
    public Result updateLaborDemand(LaborDemand laborDemand){
        Result result = new Result();
//        if(StringUtils.isBlank(user_name)){
//            result.setCode("1001");
//            result.setMsg("用户名不能为空");
//            return result;
//        }
        result = laborDemandService.updateLaborDemand(laborDemand);
        return result;
    }

    @RequestMapping(value="/updateBusinessPrice")
    @ResponseBody
    public Result updateBusinessPrice(LaborDemand laborDemand){
        Result result = new Result();
        if(StringUtils.isBlank(laborDemand.getLaborDemandId())){
            result.setCode("1001");
            result.setMsg("用工需求ID不能为空");
            return result;
        }
        result = laborDemandService.updateBusinessPrice(laborDemand);
        return result;
    }

    @RequestMapping(value="/selectOneLaborDemand")
    @ResponseBody
    public Result selectOneLaborDemand(String laborDemandId){
        Result result = new Result();
        if(StringUtils.isBlank(laborDemandId)){
            result.setCode("1001");
            result.setMsg("用工需求ID不能为空");
            return result;
        }
        result = laborDemandService.selectOneLaborDemand(laborDemandId);
        return result;

    }

    @RequestMapping(value="/selectResident")
    @ResponseBody
    public Result selectResident(String company_id, String user_type_id){
        Result result = new Result();
        if(StringUtils.isBlank(company_id)){
            result.setCode("1001");
            result.setMsg("公司ID不能为空");
            return result;
        }else if(StringUtils.isBlank(user_type_id)){
            result.setCode("1001");
            result.setMsg("用户类型ID不能为空");
            return result;
        }
        result = laborDemandService.selectResident(company_id, user_type_id);
        return result;
    }

    @RequestMapping(value="/selectThirdParty")
    @ResponseBody
    public Result selectThirdParty(String company_type_id, String parentId){
        Result result = new Result();
        if(StringUtils.isBlank(company_type_id)){
            result.setCode("1001");
            result.setMsg("公司类型ID不能为空");
            return result;
        }else if(StringUtils.isBlank(parentId)){
            result.setCode("1001");
            result.setMsg("上级ID不能为空");
            return result;
        }
        result = laborDemandService.selectThirdParty(company_type_id, parentId);
        return result;
    }

    @RequestMapping(value="/deleteLaborDemand")
    @ResponseBody
    public Result deleteLaborDemand(String laborDemandId){
        Result result = new Result();
        if(StringUtils.isBlank(laborDemandId)){
            result.setCode("1001");
            result.setMsg("用工需求ID不能为空");
            return result;
        }
        result = laborDemandService.deleteLaborDemand(laborDemandId);
        return result;
    }

    @RequestMapping(value="/selectLDByFactor")
    @ResponseBody
    public PagesResult selectLDByFactor(String company_id, String usingCompanyId, String salaryTypeId, String status, String page){
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
        pagesResult = laborDemandService.selectLDByFactor(company_id, usingCompanyId, salaryTypeId, status, page);
        return pagesResult;
    }

    @RequestMapping(value="/updateLDStatus")
    @ResponseBody
    public Result updateLDStatus(String status, String laborDemandId){
        Result result = new Result();
        if(StringUtils.isBlank(status)){
            result.setCode("1001");
            result.setMsg("状态不能为空");
            return result;
        }else if(StringUtils.isBlank(laborDemandId)){
            result.setCode("1001");
            result.setMsg("用工需求ID不能为空");
            return result;
        }
        result = laborDemandService.updateStatus(status, laborDemandId);
        return result;
    }

}
