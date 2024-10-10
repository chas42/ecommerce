package com.ecommerce.dto;

import com.ecommerce.model.Tag;

public record TagDTO(Long id, String name) {

    public TagDTO(Tag tag) {
        this(tag.getId(), tag.getName());
    }
}