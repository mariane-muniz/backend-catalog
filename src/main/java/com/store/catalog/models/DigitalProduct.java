package com.store.catalog.models;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class DigitalProduct extends AbstractProduct {

    private static final long serialVersionUID = 1L;
}