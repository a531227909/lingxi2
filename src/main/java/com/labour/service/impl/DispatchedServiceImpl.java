package com.labour.service.impl;

import com.labour.dao.ApprovalDao;
import com.labour.dao.DispatchedDao;
import com.labour.entity.Result;
import com.labour.entity.WorkAudit;
import com.labour.entity.WorkReview;
import com.labour.model.Approval;
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

    @Resource
    private ApprovalDao approvalDao;

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
        //当前审核节点ID
        String workAuditCurrentNode = "";
        //workReviewStatus 审核状态 审核还是未审核 0:未审核 1:审核中 2:审核完成
        String workReviewStatus = "";
        //jobStatusId 工作状态ID 1:入职审核中 2:入职审核未通过 3:在职 4:离职审核中 5:离职 6:异常离职
        String jobStatusId = "";
        //jobStatus 工作状态 1:入职审核中 2:入职审核未通过 3:在职 4:离职审核中 5:离职 6:异常离职
        String jobStatus = "";
        //工作申请类型ID 1:入职审核 2:离职审核
        //workAuditStatus 审核状态 审核还是未审核 0:未审核 1:审核完成 赋值为1表示审核完成
        workAuditStatus = "1";
        dispatchedDao.updateWorkAuditIdIsOk(isOk, audit_info, workAuditStatus, workAuditId);
        WorkAudit currentWorkAudit = dispatchedDao.selectOneWorkAudit(workAuditId);
        WorkReview currentWorkReview = dispatchedDao.selectOneWorkReview(currentWorkAudit.getWorkReviewId());
        String company_id = currentWorkReview.getCompany_id();
        String workReviewTypeId = currentWorkReview.getWorkReviewTypeId();
        workAuditCurrentNode = currentWorkAudit.getFlow_node_id();

        if(workReviewTypeId.equals("1")){
            Approval approval = approvalDao.selectOneEntryApproval(company_id, workAuditCurrentNode,"", "", "");
            //当审核流程结束
            if(approval==null){
                //isOk  是否批准 0:拒绝 1:同意
                if(isOk.equals("0")){
                    workReviewStatus = "2";
                    jobStatusId = "2";
                    jobStatus = "入职审核未通过";
                }else if(isOk.equals("1")){
                    workReviewStatus = "2";
                    jobStatusId = "3";
                    jobStatus = "在职";
                }
            }else{//当审核流程有下一步时
                if(isOk.equals("0")){
                    workReviewStatus = "2";
                    jobStatusId = "2";
                    jobStatus = "入职审核未通过";
                }else if(isOk.equals("1")){
                    workReviewStatus = "1";
                    jobStatusId = "1";
                    jobStatus = "入职审核中";
                    WorkAudit nextWorkAudit = new WorkAudit();
                    nextWorkAudit.setWorkReviewId(currentWorkAudit.getWorkReviewId());
                    nextWorkAudit.setFlow_node_id(approval.getEntryApprovalId());
                    nextWorkAudit.setAuditUserId(approval.getUser_id());
                    nextWorkAudit.setAuditName(approval.getName());
                    nextWorkAudit.setUser_type_id(approval.getUser_type_id());
                    nextWorkAudit.setUser_type_name(approval.getUser_type_name());
                    nextWorkAudit.setApprovalTypeId(approval.getType());
                    dispatchedDao.insertOneWorkAudit(nextWorkAudit);
                    workAuditCurrentNode = String.valueOf(nextWorkAudit.getId());
                }
            }
        }else if(workReviewTypeId.equals("2")){
            Approval approval = approvalDao.selectOneRaApproval(company_id, workAuditCurrentNode,"", "", "");
            if(approval==null){
                if(isOk.equals("0")){
                    workReviewStatus = "2";
                    jobStatusId = "3";
                    jobStatus = "在职";
                }else if(isOk.equals("1")){
                    workReviewStatus = "2";
                    jobStatusId = "5";
                    jobStatus = "离职";
                }
            }else{
                if(isOk.equals("0")){
                    workReviewStatus = "2";
                    jobStatusId = "3";
                    jobStatus = "在职";
                }else if(isOk.equals("1")){
                    workReviewStatus = "1";
                    jobStatusId = "4";
                    jobStatus = "离职审核中";
                    WorkAudit nextWorkAudit = new WorkAudit();
                    nextWorkAudit.setWorkReviewId(currentWorkAudit.getWorkReviewId());
                    nextWorkAudit.setFlow_node_id(approval.getResignationApprovalId());
                    nextWorkAudit.setAuditUserId(approval.getUser_id());
                    nextWorkAudit.setAuditName(approval.getName());
                    nextWorkAudit.setUser_type_id(approval.getUser_type_id());
                    nextWorkAudit.setUser_type_name(approval.getUser_type_name());
                    nextWorkAudit.setApprovalTypeId(approval.getType());
                    dispatchedDao.insertOneWorkAudit(nextWorkAudit);
                    workAuditCurrentNode = String.valueOf(nextWorkAudit.getId());
                }
            }
        }
        dispatchedDao.updateWorkReviewStatus(currentWorkReview.getWorkReviewId(), workAuditCurrentNode, workReviewStatus);
        dispatchedDao.updateUserJobStatus(currentWorkReview.getUserJobId(), jobStatusId, jobStatus, "", "", "", "", "");
        return result;
    }

    @Override
    public Result updateUserJobStatus(String userJobId, String jobStatusId, String jobStatus, String jobStatusTypeId, String jobStatusType, String jobStatusReasonId,
                                      String jobStatusReason, String jobStatusExplain) {
        Result result = new Result();
        int i = dispatchedDao.updateUserJobStatus(userJobId, jobStatusId, jobStatus, jobStatusTypeId, jobStatusType, jobStatusReasonId, jobStatusReason, jobStatusExplain);
        if(i == 1){
            result.setCode("1000");
            result.setMsg("更新成功");
        }else{
            result.setCode("1001");
            result.setMsg("系统故障，更新失败");
        }
        return result;
    }

}
