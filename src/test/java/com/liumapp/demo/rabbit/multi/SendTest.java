package com.liumapp.demo.rabbit.multi;

import com.liumapp.demo.rabbit.multi.config.Config;
import com.liumapp.demo.rabbit.multi.producer.Sender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author liumapp
 * @file SendTest.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 5/16/18
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {Main.class})
public class SendTest {

    @Autowired
    private Sender sender;

    @Test
    public void testSend () throws InterruptedException {
        if (true) {
            while (true) {
                sender.send();
                Thread.sleep(1000);
            }
        }
    }

}
