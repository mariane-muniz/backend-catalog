package com.store.catalog.repositories;

import com.store.catalog.models.Service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "service", path = "services")
public interface ServiceRepository extends CrudRepository<Service, Long> {

}