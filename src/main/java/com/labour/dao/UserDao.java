package com.labour.dao;

import com.labour.entity.Company;
import com.labour.entity.Result;
import com.labour.entity.User;
import com.labour.entity.UserType;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {

    public int addOneUser(@Param("user_name") String user_name,@Param("password") String password,@Param("name") String name,@Param("user_type_id") String user_type_id,
                          @Param("create_user_id") String create_user_id,@Param("create_user_name") String create_user_name, @Param("status") String status);

    public int addUserCompany(@Param("user_id") String user_id,@Param("user_name") String user_name,@Param("company_id") String company_id,@Param("company_name") String company_name);

    public List<UserType> selectAllUserType();

    public User selectOneUser(@Param("user_name") String user_name);

    public Company selectOneCompany(@Param("company_id") String company_id);

    public List<User> selectAllUser();

    public int updatePassword(@Param("user_name") String user_name,@Param("password") String password);

    public int updateStatus(@Param("user_name") String user_name,@Param("status") String status);

    public List<User> selectUserByFactor(@Param("company_id") String company_id,@Param("name") String name,@Param("user_name") String user_name,
                                         @Param("user_type_id") String user_type_id,@Param("star_num") int star_num,@Param("pageSize") int pageSize);
}
