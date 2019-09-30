package com.store.catalog.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.Data;

@Data
@Entity
public class Review extends AuditModel {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(generator = "question_generator")
    @SequenceGenerator(
            name = "question_generator",
            sequenceName = "question_sequence",
            initialValue = 1000
    )
    private Long id;

    @Column(nullable = false)
    private String author;

    @Column(nullable = false)
    private AbstractProduct product;

    @Column(nullable = false)
    private boolean status;

    @Column(nullable = false)
    private Date date;

    @Column(nullable = false)
    private int rating;
}