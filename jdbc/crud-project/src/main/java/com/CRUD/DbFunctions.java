package com.CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbFunctions {

	// -----------Establish Connection with DataBase----------
	public Connection connect_to_db(String dbname, String user, String pass) {
		Connection conn = null;
		try {
			Class.forName("org.postgresql.Driver");
			conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + dbname, user, pass);
			if (conn != null) {
				System.out.println("Connection Established");
			} else {
				System.out.println("Connection Failed");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return conn;
	}

	// ----------- CREATE TABLE -----------
	public void createTable(Connection conn, String table_name) {
		Statement statement;
		try {
			String query = "create table " + table_name
					+ "(empid SERIAL, name varchar(200), address varchar(200), salary varchar(50), primary key(empid));";
			statement = conn.createStatement();
			statement.executeUpdate(query);
			System.out.println("Table Created");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// ----------- INSERT DATA INTO TABLE -----------
	public void insert_row(Connection conn, String table_name, String name, String address, String salary) {
		Statement statement;
		try {
			String query = String.format("insert into %s(name,address,salary) values('%s','%s',%s);", table_name, name,
					address, salary);
			statement = conn.createStatement();
			statement.executeUpdate(query);
			System.out.println("Row Inserted");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

	// ----------- READ/FETCH DATA FROM TABLE -----------
	public void read_data(Connection conn, String table_name) {
		Statement statement;
		ResultSet rs = null;
		try {
			String query = String.format("select * from %s ORDER BY empid", table_name);
			statement = conn.createStatement();
			rs = statement.executeQuery(query);
			while (rs.next()) {
				System.out.print(rs.getString("empid") + " ");
				System.out.print(rs.getString("name") + " ");
				System.out.print(rs.getString("Address") + " ");
				System.out.print(rs.getString("salary")+" ");
				System.out.println();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// ----------- UPDATE DATA OF TABLE -----------
	public void update_name(Connection conn, String table_name, String new_name, int id) {
		Statement statement;
		try {
			String query = String.format("update %s set name='%s' where empid='%d'", table_name, new_name, id);
			statement = conn.createStatement();
			statement.execute(query);
			System.out.println("Data Updated Succesfully");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	
	public void search_by_name(Connection conn, String table_name, String name)
	{
		Statement statement;
		ResultSet rs=null;
		try {
			String query=String.format("select * from %s where name= '%s'",table_name,name);
			statement =conn.createStatement();
			rs=statement.executeQuery(query);
			while(rs.next())
			{
				System.out.print(rs.getString("empid")+" ");
				System.out.print(rs.getString("name")+" ");
				System.out.print(rs.getString("address")+" ");
				System.out.print(rs.getString("salary")+" ");
				System.out.println();
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public void search_by_id(Connection conn, String table_name, int empid)
	{
		Statement statement;
		ResultSet rs=null;
		try {
			String query=String.format("select * from %s where empid= '%s'",table_name, empid);
			statement =conn.createStatement();
			rs=statement.executeQuery(query);
			while(rs.next())
			{
				System.out.print(rs.getString("empid")+" ");
				System.out.print(rs.getString("name")+" ");
				System.out.print(rs.getString("address")+" ");
				System.out.print(rs.getString("salary")+" ");
				System.out.println();
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}
