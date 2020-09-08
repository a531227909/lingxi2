package com.labour.dao;

import com.labour.entity.Company;
import com.labour.entity.TArea;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Repository
public interface CompanyDao {

    public Company selectOneCompany(@Param("company_id") String company_id);

    public int insertOneCompany(@Param("company_full_name") String company_full_name,@Param("company_name")  String company_name,@Param("company_size")  String company_size,@Param("contact")  String contact,@Param("contact_phone")  String contact_phone,
                                @Param("contact_position") String contact_position,@Param("province_code")  String province_code,@Param("province_name")  String province_name,@Param("city_code")  String city_code,@Param("city_name")  String city_name,@Param("county_code")  String county_code,
                                @Param("county_name") String county_name,@Param("address")  String address,@Param("company_profile")  String company_profile,@Param("company_business_license")  String company_business_license,@Param("company_logo")  String company_logo,@Param("company_pic")  String company_pic);
}
