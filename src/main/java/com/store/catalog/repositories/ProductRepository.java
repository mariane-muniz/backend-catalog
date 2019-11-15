package com.store.catalog.repositories;

import com.store.catalog.models.Product;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "products", path = "product")
public interface ProductRepository  extends PagingAndSortingRepository<Product, Long> {
}