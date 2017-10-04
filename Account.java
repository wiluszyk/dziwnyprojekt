package com.store.dziwnyprojekt.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "account")
public class Account extends NameEntity{

    @Column(name = "surname")
    private String surname;

    @Column(name = "email")
    private String email;

    @Column(name = "telephone")
    private String telephone;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreated;

    @OneToMany(mappedBy = "account", cascade = CascadeType.ALL)
    private List<Order> orders = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;

    @OneToOne
    private User user;


}