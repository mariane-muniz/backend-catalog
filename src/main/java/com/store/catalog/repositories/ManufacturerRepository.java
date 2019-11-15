package com.store.catalog.repositories;

import com.store.catalog.models.Manufacturer;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "manufacturers", path = "manufacturer")
public interface ManufacturerRepository extends PagingAndSortingRepository<Manufacturer, Long> {

}