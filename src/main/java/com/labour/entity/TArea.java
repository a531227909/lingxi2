package com.labour.entity;

import java.io.Serializable;

public class TArea implements Serializable {
    /**
     * 地区ID
     */
    private String areaId;
    /**
     * 地区编码
     */
    private String areaCode;
    /**
     * 地区名称
     */
    private String areaName;
    /**
     * 级别
     */
    private String level;
    /**
     * 城市编码
     */
    private String cityCode;
    /**
     * 经纬度
     */
    private String center;
    /**
     * 上级地区ID
     */
    private String parentId;

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getCenter() {
        return center;
    }

    public void setCenter(String center) {
        this.center = center;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    @Override
    public String toString() {
        return "TArea{" +
                "areaId='" + areaId + '\'' +
                ", areaCode='" + areaCode + '\'' +
                ", areaName='" + areaName + '\'' +
                ", level='" + level + '\'' +
                ", cityCode='" + cityCode + '\'' +
                ", center='" + center + '\'' +
                ", parentId='" + parentId + '\'' +
                '}';
    }
}
