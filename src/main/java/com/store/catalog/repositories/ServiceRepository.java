package com.store.catalog.repositories;

import com.store.catalog.models.Service;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "services", path = "service")
public interface ServiceRepository extends PagingAndSortingRepository<Service, Long> {
}