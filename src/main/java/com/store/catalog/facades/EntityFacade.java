package com.store.catalog.facades;

public interface EntityFacade {
    Object getEntities(final String entityName, final String attributes);
    public Long countEntities(final String entityName, final String attributes);
}