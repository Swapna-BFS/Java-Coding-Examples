package com.hexaware.oopsexample.construtordemo;

public class Demo {
	String s = "Rama";
	public Demo() {
		System.out.println("Demo Class Default Constructor... called...");
	}
	
	public Demo(int a,int b){
		this();
		System.out.println("Demo class Param Constructor....called...");
	}
	public Demo(Demo d){
		System.out.println("Demo class copy Constructor....called...");
		System.out.println(d.toString());
	}
	
	public void name() {
		System.out.println("public method of Demo class");
	}

}
