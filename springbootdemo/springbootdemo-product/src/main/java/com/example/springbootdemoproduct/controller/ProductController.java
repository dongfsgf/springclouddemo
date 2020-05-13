package com.example.springbootdemoproduct.controller;

import main.java.com.example.srpingbootdemo.entity.Product;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: product controller
 * @author: fashion wei
 * @create: 2020-05-04
 **/
@RestController
public class ProductController {

    @RequestMapping(value = "getProduct")
    public String getProduct(){
        Product product = new Product();
        return product.toString();
    }
}
