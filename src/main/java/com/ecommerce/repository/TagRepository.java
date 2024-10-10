package com.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.Tag;

@Repository
public interface TagRepository extends JpaRepository<Tag, Long> {

}
