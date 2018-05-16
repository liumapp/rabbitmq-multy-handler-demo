package com.liumapp.demo.rabbit.multi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author liumapp
 * @file Main.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 5/16/18
 */
@SpringBootApplication(scanBasePackages = {"com.liumapp"})
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class , args);
    }

}
