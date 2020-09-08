package com.labour.service.impl;

import com.labour.dao.CompanyDao;
import com.labour.entity.Result;
import com.labour.entity.UpLoadImg;
import com.labour.service.CompanyService;
import com.labour.utils.Md5Utils;
import com.labour.utils.UploadFileUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.support.ApplicationObjectSupport;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Service
public class CompanyServiceImpl extends ApplicationObjectSupport implements CompanyService {

    private static Logger logger = LogManager.getLogger("org.springframework");

    @Resource
    private CompanyDao companyDao;

    @Resource
    private UpLoadImg upLoadImg;

    @Override
    public Result insertOneCompany(HttpServletRequest request, String company_full_name, String company_name, String company_size, String contact, String contact_phone,
                                   String contact_position, String province_code, String province_name, String city_code, String city_name, String county_code,
                                   String county_name, String address, String company_profile, List<MultipartFile> company_business_license, List<MultipartFile> company_logo, List<MultipartFile> company_pic) {
        Result result = new Result();
        //上传路径
        String path = upLoadImg.getPath();
        UploadFileUtils uploadTools = new UploadFileUtils();
        //公司营业执照名称
        String cblname = uploadTools.uploadFiles(company_business_license, path);
        //公司logo名称
        String clname = uploadTools.uploadFiles(company_logo, path);;
        //公司照片名称
        String cpname = uploadTools.uploadFiles(company_pic, path);;
        if(StringUtils.isNotBlank(cblname)){
            cblname = cblname.substring(1);
        }
        if(StringUtils.isNotBlank(clname)){
            clname = clname.substring(1);
        }
        if(StringUtils.isNotBlank(cpname)){
            cpname = cpname.substring(1);
        }
        int i = companyDao.insertOneCompany(company_full_name, company_name, company_size, contact, contact_phone,
                contact_position, province_code, province_name, city_code, city_name, county_code,
                county_name, address, company_profile, cblname, clname, cpname);
        if(i == 1){
            result.setCode("1000");
            result.setMsg("添加公司成功");
        }else{
            result.setCode("1001");
            result.setMsg("系统故障，添加公司失败");
        }
        return result;
    }

}
