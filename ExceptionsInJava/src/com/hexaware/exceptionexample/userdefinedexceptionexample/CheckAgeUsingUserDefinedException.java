package com.hexaware.exceptionexample.userdefinedexceptionexample;

import java.util.Scanner;

public class CheckAgeUsingUserDefinedException {

	public static void main(String[] args) {
		
		Scanner input = null;
		try{
		 input = new Scanner(System.in);
		System.out.println("Enter the age ");
		int age = input.nextInt();
		if(age == 18){
			throw new AgeNotValidException("Age is not valid");
		}if(age < 0){
			throw new AgeShouldNotBeNegariveException("Age is negative exception");
		}
		}catch(AgeNotValidException ae){
			System.out.println(ae.getMessage());
		}catch(AgeShouldNotBeNegariveException ane){
			System.out.println(ane.getMessage());
		}finally {
			input.close();
		}

	}

}
