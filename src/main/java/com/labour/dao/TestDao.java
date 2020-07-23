package com.labour.dao;

import com.labour.entity.TestUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TestDao {

    public TestUser testSelect(@Param("name")String name);

}
