package com.store.catalog.facaces;

import java.util.List;

import com.store.catalog.parameters.EntityParameter;

public interface EntityFacade {
    List getEntities(final EntityParameter entityParameter);
}