package com.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.model.Product;

@Repository
public class ProductDaoImpl implements ProductDao {
   @Autowired
   private JdbcTemplate jdbcTemplate;

public List<Product> findAllproducts() {
	return jdbcTemplate.query("select * from pro", (rs,num)->{
		Product p=new Product();
		p.setPid(rs.getInt(1));
		p.setPname(rs.getString(2));
		p.setPrice(rs.getInt(4));
		p.setQty(rs.getInt(3));
		return p;
	});
}

@Override
public void save(Product p) {
	String str="insert into pro values(?,?,?,?)";
	jdbcTemplate.update(str,new Object[] {p.getPid(),
			p.getPname(),p.getQty(),p.getPrice()});
	
}

@Override
public Product findById(int pid) {
	try {
		Product p = jdbcTemplate.queryForObject("select * from pro where pid=?",new Object[] {pid},BeanPropertyRowMapper.newInstance(Product.class));
	    System.out.println(p);
		return jdbcTemplate.queryForObject("select * from pro where pid=?",new Object[] {pid},BeanPropertyRowMapper.newInstance(Product.class));
	}catch(EmptyResultDataAccessException e) {
		return null;
	}
	
}

@Override
public void modifyProduct(Product product) {
	jdbcTemplate.update("update pro set pname=?,qty=?,price=? where pid=?",
			new Object[] {product.getPname(),product.getQty(),product.getPrice(),product.getPid()});
	
}

@Override
public void removeById(int id) {
	jdbcTemplate.update("delete from pro where pid=?",new Object[] {id});
	
}    
}