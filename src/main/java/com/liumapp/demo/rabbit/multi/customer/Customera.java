package com.liumapp.demo.rabbit.multi.customer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author liumapp
 * @file Customera.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 5/16/18
 */
@Component
@RabbitListener(queues = "test-queue")
public class Customera {

    private static Logger logger = LoggerFactory.getLogger(Customera.class);

    

}
