package com.ecommerce.dto.order;

/**
 * OrderCreateDTO
 */
public record OrderCreateDTO(Long merchantId, Long productId, Integer quantity) {

}
