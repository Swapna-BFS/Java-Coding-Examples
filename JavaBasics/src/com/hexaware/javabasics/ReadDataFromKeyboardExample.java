package com.hexaware.javabasics;

import java.util.Scanner;

public class ReadDataFromKeyboardExample {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		//System.out.println("Enter the number....");
		int n = sc.nextInt();
		float value = sc.nextFloat();
		String s = sc.next();
		String str = sc.nextLine();
		if(n%2 == 0){
			System.out.println("Even");
		}else{
			System.out.println("Not Even");
		}

	}

}
