package com.hexaware.oopsexample.accessspecifiers2;

public class C {
	A a = new A();
	void callAClassMethods(){
		System.out.println(a.name1());
		System.out.println(a.name3());
		System.out.println(a.name4());
		
	}
	public static void main(String[] args) {
		C b = new C();
		b.callAClassMethods();
	}
}
