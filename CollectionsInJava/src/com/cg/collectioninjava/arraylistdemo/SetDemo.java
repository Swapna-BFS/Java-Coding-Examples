package com.cg.collectioninjava.arraylistdemo;

import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {

	public static void main(String[] args) {
		
		HashSet<Character> alphabets = new HashSet<Character>();
		alphabets.add('A');
		alphabets.add('R');
		alphabets.add('V');
		alphabets.add('W');
		alphabets.add('Z');
		alphabets.add('Y');
		alphabets.add('C');
		alphabets.add('X');
		alphabets.add('B');
		alphabets.add('F');
		alphabets.add('B');
		alphabets.add('F');
		alphabets.add(null);
		alphabets.add(null);
		System.out.println(alphabets);
		System.out.println("Removing an element from HashSet ");
		System.out.println(alphabets.remove('F'));
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		System.out.println("studentMarks using Iterator");
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		 Iterator<Character> setItr = alphabets.iterator();
		 while(setItr.hasNext()){
			 System.out.println(setItr.next());
		 }

	}

}
