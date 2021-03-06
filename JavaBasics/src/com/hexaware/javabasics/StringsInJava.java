package com.hexaware.javabasics;

import java.util.Scanner;

public class StringsInJava {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//first way of declaring the String
		String s = "This is a string";
		//second way of declaring the String
		String s1 = new String();
		//Third way of declaring the String
		char[] charArray = new char[100];
		String s2 = new String(charArray);
		//Fourth way of declaring the String
		String s11 = new String("Thos is a string");
		
		System.out.println("First way of string = " + s);
		System.out.println("second way of string = " + s1);
		System.out.println("third way of string = " + s2);
		System.out.println("Fourth way of string = " + s11);
		
		//read a string from the keyboard
		System.out.println("Enter a string to store in s1....");
		s1 = sc.nextLine();
		System.out.println("second way of string After storing a value using scanner =  " + s1);
	
	
		//converting String to charArray
		
		charArray = s1.toCharArray();
		for(char ch : charArray){
			System.out.println(ch);
		}
		
		//equating two string if both are equal or not
		boolean result = s.equals(s11);
		if(result){
			System.out.println("both are equal");
		}else{
			System.out.println("both are not equal");
		}
		
		//combining two or more string in to a string
		System.out.println(s.concat(s11).concat(s1));
		
		//pick a charater using the index
		System.out.println("Enter the index....");
		int index = sc.nextInt();
		System.out.println(s.charAt(index));
		
		//uppercase 
		System.out.println(s.toUpperCase());
		
		//lowercase
		System.out.println(s.toLowerCase());
		
		String sOne = "Apple";
		String sTwo = "Apole";
		int compareResult = sOne.compareTo(sTwo);
		System.out.println(compareResult);
		
		char ch = 67;
		System.out.println(ch);
		
		//substring
		System.out.println(s.substring(10,16));
		
		//index of a character (first occurance of the character)
		System.out.println(s.indexOf("i"));
		
		
		//last index of a character (last occurance of the character)
		System.out.println(s.lastIndexOf("i"));
		
		//length of the string
		System.out.println(s.length());
		
		//divide string in to words
		String[] words = s.split(" ");
		System.out.println("words are......");
		for(String word : words){
			System.out.println(word);
		}
		//check string if it starts with given prefix
		System.out.println(s.startsWith("This"));
		
		//check string if it end with given suffix
		System.out.println(s.endsWith("ing"));

	}

}
