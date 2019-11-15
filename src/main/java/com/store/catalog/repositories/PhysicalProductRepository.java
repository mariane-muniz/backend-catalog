package com.store.catalog.repositories;

import com.store.catalog.models.PhysicalProduct;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource( path = "physical_product", collectionResourceRel = "physical_products" )
public interface PhysicalProductRepository extends PagingAndSortingRepository<PhysicalProduct, Long> {
}