package com.example.springbootdemo.controller;

import com.example.springbootdemo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: springcloud eureka consumer
 * @author: fashion wei
 * @create: 2020-05-04
 **/
@RestController
public class ConsumerController {


    @Autowired
    private ProductService productService;

    @RequestMapping(value = "getConsumer")
    public String getConsumer() {


        String str = productService.getproduct();

        return str;
    }

}
