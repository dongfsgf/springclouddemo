package com.example.springbootdemo.service;

import org.springframework.stereotype.Service;

/**
 * @description: 实现
 * @author: fashion wei
 * @create: 2020-05-08
 **/
@Service
public class DefaultFallback implements ProductService {

    @Override
    public String getproduct() {
        return "feign中断路器开启。。。";
    }

}
