package com.store.catalog.models;

import java.util.Date;

import javax.persistence.*;

import com.omni.aurora.core.model.AbstractAudit;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table ( name = "reviews" )
public class Review extends AbstractAudit {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String author;

    @Column(nullable = false)
    private Product product;

    @Column(nullable = false)
    private boolean status;

    @Column(nullable = false)
    private Date date;

    @Column(nullable = false)
    private int rating;
}