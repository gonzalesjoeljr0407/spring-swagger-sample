package com.spring.swagger.sample.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.swagger.sample.model.Product;
import com.spring.swagger.sample.repository.ProductRepository;

@Service
public class ProductServiceImpl {
    
    @Autowired
    ProductRepository productRepository;
    
    public List<Product> getAllProducts() {
        List<Product> products = new ArrayList<>();
        
        this.productRepository.findAll().forEach(products::add);
        
        return products;
    }
}
