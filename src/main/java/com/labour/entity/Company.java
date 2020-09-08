package com.labour.entity;

import java.io.Serializable;

public class Company implements Serializable {
    /**
     * 公司自增ID
     */
    private String company_id;
    /**
     * 公司全称
     */
    private String company_full_name;
    /**
     * 公司简称
     */
    private String company_name;
    /**
     * 公司规模
     */
    private String company_size;
    /**
     * 联系人
     */
    private String contact;
    /**
     * 联系电话
     */
    private String contact_phone;
    /**
     * 联系人职位
     */
    private String contact_position;
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
     * 公司简介
     */
    private String company_profile;
    /**
     * 营业执照(图片)
     */
    private String company_business_license;
    /**
     * 公司logo(图片)
     */
    private String company_logo;
    /**
     * 营业照片
     */
    private String company_pic;
    /**
     * 创建时间
     */
    private String create_time;
    /**
     * 更新时间
     */
    private String update_time;

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

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getCompany_size() {
        return company_size;
    }

    public void setCompany_size(String company_size) {
        this.company_size = company_size;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getContact_phone() {
        return contact_phone;
    }

    public void setContact_phone(String contact_phone) {
        this.contact_phone = contact_phone;
    }

    public String getContact_position() {
        return contact_position;
    }

    public void setContact_position(String contact_position) {
        this.contact_position = contact_position;
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

    public String getCompany_profile() {
        return company_profile;
    }

    public void setCompany_profile(String company_profile) {
        this.company_profile = company_profile;
    }

    public String getCompany_business_license() {
        return company_business_license;
    }

    public void setCompany_business_license(String company_business_license) {
        this.company_business_license = company_business_license;
    }

    public String getCompany_logo() {
        return company_logo;
    }

    public void setCompany_logo(String company_logo) {
        this.company_logo = company_logo;
    }

    public String getCompany_pic() {
        return company_pic;
    }

    public void setCompany_pic(String company_pic) {
        this.company_pic = company_pic;
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
        return "Company{" +
                "company_id='" + company_id + '\'' +
                ", company_full_name='" + company_full_name + '\'' +
                ", company_name='" + company_name + '\'' +
                ", company_size='" + company_size + '\'' +
                ", contact='" + contact + '\'' +
                ", contact_phone='" + contact_phone + '\'' +
                ", contact_position='" + contact_position + '\'' +
                ", province_code='" + province_code + '\'' +
                ", province_name='" + province_name + '\'' +
                ", city_code='" + city_code + '\'' +
                ", city_name='" + city_name + '\'' +
                ", county_code='" + county_code + '\'' +
                ", county_name='" + county_name + '\'' +
                ", address='" + address + '\'' +
                ", company_profile='" + company_profile + '\'' +
                ", company_business_license='" + company_business_license + '\'' +
                ", company_logo='" + company_logo + '\'' +
                ", company_pic='" + company_pic + '\'' +
                ", create_time='" + create_time + '\'' +
                ", update_time='" + update_time + '\'' +
                '}';
    }
}
