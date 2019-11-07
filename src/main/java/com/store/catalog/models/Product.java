package com.store.catalog.models;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Inheritance( strategy = InheritanceType.JOINED )
@Table(name = "products")
public class Product extends AbstractAudit {

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

    private boolean status;

    @ManyToMany
    @JoinTable(
        name = "prod_cat_rel",
        joinColumns = @JoinColumn(name = "product_id"),
        inverseJoinColumns = @JoinColumn(name = "category_id")
    )
    private Set<Category> categories;
}