package com.store.catalog.repositories;

import com.store.catalog.models.DigitalProduct;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "digital_products", path = "digital_product")
public interface DigitalProductRepository extends PagingAndSortingRepository<DigitalProduct, Long> {
}