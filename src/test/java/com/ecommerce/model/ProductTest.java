package com.ecommerce.model;

import org.junit.jupiter.api.Test;

 class ProductTest {

    @Test
    void testProduct() {
        Product product = new Product();
        product.setId(1);
        product.setName("Product 1");
        product.setPrice(100.0);
        product.setQuantity(10);

        assert product.getId() == 1;
        assert product.getName().equals("Product 1");
        assert product.getPrice() == 100.0;
        assert product.getQuantity() == 10;
    }

    


}
