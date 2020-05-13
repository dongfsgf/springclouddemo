package com.example.springbootdemo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description: service
 * @author: fashion wei
 * @create: 2020-05-04
 **/
@Component
@FeignClient(name = "product-server", path = "/product",fallback = DefaultFallback.class)
public interface ProductService {

    @RequestMapping(value = "getProduct")
    String getproduct();

}
