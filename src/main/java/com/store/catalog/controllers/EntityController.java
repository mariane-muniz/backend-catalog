package com.store.catalog.controllers;

import java.util.Objects;

import javax.annotation.Resource;

import com.store.catalog.facades.EntityFacade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.micrometer.core.instrument.util.StringUtils;

@RestController
@RequestMapping("/entity")
public class EntityController {

    private final static Logger LOG = LoggerFactory.getLogger(EntityController.class);

    @Resource
    private EntityFacade entityFacade;

    @GetMapping("/find/{entityName}")
    public ResponseEntity find(
        @PathVariable("entityName") final String entityName,
        @RequestParam("attributes") final String attributes) {

        LOG.warn("entityName: " + entityName);
        LOG.warn("attributes: " + attributes);

        if (StringUtils.isNotEmpty(entityName)) {
            final Object entities = this.entityFacade.getEntities(entityName, attributes);
            if (Objects.nonNull(entities)) {
                return ResponseEntity.ok(entities);
            }
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
        return ResponseEntity.ok("that´s okay!");
    }
}