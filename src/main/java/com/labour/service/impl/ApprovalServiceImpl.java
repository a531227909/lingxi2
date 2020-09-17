package com.labour.service.impl;

import com.labour.dao.ApprovalDao;
import com.labour.entity.Result;
import com.labour.model.Approval;
import com.labour.service.ApprovalService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.support.ApplicationObjectSupport;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class ApprovalServiceImpl extends ApplicationObjectSupport implements ApprovalService {

    private static Logger logger = LogManager.getLogger("org.springframework");

    @Resource
    private ApprovalDao approvalDao;

    @Override
    public Result selectOneEntryApproval(String company_id, String user_id) {
        Result result = new Result();
        Approval approval = approvalDao.selectOneEntryApproval(company_id, "", user_id);
        result.setCode("1000");
        result.setMsg("查询成功");
        result.setData(approval);
        return result;
    }

    @Override
    public Result selectOneRaApproval(String company_id, String user_id) {
        Result result = new Result();
        Approval approval = approvalDao.selectOneRaApproval(company_id, "", user_id);
        result.setCode("1000");
        result.setMsg("查询成功");
        result.setData(approval);
        return result;
    }

    @Override
    public Result selectOnePaApproval(String company_id, String user_id) {
        Result result = new Result();
        Approval approval = approvalDao.selectOnePaApproval(company_id, "", user_id);
        result.setCode("1000");
        result.setMsg("查询成功");
        result.setData(approval);
        return result;
    }

    @Override
    public Result selectEntryApprovals(String company_id) {
        Result result = new Result();
        List<Approval> approvalList = new ArrayList<>();
        boolean isPrarent = true;
        //初始化顶级审核ID,遍历parentId
        Approval approval = new Approval();
        approval.setEntryApprovalId("-1");
        while (isPrarent){
            approval = approvalDao.selectOneEntryApproval(company_id, approval.getEntryApprovalId(), "");
            if(approval == null || approval.equals("null")){
                isPrarent = false;
            }else {
                approvalList.add(approval);
            }
        }
        result.setCode("1000");
        result.setMsg("查询成功");
        result.setData(approvalList);
        return result;
    }

    @Override
    public Result selectRaApprovals(String company_id) {
        Result result = new Result();
        List<Approval> approvalList = new ArrayList<>();
        boolean isPrarent = true;
        //初始化顶级审核ID,遍历parentId
        Approval approval = new Approval();
        approval.setResignationApprovalId("-1");
        while (isPrarent){
            approval = approvalDao.selectOneRaApproval(company_id, approval.getResignationApprovalId(), "");
            if(approval == null || approval.equals("null")){
                isPrarent = false;
            }else {
                approvalList.add(approval);
            }
        }
        result.setCode("1000");
        result.setMsg("查询成功");
        result.setData(approvalList);
        return result;
    }

    @Override
    public Result selectPaApprovals(String company_id) {
        Result result = new Result();
        List<Approval> approvalList = new ArrayList<>();
        boolean isPrarent = true;
        //初始化顶级审核ID,遍历parentId
        Approval approval = new Approval();
        approval.setPayAdvanceApprovalId("-1");
        while (isPrarent){
            approval = approvalDao.selectOnePaApproval(company_id, approval.getPayAdvanceApprovalId(), "");
            if(approval == null || approval.equals("null")){
                isPrarent = false;
            }else {
                approvalList.add(approval);
            }
        }
        result.setCode("1000");
        result.setMsg("查询成功");
        result.setData(approvalList);
        return result;
    }

    @Override
    public Result insertOneEnApproval(String company_id, String parentId, String user_id) {
        Result result = new Result();
        if(parentId.equals("0")){
            int i = approvalDao.insertOneEnApproval(company_id, "-1", user_id);
            if(i == 1){
                result.setCode("1000");
                result.setMsg("新增成功");
            }else{
                result.setCode("1001");
                result.setMsg("系统故障，新增失败");
            }
        }else{
            Approval approvalSon = approvalDao.selectOneEntryApproval(company_id, parentId, "");
            int i = approvalDao.insertOneEnApproval(company_id, parentId, user_id);
            Approval approval = approvalDao.selectOneEntryApproval(company_id, parentId, user_id);
            int j = approvalDao.updateOneEnApproval("", approval.getEntryApprovalId(), "", approvalSon.getEntryApprovalId());
            if(i == 1){
                if(j == 1){
                    result.setCode("1000");
                    result.setMsg("新增成功");
                }else{
                    result.setCode("1001");
                    result.setMsg("系统故障,更新用户下级权限ID失败,新增用户权限成功");
                }
            }else{
                if(j == 1){
                    result.setCode("1001");
                    result.setMsg("系统故障,新增用户权限失败,更新下级权限ID成功");
                }else{
                    result.setCode("1001");
                    result.setMsg("系统故障,新增用户权限失败,更新下级权限ID失败");
                }
            }
        }
        return  result;
    }

    @Override
    public Result insertOneRaApproval(String company_id, String parentId, String user_id) {
        Result result = new Result();
        if(parentId.equals("0")){
            int i = approvalDao.insertOneRaApproval(company_id, "-1", user_id);
            if(i == 1){
                result.setCode("1000");
                result.setMsg("新增成功");
            }else{
                result.setCode("1001");
                result.setMsg("系统故障，新增失败");
            }
        }else{
            Approval approvalSon = approvalDao.selectOneRaApproval(company_id, parentId, "");
            int i = approvalDao.insertOneRaApproval(company_id, parentId, user_id);
            Approval approval = approvalDao.selectOneRaApproval(company_id, parentId, user_id);
            System.out.println(approval.getResignationApprovalId());
            System.out.println(approvalSon.getResignationApprovalId());
            int j = approvalDao.updateOneRaApproval("", approval.getResignationApprovalId(), "", approvalSon.getResignationApprovalId());
            if(i == 1){
                if(j == 1){
                    result.setCode("1000");
                    result.setMsg("新增成功");
                }else{
                    result.setCode("1001");
                    result.setMsg("系统故障,更新用户下级权限ID失败,新增用户权限成功");
                }
            }else{
                if(j == 1){
                    result.setCode("1001");
                    result.setMsg("系统故障,新增用户权限失败,更新下级权限ID成功");
                }else{
                    result.setCode("1001");
                    result.setMsg("系统故障,新增用户权限失败,更新下级权限ID失败");
                }
            }
        }
        return  result;
    }

    @Override
    public Result insertOnePaApproval(String company_id, String parentId, String user_id) {
        Result result = new Result();
        if(parentId.equals("0")){
            int i = approvalDao.insertOnePaApproval(company_id, "-1", user_id);
            if(i == 1){
                result.setCode("1000");
                result.setMsg("新增成功");
            }else{
                result.setCode("1001");
                result.setMsg("系统故障，新增失败");
            }
        }else{
            Approval approvalSon = approvalDao.selectOnePaApproval(company_id, parentId, "");
            int i = approvalDao.insertOnePaApproval(company_id, parentId, user_id);
            Approval approval = approvalDao.selectOnePaApproval(company_id, parentId, user_id);
            int j = approvalDao.updateOnePaApproval("", approval.getPayAdvanceApprovalId(), "", approvalSon.getPayAdvanceApprovalId());
            if(i == 1){
                if(j == 1){
                    result.setCode("1000");
                    result.setMsg("新增成功");
                }else{
                    result.setCode("1001");
                    result.setMsg("系统故障,更新用户下级权限ID失败,新增用户权限成功");
                }
            }else{
                if(j == 1){
                    result.setCode("1001");
                    result.setMsg("系统故障,新增用户权限失败,更新下级权限ID成功");
                }else{
                    result.setCode("1001");
                    result.setMsg("系统故障,新增用户权限失败,更新下级权限ID失败");
                }
            }
        }
        return  result;
    }

    @Override
    public Result deleteOneEnApproval(String entryApprovalId, String company_id, String parentId) {
        Result result = new Result();
        Approval approvalSon = approvalDao.selectOneEntryApproval(company_id, entryApprovalId, "");
        int i = approvalDao.deleteOneEnApproval(entryApprovalId);
        int j = approvalDao.updateOneEnApproval("", parentId, "", approvalSon.getEntryApprovalId());
        if(i == 1){
            if(j == 1){
                result.setCode("1000");
                result.setMsg("删除成功");
            }else{
                result.setCode("1001");
                result.setMsg("系统故障,更新用户下级权限ID失败,删除用户权限成功");
            }
        }else{
            if(j == 1){
                result.setCode("1001");
                result.setMsg("系统故障,删除用户权限失败,更新下级权限ID成功");
            }else{
                result.setCode("1001");
                result.setMsg("系统故障,删除用户权限失败,更新下级权限ID失败");
            }
        }
        return  result;
    }

    @Override
    public Result deleteOneRaApproval(String resignationApprovalId, String company_id, String parentId) {
        Result result = new Result();
        Approval approvalSon = approvalDao.selectOneRaApproval(company_id, resignationApprovalId, "");
        int i = approvalDao.deleteOneRaApproval(resignationApprovalId);
        int j = approvalDao.updateOneRaApproval("", parentId, "", approvalSon.getResignationApprovalId());
        if(i == 1){
            if(j == 1){
                result.setCode("1000");
                result.setMsg("删除成功");
            }else{
                result.setCode("1001");
                result.setMsg("系统故障,更新用户下级权限ID失败,删除用户权限成功");
            }
        }else{
            if(j == 1){
                result.setCode("1001");
                result.setMsg("系统故障,删除用户权限失败,更新下级权限ID成功");
            }else{
                result.setCode("1001");
                result.setMsg("系统故障,删除用户权限失败,更新下级权限ID失败");
            }
        }
        return  result;
    }

    @Override
    public Result deleteOnePaApproval(String payAdvanceApprovalId, String company_id, String parentId) {
        Result result = new Result();
        Approval approvalSon = approvalDao.selectOnePaApproval(company_id, payAdvanceApprovalId, "");
        int i = approvalDao.deleteOnePaApproval(payAdvanceApprovalId);
        int j = approvalDao.updateOnePaApproval("", parentId, "", approvalSon.getPayAdvanceApprovalId());
        if(i == 1){
            if(j == 1){
                result.setCode("1000");
                result.setMsg("删除成功");
            }else{
                result.setCode("1001");
                result.setMsg("系统故障,更新用户下级权限ID失败,删除用户权限成功");
            }
        }else{
            if(j == 1){
                result.setCode("1001");
                result.setMsg("系统故障,删除用户权限失败,更新下级权限ID成功");
            }else{
                result.setCode("1001");
                result.setMsg("系统故障,删除用户权限失败,更新下级权限ID失败");
            }
        }
        return  result;
    }
}
