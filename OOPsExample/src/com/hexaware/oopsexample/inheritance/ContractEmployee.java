package com.hexaware.oopsexample.inheritance;

public class ContractEmployee extends Employee {
	float contractEmpSalary;
	
	void calculateContractEmpSalary(){
		System.out.println("This method calculates salary...");
	}
}
