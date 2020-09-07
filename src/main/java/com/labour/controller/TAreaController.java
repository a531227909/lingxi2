package com.labour.controller;

import com.labour.entity.Result;
import com.labour.service.LoginService;
import com.labour.service.TAreaService;
import com.labour.service.UserService;
import com.labour.utils.HttpRequestUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
public class TAreaController {

    @Resource
    private TAreaService tAreaService;

    @RequestMapping(value="/selectAreaByLevel")
    @ResponseBody
    public Result selectAreaByLevel(String level){
        Result result = new Result();
        if(StringUtils.isBlank(level)){
            result.setCode("1001");
            result.setMsg("级别不能为空");
            return result;
        }
        result = tAreaService.selectAreaByLevel(level);
        return result;
    }

    @RequestMapping(value="/selectAreaByParentId")
    @ResponseBody
    public Result selectAreaByParentId(String parentId){
        Result result = new Result();
        if(StringUtils.isBlank(parentId)){
            result.setCode("1001");
            result.setMsg("上级地区ID不能为空");
            return result;
        }
        result = tAreaService.selectAreaByParentId(parentId);
        return result;
    }

}
