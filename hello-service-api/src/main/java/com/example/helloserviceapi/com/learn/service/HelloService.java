package com.example.helloserviceapi.com.learn.service;

import com.example.helloserviceapi.com.learn.dto.User;
import org.springframework.web.bind.annotation.*;

/**
 * @author lifb
 * @date 2019/4/18
 */
@RequestMapping("/refactor")
public interface HelloService {

    @RequestMapping(value = "/hello4",method = RequestMethod.GET)
    String hello(@RequestParam("name") String name);

    @RequestMapping(value = "/hello5",method = RequestMethod.GET)
    User hello(@RequestHeader("name") String name,@RequestHeader("age")Integer age);

    @RequestMapping(value = "/hello6",method = RequestMethod.GET)
    String hello(@RequestBody User user);
}
