package com.labour.service.impl;

import com.labour.dao.UserCompanyDao;
import com.labour.dao.UserDao;
import com.labour.entity.Result;
import com.labour.entity.User;
import com.labour.model.Approval;
import com.labour.service.UserCompanyService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.support.ApplicationObjectSupport;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserCompanyServiceImpl extends ApplicationObjectSupport implements UserCompanyService {

    private static Logger logger = LogManager.getLogger("org.springframework");

    @Resource
    private UserCompanyDao userCompanyDao;

    @Override
    public Result selectEntryApproval(String company_id, String page) {
        Result result = new Result();
        int star_num = (Integer.parseInt(page)-1)*10;
        int pageSize = 10;
        List<Approval> Approvals = userCompanyDao.selectEntryApproval(company_id, star_num, pageSize);
        result.setCode("1000");
        result.setMsg("查询成功");
        result.setData(Approvals);
        return result;
    }

    @Override
    public Result selectRaApproval(String company_id, String page) {
        Result result = new Result();
        int star_num = (Integer.parseInt(page)-1)*10;
        int pageSize = 10;
        List<Approval> Approvals = userCompanyDao.selectRaApproval(company_id, star_num, pageSize);
        result.setCode("1000");
        result.setMsg("查询成功");
        result.setData(Approvals);
        return result;
    }

    @Override
    public Result selectAdvanceApproval(String company_id, String page) {
        Result result = new Result();
        int star_num = (Integer.parseInt(page)-1)*10;
        int pageSize = 10;
        List<Approval> Approvals = userCompanyDao.selectAdvanceApproval(company_id, star_num, pageSize);
        result.setCode("1000");
        result.setMsg("查询成功");
        result.setData(Approvals);
        return result;
    }
}
