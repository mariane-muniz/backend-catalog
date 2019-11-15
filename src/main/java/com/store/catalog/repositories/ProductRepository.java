package com.store.catalog.repositories;

import java.util.List;

import com.store.catalog.models.Product;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "products", path = "product")
public interface ProductRepository  extends PagingAndSortingRepository<Product, Long> {
    
    List<Product> findAllByStatus(final boolean status, final Pageable pageable);
}