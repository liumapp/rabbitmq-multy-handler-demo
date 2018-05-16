package com.liumapp.demo.rabbit.multi.customer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author liumapp
 * @file Customerb.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 5/16/18
 */
@Component
@RabbitListener(queues = "test-queue")
public class Customerb {
}
