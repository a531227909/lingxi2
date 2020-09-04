package com.labour.dao;

import com.labour.entity.Result;
import com.labour.entity.User;
import com.labour.entity.UserType;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {

    public int addOneUser(@Param("user_name") String user_name,@Param("password") String password,@Param("name") String name,@Param("user_type") String user_type,
                          @Param("create_user_id") String create_user_id,@Param("create_user_name") String create_user_name,@Param("status") String status);

    public List<UserType> selectAllUserType();

    public User selectOneUser(@Param("user_name") String user_name);

    public List<User> selectAllUser();
}
