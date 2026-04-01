package com.tka.Entity;

import jakarta.persistence.*;

@Entity
public class stock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int quantity;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
    @ManyToOne
    @JoinColumn(name = "supplier_id")
    private supplier supplier;   // ✅ CORRECT

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(supplier supplier) {
		this.supplier = supplier;
	}

    // getters & setters
    
}