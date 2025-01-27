package com.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.ProductDao;
import com.demo.model.Product;

@Service
public class ProductserviceImpl  implements ProductService{

	@Autowired
	ProductDao pdao;
	
	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		
		return pdao.findAll();
	}

	@Override
	public Product getById(int pid) {
		// TODO Auto-generated method stub
		
		Optional<Product> op = pdao.findById(pid);
		if(op.isPresent())
		{
			return op.get();
		}
		
		return null;
	}

	@Override
	public void addProduct(Product p) {
		// TODO Auto-generated method stub
		
		pdao.save(p);
	}

	@Override
	public void update(Product p) {
		// TODO Auto-generated method stub
		
      Optional<Product>op = pdao.findById(p.getPid());
		
		if(op.isPresent())
		{
			Product p1 = op.get();
			p1.setPname(p.getPname());
			p1.setPrice(p.getPrice());
			p1.setQty(p.getQty());
			
			pdao.save(p1);
		}
	}

	


	

}
