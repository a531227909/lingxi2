package com.labour.model;

import java.io.Serializable;

public class Dispatched implements Serializable {

    private static final long serialVersionUID = 1L;

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
     * 审核状态 审核还是未审核 0:未审核 1:审核完成
     */
    private String workAuditStatus;
    /**
     * 用户ID
     */
    private String user_id;
    /**
     * 用户工作岗位ID
     */
    private String userJobId;
    /**
     * 工作申请类型Id
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
     * 审核原因
     */
    private String reviewReason;
    /**
     * 当前申请权限节点编号
     */
    private String workAuditCurrentNode;
    /**
     * 审核状态 审核还是未审核 0:未审核 1:审核完成
     */
    private String workReviewStatus;
    /**
     * 用户公司ID
     */
    private String user_company_id;
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
     * 总数
     */
    private String jobRequirements;
    /**
     * 身份证
     */
    private String idCard;
    /**
     * phoneNum
     */
    private String phoneNum;
    /**
     * 性别名称
     */
    private String genderName;
    /**
     * 民族
     */
    private String nation;
    /**
     * 学历
     */
    private String education;
    /**
     * 身份证正面
     */
    private String idCardFront;
    /**
     * 身份证反面
     */
    private String idCardReverse;

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

    public String getWorkAuditStatus() {
        return workAuditStatus;
    }

    public void setWorkAuditStatus(String workAuditStatus) {
        this.workAuditStatus = workAuditStatus;
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

    public String getUser_company_id() {
        return user_company_id;
    }

    public void setUser_company_id(String user_company_id) {
        this.user_company_id = user_company_id;
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

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getGenderName() {
        return genderName;
    }

    public void setGenderName(String genderName) {
        this.genderName = genderName;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getIdCardFront() {
        return idCardFront;
    }

    public void setIdCardFront(String idCardFront) {
        this.idCardFront = idCardFront;
    }

    public String getIdCardReverse() {
        return idCardReverse;
    }

    public void setIdCardReverse(String idCardReverse) {
        this.idCardReverse = idCardReverse;
    }

    @Override
    public String toString() {
        return "Dispatched{" +
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
                ", workAuditStatus='" + workAuditStatus + '\'' +
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
                ", user_company_id='" + user_company_id + '\'' +
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
                ", idCard='" + idCard + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", genderName='" + genderName + '\'' +
                ", nation='" + nation + '\'' +
                ", education='" + education + '\'' +
                ", idCardFront='" + idCardFront + '\'' +
                ", idCardReverse='" + idCardReverse + '\'' +
                '}';
    }

}
