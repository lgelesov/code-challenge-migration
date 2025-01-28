package com.example.dummyjson.service;

import com.example.dummyjson.client.ProductClient;
import com.example.dummyjson.dto.Product;
import com.example.dummyjson.dto.ProductResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductClient productClient;

    @Autowired
    public ProductService(ProductClient productClient) {
        this.productClient = productClient;
    }

    public List<Product> getAllProducts() {
        ProductResponse response = productClient.getAllProducts();
        return response.getProducts();
    }

    public Product getProductById(Long id) {
        return productClient.getProductById(id);
    }
}