package com.store.catalog.repositories;

import com.omni.aurora.core.model.CustomPagingAndSortingRepository;
import com.store.catalog.models.Product;

import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource(collectionResourceRel = "products", path = "product")
public interface ProductRepository  extends CustomPagingAndSortingRepository<Product, Long> {

    @RestResource(path = "code")
    Product getByCode(@Param(value = "value") final String code);
}