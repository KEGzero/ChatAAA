package com.kunyyds666.chataaa;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class ChatAaaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChatAaaApplication.class, args);
    }

}
