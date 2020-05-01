package com.store.catalog.models;

import javax.persistence.*;

import com.omni.aurora.core.model.AbstractAudit;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table( name = "manufacturers" )
public class Manufacturer extends AbstractAudit {

    private static final long serialVersionUID = 1L;

    @Column(nullable = false, unique = true)
    private String name;
}