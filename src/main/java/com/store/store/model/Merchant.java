package com.store.store.model;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Merchant {

    private Long id;
    private String name;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    private User user;

}
