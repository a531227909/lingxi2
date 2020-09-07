package com.labour.dao;

import com.labour.entity.Company;
import com.labour.entity.TArea;
import com.labour.entity.User;
import com.labour.entity.UserType;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TAreaDao {

    public List<TArea> selectAreaByLevel(String level);

    public List<TArea> selectAreaByParentId(String parentId);

}
