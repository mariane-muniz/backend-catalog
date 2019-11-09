package com.store.catalog.repositories;

import com.store.catalog.models.Review;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "reviews", path = "review")
public interface ReviewRepository extends CrudRepository<Review, Long> {

}