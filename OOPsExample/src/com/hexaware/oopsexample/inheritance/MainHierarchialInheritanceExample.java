package com.hexaware.oopsexample.inheritance;

public class MainHierarchialInheritanceExample {

	public static void main(String[] args) {
		FullTimeEmployee fte = new FullTimeEmployee();
		fte.calculateSalary();
		fte.readEmployeeDetails();
		fte.displayEmployeeDetails();
		fte.calculateFullTimeEmployeeSa();
		
		ContractEmployee ce = new ContractEmployee();
		ce.readEmployeeDetails();
		ce.displayEmployeeDetails();
		ce.calculateContractEmpSalary();

	}

}
