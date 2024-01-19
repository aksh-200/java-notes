package com.demo.service;

import java.util.List;

import com.demo.model.Product;

public interface ProductService {

	List<Product> getAllProducts();

	Product getById(int pid);

	void addProduct(Product p);

	void update(Product p);

	
	
}
