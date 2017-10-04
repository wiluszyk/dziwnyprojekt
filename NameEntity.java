package com.store.dziwnyprojekt.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@Data
@MappedSuperclass
public class NameEntity extends BaseEntity {

    @Column(name = "name")
    private String name;
}
