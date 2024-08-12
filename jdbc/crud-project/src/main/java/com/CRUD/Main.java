package com.CRUD;

import java.sql.Connection;

public class Main {
	public static void main(String[] args) {
		DbFunctions db=new DbFunctions();//instance of the DbFunctions class
		
		// Call the connect_to_db method to establish a connection to the database
        // Parameters: Database Name ("crudDb"), Username ("postgres"), and Password ("root")
		Connection conn=db.connect_to_db("crudDb","postgres","root");
		
		// Call the createTable method to create a table named "employee" in the connected database
	//	db.createTable(conn, "employee");
		
		//Call the insert_row method to insert data into table. Parameters: ("tableName","empName","address","salary)
	//	db.insert_row(conn, "employee", "chintu", "india","750000");
	
		
		//Call the update_name method to update the Name by where ID: Parameters: ("table_name","new_name","id")
		db.update_name(conn, "employee","Mangesh",3);
		
		//Call the search_by_name method to search and fetch details of employee
	//	db.search_by_name(conn, "employee", "Chintu");
		
		
	//	db.search_by_id(conn, "employee", 3);
		
		//Call the read_data method to read/fetch data from table. Paremeters: ("tableName")
		db.read_data(conn, "employee");
	}
}
