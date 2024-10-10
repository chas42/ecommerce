package com.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.dto.MerchantCreateDTO;
import com.ecommerce.dto.MerchantReadDTO;
import com.ecommerce.model.Merchant;
import com.ecommerce.model.User;
import com.ecommerce.repository.MerchantRepository;
import com.ecommerce.repository.UserRepository;

@Service
public class MerchantService {

    @Autowired
    private MerchantRepository  merchantRepository;

    @Autowired
    private UserRepository userRepository;


    public void createMerchant(MerchantCreateDTO merchantCreateDTO) {

        User user = userRepository.findById(merchantCreateDTO.userId()).get();

        Merchant newMerchant = new Merchant(merchantCreateDTO.name(), user);

        merchantRepository.save(newMerchant);
    
    }

    public MerchantReadDTO getMerchantById(Long id) {

        Merchant merchant = merchantRepository.findById(id).get();

        return new MerchantReadDTO(merchant);
    }

    public void updateMerchant(MerchantUpdateDTO merchantUpdateDTO) {
        Merchant merchant = merchantRepository.findById(merchantUpdateDTO.id()).orElse(null);

        
            // Update other fields as necessary
    }

    public void deleteMerchant(Long id) {
        merchantRepository.deleteById(id);
    }
    
}
