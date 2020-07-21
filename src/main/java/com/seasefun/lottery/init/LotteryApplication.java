package com.seasefun.lottery.init;

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
@ComponentScan(basePackages = { "com.seasefun.lottery.dao","com.seasefun.lottery.controller","com.seasefun.lottery.entity",
        "com.seasefun.lottery.service","com.seasefun.lottery.plugins","com.seasefun.lottery.scheduled"})
@MapperScan(basePackages = { "com.seasefun.lottery.dao" })
@EnableScheduling
@SpringBootApplication
public class LotteryApplication {

    public static void main(String[] args) {
        SpringApplication.run(LotteryApplication.class,args);
    }

}
