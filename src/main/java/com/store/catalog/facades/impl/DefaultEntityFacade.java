package com.store.catalog.facades.impl;

import javax.annotation.Resource;

import com.store.catalog.facades.EntityFacade;
import com.store.catalog.services.EntityCatalogService;

import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component("entityFacade")
public class DefaultEntityFacade<T> implements EntityFacade {

    @Resource
    private EntityCatalogService entityCatalogService;

    @Override
    public Object getEntities(final String entityName, final String attributes) {

        Assert.notNull(entityName, "entityName");
        return this.entityCatalogService.getEntityRepository(entityName);
    }

}