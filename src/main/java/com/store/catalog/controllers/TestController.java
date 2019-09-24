package com.store.catalog.controllers;

import java.util.List;

import javax.annotation.Resource;

import com.store.catalog.facaces.EntityFacade;
import com.store.catalog.parameters.EntityParameter;

import org.springframework.cache.annotation.Caching;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Caching
@RestController
@RequestMapping("/elements")
public class TestController {

    @Resource
    private EntityFacade entityFacade;

    @ResponseBody
    @GetMapping("/{entity}")
    public ResponseEntity getElements(@PathVariable String entity) {

        final EntityParameter entityParameter = new EntityParameter();
        entityParameter.setEntityNameString(entity);

        final List entities = this.entityFacade.getEntities(entityParameter);
        
        return new ResponseEntity<>(HttpStatus.ACCEPTED).ok(entities);
    }
}