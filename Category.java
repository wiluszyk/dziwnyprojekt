package com.store.dziwnyprojekt.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "category")
public class Category extends NameEntity {

    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy="category", cascade=CascadeType.ALL)
    private List<Product> products = new ArrayList<>();


}
