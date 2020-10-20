package com.labour.entity;

import java.io.Serializable;

public class WorkAudit implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private int id;
    /**
     * 工作审核自增ID
     */
    private String workAuditId;
    /**
     * 工作申请ID
     */
    private String workReviewId;
    /**
     * 审核节点ID
     */
    private String flow_node_id;
    /**
     * 审批用户ID
     */
    private String auditUserId;
    /**
     * 审批人姓名
     */
    private String auditName;
    /**
     * 审批部门ID
     */
    private String user_type_id;
    /**
     * 审批部门名称
     */
    private String user_type_name;
    /**
     * 审核人员类型ID
     */
    private String approvalTypeId;
    /**
     * 审核人员类型
     */
    private String approvalType;
    /**
     * 是否批准 0:拒绝 1:同意
     */
    private String isOk;
    /**
     * 审批意见
     */
    private String audit_info;
    /**
     * 创建时间
     */
    private String create_time;
    /**
     * 更新时间
     */
    private String update_time;
    /**
     * 审核状态 审核还是未审核 0:未审核 1:审核完成
     */
    private String workAuditStatus;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWorkAuditId() {
        return workAuditId;
    }

    public void setWorkAuditId(String workAuditId) {
        this.workAuditId = workAuditId;
    }

    public String getWorkReviewId() {
        return workReviewId;
    }

    public void setWorkReviewId(String workReviewId) {
        this.workReviewId = workReviewId;
    }

    public String getFlow_node_id() {
        return flow_node_id;
    }

    public void setFlow_node_id(String flow_node_id) {
        this.flow_node_id = flow_node_id;
    }

    public String getAuditUserId() {
        return auditUserId;
    }

    public void setAuditUserId(String auditUserId) {
        this.auditUserId = auditUserId;
    }

    public String getAuditName() {
        return auditName;
    }

    public void setAuditName(String auditName) {
        this.auditName = auditName;
    }

    public String getUser_type_id() {
        return user_type_id;
    }

    public void setUser_type_id(String user_type_id) {
        this.user_type_id = user_type_id;
    }

    public String getUser_type_name() {
        return user_type_name;
    }

    public void setUser_type_name(String user_type_name) {
        this.user_type_name = user_type_name;
    }

    public String getApprovalTypeId() {
        return approvalTypeId;
    }

    public void setApprovalTypeId(String approvalTypeId) {
        this.approvalTypeId = approvalTypeId;
    }

    public String getApprovalType() {
        return approvalType;
    }

    public void setApprovalType(String approvalType) {
        this.approvalType = approvalType;
    }

    public String getIsOk() {
        return isOk;
    }

    public void setIsOk(String isOk) {
        this.isOk = isOk;
    }

    public String getAudit_info() {
        return audit_info;
    }

    public void setAudit_info(String audit_info) {
        this.audit_info = audit_info;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }

    public String getWorkAuditStatus() {
        return workAuditStatus;
    }

    public void setWorkAuditStatus(String workAuditStatus) {
        this.workAuditStatus = workAuditStatus;
    }

    @Override
    public String toString() {
        return "WorkAudit{" +
                "workAuditId='" + workAuditId + '\'' +
                ", workReviewId='" + workReviewId + '\'' +
                ", flow_node_id='" + flow_node_id + '\'' +
                ", auditUserId='" + auditUserId + '\'' +
                ", auditName='" + auditName + '\'' +
                ", user_type_id='" + user_type_id + '\'' +
                ", user_type_name='" + user_type_name + '\'' +
                ", approvalTypeId='" + approvalTypeId + '\'' +
                ", approvalType='" + approvalType + '\'' +
                ", isOk='" + isOk + '\'' +
                ", audit_info='" + audit_info + '\'' +
                ", create_time='" + create_time + '\'' +
                ", update_time='" + update_time + '\'' +
                ", workAuditStatus='" + workAuditStatus + '\'' +
                '}';
    }
}
