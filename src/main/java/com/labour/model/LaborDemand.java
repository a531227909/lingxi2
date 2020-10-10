package com.labour.model;

import java.io.Serializable;

public class LaborDemand implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用工需求自增ID
     */
    private String laborDemandId;

    /**
     * 公司ID
     */
    private String company_id;

    /**
     * 公司全称
     */
    private String company_full_name;

    /**
     * 需求编号
     */
    private String demandId;

    /**
     * 需求来源
     */
    private String demandSource;

    /**
     * 需求来源类型ID
     */
    private String demandSourceTypeId;

    /**
     * 需求来源公司名称
     */
    private String demandSourceName;

    /**
     * 需求来源公司ID
     */
    private String demandSourceId;

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
     * 薪酬类型ID
     */
    private String salaryTypeId;

    /**
     * 薪酬类型名称
     */
    private String salaryTypeName;

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
     * 工作周期起始时间
     */
    private String startWorkTime;

    /**
     * 工作周期结束时间
     */
    private String endWorkTime;

    /**
     * 驻场ID
     */
    private String resident;

    /**
     * 驻场名称
     */
    private String residentName;

    /**
     * 最小年龄
     */
    private String minAge;

    /**
     * 最大年龄
     */
    private String maxAge;

    /**
     * 性别
     */
    private String genderName;

    /**
     * 性别ID
     */
    private String genderId;

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
     * 福利因素ID
     */
    private String welfareMembers;

    /**
     * 特色描述
     */
    private String features;

    /**
     * 岗位要求
     */
    private String jobRequirements;

    /**
     * 业务价ID
     */
    private String businessPriceId;

    /**
     * 业务价名称
     */
    private String businessPriceName;

    /**
     * 签单价
     */
    private String signUnitPrice;

    /**
     * 业务款
     */
    private String businessFunds;

    /**
     * 工人价
     */
    private String workersPrice;

    /**
     * 状态 0:未发布 1:发布中
     */
    private String status;

    /**
     * 创建时间
     */
    private String create_time;

    /**
     * 更新时间
     */
    private String update_time;

    public String getLaborDemandId() {
        return laborDemandId;
    }

    public void setLaborDemandId(String laborDemandId) {
        this.laborDemandId = laborDemandId;
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

    public String getDemandId() {
        return demandId;
    }

    public void setDemandId(String demandId) {
        this.demandId = demandId;
    }

    public String getDemandSource() {
        return demandSource;
    }

    public void setDemandSource(String demandSource) {
        this.demandSource = demandSource;
    }

    public String getDemandSourceTypeId() {
        return demandSourceTypeId;
    }

    public void setDemandSourceTypeId(String demandSourceTypeId) {
        this.demandSourceTypeId = demandSourceTypeId;
    }

    public String getDemandSourceName() {
        return demandSourceName;
    }

    public void setDemandSourceName(String demandSourceName) {
        this.demandSourceName = demandSourceName;
    }

    public String getDemandSourceId() {
        return demandSourceId;
    }

    public void setDemandSourceId(String demandSourceId) {
        this.demandSourceId = demandSourceId;
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

    public String getMinAge() {
        return minAge;
    }

    public void setMinAge(String minAge) {
        this.minAge = minAge;
    }

    public String getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(String maxAge) {
        this.maxAge = maxAge;
    }

    public String getGenderName() {
        return genderName;
    }

    public void setGenderName(String genderName) {
        this.genderName = genderName;
    }

    public String getGenderId() {
        return genderId;
    }

    public void setGenderId(String genderId) {
        this.genderId = genderId;
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

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    public String getJobRequirements() {
        return jobRequirements;
    }

    public void setJobRequirements(String jobRequirements) {
        this.jobRequirements = jobRequirements;
    }

    public String getBusinessPriceId() {
        return businessPriceId;
    }

    public void setBusinessPriceId(String businessPriceId) {
        this.businessPriceId = businessPriceId;
    }

    public String getBusinessPriceName() {
        return businessPriceName;
    }

    public void setBusinessPriceName(String businessPriceName) {
        this.businessPriceName = businessPriceName;
    }

    public String getSignUnitPrice() {
        return signUnitPrice;
    }

    public void setSignUnitPrice(String signUnitPrice) {
        this.signUnitPrice = signUnitPrice;
    }

    public String getBusinessFunds() {
        return businessFunds;
    }

    public void setBusinessFunds(String businessFunds) {
        this.businessFunds = businessFunds;
    }

    public String getWorkersPrice() {
        return workersPrice;
    }

    public void setWorkersPrice(String workersPrice) {
        this.workersPrice = workersPrice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
        return "LaborDemand{" +
                "laborDemandId='" + laborDemandId + '\'' +
                ", company_id='" + company_id + '\'' +
                ", company_full_name='" + company_full_name + '\'' +
                ", demandId='" + demandId + '\'' +
                ", demandSource='" + demandSource + '\'' +
                ", demandSourceTypeId='" + demandSourceTypeId + '\'' +
                ", demandSourceName='" + demandSourceName + '\'' +
                ", demandSourceId='" + demandSourceId + '\'' +
                ", usingCompanyId='" + usingCompanyId + '\'' +
                ", usingCompanyName='" + usingCompanyName + '\'' +
                ", stationName='" + stationName + '\'' +
                ", salaryTypeId='" + salaryTypeId + '\'' +
                ", salaryTypeName='" + salaryTypeName + '\'' +
                ", province_code='" + province_code + '\'' +
                ", province_name='" + province_name + '\'' +
                ", city_code='" + city_code + '\'' +
                ", city_name='" + city_name + '\'' +
                ", county_code='" + county_code + '\'' +
                ", county_name='" + county_name + '\'' +
                ", address='" + address + '\'' +
                ", startWorkTime='" + startWorkTime + '\'' +
                ", endWorkTime='" + endWorkTime + '\'' +
                ", resident='" + resident + '\'' +
                ", residentName='" + residentName + '\'' +
                ", minAge='" + minAge + '\'' +
                ", maxAge='" + maxAge + '\'' +
                ", genderName='" + genderName + '\'' +
                ", genderId='" + genderId + '\'' +
                ", shiftSystemName='" + shiftSystemName + '\'' +
                ", shiftSystemId='" + shiftSystemId + '\'' +
                ", operationModeName='" + operationModeName + '\'' +
                ", operationModeId='" + operationModeId + '\'' +
                ", workClothesName='" + workClothesName + '\'' +
                ", workClothesId='" + workClothesId + '\'' +
                ", welfareMemberId='" + welfareMemberId + '\'' +
                ", welfareMembers='" + welfareMembers + '\'' +
                ", features='" + features + '\'' +
                ", jobRequirements='" + jobRequirements + '\'' +
                ", businessPriceId='" + businessPriceId + '\'' +
                ", businessPriceName='" + businessPriceName + '\'' +
                ", signUnitPrice='" + signUnitPrice + '\'' +
                ", businessFunds='" + businessFunds + '\'' +
                ", workersPrice='" + workersPrice + '\'' +
                ", status='" + status + '\'' +
                ", create_time='" + create_time + '\'' +
                ", update_time='" + update_time + '\'' +
                '}';
    }

}
