package com.example.hystrixdashborard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @param:
 * @return:
 * @auther: lifubei
 * @date: 2019/4/12 10:41
 */
@EnableHystrixDashboard
@SpringBootApplication
public class HystrixDashborardApplication {

    public static void main(String[] args) {
        SpringApplication.run(HystrixDashborardApplication.class, args);
    }

}
