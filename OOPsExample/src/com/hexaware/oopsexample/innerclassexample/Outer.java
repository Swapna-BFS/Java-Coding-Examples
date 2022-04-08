package com.hexaware.oopsexample.innerclassexample;

public class Outer {
	private static int i = 30;
	public void methodOne(){
		System.out.println("outer class method");
	}
	
	public static class Inner {
		public void methodTwo(){
			System.out.println("I value = " + i);
			System.out.println("Inner class method");
		}
	}

}
