package com.store.catalog.repositories;

import com.omni.aurora.core.model.CustomPagingAndSortingRepository;
import com.store.catalog.models.DigitalProduct;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "digital_products", path = "digital_product")
public interface DigitalProductRepository extends CustomPagingAndSortingRepository<DigitalProduct, Long> {
}