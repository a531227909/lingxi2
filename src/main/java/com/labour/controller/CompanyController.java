package com.labour.controller;

import com.labour.entity.Result;
import com.labour.entity.UpLoadImg;
import com.labour.model.PagesResult;
import com.labour.service.CompanyService;
import org.apache.commons.lang.StringUtils;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@EnableConfigurationProperties(UpLoadImg.class)
@Controller
public class CompanyController {

    @Resource
    private CompanyService companyService;

    @RequestMapping(value="/insertOneCompany")
    @ResponseBody
    public Result insertOneCompany(HttpServletRequest request, String company_full_name, String company_name, String company_size, String contact, String contact_phone,
                                String contact_position, String province_code, String province_name, String city_code, String city_name, String county_code,
                                String county_name, String address, String company_profile, List<MultipartFile> company_business_license, List<MultipartFile> company_logo, List<MultipartFile> company_pic){
        Result result = new Result();
        if(StringUtils.isBlank(company_full_name)){
            result.setCode("1001");
            result.setMsg("公司全称不能为空");
            return result;
        }else if(StringUtils.isBlank(contact)){
            result.setCode("1001");
            result.setMsg("联系人不能为空");
            return result;
        }else if(StringUtils.isBlank(contact_phone)){
            result.setCode("1001");
            result.setMsg("联系电话不能为空");
            return result;
        }else if(StringUtils.isBlank(province_code)||StringUtils.isBlank(province_name)||StringUtils.isBlank(city_code)||StringUtils.isBlank(city_name)
                ||StringUtils.isBlank(county_code)||StringUtils.isBlank(county_name)){
            result.setCode("1001");
            result.setMsg("区域地址不能为空");
            return result;
        }else if(StringUtils.isBlank(address)){
            result.setCode("1001");
            result.setMsg("详细地址不能为空");
            return result;
        }else if(StringUtils.isBlank(contact)){
            result.setCode("1001");
            result.setMsg("联系人不能为空");
            return result;
        }else{
            int i = 0;
            for (MultipartFile file : company_business_license) {
                if (StringUtils.isBlank(file.getOriginalFilename())) { // 通过获取文件名称来判断文件是否为空
                    i++;
                }
            }
            if(i == company_business_license.size()){
                result.setCode("1001");
                result.setMsg("营业执照不能为空");
                return result;
            }
        }

        result = companyService.insertOneCompany(request,company_full_name, company_name, company_size, contact, contact_phone,
                contact_position, province_code, province_name, city_code, city_name, county_code,
                county_name, address, company_profile, company_business_license, company_logo, company_pic);
        return result;
    }

    @RequestMapping(value="/selectCompanyByFactor")
    @ResponseBody
    public PagesResult selectCompanyByFactor(String company_full_name, String company_id, String city_code, String page){
        PagesResult pagesResult = new PagesResult();
        if(StringUtils.isBlank(page)){
            pagesResult.setCode("1001");
            pagesResult.setMsg("页码不能为空");
            return pagesResult;
        }
        pagesResult = companyService.selectCompanyByFactor(company_full_name, company_id, city_code, page);
        return pagesResult;
    }

}
