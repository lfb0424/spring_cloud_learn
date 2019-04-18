package com.example.feignconsumer.com.learn.util;

import com.example.feignconsumer.com.learn.entity.User;
import com.example.feignconsumer.com.learn.service.HelloService;

/**
 * @Author: admin
 * @Date: 2019/4/18 14:53
 */
public class HelloServiceFallback implements HelloService {
    @Override
    public String hello() {
        return "error";
    }

    @Override
    public String hello(String name) {
        return "error";
    }

    @Override
    public User hello(String name, Integer age) {
        return new User("未知",0);
    }

    @Override
    public String hello(User user) {
        return "error";
    }
}
