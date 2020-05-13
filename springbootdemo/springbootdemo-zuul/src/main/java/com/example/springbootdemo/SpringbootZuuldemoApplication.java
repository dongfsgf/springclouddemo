package com.example.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringCloudApplication
public class SpringbootZuuldemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootZuuldemoApplication.class, args);
    }

}
