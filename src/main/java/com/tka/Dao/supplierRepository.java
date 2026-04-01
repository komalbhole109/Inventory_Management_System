package com.tka.Dao;

import com.tka.Entity.supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface supplierRepository extends JpaRepository<supplier, Integer> {
}