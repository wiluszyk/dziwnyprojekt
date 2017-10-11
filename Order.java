package com.store.dziwnyprojekt.model;

import lombok.Data;

import javax.persistence.*;
import java.util.*;

@Data
@Entity
@Table(name = "orders")
public class Order extends NameEntity{

        @Temporal(TemporalType.TIMESTAMP)
        @Column(name = "created")
        private Date created;

        @OneToMany(mappedBy="order", cascade=CascadeType.ALL)
        private Set<OrderDetail> orderDetails = new HashSet<>();

        @ManyToOne
        @JoinColumn(name="account_id")
        private User user;


}
