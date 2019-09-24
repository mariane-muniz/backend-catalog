package com.store.catalog.services.impl;

import java.util.List;

import com.store.catalog.parameters.EntityParameter;
import com.store.catalog.services.EntityService;

import org.springframework.stereotype.Component;

@Component("entityService")
public class DefaultEntityService implements EntityService {
 
    @Override
    public boolean isAllowed(final EntityParameter entityParameter) {
        

        return true;
    }

    @Override
    public List getEntities(final EntityParameter entityParameter) {

        return null;
    }
}