package com.labour.entity;

import java.io.Serializable;

public class User implements Serializable {
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

    @Override
    public String toString() {
        return "User{" +
                "user_id='" + user_id + '\'' +
                ", user_name='" + user_name + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", user_type='" + user_type_id + '\'' +
                ", user_type_name='" + user_type_name + '\'' +
                ", create_user_id='" + create_user_id + '\'' +
                ", create_user_name='" + create_user_name + '\'' +
                ", create_time='" + create_time + '\'' +
                ", update_time='" + update_time + '\'' +
                ", status='" + status + '\'' +
                ", token='" + token + '\'' +
                '}';
    }
}
