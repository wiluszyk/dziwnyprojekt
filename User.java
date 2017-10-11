package com.store.dziwnyprojekt.model;

import lombok.Data;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.util.*;

@Data
@Entity
@Table(name = "user")
public class User extends NameEntity{

    @Column(name = "surname")
    private String surname;

    @Column(name = "email")
    @Email
    @NotEmpty
    private String email;

    @Column(name = "password")
    @NotEmpty
    private String password;

    @Column(name = "telephone")
    private String telephone;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreated;

    @OneToMany(mappedBy = "user", cascade = CascadeType.REMOVE, orphanRemoval = true)
    private Set<Order> orders = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;

    @ManyToMany(cascade = CascadeType.MERGE)
    private Set<Role> roles = new HashSet<>();

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void addRole(Role role) {
        roles.add(role);
        role.getUsers().add(this);
    }

}