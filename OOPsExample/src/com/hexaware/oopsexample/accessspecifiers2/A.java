package com.hexaware.oopsexample.accessspecifiers2;

public class A {
	
	public String name1() {
		return "Hello from public method";
		
	}
	
	private String name2() {
		return "Hello from private method";
		
	}
	
	protected String name3() {
		return "Hello from protected method";
		
	}
	
	String name4() {
		return "Hello from default method";
		
	}

}
