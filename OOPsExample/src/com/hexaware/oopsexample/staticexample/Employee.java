package com.hexaware.oopsexample.staticexample;

public class Employee {
	static{
		System.out.println("static block of employee class");
	}
	
	private int empId;
	private String empName;
	private float empSalary;
	private static String companyName ="Hexaware";
	
	public Employee() {
		System.out.println("emp constructor calledd...");
	}
	
	public Employee(int empId, String empName, float empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
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
	public float getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}
	public static String getCompanyName() {
		return companyName;
	}
	public static void setCompanyName(String companyName) {
		Employee.companyName = companyName;
	}

	public static void calculateSalary(){
		System.out.println("emp salary is calculated....");
	}
	
}
