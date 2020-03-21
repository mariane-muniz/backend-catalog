package com.store.catalog.models;

import java.util.Set;

import javax.persistence.*;

import com.omni.aurora.core.model.AbstractAudit;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "categories")
public class Category extends AbstractAudit {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, unique = true)
    private String code;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false, unique = true)
    private String description;

    @Column
    private boolean active;

    @ManyToMany(mappedBy = "categories")
    private Set<Product> products;
}