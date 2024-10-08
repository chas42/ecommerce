package com.store.store.model;

import java.util.Set;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Order {

    private Long id;
    private User user;
    private String status; // pending, processing, completed, delivered

    private Product product;

    private Set<OrderItem> orderItems;

}
