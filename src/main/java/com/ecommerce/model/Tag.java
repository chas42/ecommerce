package com.ecommerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

import com.ecommerce.dto.TagDTO;

@Getter
@Setter
@NoArgsConstructor
@Entity(name = "tags")
public class Tag {

    public Tag(TagDTO tagDTO) {
        setName(tagDTO.name());
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToMany
    private Set<Product> products = new LinkedHashSet<>();

}
