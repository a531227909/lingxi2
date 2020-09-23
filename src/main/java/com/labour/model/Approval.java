package com.labour.model;

import java.io.Serializable;

public class Approval implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户公司自增ID
     */
    private String user_company_id;
    /**
     * 用户ID
     */
    private String user_id;
    /**
     * 用户名
     */
    private String user_name;
    /**
     * 用户名
     */
    private String name;
    /**
     * 用户类型(岗位)ID
     */
    private String user_type_id;
    /**
     * 用户类型(岗位)名称
     */
    private String user_type_name;
    /**
     * 公司ID
     */
    private String company_id;
    /**
     * 公司全称
     */
    private String company_full_name;
    /**
     * 入职审核权限自增ID
     */
    private String entryApprovalId;
    /**
     * 离职审核权限自增ID
     */
    private String resignationApprovalId;
    /**
     * 预支审核权限自增ID
     */
    private String payAdvanceApprovalId;
    /**
     * 上级审核权限ID 0:没有权限 -1:顶级
     */
    private String parentId;

    /**
     * 1:管理员 2:部门
     */
    private String type;

    public String getUser_company_id() {
        return user_company_id;
    }

    public void setUser_company_id(String user_company_id) {
        this.user_company_id = user_company_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getEntryApprovalId() {
        return entryApprovalId;
    }

    public void setEntryApprovalId(String entryApprovalId) {
        this.entryApprovalId = entryApprovalId;
    }

    public String getResignationApprovalId() {
        return resignationApprovalId;
    }

    public void setResignationApprovalId(String resignationApprovalId) {
        this.resignationApprovalId = resignationApprovalId;
    }

    public String getPayAdvanceApprovalId() {
        return payAdvanceApprovalId;
    }

    public void setPayAdvanceApprovalId(String payAdvanceApprovalId) {
        this.payAdvanceApprovalId = payAdvanceApprovalId;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Approval{" +
                "user_company_id='" + user_company_id + '\'' +
                ", user_id='" + user_id + '\'' +
                ", user_name='" + user_name + '\'' +
                ", name='" + name + '\'' +
                ", user_type_id='" + user_type_id + '\'' +
                ", user_type_name='" + user_type_name + '\'' +
                ", company_id='" + company_id + '\'' +
                ", company_full_name='" + company_full_name + '\'' +
                ", entryApprovalId='" + entryApprovalId + '\'' +
                ", resignationApprovalId='" + resignationApprovalId + '\'' +
                ", payAdvanceApprovalId='" + payAdvanceApprovalId + '\'' +
                ", parentId='" + parentId + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
