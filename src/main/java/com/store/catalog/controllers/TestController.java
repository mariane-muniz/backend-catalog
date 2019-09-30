package com.store.catalog.controllers;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.annotation.Resource;

import com.store.catalog.models.Category;
import com.store.catalog.repositories.CategoryRepository;
import com.store.catalog.repositories.ProductRepository;

import org.springframework.cache.annotation.Caching;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Caching
@RestController
@RequestMapping("/elements")
public class TestController {

    @Resource
    private ProductRepository productRepository;
    @Resource
    private CategoryRepository categoryRepository;

    @ResponseBody
    @GetMapping("/test")
    public String test() {

        // this.create();

        // Category category = this.categoryRepository.findOneByCode("123");
        // Iterable<Product> products = this.productRepository.findAll();

        // Set<Category> categories = new HashSet<>();
        // categories.add(category);
        // products.add(product);

        // category.setProducts(toSet(products));

        // Product product = products.iterator().next();
        // product.setCategories(categories);
        
        // this.productRepository.save(product);

        // this.categoryRepository.save(category);
 
        return "it´s okay";
    } 

    public <T> Set<T> toSet(Iterable<T> collection) {
        HashSet<T> set = new HashSet<T>();
        for (T item: collection)
            set.add(item);
        return set;
    }

    // private void create() {

    //     Category c = new Category();
    //     c.setActive(true);
    //     c.setCode("123");
    //     c.setName("Toys");
    //     c.setDescription("Description of category toys.");


    //     Product p = new Product();
    //     p.setActive(true);
    //     p.setCode("456");
    //     p.setDateAvailable(new Date());
    //     p.setDescription("Product description");
    //     p.setName("Product name");

    //     this.categoryRepository.save(c);
    //     this.productRepository.save(p);
    // }
}