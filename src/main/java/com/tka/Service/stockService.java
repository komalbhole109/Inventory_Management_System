package com.tka.Service;

import com.tka.Entity.stock;
import java.util.List;

public interface stockService {

    List<stock> getAllStocks();

    void saveStock(stock stock);

    void deleteStock(int id);
}