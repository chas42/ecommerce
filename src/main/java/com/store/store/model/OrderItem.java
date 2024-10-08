package com.store.store.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class OrderItem {

    private Long id;
    private Product product;
    private Integer quantity;

}
