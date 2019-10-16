package com.store.catalog.services.impl;

import java.util.ArrayList;
import java.util.List;

import com.store.catalog.services.AbstractService;
import com.store.catalog.services.EntityCatalogService;
import com.store.catalog.services.EntityRepositoryIndex;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component("entityCatalogService")
public class DefaultEntityCatalogService implements EntityCatalogService {

    private final static Logger LOG = LoggerFactory.getLogger(DefaultEntityCatalogService.class);

    @Autowired
    private ApplicationContext context;

    @Override
    public List<Object> getEntityRepository(final String entityName) {

        final CrudRepository repository = (CrudRepository) this.context.getBean(EntityRepositoryIndex.product);

        LOG.info(repository.toString());
        LOG.info(EntityRepositoryIndex.product);

        final Iterable itens = repository.findAll();

        if (itens.iterator().hasNext()) {
            final List<Object> target = new ArrayList<>();
            itens.iterator().forEachRemaining(target::add);
            return target;
        }

        return null;
    }
}