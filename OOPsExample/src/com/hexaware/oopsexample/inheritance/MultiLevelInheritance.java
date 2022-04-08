package com.hexaware.oopsexample.inheritance;

public class MultiLevelInheritance {

	public static void main(String[] args) {
		HourlyEmployee he = new HourlyEmployee();
		he.readEmployeeDetails();
		he.displayEmployeeDetails();
		he.calculateContractEmpSalary();
		he.calculateHourlyEmpSalary();

	}

}
