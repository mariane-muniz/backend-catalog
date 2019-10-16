package com.store.catalog.services;

import java.util.List;

public interface EntityCatalogService {

    List<Object> getEntityRepository(final String entityName);
}