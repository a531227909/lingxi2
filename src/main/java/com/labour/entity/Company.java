package com.labour.entity;

import java.io.Serializable;

public class Company implements Serializable {
    /**
     * 公司自增ID
     */
    private String company_id;
    /**
     * 公司名
     */
    private String company_name;

    public String getCompany_id() {
        return company_id;
    }

    public void setCompany_id(String company_id) {
        this.company_id = company_id;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    @Override
    public String toString() {
        return "Company{" +
                "company_id='" + company_id + '\'' +
                ", company_name='" + company_name + '\'' +
                '}';
    }
}
