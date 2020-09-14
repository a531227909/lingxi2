package com.labour.service;

import com.labour.entity.Result;
import com.labour.model.PagesResult;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface CompanyService {

    public Result insertOneCompany(HttpServletRequest request, String company_full_name, String company_name, String company_size, String contact, String contact_phone,
                                    String contact_position, String province_code, String province_name, String city_code, String city_name, String county_code,
                                    String county_name, String address, String company_profile, List<MultipartFile> company_business_license, List<MultipartFile> company_logo, List<MultipartFile> company_pic);

    public PagesResult selectCompanyByFactor(String company_full_name, String company_id, String city_code, String page);
}
