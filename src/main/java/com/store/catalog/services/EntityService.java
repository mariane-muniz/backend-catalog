package com.store.catalog.services;

import java.util.List;

import com.store.catalog.parameters.EntityParameter;

public interface EntityService {

    boolean isAllowed(final EntityParameter entityParameter);
    List getEntities(final EntityParameter entityParameter);
}