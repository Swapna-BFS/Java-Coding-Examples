package com.hexaware.oopsexample.polymorphism;

public class PartTimeStudent extends Student{
	public void calculateResult(int n){
		System.out.println("partTime Student Result Calculating...");
		System.out.println("Result " + (500/n));
	}
	public void calculateResult(int n,float passpercentage){
		System.out.println("partTime Student Result Calculating...");
		System.out.println("Result " + (500/n));
	}
}
