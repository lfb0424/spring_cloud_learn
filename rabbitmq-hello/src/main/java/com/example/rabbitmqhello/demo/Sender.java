package com.example.rabbitmqhello.demo;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Author: admin
 * @Date: 2019/4/19 13:49
 * @description: 该生产者中，我们会产生一个字符串，并发送到名为hello的队列中
 */
@Component
public class Sender {

    /**
     * 通过注入AmqpTemplate接口的实例来实现消息的发送，该接口定义了一套针对AMQP协议的基础操作。
     */
    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(){
        String context ="hello "+new Date();
        System.out.println("Sender: "+context);
        //将context发送到hello队列
        this.amqpTemplate.convertAndSend("hello",context);
    }
}
