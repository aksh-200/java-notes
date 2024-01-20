package com.demo.service;

import java.util.List;

import com.demo.dao.EmpDao;
import com.demo.dao.EmpDaoImpl;
import com.demo.model.Employee;

public class EmpServiceImpl implements EmpService {

	
	private EmpDao edao;
	
	public EmpServiceImpl()
	{
		this.edao = new EmpDaoImpl();
	}
	
	public List<Employee> findAllEmployee() {
		// TODO Auto-generated method stub
		return edao.getAllEmployees();
	}

	@Override
	public void deleteById(int empid) {
		// TODO Auto-generated method stub
		edao.removeById(empid);
		
	}

	
	public Employee getById(int empid) {
		// TODO Auto-generated method stub
		return edao.findById(empid);
	}

	@Override
	public void modify(Employee e) {
		// TODO Auto-generated method stub
		edao.updateById(e);;
	}

	@Override
	public void add(Employee e) {
		// TODO Auto-generated method stub
		edao.insert(e);
	}

}
