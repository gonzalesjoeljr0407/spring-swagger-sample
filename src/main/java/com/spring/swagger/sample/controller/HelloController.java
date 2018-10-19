package com.spring.swagger.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.swagger.sample.model.Product;
import com.spring.swagger.sample.service.ProductServiceImpl;

@RestController
@RequestMapping("/secured")
public class HelloController {
    
    @Autowired
    ProductServiceImpl productServiceImpl;
    
    @GetMapping("/hello")
    public ResponseEntity<String> returnHello() {
        return new ResponseEntity<>("Hello", HttpStatus.OK);
    }
    
    @GetMapping("/product/getAll")
    public ResponseEntity<List<Product>> getProducts() {
        return new ResponseEntity<>(productServiceImpl.getAllProducts(), HttpStatus.OK);
    }
    
    @GetMapping("/product/{name}")
    public ResponseEntity<List<Product>> getByProductName(@PathVariable("name") String productName) {
        return new ResponseEntity<>(productServiceImpl.getByProductName(productName), HttpStatus.OK);
    }
}
