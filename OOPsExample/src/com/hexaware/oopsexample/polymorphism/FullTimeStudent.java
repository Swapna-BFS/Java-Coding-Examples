package com.hexaware.oopsexample.polymorphism;

public class FullTimeStudent extends Student{
	int noOfSubjects;
	
	@Override
	public void calculateResult(){
		System.out.println("Full Time Student Result Calculating...");
		System.out.println("enter Number of subjects");
		int n = 5;
		System.out.println("Result " + (500/n));
	}
}
