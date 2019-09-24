package com.store.catalog.facaces.impl;

import java.util.List;

import javax.annotation.Resource;

import com.store.catalog.facaces.EntityFacade;
import com.store.catalog.parameters.EntityParameter;
import com.store.catalog.services.EntityService;

import org.springframework.stereotype.Component;

@Component("entityFacade")
public class DefaultEntityFacade implements EntityFacade {

    @Resource
    private EntityService entityService;

    @Override
    public List getEntities(final EntityParameter entityParameter) {

        final boolean isAllowed = this.entityService.isAllowed(entityParameter);
        if (isAllowed) {
            final List entities = this.entityService.getEntities(entityParameter);
        }
        return null;
    }
}