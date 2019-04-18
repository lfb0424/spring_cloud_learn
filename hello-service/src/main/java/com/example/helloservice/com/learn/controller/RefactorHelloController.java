package com.example.helloservice.com.learn.controller;

import com.example.helloserviceapi.com.learn.dto.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lifubei
 * @date 2019/4/18 11:27
 */
@RestController
public class RefactorHelloController implements com.example.helloserviceapi.com.learn.service.HelloService{
    @Override
    public String hello(@RequestParam("name") String name) {
        return "hello "+name;
    }

    @Override
    public User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age) {
        return new User(name,age);
    }

    @Override
    public String hello(@RequestBody User user) {
        return "Hello "+user.getName()+", "+user.getAge();
    }
}
