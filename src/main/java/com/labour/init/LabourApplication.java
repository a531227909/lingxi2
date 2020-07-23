package com.labour.init;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @des 彩果服务启动入口
 * @author Voldemort
 * @time 2019年08月13日16:18:20
 * @version 1.0
 */
@Configuration
@ComponentScan(basePackages = { "com.labour.dao","com.labour.controller","com.labour.entity",
        "com.labour.service","com.labour.plugins","com.labour.scheduled"})
@MapperScan(basePackages = { "com.labour.dao" })
@EnableScheduling
@SpringBootApplication
public class LabourApplication {

    public static void main(String[] args) {
        SpringApplication.run(LabourApplication.class,args);
    }

}
