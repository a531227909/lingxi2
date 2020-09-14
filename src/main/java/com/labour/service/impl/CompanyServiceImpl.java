package com.labour.service.impl;

import com.labour.dao.CompanyDao;
import com.labour.entity.Company;
import com.labour.entity.Result;
import com.labour.entity.UpLoadImg;
import com.labour.model.PagesResult;
import com.labour.service.CompanyService;
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

    @Override
    public PagesResult selectCompanyByFactor(String company_full_name, String company_id, String city_code, String page) {
        PagesResult pagesResult = new PagesResult();
        int star_num = (Integer.parseInt(page)-1)*10;
        int pageSize = 10;
        int count = companyDao.selectCountByFactor(company_full_name, company_id, city_code);
        List<Company> companies = companyDao.selectCompanyByFactor(company_full_name, company_id, city_code, star_num, pageSize);
        String pages = String.valueOf(count/pageSize + 1);
        if(companies.size()!=0){
            for (Company company : companies){
                String sblUrl = "";
                String slUrl = "";
                String spUrl = "";
                String[] sblImgNames = company.getCompany_business_license().split(",");
                String[] slImgNames = company.getCompany_logo().split(",");
                String[] spImgNames = company.getCompany_pic().split(",");
                for(String name : sblImgNames){
                    sblUrl = sblUrl + upLoadImg.getUrl() + "/" + name + ",";
                }
                for(String name : slImgNames){
                    slUrl = slUrl + upLoadImg.getUrl() + "/" + name + ",";
                }
                for(String name : spImgNames){
                    spUrl = spUrl + upLoadImg.getUrl() + "/" + name + ",";
                }
                sblUrl = sblUrl.substring(0,sblUrl.length()-1);
                slUrl = slUrl.substring(0,slUrl.length()-1);
                spUrl = spUrl.substring(0,spUrl.length()-1);
                company.setCompany_business_license(sblUrl);
                company.setCompany_logo(slUrl);
                company.setCompany_pic(spUrl);
            }
        }
        pagesResult.setCode("1000");
        pagesResult.setMsg("查询成功");
        pagesResult.setPages(pages);
        pagesResult.setData(companies);
        return pagesResult;
    }

}
