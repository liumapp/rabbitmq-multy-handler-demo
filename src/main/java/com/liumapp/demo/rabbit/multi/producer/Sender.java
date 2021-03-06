package com.liumapp.demo.rabbit.multi.producer;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.Random;

/**
 * @author liumapp
 * @file Sender.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 5/16/18
 */
@Component
public class Sender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send () {
        String context = "hello " + new Date() + new Random();
        this.amqpTemplate.convertAndSend("test-queue" , context);
    }

}
