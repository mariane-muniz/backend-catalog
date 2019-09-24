package com.store.catalog.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "products")
public class Product extends AuditModel {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(generator = "question_generator")
    @SequenceGenerator(
            name = "question_generator",
            sequenceName = "question_sequence",
            initialValue = 1000
    )
    private Long id;

    @Lob
    private String description;

    @Column(length = 255, nullable = false, unique = true)
    private String name;

    @Column(length = 255, nullable = false, unique = true)
    private String code;

    @Column(length = 255, nullable = true, unique = false)
    private String model;

    @Column(length = 255, nullable = true, unique = false)
    private String sku;

    @Column(length = 255, nullable = true, unique = false)
    private String upc;

    @Column(length = 255, nullable = true, unique = false)
    private String ean;

    private Date dateAvailable;

    private boolean active;
}