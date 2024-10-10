package com.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.Merchant;

@Repository
public interface MerchantRepository extends JpaRepository<Merchant, Long> {

}
