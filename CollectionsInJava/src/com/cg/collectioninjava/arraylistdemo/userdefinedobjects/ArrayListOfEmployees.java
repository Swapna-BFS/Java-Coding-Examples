package com.cg.collectioninjava.arraylistdemo.userdefinedobjects;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListOfEmployees {

	public static void main(String[] args) {
		ArrayList<Employee> listOfEmps = new ArrayList<>();
		
		//create objects of employee
		Employee emp = new Employee();
		
		//listOfEmps.add(emp);
		//create objects of employee
		Employee emp1 = new Employee(123,"Rama");
		Employee emp11 = new Employee(124,"Ana");
		Employee emp111 = new Employee(125,"Zain");
		listOfEmps.add(emp1);
		listOfEmps.add(emp11);
		listOfEmps.add(emp111);
		System.out.println("before sorting emp names");
		for (int j = 0; j < listOfEmps.size(); j++) {
			System.out.println(listOfEmps.get(j).getEmpName());
			
		}
		Collections.sort(listOfEmps);
		System.out.println("after sorting emp names");
		for (int j = 0; j < listOfEmps.size(); j++) {
			System.out.println(listOfEmps.get(j).getEmpName());
			
		}
		
	}

}
