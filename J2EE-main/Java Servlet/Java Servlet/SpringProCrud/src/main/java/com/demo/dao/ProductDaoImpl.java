package com.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.demo.model.Product;

public class ProductDaoImpl implements ProductDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	
	public List<Product> findAllProduct() {
		
		
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select * from Pro", (rs,num)->{
			Product p = new Product();
			p.setPid(rs.getInt(1));
			p.setPname(rs.getString(2));
			p.setPrice(rs.getInt(3));
			p.setQty(rs.getInt(4));
			return p;
		});
	}

}
