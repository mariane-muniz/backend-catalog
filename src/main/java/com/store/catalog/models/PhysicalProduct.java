package com.store.catalog.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table( name = "physical_products" )
public class PhysicalProduct extends Product {

    private static final long serialVersionUID = 1L;

    @Column(nullable = false)
    private double weight;

    @Column(nullable = false)
    private double width;

    @Column(nullable = false)
    private double height;

    @Column(nullable = false)
    private double length;
}