package com.store.catalog.repositories;

import com.store.catalog.models.Review;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "reviews", path = "review")
public interface ReviewRepository extends PagingAndSortingRepository<Review, Long> {

}