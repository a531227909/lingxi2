package com.labour.dao;

import com.labour.entity.User;
import com.labour.model.UserType;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {

    int addOneUser(@Param("user_name") String user_name,@Param("password") String password,@Param("name") String name,@Param("user_type_id") String user_type_id,
                          @Param("create_user_id") String create_user_id,@Param("create_user_name") String create_user_name, @Param("status") String status);

    int addUserCompany(@Param("user_id") String user_id,@Param("user_name") String user_name,@Param("company_id") String company_id,@Param("company_full_name") String company_full_name);

    List<UserType> selectAllUserType();

    User selectOneUser(@Param("user_name") String user_name);

    List<User> selectAllUser();

    int updatePassword(@Param("user_name") String user_name,@Param("password") String password);

    int updateStatus(@Param("user_name") String user_name,@Param("status") String status);

    List<User> selectUserByFactor(@Param("company_id") String company_id,@Param("name") String name,@Param("user_name") String user_name,
                                         @Param("user_type_id") String user_type_id,@Param("star_num") int star_num,@Param("pageSize") int pageSize);

    int selectCountByFactor(@Param("company_id") String company_id,@Param("name") String name,@Param("user_name") String user_name,
                               @Param("user_type_id") String user_type_id);

    List<UserType> selectUsersCount(@Param("status") String status, String company_id);
}
