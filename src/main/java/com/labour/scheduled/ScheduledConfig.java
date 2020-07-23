//package com.labour.scheduled;
//
//import com.labour.service.TestService;
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Component;
//
//import javax.annotation.Resource;
//
//@Component
//public class ScheduledConfig {
//
//    @Resource
//    private TestService testService;
//
//    @Scheduled(cron = "0/2 * * * * ?") // 每2秒执行一次
//    public void schedulerKenoResultJob(){
//        testService.testLabour();
//    }
//
//}
