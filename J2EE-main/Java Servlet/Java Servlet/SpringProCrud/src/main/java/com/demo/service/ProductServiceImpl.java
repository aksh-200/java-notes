package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.demo.dao.ProductDao;

import com.demo.model.Product;

public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductDao pdao;

	public List<Product> getAllProducts() {
		
		
		// TODO Auto-generated method stub
		return pdao.findAllProduct();
	}

}
