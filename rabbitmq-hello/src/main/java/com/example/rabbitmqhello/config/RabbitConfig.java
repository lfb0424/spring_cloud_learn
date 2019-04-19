package com.example.rabbitmqhello.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @Author: admin
 * @Date: 2019/4/19 13:57
 * @description: 创建配置类，用来配置队列、交换器、路由器等高级信息
 */
@Configuration
public class RabbitConfig {

    /**
     * 创建一个名字为hello的队列
     * @return
     */
    @Bean
    public Queue helloQueue(){
        return new Queue("hello");
    }
}
