package com.labour.entity;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户自增ID
     */
    private String user_id;
    /**
     * 用户名
     */
    private String user_name;
    /**
     *密码
     */
    private String password;
    /**
     * 名称
     */
    private String name;
    /**
     * 昵称
     */
    private String petName;
    /**
     * 微信唯一ID
     */
    private String weChatId;
    /**
     * 头像
     */
    private String headImage;
    /**
     * 性别类型ID
     */
    private String genderId;
    /**
     * 性别名称
     */
    private String genderName;
    /**
     * 民族ID
     */
    private String nationId;
    /**
     * 民族
     */
    private String nation;
    /**
     * 学历ID
     */
    private String educationId;
    /**
     * 学历
     */
    private String education;
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
     * 身份证
     */
    private String idCard;
    /**
     * 身份证正面
     */
    private String idCardFront;
    /**
     * 身份证反面
     */
    private String idCardReverse;
    /**
     * 电话号码
     */
    private String phoneNum;
    /**
     * 用户类型(岗位)
     */
    private String user_type_id;
    /**
     * 用户类型(岗位)名称
     */
    private String user_type_name;
    /**
     * 创建用户ID
     */
    private String create_user_id;
    /**
     * 创建用户名
     */
    private String create_user_name;
    /**
     * 创建时间
     */
    private String create_time;
    /**
     * 更新时间
     */
    private String update_time;
    /**
     * 状态 0:停用 1:启用
     */
    private String status;
    /**
     * token
     */
    private String token;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getWeChatId() {
        return weChatId;
    }

    public void setWeChatId(String weChatId) {
        this.weChatId = weChatId;
    }

    public String getHeadImage() {
        return headImage;
    }

    public void setHeadImage(String headImage) {
        this.headImage = headImage;
    }

    public String getGenderId() {
        return genderId;
    }

    public void setGenderId(String genderId) {
        this.genderId = genderId;
    }

    public String getGenderName() {
        return genderName;
    }

    public void setGenderName(String genderName) {
        this.genderName = genderName;
    }

    public String getNationId() {
        return nationId;
    }

    public void setNationId(String nationId) {
        this.nationId = nationId;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getEducationId() {
        return educationId;
    }

    public void setEducationId(String educationId) {
        this.educationId = educationId;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
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

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
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

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
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

    public String getCreate_user_id() {
        return create_user_id;
    }

    public void setCreate_user_id(String create_user_id) {
        this.create_user_id = create_user_id;
    }

    public String getCreate_user_name() {
        return create_user_name;
    }

    public void setCreate_user_name(String create_user_name) {
        this.create_user_name = create_user_name;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
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

    @Override
    public String toString() {
        return "User{" +
                "user_id='" + user_id + '\'' +
                ", user_name='" + user_name + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", petName='" + petName + '\'' +
                ", weChatId='" + weChatId + '\'' +
                ", headImage='" + headImage + '\'' +
                ", genderId='" + genderId + '\'' +
                ", genderName='" + genderName + '\'' +
                ", nationId='" + nationId + '\'' +
                ", nation='" + nation + '\'' +
                ", educationId='" + educationId + '\'' +
                ", education='" + education + '\'' +
                ", province_code='" + province_code + '\'' +
                ", province_name='" + province_name + '\'' +
                ", city_code='" + city_code + '\'' +
                ", city_name='" + city_name + '\'' +
                ", county_code='" + county_code + '\'' +
                ", county_name='" + county_name + '\'' +
                ", address='" + address + '\'' +
                ", idCard='" + idCard + '\'' +
                ", idCardFront='" + idCardFront + '\'' +
                ", idCardReverse='" + idCardReverse + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", user_type_id='" + user_type_id + '\'' +
                ", user_type_name='" + user_type_name + '\'' +
                ", create_user_id='" + create_user_id + '\'' +
                ", create_user_name='" + create_user_name + '\'' +
                ", create_time='" + create_time + '\'' +
                ", update_time='" + update_time + '\'' +
                ", status='" + status + '\'' +
                ", token='" + token + '\'' +
                ", user_company_id='" + user_company_id + '\'' +
                ", company_id='" + company_id + '\'' +
                ", company_full_name='" + company_full_name + '\'' +
                '}';
    }

}
