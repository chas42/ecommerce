package com.ecommerce.dto.user;

import com.ecommerce.model.User;

public record UserReadDTO(Long id, String name, String email) {
    
        public UserReadDTO(User user) {
            this(user.getId(),
                user.getName(),
                user.getEmail());
        }
}
