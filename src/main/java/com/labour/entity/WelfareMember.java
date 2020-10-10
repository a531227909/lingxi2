package com.labour.entity;

import java.io.Serializable;

public class WelfareMember implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 因素自增ID
     */
    private String memberId;

    /**
     * 福利因素ID
     */
    private String welfareMemberId;

    /**
     * 公司ID
     */
    private String company_id;

    /**
     * 公司全称
     */
    private String company_full_name;

    /**
     * 福利类型ID
     */
    private String welfareId;

    /**
     * 福利类型名称
     */
    private String welfareName;

    /**
     * 福利内容
     */
    private String welfare;

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getWelfareMemberId() {
        return welfareMemberId;
    }

    public void setWelfareMemberId(String welfareMemberId) {
        this.welfareMemberId = welfareMemberId;
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

    public String getWelfareId() {
        return welfareId;
    }

    public void setWelfareId(String welfareId) {
        this.welfareId = welfareId;
    }

    public String getWelfareName() {
        return welfareName;
    }

    public void setWelfareName(String welfareName) {
        this.welfareName = welfareName;
    }

    public String getWelfare() {
        return welfare;
    }

    public void setWelfare(String welfare) {
        this.welfare = welfare;
    }

    @Override
    public String toString() {
        return "WelfareMember{" +
                "memberId='" + memberId + '\'' +
                ", welfareMemberId='" + welfareMemberId + '\'' +
                ", company_id='" + company_id + '\'' +
                ", company_full_name='" + company_full_name + '\'' +
                ", welfareId='" + welfareId + '\'' +
                ", welfareName='" + welfareName + '\'' +
                ", welfare='" + welfare + '\'' +
                '}';
    }

}
