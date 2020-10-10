package com.labour.controller;

import com.labour.entity.Result;
import com.labour.entity.UpLoadImg;
import com.labour.model.PagesResult;
import com.labour.service.CompanyService;
import com.labour.utils.StrUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.List;

@EnableConfigurationProperties(UpLoadImg.class)
@Controller
public class CompanyController {

    @Resource
    private CompanyService companyService;

    @RequestMapping(value="/insertOneCompany")
    @ResponseBody
    public Result insertOneCompany(String company_full_name, String company_name, String company_size, String contact, String contact_phone,
                                   String contact_position, String province_code, String province_name, String city_code, String city_name, String county_code,
                                   String county_name, String address, String company_profile, List<MultipartFile> company_business_license, List<MultipartFile> company_logo, List<MultipartFile> company_pic,
                                   String company_type_id, String company_type_name, String parentId){
        Result result = new Result();
        if(StringUtils.isBlank(company_full_name)){
            result.setCode("1001");
            result.setMsg("公司全称不能为空");
            return result;
        }else if(StrUtils.length(company_full_name) > 16){
            result.setCode("1001");
            result.setMsg("公司全称长度不能超过varchar(32)");
            return result;
        }else if(StrUtils.length(company_name) > 16){
            result.setCode("1001");
            result.setMsg("公司简称长度不能超过varchar(32)");
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
        }
//        else{
//            int i = 0;
//            for (MultipartFile file : company_business_license) {
//                if (StringUtils.isBlank(file.getOriginalFilename())) { // 通过获取文件名称来判断文件是否为空
//                    i++;
//                }
//            }
//            if(i == company_business_license.size()){
//                result.setCode("1001");
//                result.setMsg("营业执照不能为空");
//                return result;
//            }
//        }

        result = companyService.insertOneCompany(company_full_name, company_name, company_size, contact, contact_phone,
                contact_position, province_code, province_name, city_code, city_name, county_code,
                county_name, address, company_profile, company_business_license, company_logo, company_pic, company_type_id, company_type_name, parentId);
        return result;
    }

    @RequestMapping(value="/selectCompanyByFactor")
    @ResponseBody
    public PagesResult selectCompanyByFactor(String company_full_name, String company_id, String city_code, String contact, String parentId, String page){
        PagesResult pagesResult = new PagesResult();
        if(StringUtils.isBlank(page)){
            pagesResult.setCode("1001");
            pagesResult.setMsg("页码不能为空");
            return pagesResult;
        }
        pagesResult = companyService.selectCompanyByFactor(company_full_name, company_id, city_code, contact, parentId, page);
        return pagesResult;
    }

    @RequestMapping(value="/updateOneCompany")
    @ResponseBody
    public Result updateOneCompany(String company_id, String company_full_name, String company_name, String company_size, String contact, String contact_phone,
                                   String contact_position, String province_code, String province_name, String city_code, String city_name, String county_code,
                                   String county_name, String address, String company_profile, List<MultipartFile> company_business_license, List<MultipartFile> company_logo, List<MultipartFile> company_pic,
                                   String company_type_id, String company_type_name, String parentId){
        Result result = new Result();
        if(StringUtils.isBlank(company_id)){
            result.setCode("1001");
            result.setMsg("公司ID不能为空");
            return result;
        }
        result = companyService.updateOneCompany(company_id, company_full_name, company_name, company_size, contact, contact_phone,
                contact_position, province_code, province_name, city_code, city_name, county_code,
                county_name, address, company_profile, company_business_license, company_logo, company_pic, company_type_id, company_type_name, parentId);
        return result;
    }

    @RequestMapping(value="/selectOneCompany")
    @ResponseBody
    public Result selectOneCompany(String company_id){
        Result result = new Result();
        if(StringUtils.isBlank(company_id)){
            result.setCode("1001");
            result.setMsg("公司ID不能为空");
            return result;
        }
        result = companyService.selectOneCompany(company_id);
        return result;
    }

    @RequestMapping(value="/deleteCompanyPic")
    @ResponseBody
    public Result deleteCompanyPic(String pictureId, String pictureName){
        Result result = new Result();
        if(StringUtils.isBlank(pictureId)){
            result.setCode("1001");
            result.setMsg("图片ID不能为空");
            return result;
        }else if(StringUtils.isBlank(pictureName)){
            result.setCode("1001");
            result.setMsg("图片名不能为空");
            return result;
        }
        result = companyService.deleteCompanyPic(pictureId, pictureName);
        return result;
    }
}
