package com.labour.init;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan(basePackages = { "com.labour.dao","com.labour.controller","com.labour.entity","com.labour.model",
        "com.labour.service","com.labour.plugins","com.labour.scheduled"})
@MapperScan(basePackages = { "com.labour.dao" })
@ServletComponentScan(basePackages = { "com.labour.filter" })
@EnableScheduling
@SpringBootApplication
public class LabourApplication {

    public static void main(String[] args) {
        SpringApplication.run(LabourApplication.class,args);
    }

}
