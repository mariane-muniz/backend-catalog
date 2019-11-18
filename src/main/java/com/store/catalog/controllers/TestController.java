package com.store.catalog.controllers;

import java.util.Date;

import javax.annotation.Resource;

import com.store.catalog.models.Product;
import com.store.catalog.repositories.CategoryRepository;
import com.store.catalog.repositories.ProductRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Caching;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Caching
@RestController
@RequestMapping("/elements")
public class TestController {

    private final static Logger LOG = LoggerFactory.getLogger(TestController.class);

    @Resource
    private ProductRepository productRepository;
    @Resource
    private CategoryRepository categoryRepository;

    @ResponseBody
    @GetMapping("/test")
    public String test() {

        for(int i=51; i < 95850 ; i++) {

            LOG.info("product: 456" + i);    

            Product p = new Product();
            p.setStatus(true);
            p.setCode("456" + i);
            p.setDateAvailable(new Date());
            p.setDescription("Product description " + i);
            p.setName("Product name" + i);
            this.productRepository.save(p);
        }

        return "it´s okay";
    } 
}