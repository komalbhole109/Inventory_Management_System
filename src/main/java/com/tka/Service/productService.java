package com.tka.Service;

import com.tka.Entity.Product;
import java.util.List;

public interface productService {

    List<Product> getAllProducts();

    Product getProductById(int id);

    void saveProduct(Product product);

    void deleteProduct(int id);
}