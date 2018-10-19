package com.spring.swagger.sample.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.swagger.sample.model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long>{
}
