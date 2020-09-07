package com.labour.service;

import com.labour.entity.Result;

public interface TAreaService {

    public Result selectAreaByLevel(String level);

    public Result selectAreaByParentId(String parentId);

}
