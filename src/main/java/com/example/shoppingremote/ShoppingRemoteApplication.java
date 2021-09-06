package com.example.shoppingremote;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ShoppingRemoteApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShoppingRemoteApplication.class, args);
    }

}
