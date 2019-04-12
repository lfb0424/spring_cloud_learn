package com.example.feignconsumer.com.learn.service;

import com.example.feignconsumer.com.learn.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: admin
 * @Date: 2019/4/12 13:53
 */
@FeignClient("HELLO-SERVICE")
public interface HelloService {

    /**
     *
     * 功能描述:
     *
     * @param:
     * @return:
     * @auther: lifubei
     * @date: 2019/4/12 13:54
     */
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    String hello();

    @RequestMapping(value = "/hello1",method = RequestMethod.GET)
    String hello(@RequestParam(value = "name") String name);

    @RequestMapping(value = "/hello2",method = RequestMethod.GET)
    User hello(@RequestHeader(value = "name") String name,@RequestHeader(value = "age") Integer age);

    @RequestMapping(value = "/hello3",method = RequestMethod.POST)
    String hello(@RequestBody User user);
}
