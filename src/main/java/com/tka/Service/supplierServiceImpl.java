package com.tka.Service;

import com.tka.Dao.supplierRepository;
import com.tka.Entity.supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class supplierServiceImpl implements supplierService {

    @Autowired
    private supplierRepository supplierRepository;

    @Override
    public List<supplier> getAllSuppliers() {
        return supplierRepository.findAll();
    }

    @Override
    public void saveSupplier(supplier supplier) {
        supplierRepository.save(supplier);
    }

    @Override
    public void deleteSupplier(int id) {
        supplierRepository.deleteById(id);
    }
}