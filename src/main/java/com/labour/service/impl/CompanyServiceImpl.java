package com.labour.service.impl;

import com.labour.dao.CompanyDao;
import com.labour.dao.PictureNameDao;
import com.labour.entity.Company;
import com.labour.entity.PictureName;
import com.labour.entity.Result;
import com.labour.entity.UpLoadImg;
import com.labour.model.PagesResult;
import com.labour.service.CompanyService;
import com.labour.utils.UUIDUtils;
import com.labour.utils.UploadFileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.support.ApplicationObjectSupport;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.util.List;

@Service
public class CompanyServiceImpl extends ApplicationObjectSupport implements CompanyService {

    private static Logger logger = LogManager.getLogger("org.springframework");

    @Resource
    private CompanyDao companyDao;

    @Resource
    private PictureNameDao pictureNameDao;

    @Resource
    private UpLoadImg upLoadImg;

    @Override
    public Result insertOneCompany(String company_full_name, String company_name, String company_size, String contact, String contact_phone,
                                   String contact_position, String province_code, String province_name, String city_code, String city_name, String county_code,
                                   String county_name, String address, String company_profile, List<MultipartFile> company_business_license, List<MultipartFile> company_logo, List<MultipartFile> company_pic,
                                   String company_type_id, String company_type_name, String parentId) {
        Result result = new Result();
        //上传路径
        String path = upLoadImg.getPath();
        //上传工具类
        UploadFileUtils uploadTools = new UploadFileUtils();
        //公司营业执照名称
        List<String> cblnames = uploadTools.uploadFiles(company_business_license, path);
        //公司logo名称
        List<String> clnames = uploadTools.uploadFiles(company_logo, path);
        //公司照片名称
        List<String> cpnames = uploadTools.uploadFiles(company_pic, path);
        //公司营业执照图片ID
        String cblId = UUIDUtils.getUUID();
        //公司logo图片ID
        String clId = UUIDUtils.getUUID();
        //公司照片图片ID
        String cpId = UUIDUtils.getUUID();
        int i = companyDao.insertOneCompany(company_full_name, company_name, company_size, contact, contact_phone,
                contact_position, province_code, province_name, city_code, city_name, county_code,
                county_name, address, company_profile, cblId, clId, cpId, company_type_id, company_type_name, parentId);
        if(cblnames!=null && cblnames.size()>=0){
            for(String pictureName : cblnames){
                pictureNameDao.insertOnepictureName(cblId, pictureName);
            }
        }
        if(clnames!=null && clnames.size()>=0){
            for(String pictureName : clnames) {
                pictureNameDao.insertOnepictureName(clId, pictureName);
            }
        }
        if(cpnames!=null && cpnames.size()>=0){
            for(String pictureName : cpnames){
                pictureNameDao.insertOnepictureName(cpId, pictureName);
            }
        }
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
    public PagesResult selectCompanyByFactor(String company_full_name, String company_id, String city_code, String contact, String parentId, String page) {
        PagesResult pagesResult = new PagesResult();
        int star_num = (Integer.parseInt(page)-1)*10;
        int pageSize = 10;
        int count = companyDao.selectCountByFactor(company_full_name, company_id, city_code, contact, parentId);
        List<Company> companies = companyDao.selectCompanyByFactor(company_full_name, company_id, city_code,contact, parentId, star_num, pageSize);
        String pages = String.valueOf(count/pageSize + 1);
        if(companies.size()!=0){
            for (Company company : companies){
                String cbl = company.getCompany_business_license().toString();
                String cl = company.getCompany_logo().toString();
                String cp = company.getCompany_pic().toString();
                List<PictureName> cblPicNames = pictureNameDao.selectPicNameById(cbl);
                List<PictureName> clPicNames = pictureNameDao.selectPicNameById(cl);
                List<PictureName> cpPicNames = pictureNameDao.selectPicNameById(cp);
                for(PictureName pictureName :cblPicNames){
                    pictureName.setPictureName(upLoadImg.getUrl() + "/" + pictureName.getPictureName());
                }
                for(PictureName pictureName :clPicNames){
                    pictureName.setPictureName(upLoadImg.getUrl() + "/" + pictureName.getPictureName());
                }
                for(PictureName pictureName :cpPicNames){
                    pictureName.setPictureName(upLoadImg.getUrl() + "/" + pictureName.getPictureName());
                }
                company.setCompany_business_license(cblPicNames);
                company.setCompany_logo(clPicNames);
                company.setCompany_pic(cpPicNames);
            }
        }
        pagesResult.setCode("1000");
        pagesResult.setMsg("查询成功");
        pagesResult.setPages(pages);
        pagesResult.setData(companies);
        pagesResult.setCount(String.valueOf(count));
        return pagesResult;
    }

    @Override
    public Result updateOneCompany(String company_id, String company_full_name, String company_name, String company_size, String contact, String contact_phone,
                                   String contact_position, String province_code, String province_name, String city_code, String city_name, String county_code,
                                   String county_name, String address, String company_profile, List<MultipartFile> company_business_license, List<MultipartFile> company_logo, List<MultipartFile> company_pic,
                                   String company_type_id, String company_type_name, String parentId) {
        Result result = new Result();
        //上传路径
        String path = upLoadImg.getPath();
        //上传工具类
        UploadFileUtils uploadTools = new UploadFileUtils();
        //公司营业执照名称
        List<String> cblnames = uploadTools.uploadFiles(company_business_license, path);
        //公司logo名称
        List<String> clnames = uploadTools.uploadFiles(company_logo, path);
        //公司照片名称
        List<String> cpnames = uploadTools.uploadFiles(company_pic, path);

        Company company = companyDao.selectOneCompany(company_id);
        //公司营业执照图片ID
        String cblId = company.getCompany_business_license().toString();
        //公司logo图片ID
        String clId = company.getCompany_logo().toString();
        //公司照片图片ID
        String cpId = company.getCompany_pic().toString();
        if(cblnames!=null && cblnames.size()>=0){
            for(String pictureName : cblnames){
                pictureNameDao.insertOnepictureName(cblId, pictureName);
            }
        }
        if(clnames!=null && clnames.size()>=0){
            for(String pictureName : clnames) {
                pictureNameDao.insertOnepictureName(clId, pictureName);
            }
        }
        if(cpnames!=null && cpnames.size()>=0){
            for(String pictureName : cpnames){
                pictureNameDao.insertOnepictureName(cpId, pictureName);
            }
        }
        int n = companyDao.updateOneCompany(company_id, company_full_name, company_name, company_size, contact, contact_phone,
                contact_position, province_code, province_name, city_code, city_name, county_code,
                county_name, address, company_profile, "", "", "", company_type_id, company_type_name, parentId);
        if(n == 1){
            result.setCode("1000");
            result.setMsg("更新状态成功");
        }else{
            result.setCode("1001");
            result.setMsg("系统故障，更新失败");
        }
        return result;
    }

    @Override
    public Result selectOneCompany(String company_id) {
        Result result = new Result();
        Company company = companyDao.selectOneCompany(company_id);
        String cbl = company.getCompany_business_license().toString();
        String cl = company.getCompany_logo().toString();
        String cp = company.getCompany_pic().toString();
        List<PictureName> cblPicNames = pictureNameDao.selectPicNameById(cbl);
        List<PictureName> clPicNames = pictureNameDao.selectPicNameById(cl);
        List<PictureName> cpPicNames = pictureNameDao.selectPicNameById(cp);
        for(PictureName pictureName :cblPicNames){
            pictureName.setPictureName(upLoadImg.getUrl() + "/" + pictureName.getPictureName());
        }
        for(PictureName pictureName :clPicNames){
            pictureName.setPictureName(upLoadImg.getUrl() + "/" + pictureName.getPictureName());
        }
        for(PictureName pictureName :cpPicNames){
            pictureName.setPictureName(upLoadImg.getUrl() + "/" + pictureName.getPictureName());
        }
        company.setCompany_business_license(cblPicNames);
        company.setCompany_logo(clPicNames);
        company.setCompany_pic(cpPicNames);
        result.setCode("1000");
        result.setMsg("查询成功");
        result.setData(company);
        return result;
    }

    @Override
    public Result deleteCompanyPic(String pictureId, String pictureName) {
        Result result = new Result();
        //上传路径
        String path = upLoadImg.getPath();
        //删除图片
        UploadFileUtils.deleteOneFile(path + File.separator + pictureName);
        int i = pictureNameDao.deleteCompanyPic(pictureId, pictureName);
        if(i == 1){
            result.setCode("1000");
            result.setMsg("删除成功");
        }else{
            result.setCode("1001");
            result.setMsg("系统故障，更新失败");
        }
        return result;
    }

}
