package com.store.dziwnyprojekt.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "user_role")
public class UserRole extends BaseEntity {

    @Column(name = "role")
    private String role;

    @OneToOne(mappedBy = "userRole")
    private User user;



}
