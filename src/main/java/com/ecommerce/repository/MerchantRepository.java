package com.ecommerce.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.Merchant;

@Repository
public interface MerchantRepository extends CrudRepository<Merchant, Long> {

}
