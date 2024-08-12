package com.qsp.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.qsp.model.Employee;

public class EmployeeController {
	
	static Connection con = null;
	static String url="jdbc:postgresql://localhost:5432/qsp";
	static String pass = "root";
	static String user = "postgres";
	
	
	static {
		try {
		//STEP -> 1
		Class.forName("org.postgresql.Driver");
		//STEP -> 2
		con = DriverManager.getConnection(url,user,pass);
		System.out.println(con);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	//INSERT METHOD
	public static void insert(Employee e)
	{
		try {
			// STEP -> 3
			PreparedStatement ps = con.prepareStatement("insert into employee values(?,?,?)");
			//Setting value to delemeter
			ps.setInt(1, e.getId());
			ps.setString(2, e.getName());
			ps.setDouble(3, e.getSal());
			
			//STEP -> 4
			ps.executeUpdate();			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	//UPDATE METHOD USING ID
	public static boolean updateNameByID(int id, String name)
	{
		
			Employee emp=fetchById(id);
			if(emp.getName() != null)
			{
				//STEP -> 3
				PreparedStatement ps;
				try {
					ps = con.prepareStatement("update employee set name=? where id=?");
					ps.setString(1, name);
					ps.setInt(2, id);
					//STEP -> 4
					ps.executeUpdate();
					} 
				catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				return true;
			}
			else
			{
				return false;
			}
		}
	
	
	//UPDATE METHOD USING SALARY
	public static boolean updateNameBySal(int id, String sal)
	{
		
			Employee emp=fetchById(id);
			if(emp.getName() != null)
			{
				//STEP -> 3
				PreparedStatement ps;
				try {
					ps = con.prepareStatement("update employee set name=? where id=?");
					ps.setString(1, sal);
					ps.setInt(2, id);
					//STEP -> 4
					ps.executeUpdate();
					} 
				catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				return true;
			}
			else
			{
				return false;
			}
		}
		
		
	//DELETE METHOD USING ID
	public static boolean deleteByID(int id)
	{
		Employee e=fetchById(id);
		if(e.getName() != null)
		{
			try {
				//3rd step
				PreparedStatement ps=con.prepareStatement("delete from employee where id=?");
				ps.setInt(1, id);
				//STEP -> 4
				ps.executeUpdate();
			}
			catch(Exception e4)
			{
				e4.printStackTrace();
			}
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static Employee fetchById(int id)
	{
		Employee e=new Employee();
		try {
			//STEP -> 3
			PreparedStatement ps=con.prepareStatement("select * from employee where id=?");
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				e.setId(rs.getInt("id"));
				e.setName(rs.getString("name"));
				e.setSal(rs.getDouble("sal"));
				
			}
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		return e;
		
	}
	
	public static void main(String args[])
	{
	}
	
}


