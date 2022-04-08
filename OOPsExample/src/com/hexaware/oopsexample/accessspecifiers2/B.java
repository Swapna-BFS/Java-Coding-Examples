package com.hexaware.oopsexample.accessspecifiers2;

public class B extends A{
	
	void callAClassMethods(){
		System.out.println(name1());
		System.out.println(name3());
		System.out.println(name4());
		
	}

	public static void main(String[] args) {
		B b = new B();
		b.callAClassMethods();
	}
}
