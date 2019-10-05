package com.store.catalog.repositories;

import com.store.catalog.models.DigitalProduct;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "digital_product", path = "digital_products")
public interface DigitalProductRepository extends CrudRepository<DigitalProduct, Long> {
    
}