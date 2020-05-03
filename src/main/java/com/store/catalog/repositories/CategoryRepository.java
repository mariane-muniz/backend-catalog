package com.store.catalog.repositories;

import com.omni.aurora.core.model.CustomPagingAndSortingRepository;
import com.store.catalog.models.Category;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "categories", path = "category")
public interface CategoryRepository extends CustomPagingAndSortingRepository<Category, Long> {
}