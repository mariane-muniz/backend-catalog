package com.store.catalog.repositories;

import com.store.catalog.models.AbstractProduct;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "product", path = "products")
public interface ProductRepository  extends CrudRepository<AbstractProduct, Long> {

    AbstractProduct findOneByCode(final String code);
}