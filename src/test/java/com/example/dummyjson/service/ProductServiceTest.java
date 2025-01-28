package com.example.dummyjson.service;

import com.example.dummyjson.dto.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class ProductServiceTest {

    @Autowired
    private ProductService productService;

    @Test
    public void testGetAllProducts() {
        List<Product> products = productService.getAllProducts();

        assertNotNull(products);
        assert(!products.isEmpty());
    }

    @Test
    public void testGetProductById() {
        Product product = productService.getProductById(1L);

        assertNotNull(product);
        assertEquals(1L, product.getId());
    }
}