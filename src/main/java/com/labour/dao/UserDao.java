package com.labour.dao;

import com.labour.entity.User;
import com.labour.entity.UserCompany;
import com.labour.model.UserType;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {

    int addOneUser(@Param("user_name") String user_name,@Param("password") String password,@Param("name") String name,@Param("user_type_id") String user_type_id,
                          @Param("create_user_id") String create_user_id,@Param("create_user_name") String create_user_name, @Param("status") String status);

    int addUserCompany(@Param("user_id") String user_id,@Param("user_name") String user_name,@Param("company_id") String company_id,@Param("company_full_name") String company_full_name);

    int addOneUserCompany(UserCompany userCompany);

    List<UserType> selectAllUserType();

    List<UserType> selectUserTypeByFactor(@Param("user_type_id") String user_type_id,@Param("status")  String status);

    User selectOneUser(@Param("user_name") String user_name);

    List<User> selectAllUser();

    int updatePassword(@Param("user_name") String user_name,@Param("password") String password);

    int updateStatus(@Param("user_name") String user_name,@Param("status") String status);

    List<User> selectUserByFactor(@Param("company_id") String company_id,@Param("name") String name,@Param("user_name") String user_name,
                                         @Param("user_type_id") String user_type_id,@Param("star_num") int star_num,@Param("pageSize") int pageSize);

    int selectCountByFactor(@Param("company_id") String company_id,@Param("name") String name,@Param("user_name") String user_name,
                               @Param("user_type_id") String user_type_id);

    List<UserType> selectUsersCount(@Param("status") String status,@Param("company_id") String company_id);

    int addWeChatUser(@Param("weChatId") String weChatId,@Param("headImage") String headImage,@Param("petName") String petName,
                      @Param("user_type_id") String user_type_id,@Param("status") String status);

    User selectOneWechatUser(@Param("weChatId") String weChatId);

    int userRegister(@Param("user_id")String user_id, @Param("name")String name, @Param("phoneNum") String phoneNum, @Param("idCard") String idCard, @Param("genderId") String genderId,
                     @Param("genderName") String genderName, @Param("province_code") String province_code, @Param("province_name") String province_name, @Param("city_code") String city_code,
                     @Param("city_name") String city_name, @Param("county_code") String county_code, @Param("county_name") String county_name, @Param("idCardFront") String idCardFront,
                     @Param("idCardReverse") String idCardReverse);

    User selectOneUserById(@Param("user_id")String user_id);
}
