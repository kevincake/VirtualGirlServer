package com.freedomer.virtualgirl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @atuhor:eavawu
 * @date:15/08/2017
 * @todo:服务器入口类
 */
@SpringBootApplication
@EnableScheduling
public class GirlApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(GirlApplication.class, args);
    }
}
