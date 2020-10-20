package com.labour.entity;

import java.io.Serializable;

public class WorkReview implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private int id;
    /**
     * 工作申请自增ID
     */
    private String workReviewId;
    /**
     * 用户名
     */
    private String user_id;
    /**
     * 用户工作岗位ID
     */
    private String userJobId;
    /**
     * 工作申请类型ID 1:入职审核 2:离职审核
     */
    private String workReviewTypeId;
    /**
     * 工作申请类型
     */
    private String workReviewType;
    /**
     * 用户名
     */
    private String name;
    /**
     * 所属公司ID
     */
    private String company_id;
    /**
     * 所属公司全称
     */
    private String company_full_name;
    /**
     * 用工公司ID
     */
    private String usingCompanyId;
    /**
     * 用工公司名称
     */
    private String usingCompanyName;
    /**
     * 申请原因
     */
    private String reviewReason;
    /**
     * 当前审核节点ID
     */
    private String workAuditCurrentNode;
    /**
     * 审核状态 审核还是未审核 0:未审核 2:审核中 3:审核完成
     */
    private String workReviewStatus;
    /**
     * 创建时间
     */
    private String create_time;
    /**
     * 更新时间
     */
    private String update_time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWorkReviewId() {
        return workReviewId;
    }

    public void setWorkReviewId(String workReviewId) {
        this.workReviewId = workReviewId;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUserJobId() {
        return userJobId;
    }

    public void setUserJobId(String userJobId) {
        this.userJobId = userJobId;
    }

    public String getWorkReviewTypeId() {
        return workReviewTypeId;
    }

    public void setWorkReviewTypeId(String workReviewTypeId) {
        this.workReviewTypeId = workReviewTypeId;
    }

    public String getWorkReviewType() {
        return workReviewType;
    }

    public void setWorkReviewType(String workReviewType) {
        this.workReviewType = workReviewType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany_id() {
        return company_id;
    }

    public void setCompany_id(String company_id) {
        this.company_id = company_id;
    }

    public String getCompany_full_name() {
        return company_full_name;
    }

    public void setCompany_full_name(String company_full_name) {
        this.company_full_name = company_full_name;
    }

    public String getUsingCompanyId() {
        return usingCompanyId;
    }

    public void setUsingCompanyId(String usingCompanyId) {
        this.usingCompanyId = usingCompanyId;
    }

    public String getUsingCompanyName() {
        return usingCompanyName;
    }

    public void setUsingCompanyName(String usingCompanyName) {
        this.usingCompanyName = usingCompanyName;
    }

    public String getReviewReason() {
        return reviewReason;
    }

    public void setReviewReason(String reviewReason) {
        this.reviewReason = reviewReason;
    }

    public String getWorkAuditCurrentNode() {
        return workAuditCurrentNode;
    }

    public void setWorkAuditCurrentNode(String workAuditCurrentNode) {
        this.workAuditCurrentNode = workAuditCurrentNode;
    }

    public String getWorkReviewStatus() {
        return workReviewStatus;
    }

    public void setWorkReviewStatus(String workReviewStatus) {
        this.workReviewStatus = workReviewStatus;
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

    @Override
    public String toString() {
        return "WorkReview{" +
                "workReviewId='" + workReviewId + '\'' +
                ", user_id='" + user_id + '\'' +
                ", userJobId='" + userJobId + '\'' +
                ", workReviewTypeId='" + workReviewTypeId + '\'' +
                ", workReviewType='" + workReviewType + '\'' +
                ", name='" + name + '\'' +
                ", company_id='" + company_id + '\'' +
                ", company_full_name='" + company_full_name + '\'' +
                ", usingCompanyId='" + usingCompanyId + '\'' +
                ", usingCompanyName='" + usingCompanyName + '\'' +
                ", reviewReason='" + reviewReason + '\'' +
                ", workAuditCurrentNode='" + workAuditCurrentNode + '\'' +
                ", workReviewStatus='" + workReviewStatus + '\'' +
                ", create_time='" + create_time + '\'' +
                ", update_time='" + update_time + '\'' +
                '}';
    }
}
