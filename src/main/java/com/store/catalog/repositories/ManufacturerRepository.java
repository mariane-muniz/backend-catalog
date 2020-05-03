package com.store.catalog.repositories;

import com.omni.aurora.core.model.CustomPagingAndSortingRepository;
import com.store.catalog.models.Manufacturer;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "manufacturers", path = "manufacturer")
public interface ManufacturerRepository extends CustomPagingAndSortingRepository<Manufacturer, Long> {
}