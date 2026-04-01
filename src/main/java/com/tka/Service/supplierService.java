package com.tka.Service;

import com.tka.Entity.supplier;

import java.util.List;

public interface supplierService {

    List<supplier> getAllSuppliers();

    void saveSupplier(supplier supplier);

    void deleteSupplier(int id);
}