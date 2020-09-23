package com.labour.dao;

import com.labour.entity.TArea;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TAreaDao {

    List<TArea> selectAreaByLevel(String level);

    List<TArea> selectAreaByParentId(String parentId);

}
