package com.store.dziwnyprojekt.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "order_detail")
public class OrderDetail extends BaseEntity{

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "Cost")
    private Double cost;

    @ManyToOne
    @JoinColumn(name="product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name="order_id")
    private Order order;


}
