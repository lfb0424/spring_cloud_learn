package com.example.ribbonconsumer.com.learn.web;

import com.example.ribbonconsumer.com.learn.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: ribbon-consumer
 * @Package: com.example.ribbonconsumer.com.learn.web
 * @ClassName: ConsumerConterller
 * @Author: admin
 * @Description: ${description}
 * @Date: 2019/4/10 11:55
 * @Version: 1.0
 */
@RestController
public class ConsumerConterller {

    @Autowired
    HelloService helloService;

    @RequestMapping(value = "ribbon-consumer",method =  RequestMethod.GET)
    public String helloConsumer(){
        return helloService.helloService();
    }
}
