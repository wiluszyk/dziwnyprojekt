package com.store.dziwnyprojekt.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "user_role")
public class UserRole extends BaseEntity {

    @Column(name = "role")
    private String role;

    @OneToMany(mappedBy = "userRole", cascade=CascadeType.ALL)
    private List<User> user;



}
