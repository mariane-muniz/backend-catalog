package com.store.catalog.repositories;

import com.store.catalog.models.Category;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "categories", path = "category")
public interface CategoryRepository extends CrudRepository<Category, Long> {

    public Category findOneByCode(final String code);
}