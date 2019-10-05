package com.store.catalog.models;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "digital_products")
public class DigitalProduct extends Product {

    private static final long serialVersionUID = 1L;
}