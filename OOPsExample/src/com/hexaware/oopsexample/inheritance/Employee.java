package com.hexaware.oopsexample.inheritance;

//import java.util.Date;

public class Employee {

	int empId;
	String empName;
	String empEmail;
	
	void readEmployeeDetails(){
		System.out.println("This method reads employee details");
	}
	
	void displayEmployeeDetails(){
		System.out.println("This method prints employee details");
	}
	void calculateSalary(){
		System.out.println("This method calculates salary of all employee");
	}
}
