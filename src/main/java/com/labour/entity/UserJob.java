package com.labour.entity;

import java.io.Serializable;

public class UserJob implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private int id;
    /**
     * 用户工作岗位ID
     */
    private String userJobId;
    /**
     * 用户ID
     */
    private String user_id;
    /**
     * 用户公司ID
     */
    private String user_company_id;
    /**
     * 公司ID
     */
    private String company_id;
    /**
     * 公司全称
     */
    private String company_full_name;
    /**
     * 入职时间
     */
    private String startJobTime;
    /**
     * 离职结束时间
     */
    private String endJobTime;
    /**
     * 推荐团队Id
     */
    private String promoteTeamId;
    /**
     * 推荐团队
     */
    private String promoteTeam;
    /**
     * 驻场ID
     */
    private String resident;
    /**
     * 驻场名称
     */
    private String residentName;
    /**
     * 省级ID
     */
    private String province_code;
    /**
     * 省级名称
     */
    private String province_name;
    /**
     * 市级ID
     */
    private String city_code;
    /**
     * 市级名称
     */
    private String city_name;
    /**
     * 县级ID
     */
    private String county_code;
    /**
     * 县级名称
     */
    private String county_name;
    /**
     * 详细地址
     */
    private String address;
    /**
     * 用工公司ID
     */
    private String usingCompanyId;
    /**
     * 用工公司名称
     */
    private String usingCompanyName;
    /**
     * 岗位名称
     */
    private String stationName;
    /**
     * 工人价
     */
    private String workersPrice;
    /**
     * 薪酬类型ID
     */
    private String salaryTypeId;
    /**
     * 薪酬类型名称
     */
    private String salaryTypeName;
    /**
     * 班制名称
     */
    private String shiftSystemName;
    /**
     * 班制ID
     */
    private String shiftSystemId;
    /**
     * 工作方式名称
     */
    private String operationModeName;
    /**
     * 工作方式ID
     */
    private String operationModeId;
    /**
     * 工衣名称
     */
    private String workClothesName;
    /**
     * 工衣ID
     */
    private String workClothesId;
    /**
     * 福利因素ID
     */
    private String welfareMemberId;
    /**
     * 福利因素
     */
    private String welfareMembers;
    /**
     * 工作周期起始时间
     */
    private String startWorkTime;
    /**
     * 工作周期结束时间
     */
    private String endWorkTime;
    /**
     * 岗位要求
     */
    private String jobRequirements;
    /**
     * 工作状态ID
     */
    private String jobStatusId;
    /**
     * 工作状态
     */
    private String jobStatus;
    /**
     * 工作状态类型ID
     */
    private String jobStatusTypeId;
    /**
     * 工作状态类型
     */
    private String jobStatusType;
    /**
     * 工作状态原因ID
     */
    private String jobStatusReasonId;
    /**
     * 工作状态原因
     */
    private String jobStatusReason;
    /**
     * 工作状态说明
     */
    private String jobStatusExplain;
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

    public String getUserJobId() {
        return userJobId;
    }

    public void setUserJobId(String userJobId) {
        this.userJobId = userJobId;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_company_id() {
        return user_company_id;
    }

    public void setUser_company_id(String user_company_id) {
        this.user_company_id = user_company_id;
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

    public String getStartJobTime() {
        return startJobTime;
    }

    public void setStartJobTime(String startJobTime) {
        this.startJobTime = startJobTime;
    }

    public String getEndJobTime() {
        return endJobTime;
    }

    public void setEndJobTime(String endJobTime) {
        this.endJobTime = endJobTime;
    }

    public String getPromoteTeamId() {
        return promoteTeamId;
    }

    public void setPromoteTeamId(String promoteTeamId) {
        this.promoteTeamId = promoteTeamId;
    }

    public String getPromoteTeam() {
        return promoteTeam;
    }

    public void setPromoteTeam(String promoteTeam) {
        this.promoteTeam = promoteTeam;
    }

    public String getResident() {
        return resident;
    }

    public void setResident(String resident) {
        this.resident = resident;
    }

    public String getResidentName() {
        return residentName;
    }

    public void setResidentName(String residentName) {
        this.residentName = residentName;
    }

    public String getProvince_code() {
        return province_code;
    }

    public void setProvince_code(String province_code) {
        this.province_code = province_code;
    }

    public String getProvince_name() {
        return province_name;
    }

    public void setProvince_name(String province_name) {
        this.province_name = province_name;
    }

    public String getCity_code() {
        return city_code;
    }

    public void setCity_code(String city_code) {
        this.city_code = city_code;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public String getCounty_code() {
        return county_code;
    }

    public void setCounty_code(String county_code) {
        this.county_code = county_code;
    }

    public String getCounty_name() {
        return county_name;
    }

    public void setCounty_name(String county_name) {
        this.county_name = county_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getWorkersPrice() {
        return workersPrice;
    }

    public void setWorkersPrice(String workersPrice) {
        this.workersPrice = workersPrice;
    }

    public String getSalaryTypeId() {
        return salaryTypeId;
    }

    public void setSalaryTypeId(String salaryTypeId) {
        this.salaryTypeId = salaryTypeId;
    }

    public String getSalaryTypeName() {
        return salaryTypeName;
    }

    public void setSalaryTypeName(String salaryTypeName) {
        this.salaryTypeName = salaryTypeName;
    }

    public String getShiftSystemName() {
        return shiftSystemName;
    }

    public void setShiftSystemName(String shiftSystemName) {
        this.shiftSystemName = shiftSystemName;
    }

    public String getShiftSystemId() {
        return shiftSystemId;
    }

    public void setShiftSystemId(String shiftSystemId) {
        this.shiftSystemId = shiftSystemId;
    }

    public String getOperationModeName() {
        return operationModeName;
    }

    public void setOperationModeName(String operationModeName) {
        this.operationModeName = operationModeName;
    }

    public String getOperationModeId() {
        return operationModeId;
    }

    public void setOperationModeId(String operationModeId) {
        this.operationModeId = operationModeId;
    }

    public String getWorkClothesName() {
        return workClothesName;
    }

    public void setWorkClothesName(String workClothesName) {
        this.workClothesName = workClothesName;
    }

    public String getWorkClothesId() {
        return workClothesId;
    }

    public void setWorkClothesId(String workClothesId) {
        this.workClothesId = workClothesId;
    }

    public String getWelfareMemberId() {
        return welfareMemberId;
    }

    public void setWelfareMemberId(String welfareMemberId) {
        this.welfareMemberId = welfareMemberId;
    }

    public String getWelfareMembers() {
        return welfareMembers;
    }

    public void setWelfareMembers(String welfareMembers) {
        this.welfareMembers = welfareMembers;
    }

    public String getStartWorkTime() {
        return startWorkTime;
    }

    public void setStartWorkTime(String startWorkTime) {
        this.startWorkTime = startWorkTime;
    }

    public String getEndWorkTime() {
        return endWorkTime;
    }

    public void setEndWorkTime(String endWorkTime) {
        this.endWorkTime = endWorkTime;
    }

    public String getJobRequirements() {
        return jobRequirements;
    }

    public void setJobRequirements(String jobRequirements) {
        this.jobRequirements = jobRequirements;
    }

    public String getJobStatusId() {
        return jobStatusId;
    }

    public void setJobStatusId(String jobStatusId) {
        this.jobStatusId = jobStatusId;
    }

    public String getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    public String getJobStatusTypeId() {
        return jobStatusTypeId;
    }

    public void setJobStatusTypeId(String jobStatusTypeId) {
        this.jobStatusTypeId = jobStatusTypeId;
    }

    public String getJobStatusType() {
        return jobStatusType;
    }

    public void setJobStatusType(String jobStatusType) {
        this.jobStatusType = jobStatusType;
    }

    public String getJobStatusReasonId() {
        return jobStatusReasonId;
    }

    public void setJobStatusReasonId(String jobStatusReasonId) {
        this.jobStatusReasonId = jobStatusReasonId;
    }

    public String getJobStatusReason() {
        return jobStatusReason;
    }

    public void setJobStatusReason(String jobStatusReason) {
        this.jobStatusReason = jobStatusReason;
    }

    public String getJobStatusExplain() {
        return jobStatusExplain;
    }

    public void setJobStatusExplain(String jobStatusExplain) {
        this.jobStatusExplain = jobStatusExplain;
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
        return "UserJob{" +
                "userJobId='" + userJobId + '\'' +
                ", user_id='" + user_id + '\'' +
                ", user_company_id='" + user_company_id + '\'' +
                ", company_id='" + company_id + '\'' +
                ", company_full_name='" + company_full_name + '\'' +
                ", startJobTime='" + startJobTime + '\'' +
                ", endJobTime='" + endJobTime + '\'' +
                ", promoteTeamId='" + promoteTeamId + '\'' +
                ", promoteTeam='" + promoteTeam + '\'' +
                ", resident='" + resident + '\'' +
                ", residentName='" + residentName + '\'' +
                ", province_code='" + province_code + '\'' +
                ", province_name='" + province_name + '\'' +
                ", city_code='" + city_code + '\'' +
                ", city_name='" + city_name + '\'' +
                ", county_code='" + county_code + '\'' +
                ", county_name='" + county_name + '\'' +
                ", address='" + address + '\'' +
                ", usingCompanyId='" + usingCompanyId + '\'' +
                ", usingCompanyName='" + usingCompanyName + '\'' +
                ", stationName='" + stationName + '\'' +
                ", workersPrice='" + workersPrice + '\'' +
                ", salaryTypeId='" + salaryTypeId + '\'' +
                ", salaryTypeName='" + salaryTypeName + '\'' +
                ", shiftSystemName='" + shiftSystemName + '\'' +
                ", shiftSystemId='" + shiftSystemId + '\'' +
                ", operationModeName='" + operationModeName + '\'' +
                ", operationModeId='" + operationModeId + '\'' +
                ", workClothesName='" + workClothesName + '\'' +
                ", workClothesId='" + workClothesId + '\'' +
                ", welfareMemberId='" + welfareMemberId + '\'' +
                ", welfareMembers='" + welfareMembers + '\'' +
                ", startWorkTime='" + startWorkTime + '\'' +
                ", endWorkTime='" + endWorkTime + '\'' +
                ", jobRequirements='" + jobRequirements + '\'' +
                ", jobStatusId='" + jobStatusId + '\'' +
                ", jobStatus='" + jobStatus + '\'' +
                ", jobStatusTypeId='" + jobStatusTypeId + '\'' +
                ", jobStatusType='" + jobStatusType + '\'' +
                ", jobStatusReasonId='" + jobStatusReasonId + '\'' +
                ", jobStatusReason='" + jobStatusReason + '\'' +
                ", jobStatusExplain='" + jobStatusExplain + '\'' +
                ", create_time='" + create_time + '\'' +
                ", update_time='" + update_time + '\'' +
                '}';
    }

}
