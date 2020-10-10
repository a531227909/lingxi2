package com.labour.service.impl;

import com.labour.dao.DispatchedDao;
import com.labour.entity.Result;
import com.labour.model.Dispatched;
import com.labour.model.PagesResult;
import com.labour.service.DispatchedService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.support.ApplicationObjectSupport;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DispatchedServiceImpl extends ApplicationObjectSupport implements DispatchedService {

    private static Logger logger = LogManager.getLogger("org.springframework");

    @Resource
    private DispatchedDao dispatchedDao;

    @Override
    public PagesResult selectDispatchedByFactor(String workAuditStatus, String company_id, String name, String phoneNum, String province_code, String city_code,
                                                String usingCompanyId, String stationName, String workReviewTypeId, String user_id, String page) {
        //默认查询未审核
        workAuditStatus = "0";
        PagesResult pagesResult = new PagesResult();
        int star_num = (Integer.parseInt(page)-1)*10;
        int pageSize = 10;
        int count = dispatchedDao.selectCountByFactor(workAuditStatus, company_id, name, phoneNum, province_code, city_code, usingCompanyId, stationName, workReviewTypeId, user_id);
        String pages = String.valueOf(count/pageSize + 1);
        List<Dispatched> dispatcheds = dispatchedDao.selectDispatchedByFactor(workAuditStatus, company_id, name, phoneNum, province_code, city_code, usingCompanyId, stationName, workReviewTypeId, user_id, star_num, pageSize);
        pagesResult.setCode("1000");
        pagesResult.setMsg("查询成功");
        pagesResult.setPages(pages);
        pagesResult.setData(dispatcheds);
        pagesResult.setCount(String.valueOf(count));
        return pagesResult;
    }

    @Override
    public Result selectOneDispatched(String workAuditId) {
        Result result = new Result();
        Dispatched dispatched = dispatchedDao.selectOneDispatched(workAuditId);
        result.setCode("1000");
        result.setMsg("查询成功");
        result.setData(dispatched);
        return result;
    }

    @Override
    public Result updateWorkAuditIdIsOk(String isOk, String audit_info, String workAuditStatus, String workAuditId) {
        Result result = new Result();
        //审核状态 审核还是未审核 0:未审核 1:审核完成 赋值为1表示审核完成
        workAuditStatus = "1";
        int i = dispatchedDao.updateWorkAuditIdIsOk(isOk, audit_info, workAuditStatus, workAuditId);
        if(i == 1){
            result.setCode("1000");
            result.setMsg("审核成功");
        }else{
            result.setCode("1001");
            result.setMsg("系统故障，审核失败");
        }
        return result;
    }

}
