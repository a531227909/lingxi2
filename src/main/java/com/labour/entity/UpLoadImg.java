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

    private String path;

    private String url;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "UpLoadImg{" +
                "path='" + path + '\'' +
                ", url='" + url + '\'' +
                '}';
    }

}
