package com.store.store.model;

import org.junit.jupiter.api.Test;

public class ProductTest {

    @Test
    public void testProduct() {
        Product product = new Product();
        product.setId(1);
        product.setName("Product 1");
        product.setPrice(100.0);
        product.setQuantity(10);
        product.setCategory("Category 1");

        assert product.getId() == 1;
        assert product.getName().equals("Product 1");
        assert product.getPrice() == 100.0;
        assert product.getQuantity() == 10;
        assert product.getCategory().equals("Category 1");
    }

    


}
