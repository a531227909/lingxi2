package com.labour.model;

import java.io.Serializable;

public class Advance implements Serializable {

    private static final long serialVersionUID = 1L;

    private String advanceId;
    private String name;
    private String gender;
    private String idCard;
    private String phoneNum;
    private String company_id;
    private String company_full_name;
    private String usingCompanyId;
    private String usingCompanyName;
    private String stationName;
    private String workersPrice;
    private String startJobTime;
    private String advanceMoney;
    private String create_time;
    private String advanceServiceCost;
    private String status;
    private String province_code;
    private String province_name;
    private String city_code;
    private String city_name;
    private String county_code;
    private String county_name;
    private String address;

    public String getAdvanceId() {
        return advanceId;
    }

    public void setAdvanceId(String advanceId) {
        this.advanceId = advanceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public String getStartJobTime() {
        return startJobTime;
    }

    public void setStartJobTime(String startJobTime) {
        this.startJobTime = startJobTime;
    }

    public String getAdvanceMoney() {
        return advanceMoney;
    }

    public void setAdvanceMoney(String advanceMoney) {
        this.advanceMoney = advanceMoney;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getAdvanceServiceCost() {
        return advanceServiceCost;
    }

    public void setAdvanceServiceCost(String advanceServiceCost) {
        this.advanceServiceCost = advanceServiceCost;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    @Override
    public String toString() {
        return "Advance{" +
                "advanceId='" + advanceId + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", idCard='" + idCard + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", company_id='" + company_id + '\'' +
                ", company_full_name='" + company_full_name + '\'' +
                ", usingCompanyId='" + usingCompanyId + '\'' +
                ", usingCompanyName='" + usingCompanyName + '\'' +
                ", stationName='" + stationName + '\'' +
                ", workersPrice='" + workersPrice + '\'' +
                ", startJobTime='" + startJobTime + '\'' +
                ", advanceMoney='" + advanceMoney + '\'' +
                ", create_time='" + create_time + '\'' +
                ", advanceServiceCost='" + advanceServiceCost + '\'' +
                ", status='" + status + '\'' +
                ", province_code='" + province_code + '\'' +
                ", province_name='" + province_name + '\'' +
                ", city_code='" + city_code + '\'' +
                ", city_name='" + city_name + '\'' +
                ", county_code='" + county_code + '\'' +
                ", county_name='" + county_name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
