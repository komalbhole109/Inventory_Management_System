package com.tka.Dao;

import com.tka.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface productRepository extends JpaRepository<Product, Integer> {

    // Custom method (optional)
    Product findByName(String name);
}