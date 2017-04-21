package com.javaoptimum.persistence.db1.repo;

import com.javaoptimum.persistence.db1.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {}