package com.labour.service.impl;

import com.labour.dao.CompanyDao;
import com.labour.dao.LaborDemandDao;
import com.labour.entity.Company;
import com.labour.entity.Result;
import com.labour.entity.User;
import com.labour.entity.WelfareMember;
import com.labour.model.LaborDemand;
import com.labour.model.PagesResult;
import com.labour.service.LaborDemandService;
import com.labour.utils.LaborDemandUtils;
import com.labour.utils.UUIDUtils;
import net.sf.json.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.support.ApplicationObjectSupport;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LaborDemandServiceImpl extends ApplicationObjectSupport implements LaborDemandService {

    private static Logger logger = LogManager.getLogger("org.springframework");

    @Resource
    private LaborDemandDao laborDemandDao;

    @Resource
    private CompanyDao companyDao;

    @Override
    public Result insertLaborDemand(LaborDemand laborDemand) {
        Result result = new Result();
        //福利因素ID
        String welfareMemberId = UUIDUtils.getUUID();
        laborDemand.setWelfareMemberId(welfareMemberId);
        //设置需求编号demandId,格式yyyyMMdd+时间戳后8位
        String demandId = LaborDemandUtils.getDemandId();
        laborDemand.setDemandId(demandId);
        int i = 0;
        i = laborDemandDao.insertLaborDemand(laborDemand);
        if(i == 1){
            result.setCode("1000");
            result.setMsg("添加成功");
        }else{
            result.setCode("1001");
            result.setMsg("系统故障，添加失败");
        }
        String[] welfareMenbers = laborDemand.getWelfareMembers().split("\\|");
        for(String welfareMember : welfareMenbers){
            JSONObject json = JSONObject.fromObject(welfareMember);
            WelfareMember wm = (WelfareMember) JSONObject.toBean(json, WelfareMember.class);
            laborDemandDao.insertWelfareMember(welfareMemberId, wm.getCompany_id(), wm.getCompany_full_name(), wm.getWelfareId(), wm.getWelfareName(), wm.getWelfare());
        }
        return result;
    }

    @Override
    public Result updateLaborDemand(LaborDemand laborDemand) {
        Result result = new Result();
        int i = 0;
        i = laborDemandDao.updateLaborDemand(laborDemand);
        if(i == 1){
            result.setCode("1000");
            result.setMsg("更新成功");
        }else{
            result.setCode("1001");
            result.setMsg("系统故障，更新失败");
        }
        laborDemandDao.deleteWmByWmId(laborDemand.getWelfareMemberId());
        if(StringUtils.isNotBlank(laborDemand.getWelfareMembers())){
            String[] welfareMenbers = laborDemand.getWelfareMembers().split("\\|");
            for(String welfareMember : welfareMenbers){
                JSONObject json = JSONObject.fromObject(welfareMember);
                WelfareMember wm = (WelfareMember) JSONObject.toBean(json, WelfareMember.class);
                laborDemandDao.insertWelfareMember(laborDemand.getWelfareMemberId(), wm.getCompany_id(), wm.getCompany_full_name(), wm.getWelfareId(), wm.getWelfareName(), wm.getWelfare());
            }
        }
        return result;
    }

    @Override
    public Result updateBusinessPrice(LaborDemand laborDemand) {
        Result result = new Result();
        int i = 0;
        i = laborDemandDao.updateBusinessPrice(laborDemand);
        if(i == 1){
            result.setCode("1000");
            result.setMsg("更新成功");
        }else{
            result.setCode("1001");
            result.setMsg("系统故障，更新失败");
        }
        return result;
    }

    @Override
    public Result selectOneLaborDemand(String laborDemandId) {
        Result result = new Result();
        int i = 0;
        LaborDemand laborDemand = laborDemandDao.selectOneLaborDemand(laborDemandId);
        result.setCode("1000");
        result.setMsg("查询成功");
        result.setData(laborDemand);
        return result;
    }

    @Override
    public Result selectResident(String company_id, String user_type_id) {
        Result result = new Result();
        List<User> users = laborDemandDao.selectResident(company_id, user_type_id);
        result.setCode("1000");
        result.setMsg("查询成功");
        result.setData(users);
        return result;
    }

    @Override
    public Result selectThirdParty(String company_type_id, String parentId) {
        Result result = new Result();
        List<Company> companys = companyDao.selectThirdParty(company_type_id, parentId);
        result.setCode("1000");
        result.setMsg("查询成功");
        result.setData(companys);
        return result;
    }

    @Override
    public Result deleteLaborDemand(String laborDemandId) {
        Result result = new Result();
        LaborDemand laborDemand = laborDemandDao.selectOneLaborDemand(laborDemandId);
        int i = laborDemandDao.deleteLaborDemand(laborDemandId);
        laborDemandDao.deleteWmByWmId(laborDemand.getWelfareMemberId());
        if(i ==1){
            result.setCode("1000");
            result.setMsg("删除成功");
        }else{
            result.setCode("1001");
            result.setMsg("系统故障,删除失败");
        }
        return result;
    }

    @Override
    public PagesResult selectLDByFactor(String company_id, String usingCompanyId, String salaryTypeId, String status, String page) {
        PagesResult pagesResult = new PagesResult();
        int star_num = (Integer.parseInt(page)-1)*10;
        int pageSize = 10;
        int count = laborDemandDao.selectCountByFactor(company_id, usingCompanyId, salaryTypeId, status);
        String pages = String.valueOf(count/pageSize + 1);
        System.out.println(count);
        List<LaborDemand> laborDemands = laborDemandDao.selectLDByFactor(company_id, usingCompanyId, salaryTypeId, status, star_num, pageSize);
        pagesResult.setCode("1000");
        pagesResult.setMsg("查询成功");
        pagesResult.setPages(pages);
        pagesResult.setData(laborDemands);
        pagesResult.setCount(String.valueOf(count));
        return pagesResult;
    }

    @Override
    public Result updateStatus(String status, String laborDemandId) {
        Result result = new Result();
        int i = laborDemandDao.updateStatus(status, laborDemandId);
        if(i ==1){
            result.setCode("1000");
            result.setMsg("更新状态成功");
        }else{
            result.setCode("1001");
            result.setMsg("系统故障,删除失败");
        }
        return result;
    }

}
