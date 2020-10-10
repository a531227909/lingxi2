package com.labour.service.impl;

import com.labour.dao.AdvanceDao;
import com.labour.entity.Result;
import com.labour.model.Advance;
import com.labour.model.PagesResult;
import com.labour.service.AdvanceService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.support.ApplicationObjectSupport;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AdvanceServiceImpl extends ApplicationObjectSupport implements AdvanceService {

    private static Logger logger = LogManager.getLogger("org.springframework");

    @Resource
    private AdvanceDao advanceDao;

    @Override
    public PagesResult selectAdvanceByFactor(String name, String gender, String phoneNum, String province_code, String city_code, String company_id, String usingCompanyId, String stationName, String page) {
        PagesResult pagesResult = new PagesResult();
        int star_num = (Integer.parseInt(page)-1)*10;
        int pageSize = 10;
        int count = advanceDao.selectCountByFactor(name, gender, phoneNum, province_code, city_code, company_id, usingCompanyId, stationName);
        String pages = String.valueOf(count/pageSize + 1);
        List<Advance> advances = advanceDao.selectAdvanceByFactor(name, gender, phoneNum, province_code, city_code, company_id, usingCompanyId, stationName, star_num, pageSize);
        pagesResult.setCode("1000");
        pagesResult.setMsg("查询成功");
        pagesResult.setPages(pages);
        pagesResult.setData(advances);
        pagesResult.setCount(String.valueOf(count));
        return pagesResult;
    }

    @Override
    public Result selectOneAdvance(String advanceId) {
        Result result = new Result();
        Advance advance = advanceDao.selectOneAdvance(advanceId);
        result.setCode("1000");
        result.setMsg("查询成功");
        result.setData(advance);
        return result;
    }

    @Override
    public Result updateAdvanceStatus(String status, String advanceId) {
        Result result = new Result();
        int i = advanceDao.updateAdvanceStatus(status, advanceId);
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
