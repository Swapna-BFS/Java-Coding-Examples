package com.hexaware.oopsexample.accessspecifiers3;

import com.hexaware.oopsexample.accessspecifiers2.A;
//import com.hexaware.oopsexample.accessspecifiers2.B;

public class D extends A{
	void callAClassMethods(){
		System.out.println(name1());
		System.out.println(name3());
		//System.out.println(name4());
		
	}

	public static void main(String[] args) {
		D b = new D();
		b.callAClassMethods();
	}
}
