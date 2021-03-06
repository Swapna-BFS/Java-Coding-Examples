package com.hexaware.oopsexample.abstractclassexample;

public abstract class Employee{
	
	private int empId;
	private String empName;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

	public void readempdetails() {
		System.out.println("Reading emp details");
	}
	public void displayempdetails() {
		System.out.println("Display emp details");
	}
	public abstract void calculateSalary();
}
