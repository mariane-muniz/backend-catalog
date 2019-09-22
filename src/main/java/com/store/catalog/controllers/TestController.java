package com.store.catalog.controllers;

import com.store.catalog.dtos.ProductData;

import org.springframework.cache.annotation.Caching;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Caching
@RestController
@RequestMapping("/coisado")
public class TestController {

    @ResponseBody
    @RequestMapping
    public ProductData test() {

        return new ProductData();
    }
}