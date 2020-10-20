package com.labour.dao;

import com.labour.entity.UserJob;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserJobDao {

    int addOneUserJob(UserJob userJob);

    UserJob selectUserJob(@Param("user_id")String user_id, @Param("company_id")String company_id);

}
