package com.hexaware.oopsexample.finalexample;

public class Sample {
	private final int a = 30;
	protected final void methodOne(){
		//a = 90;
		final int localvariable = 60;
		System.out.println("Method One.....");
	}
	public int getA() {
		return a;
	}
}
