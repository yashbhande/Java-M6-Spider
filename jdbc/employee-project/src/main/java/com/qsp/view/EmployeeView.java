package com.qsp.view;

import com.qsp.controller.EmployeeController;
import com.qsp.model.Employee;

public class EmployeeView {
	public static void main(String[] args) {
		
		Employee e=new Employee();
		e.setId(103);
		e.setName("Chintu");
		e.setSal(925000);
		EmployeeController.insert(e);
		System.out.println("Inserted Succesfully");
		
		Employee e1=EmployeeController.fetchById(101);
		System.out.println("ID: "+e1.getId());
		System.out.println("Name: "+e1.getName());
		System.out.println("Salary: "+e1.getSal());
		
		//Update using ID
		boolean e2=EmployeeController.updateNameByID(102, "Chintu2");
		System.out.println("Updated Succesfully: "+e2);
		
		//Update using Salary
		boolean e3=EmployeeController.updateNameBySal(102, "Chintu2");
		System.out.println("Updated Succesfully: "+e3);
		
		boolean e4=EmployeeController.deleteByID(102);
		System.out.println("Deleted Succesfully: "+e4);
	}
}
