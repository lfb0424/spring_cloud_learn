package com.example.feignconsumer.com.learn.service;

import com.example.helloserviceapi.com.learn.service.HelloService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @Author: admin
 * @Date: 2019/4/18 13:48
 */
@FeignClient(value = "HELLO-SERVICE")
public interface RefactorHelloService extends HelloService {
}
