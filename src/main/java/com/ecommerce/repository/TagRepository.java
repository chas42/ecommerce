package com.ecommerce.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.Tag;

@Repository
public interface TagRepository extends CrudRepository<Tag, Long> {

}
