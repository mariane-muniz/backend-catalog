package com.store.catalog.repositories;


import com.store.catalog.models.Product;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "products", path = "product")
public interface ProductRepository  extends CrudRepository<Product, Long> {

    Product findOneByCode(final String code);

}