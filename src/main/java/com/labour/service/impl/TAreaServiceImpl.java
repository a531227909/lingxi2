package com.labour.service.impl;

import com.labour.dao.TAreaDao;
import com.labour.dao.UserDao;
import com.labour.entity.Result;
import com.labour.entity.TArea;
import com.labour.entity.User;
import com.labour.plugins.LabourPluginFactory;
import com.labour.plugins.Plugin;
import com.labour.plugins.labourResult.LabourReulstPlugin;
import com.labour.service.LoginService;
import com.labour.service.TAreaService;
import com.labour.utils.Md5Utils;
import com.labour.utils.TokenUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.support.ApplicationObjectSupport;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

@Service
public class TAreaServiceImpl extends ApplicationObjectSupport implements TAreaService {

    private static Logger logger = LogManager.getLogger("org.springframework");

    @Resource
    private TAreaDao tAreaDao;

    @Override
    public Result selectAreaByLevel(String level) {
        Result result = new Result();
        List<TArea> TAreas = tAreaDao.selectAreaByLevel(level);
        result.setCode("1000");
        result.setMsg("查询成功");
        result.setData(TAreas);
        return result;
    }

    @Override
    public Result selectAreaByParentId(String parentId) {
        Result result = new Result();
        List<TArea> TAreas = tAreaDao.selectAreaByParentId(parentId);
        result.setCode("1000");
        result.setMsg("查询成功");
        result.setData(TAreas);
        return result;
    }
}
