package com.example.feignconsumer.com.learn.controller;

import com.example.feignconsumer.com.learn.entity.User;
import com.example.feignconsumer.com.learn.service.HelloService;
import com.example.feignconsumer.com.learn.service.RefactorHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: admin
 * @Date: 2019/4/12 13:56
 */
@RestController
public class ConsumerController {

    @Autowired
    HelloService helloService;
    @Autowired
    RefactorHelloService refactorHelloService;

    @RequestMapping(value = "/feign-consumer3",method = RequestMethod.GET)
    public String helloConsumer3(){
        StringBuilder sb=new StringBuilder();
        sb.append(refactorHelloService.hello("MIMI")).append('\n');
        sb.append(refactorHelloService.hello("MIMI",20)).append("\n");
        sb.append(refactorHelloService.hello(new com.example.helloserviceapi.com.learn.dto.User("DIDI",20))).append("\n");
        return sb.toString();
    }

    @RequestMapping(value = "/feign-consumer",method = RequestMethod.GET)
    public String helloConsumer(){
        System.out.println("888888888");
        return helloService.hello();
    }

    @RequestMapping(value = "/feign-consumer2",method = RequestMethod.GET)
    public String helloConsumer2(){
        StringBuilder sb = new StringBuilder();
        sb.append(helloService.hello()).append("\n");
        sb.append(helloService.hello("DIDI")).append("\n");
        sb.append(helloService.hello("DIDI",12)).append("\n");
        sb.append(helloService.hello(new User("DIDI",12))).append("\n");
        return sb.toString();
    }
}
