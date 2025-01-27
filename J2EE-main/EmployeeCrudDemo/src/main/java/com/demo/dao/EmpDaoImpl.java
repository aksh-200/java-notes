package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.demo.model.Employee;

public class EmpDaoImpl implements EmpDao{
	
	
	static Connection conn;
	static PreparedStatement selemp,delById , selbyid , upbyid ,ins;
	
	static {
		
		conn = DBUtil.getMyConnection();
		try {
			selemp = conn.prepareStatement("select * from employeenew");
			delById=conn.prepareStatement("delete from employeenew where id = ?");
			selbyid = conn.prepareStatement("select * from employeenew where id = ?");
			upbyid = conn.prepareStatement("update employeenew set name = ? , sal=? where id= ?");
			//upById=conn.prepareStatement("update employee set ename=?,sal=? where empid=?");
			ins = conn.prepareStatement("insert into employeenew values(?,?,?)");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		List<Employee>lst = new ArrayList<>();
		
		try {
			ResultSet rs = selemp.executeQuery();
			
			while(rs.next())
			{
				Employee e = new Employee(rs.getInt(1),rs.getString(2),rs.getInt(3));
				lst.add(e);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return lst;
	}



	@Override
	public void removeById(int empid) {
		// TODO Auto-generated method stub
		try {
			delById.setInt(1, empid);
			delById.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}



	@Override
	public Employee findById(int empid) {
		try {
			selbyid.setInt(1, empid);
			ResultSet rs=selbyid.executeQuery();
			if(rs.next())
			   return new Employee(rs.getInt(1),rs.getString(2),rs.getInt(3));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}



	@Override
	public void updateById(Employee e) {
		// TODO Auto-generated method stub
		
		try {
			
			upbyid.setString(1, e.getName());
			upbyid.setInt(2, e.getSal());
			upbyid.setInt(3, e.getId());
			upbyid.executeUpdate();
			System.out.println("in update");

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		};
		
		
	}



	
	public void insert(Employee e) {
		// TODO Auto-generated method stub
		try {
			ins.setInt(1,e.getId());
			ins.setString(2,e.getName());
			ins.setInt(3,e.getSal());
			ins.executeUpdate();
             System.out.println(e);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
	}

}
