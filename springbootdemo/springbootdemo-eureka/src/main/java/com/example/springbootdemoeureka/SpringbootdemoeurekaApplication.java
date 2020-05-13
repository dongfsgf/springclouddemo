package com.example.springbootdemoeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringbootdemoeurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootdemoeurekaApplication.class, args);
    }

}
