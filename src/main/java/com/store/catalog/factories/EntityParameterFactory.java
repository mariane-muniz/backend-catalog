package com.store.catalog.factories;

import com.store.catalog.parameters.EntityParameter;

public class EntityParameterFactory {

    public EntityParameter build(final String entityName) {

        final EntityParameter parameter = new EntityParameter();
        parameter.setEntityNameString(entityName);

        return parameter;
    }
}