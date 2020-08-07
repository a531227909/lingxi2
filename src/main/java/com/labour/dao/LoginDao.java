package com.labour.dao;

import com.labour.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginDao {

    public User selectUser(@Param("user_name") String user_name, @Param("password")String password);

}
