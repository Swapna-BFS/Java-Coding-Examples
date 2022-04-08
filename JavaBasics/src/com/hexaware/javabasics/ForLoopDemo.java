package com.hexaware.javabasics;

import java.util.Scanner;

public class ForLoopDemo {

	public static void main(String[] args) {

		int sum = 0;
		long data = 123;
		Scanner sc = new  Scanner(System.in);
		System.out.println("Sum of first n digits (1 to n)");
		float n = sc.nextFloat();
		for(float i=1.0f;i<=n;i++){
			sum += i;
		}
		System.out.println(sum);
	}

}
