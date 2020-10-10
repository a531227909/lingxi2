package com.labour.service;

import com.labour.entity.Result;

public interface TAreaService {

    Result selectAreaByLevel(String level);

    Result selectAreaByParentId(String parentId);

}
