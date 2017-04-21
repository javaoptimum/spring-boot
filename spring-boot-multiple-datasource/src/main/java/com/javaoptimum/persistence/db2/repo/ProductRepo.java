package com.javaoptimum.persistence.db2.repo;


import com.javaoptimum.persistence.db2.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Integer> {}