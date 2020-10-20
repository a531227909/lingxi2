package com.labour.service.impl;

import com.labour.dao.*;
import com.labour.entity.*;
import com.labour.model.Approval;
import com.labour.model.LaborDemand;
import com.labour.service.ApplyService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.context.support.ApplicationObjectSupport;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ApplyServiceImpl extends ApplicationObjectSupport implements ApplyService {

    private static Logger logger = LogManager.getLogger("org.springframework");

    @Resource
    private DispatchedDao dispatchedDao;

    @Resource
    private LaborDemandDao laborDemandDao;

    @Resource
    private UserDao userDao;

    @Resource
    private UserJobDao userJobDao;

    @Resource
    private ApprovalDao approvalDao;

    @Override
    public Result insertOneEntryApply(String user_id, String laborDemandId, String workReviewTypeId, String workReviewType, String reviewReason) {
        Result result = new Result();
        User user = userDao.selectOneUserById(user_id);
        LaborDemand laborDemand = laborDemandDao.selectOneLaborDemand(laborDemandId);
        String company_id = laborDemand.getCompany_id();

        //新增到用户公司关系表
        UserCompany userCompany = new UserCompany();
        userCompany.setUser_id(user_id);
        userCompany.setUser_name(user.getUser_name());
        userCompany.setCompany_id(company_id);
        userCompany.setCompany_full_name(laborDemand.getCompany_full_name());

        //新增到用户工作关系表
        UserJob userJob = new UserJob();
        BeanUtils.copyProperties(laborDemand, userJob);
        userJob.setUser_company_id(String.valueOf(userCompany.getId()));
        userJob.setUser_id(user_id);
        userJob.setJobStatusId("1");
        userJob.setJobStatus("入职审核中");
        userJobDao.addOneUserJob(userJob);

        //parentId = "-1" 查询第一次审核申请的管理员或部门
        String parentId = "-1";
        Approval approval = approvalDao.selectOneEntryApproval(company_id, parentId, "", "", "");

        //新增审核请求
        WorkReview workReview = new WorkReview();
        BeanUtils.copyProperties(userJob, workReview);
        workReview.setWorkReviewTypeId(workReviewTypeId);
        workReview.setWorkReviewType(workReviewType);
        workReview.setReviewReason(reviewReason);
        workReview.setWorkReviewStatus("1");//工作申请类型ID 1:入职审核 2:离职审核
        workReview.setCreate_time(null);
        workReview.setUpdate_time(null);
        dispatchedDao.insertOneWorkReview(workReview);
        //新增审核请求
        WorkAudit workAudit = new WorkAudit();
        workAudit.setWorkReviewId(workReview.getWorkReviewId());
        workAudit.setFlow_node_id(approval.getEntryApprovalId());
        workAudit.setAuditUserId(approval.getUser_id());
        workAudit.setAuditName(approval.getName());
        workAudit.setUser_type_id(approval.getUser_type_id());
        workAudit.setUser_type_name(approval.getUser_type_name());
        workAudit.setApprovalTypeId(approval.getType());
        //审核状态 审核还是未审核 0:未审核 1:审核完成
        workAudit.setWorkAuditStatus("0");
        dispatchedDao.insertOneWorkAudit(workAudit);

        dispatchedDao.updateAuditCurrentNode(String.valueOf(workReview.getId()), String.valueOf(workAudit.getId()));

        result.setCode("1000");
        result.setMsg("申请入职成功");
        return result;
    }

    @Override
    public Result insertOneRaApply(String user_id, String company_id, String workReviewTypeId, String workReviewType, String reviewReason) {
        Result result = new Result();
        UserJob userJob = userJobDao.selectUserJob(user_id, company_id);

        //parentId = "-1" 查询第一次审核申请的管理员或部门
        String parentId = "-1";
        Approval approval = approvalDao.selectOneRaApproval(company_id, parentId, "", "", "");

        String jobStatusId = "4";
        String jobStatus = "离职审核中";
        dispatchedDao.updateUserJobStatus(userJob.getUserJobId(), jobStatusId, jobStatus, "", "", "", "", "");

        //新增工作请求
        WorkReview workReview = new WorkReview();
        BeanUtils.copyProperties(userJob, workReview);
        workReview.setWorkReviewTypeId(workReviewTypeId);
        workReview.setWorkReviewType(workReviewType);
        workReview.setReviewReason(reviewReason);
        workReview.setWorkReviewStatus("2");//工作申请类型ID 1:入职审核 2:离职审核
        workReview.setCreate_time(null);
        workReview.setUpdate_time(null);
        dispatchedDao.insertOneWorkReview(workReview);

        //新增审核请求
        WorkAudit workAudit = new WorkAudit();
        workAudit.setWorkReviewId(workReview.getWorkReviewId());
        workAudit.setFlow_node_id(approval.getResignationApprovalId());
        workAudit.setAuditUserId(approval.getUser_id());
        workAudit.setAuditName(approval.getName());
        workAudit.setUser_type_id(approval.getUser_type_id());
        workAudit.setUser_type_name(approval.getUser_type_name());
        workAudit.setApprovalTypeId(approval.getType());
        //审核状态 审核还是未审核 0:未审核 1:审核完成
        workAudit.setWorkAuditStatus("0");
        dispatchedDao.insertOneWorkAudit(workAudit);

        dispatchedDao.updateAuditCurrentNode(String.valueOf(workReview.getId()), String.valueOf(workAudit.getId()));

        result.setCode("1000");
        result.setMsg("申请离职成功");
        return result;
    }

}
