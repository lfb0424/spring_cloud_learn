package com.example.rabbitmqhello.demo;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Author: admin
 * @Date: 2019/4/19 13:53
 * @description: @RabbitListener（queues="hello"）注解定义该类对hello队列的监听；@RabbitHandler指定对消息的处理方法，
 * 该消费操作为输出消息的字符串内容
 */
@Component
@RabbitListener(queues = "hello")
public class Receiver {

    /**
     * 对接收到的消息进行处理
     * @param hello
     */
    @RabbitHandler
    public void process(String hello) {
        System.out.println("receiver: " + hello);
    }
}
