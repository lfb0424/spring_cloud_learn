package com.example.helloservice.com.learn.controller;

import com.example.helloservice.com.learn.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Random;


/**
 * @ProjectName: springboot
 * @Package: com.example.springboot.com.learn.controller
 * @ClassName: HelloController
 * @Author: admin
 * @Description: ${description}
 * @Date: 2019/4/9 11:48
 * @Version: 1.0
 */
@RestController
public class HelloController {

    private final Logger logger = LoggerFactory.getLogger(HelloController.class);


    /**
     * 服务发现客户端
     */
    @Autowired
    private DiscoveryClient discoveryClient;


    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() throws Exception {

//        int sleepTime = new Random().nextInt(3000);

//        logger.info("sleepTime:"+sleepTime);
        List<String> services = discoveryClient.getServices();
//        Thread.sleep(sleepTime);

        logger.info("---------------------------------------------------->>/hello,host:" + services);

        return "++++++++++++++++++++Hello  World!!++++++++++++++++++++++++";
    }

    @RequestMapping(value = "/hello1",method = RequestMethod.GET)
    public String hello1(@RequestParam String name){
        return "hello "+name;
    }

    @RequestMapping(value = "/hello2",method = RequestMethod.GET)
    public User hello(@RequestHeader String name, @RequestHeader Integer age){
        return new User(name,age);
    }

    @RequestMapping(value = "/hello3",method = RequestMethod.POST)
    public String hello(@RequestBody User user){
        return "Hello "+ user.getName()+", "+user.getAge();
    }
}
