package com.hexaware.javabasics;

import java.util.Scanner;

public class DataTypes {

	public static void main(String[] args) {

		// variables => variables should be declared using camelCase
		int aValueOne = 30; // 4 bytes
		float bData = 40.5f;// 4 bytes
		char chCode = 'y';// 2 bytes => Unicode Transformation Format (UTF-8)
		double piValue = 567.890123;// 8 bytes
		String s = "hexaware";
		System.out.println("Before Values....");
		System.out.println(aValueOne);
		System.out.println(bData);
		System.out.println(chCode);
		System.out.println(piValue);
		System.out.println(s);
		/*Scanner input = new Scanner(System.in);
		System.out.println("Enter the value of aValueOne....");
		aValueOne = input.nextInt();
		System.out.println("Enter the value of bData....");
		bData = input.nextFloat();
		System.out.println("Enter the value of chCode....");
		chCode = input.next().charAt(0);
		System.out.println("Enter the value of piValue....");
		piValue = input.nextDouble();
		System.out.println("Enter the value of String....");
		s = input.next();
		System.out.println("Enter the value of String with space");
		input.nextLine();
		String str = input.nextLine();
		
		System.out.println("After Values....");
		System.out.println(aValueOne);
		System.out.println(bData);
		System.out.println(chCode);
		System.out.println(piValue);
		System.out.println(s);
		System.out.println(str);*/
		// literal
		// 30 => integer literal
		// 40.5f => float literal
		// 567.890123 => double literal
		// 'y' => char literal => unicode charset
		// "String" => string literal
		//i18N => internationalization
		
		char ch = 'y';
		int x = 30;
		System.out.println("RESULT =" + (ch + x));
		
		
		
		
		//input.close();
		
	}

}
