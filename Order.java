package com.store.dziwnyprojekt.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "orders")
public class Order extends NameEntity{

        @Column(name = "date")
        private Date dateOfOrder;

        @OneToMany(mappedBy="order", cascade=CascadeType.ALL)
        private List<OrderDetail> orderDetails = new ArrayList<>();

        @ManyToOne
        @JoinColumn(name="account_id")
        private Account account;


}
