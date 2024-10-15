package com.ecommerce.dto.order;

import java.time.LocalDateTime;
import java.util.List;

import com.ecommerce.dto.user.UserDTO;
import com.ecommerce.model.Order;

public record OrderDto(Long id, UserDTO user, List<OrderItemDto> orderItems, LocalDateTime createdAt) {

    // TODO fix this
    public OrderDto(Order order) {
        this(null, null, null, null);
    }

}
