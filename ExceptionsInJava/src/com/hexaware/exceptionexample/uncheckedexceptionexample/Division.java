package com.hexaware.exceptionexample.uncheckedexceptionexample;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		Scanner input = null;
		try{
		 input = new Scanner(System.in);
		System.out.println("Enter the value of dividend");
		int a = input.nextInt();
		System.out.println("Enter the value od divisor");
		int b = input.nextInt();
		if(b == 0){
			throw  new Exception("DIVISOR IS EQUAL TO ZERO");
		}
		System.out.println("Result of Division = " + (a/b));
		}catch(IOException | InputMismatchException ie){
			System.out.println(ie.getMessage());
			//e.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}finally {
			input.close();
		}
	}
}
