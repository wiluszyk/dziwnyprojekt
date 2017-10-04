package com.store.dziwnyprojekt.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "user")
public class User extends BaseEntity {

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @OneToOne
    private UserRole userRole;

    @OneToOne(mappedBy = "user")
    private Account account;



}
