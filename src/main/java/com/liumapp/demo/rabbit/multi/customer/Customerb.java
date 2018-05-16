package com.liumapp.demo.rabbit.multi.customer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
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

    private static Logger logger = LoggerFactory.getLogger(Customerb.class);

    @RabbitHandler
    public void process (String msg) throws InterruptedException {
        logger.info("b1 begine , the msg is : " + msg);
        Thread.sleep(5000);
        logger.info("b1 done");
    }

}
