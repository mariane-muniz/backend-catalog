package com.store.catalog.repositories;

import com.store.catalog.models.ProductEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "product", path = "products")
public interface ProductRepository  extends JpaRepository<ProductEntity, Integer> {

}