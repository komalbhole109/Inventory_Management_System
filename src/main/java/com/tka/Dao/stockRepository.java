package com.tka.Dao;

import com.tka.Entity.stock;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface stockRepository extends JpaRepository<stock, Integer>
{

	static List<stock> getAllStocks() {
		return null;
	}
	
}