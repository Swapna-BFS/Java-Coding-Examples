package com.hexaware.oopsexample.staticexample;

public class MainStatic {

	public static void main(String[] args) {
		Increment i = new Increment();
		Increment i1 = new Increment();
		Increment i2 = new Increment();
		Increment i3 = new Increment();
		System.out.println("i="+i.increment());
		System.out.println("i="+i1.increment());
		System.out.println("i="+i2.increment());
		System.out.println("i="+i3.increment());
	}

}
