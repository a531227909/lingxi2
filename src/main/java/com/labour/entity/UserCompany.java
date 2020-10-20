package com.labour.entity;

import java.io.Serializable;

public class UserCompany implements Serializable {

    private static final long serialVersionUID = 1L;


    private int id;
    /**
     * 用户公司ID
     */
    private String user_company_id;
    /**
     * 用户自增ID
     */
    private String user_id;
    /**
     * 用户名
     */
    private String user_name;
    /**
     *公司ID
     */
    private String company_id;
    /**
     * 公司全称
     */
    private String company_full_name;
    /**
     * 入职审批流程序列 0:不在序列
     */
    private String entry_approval_level;
    /**
     * 预支审批流程序列 0:不在序列
     */
    private String resignation_approval_level;
    /**
     * 离职审批流程序列 0:不在序列
     */
    private String advance_approval_level;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getEntry_approval_level() {
        return entry_approval_level;
    }

    public void setEntry_approval_level(String entry_approval_level) {
        this.entry_approval_level = entry_approval_level;
    }

    public String getResignation_approval_level() {
        return resignation_approval_level;
    }

    public void setResignation_approval_level(String resignation_approval_level) {
        this.resignation_approval_level = resignation_approval_level;
    }

    public String getAdvance_approval_level() {
        return advance_approval_level;
    }

    public void setAdvance_approval_level(String advance_approval_level) {
        this.advance_approval_level = advance_approval_level;
    }

    @Override
    public String toString() {
        return "UserCompany{" +
                "user_company_id='" + user_company_id + '\'' +
                ", user_id='" + user_id + '\'' +
                ", user_name='" + user_name + '\'' +
                ", company_id='" + company_id + '\'' +
                ", company_full_name='" + company_full_name + '\'' +
                ", entry_approval_level='" + entry_approval_level + '\'' +
                ", resignation_approval_level='" + resignation_approval_level + '\'' +
                ", advance_approval_level='" + advance_approval_level + '\'' +
                '}';
    }
}
