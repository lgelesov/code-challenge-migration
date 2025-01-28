package com.example.dummyjson.controller;

import com.example.dummyjson.dto.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.openfeign.EnableFeignClients;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@EnableFeignClients(basePackages = "com.example.dummyjson.client")
public class ProductControllerTest {

    @Autowired
    private ProductController productController;

    @Test
    public void testGetAllProducts() {
        // Act
        List<Product> products = productController.getAllProducts();

        // Assert
        assertNotNull(products);
        assertFalse(products.isEmpty());
        products.forEach(product -> {
            assertNotNull(product.getId());
            assertNotNull(product.getTitle());
            assertNotNull(product.getDescription());
            assertNotNull(product.getPrice());
        });
    }

    @Test
    public void testGetProductById() {
        // Arrange
        Long productId = 1L;

        // Act
        Product product = productController.getProductById(productId);

        // Assert
        assertNotNull(product);
        assertEquals(productId, product.getId());
        assertNotNull(product.getTitle());
        assertNotNull(product.getDescription());
        assertNotNull(product.getPrice());
        assertTrue(product.getPrice() > 0);
    }
}