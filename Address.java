package com.store.dziwnyprojekt.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "address")
public class Address extends BaseEntity{

    @Column(name = "country")
    private String country;

    @Column(name = "voivodeship")
    private String voivodeship;

    @Column(name = "city")
    private String city;

    @Column(name = "street")
    private String street;

    @Column(name = "postal_code")
    private String postalCode;

    @Column(name = "street_number")
    private String streetNumber;

    @OneToMany(mappedBy="address", cascade=CascadeType.ALL)
    private List<Account> accounts = new ArrayList<>();


}
