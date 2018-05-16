package com.liumapp.demo.rabbit.multi.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @author liumapp
 * @file Config.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 5/16/18
 */
@Configuration
@ImportResource(locations = {"classpath:/spring/applicationContext*.xml"})
public class Config {

    @Bean
    public Queue helloQueue () {
        return new Queue("test-queue");
    }

}
