package com.demo.dao;

import java.util.List;

import com.demo.model.MyUser;

public interface Userdao {

	

	void save(MyUser u);

	
	List<MyUser> findAll();


	MyUser findById(int uid);
	
	boolean deleteById(int uid);


	boolean updateById(int uid, String unm, String street);
}
