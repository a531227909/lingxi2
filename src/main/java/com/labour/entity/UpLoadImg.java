package com.labour.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Configuration
@ConfigurationProperties(prefix = "uploadimg", ignoreUnknownFields = false)
@PropertySource("classpath:uploadimg.properties")
@Data
@Component
public class UpLoadImg implements Serializable {

    private static final long serialVersionUID = 1L;

    private String companyImgPath;

    private String companyImgUrl;

    private String idCardImgPath;

    private String idCardImgUrl;

    public String getCompanyImgPath() {
        return companyImgPath;
    }

    public void setCompanyImgPath(String companyImgPath) {
        this.companyImgPath = companyImgPath;
    }

    public String getCompanyImgUrl() {
        return companyImgUrl;
    }

    public void setCompanyImgUrl(String companyImgUrl) {
        this.companyImgUrl = companyImgUrl;
    }

    public String getIdCardImgPath() {
        return idCardImgPath;
    }

    public void setIdCardImgPath(String idCardImgPath) {
        this.idCardImgPath = idCardImgPath;
    }

    public String getIdCardImgUrl() {
        return idCardImgUrl;
    }

    public void setIdCardImgUrl(String idCardImgUrl) {
        this.idCardImgUrl = idCardImgUrl;
    }

    @Override
    public String toString() {
        return "UpLoadImg{" +
                "companyImgPath='" + companyImgPath + '\'' +
                ", companyImgUrl='" + companyImgUrl + '\'' +
                ", idCardImgPath='" + idCardImgPath + '\'' +
                ", idCardImgUrl='" + idCardImgUrl + '\'' +
                '}';
    }

}
