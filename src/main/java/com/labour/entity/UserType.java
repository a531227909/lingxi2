package com.labour.entity;

import java.io.Serializable;

public class UserType implements Serializable {

    /**
     * 用户自增ID
     */
    private String user_type_id;
    /**
     * 用户名
     */
    private String user_type_name;
    /**
     * 状态 1:管理员 2:用户
     */
    private String status;

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "UserType{" +
                "user_type_id='" + user_type_id + '\'' +
                ", user_type_name='" + user_type_name + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
