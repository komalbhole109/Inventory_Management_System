package com.tka.Service;

import com.tka.Dao.stockRepository;
import com.tka.Entity.stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class stockServiceImpl implements stockService {

    @Autowired
    private stockRepository stockRepository;

    @Override
    public void saveStock(stock stock) {
        stockRepository.save(stock);
    }

    @Override
    public void deleteStock(int id) {
        stockRepository.deleteById(id);
    }

    @Override
    public List<stock> getAllStocks() {
        return stockRepository.findAll(); // ✅ FIXED
    }
}