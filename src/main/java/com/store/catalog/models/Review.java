package com.store.catalog.models;

import javax.persistence.*;

import com.omni.aurora.core.model.AbstractAudit;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "reviews")
public class Review extends AbstractAudit {

    private static final long serialVersionUID = 2L;

    @Column(nullable = false)
    private String author;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", nullable = true)
    private Product product;

    @Column(nullable = false)
    private boolean status;

    @Column(nullable = false)
    private int rating;
}