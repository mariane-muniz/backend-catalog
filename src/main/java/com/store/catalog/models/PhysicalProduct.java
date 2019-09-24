package com.store.catalog.models;

import javax.persistence.Column;

import lombok.Data;

// Extender de produtos

@Data
public class PhysicalProduct extends AuditModel {

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