package com.store.catalog.models;

import java.util.Date;
import java.util.Set;

import javax.persistence.*;

import com.omni.aurora.core.model.AbstractAudit;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Inheritance( strategy = InheritanceType.JOINED )
@Table(name = "products")
public class Product extends AbstractAudit {

    private static final long serialVersionUID = 3L;

    @Lob
    private String description;

    @Column(nullable = false, unique = true)
    private String name;
    private String model;
    private String sku;
    private String upc;
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

    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "product"
    )
    private Set<Review> reviews;
}