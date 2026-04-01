package com.tka.Dao;

import com.tka.Entity.stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface stockRepository extends JpaRepository<stock, Integer> {
}