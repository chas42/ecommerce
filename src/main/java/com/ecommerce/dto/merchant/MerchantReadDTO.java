package com.ecommerce.dto.merchant;

import com.ecommerce.dto.user.UserReadDTO;
import com.ecommerce.model.Merchant;

public record MerchantReadDTO(Long id, String name, UserReadDTO userReadDTO) {

    public MerchantReadDTO(Merchant merchant) {
        this(merchant.getId(), merchant.getName(), new UserReadDTO(merchant.getUser()));

    }

}
