package com.store.catalog.repositories;

import com.store.catalog.models.Service;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource(collectionResourceRel = "services", path = "service")
public interface ServiceRepository extends PagingAndSortingRepository<Service, Long> {

    @RestResource(path = "code")
    Service getByCode(@Param(value = "code") final String code);
}