package com.seasefun.lottery.dao;

import com.seasefun.lottery.entity.TestUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TestDao {

    public TestUser testSelect(@Param("account_id")String account_id);

}
