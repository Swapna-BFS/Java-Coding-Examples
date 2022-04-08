package com.hexaware.oopsexample.accessspecifiers3;

import com.hexaware.oopsexample.accessspecifiers2.A;


public class E {
	A a = new A();
	void callAClassMethods(){
		System.out.println(a.name1());
		//System.out.println(a.name3());
		//System.out.println(a.name4());
		
	}
	public static void main(String[] args) {
		E b = new E();
		b.callAClassMethods();
	}
}
