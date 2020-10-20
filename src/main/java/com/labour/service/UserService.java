package com.labour.service;

import com.labour.entity.Result;
import com.labour.model.PagesResult;
import org.springframework.web.multipart.MultipartFile;

public interface UserService {

    Result selectAllUserType();

    Result selectUserTypeByFactor(String user_type_id, String status);

    Result addOneUser(String user_name, String password, String name, String user_type_id, String company_id, String create_user_id, String create_user_name);

    Result updatePassword(String user_name, String password);

    Result updateStatus(String user_name, String status);

    PagesResult selectUserByFactor(String company_id, String name, String user_name, String user_type_id, String page);

    Result selectUsersCount(String status, String company_id);

    Result userRegister(String user_id, String name, String phoneNum, String idCard, String genderId, String genderName, String province_code, String province_name,
                        String city_code, String city_name, String county_code, String county_name, MultipartFile idCardFront, MultipartFile idCardReverse);
}
