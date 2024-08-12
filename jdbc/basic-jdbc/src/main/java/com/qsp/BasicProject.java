package com.qsp;

import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;

public class BasicProject {

	public static void main(String[] args) {
		try {
		//STEP -> 1
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver is loaded");
			
		//STEP -> 2
			//1st way for connection
			//	Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/qsp","postgres","root");
				
			//2nd way for connection
			Connection con=DriverManager.getConnection
					("jdbc:postgresql://localhost:5432/qsp?user=postgres&password=root");
			System.out.println("Connection is done");
			
		//STEP -> 3
			Statement stm=con.createStatement();
			System.out.println("Statement is created");
			
		//STEP -> 4		-> INSERT DATA INTO STUDENT TABLE
			stm.execute("insert into student values(105,'laliu',99230000000)");
			System.out.println("data inserted --!");
	
			
		//STEP -> 4		-> UPDATE DATA INTO STUDENT TABLE
		stm.execute("update student set name='lalu prasad' where id=103");
		System.out.println("data updated --!");		
			
		//STEP -> 5
			con.close();
			System.out.println("Connection closed");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
