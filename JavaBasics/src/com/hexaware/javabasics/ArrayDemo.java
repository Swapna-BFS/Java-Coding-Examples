package com.hexaware.javabasics;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Declaring an array
		int[] data = null;
		data = new int[10];
		
		//Initialization of the array
		int[] values = {5,45,34,67,89};
		
		System.out.println("Accessing array elements using for each....");
		for(int i : values){
			System.out.println(i);
		}
		
		System.out.println("Read values and store in the array");
		for(int i=0 ;i<data.length;i++){
			data[i] = sc.nextInt();
		}
		
		System.out.println("Accessing array elements using for each....");
		for(int i : data){
			System.out.println(i);
		}
	}

}
