package com.hexaware.javabasics;

import java.util.Scanner;

public class ArithmeticOperations {

	public static void main(String[] args) {
		char ch = 'y';
		Scanner input = new Scanner(System.in);
		do{
		System.out.println("Enter the choice");
		System.out.println("1.Add");
		System.out.println("2.Sub");
		System.out.println("3.Modulus");
		System.out.println("4.Div");
		System.out.println("5.Mul");
		String choice = input.next();
		System.out.println("Read value of a");
		int a = input.nextInt();
		System.out.println("Read value of b");
		int b = input.nextInt();
		//Only convertible int values, strings or enum variables are permitted
		switch (choice) {
		
		default:
			System.out.println("No Operation found...please check once...");
			break;
		case "Add":
			System.out.println((a+b) + "Addition = " );
			break;
		case "Sub":
			System.out.println("Substraction = " + (a-b));
			break;
		case "Mod":
			System.out.println(" Modulus = " + (a%b));
			break;
		case "Div":
			System.out.println("Division = " + (a/b));
			break;
		case "Mul":
			System.out.println("Multiplication = " + (a*b));
			break;
		}
		System.out.println("do you repeat ... y - yes or n - no");
		ch = input.next().charAt(0);
		}while(ch  == 'y');
		input.close();
	}

}
