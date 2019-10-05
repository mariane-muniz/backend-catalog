package com.store.catalog.repositories;

import com.store.catalog.models.Manufacturer;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "manufacturer", path = "manufacturers")
public interface ManufacturerRepository extends CrudRepository<Manufacturer, Long> {

}