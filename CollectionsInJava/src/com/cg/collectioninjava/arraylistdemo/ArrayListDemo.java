package com.cg.collectioninjava.arraylistdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// Create an Array List
		ArrayList<Float> studentMarks = new ArrayList<>();
		studentMarks.add(76.5f);
		studentMarks.add(76.5f);
		studentMarks.add(76.5f);
		studentMarks.add(86.5f);
		studentMarks.add(96.5f);
		studentMarks.add(36.5f);
		studentMarks.add(56.5f);
		studentMarks.add(46.5f);
		studentMarks.add(null);
		studentMarks.add(null);
		studentMarks.add(null);
		//Collections.sort(studentMarks);
		System.out.println(studentMarks);
		//System.out.println(studentMarks);
		studentMarks.add(3, 176.5f);
		System.out.println(studentMarks);
		System.out.println(studentMarks.remove(6));
		System.out.println(studentMarks);
		System.out.println(studentMarks.remove(96.5f));
		System.out.println(studentMarks);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("studentMarks using for each");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
		for (Float marks : studentMarks) {
			System.out.println(marks);
		}
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		System.out.println("studentMarks using Iterator");
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		Iterator<Float> listItr = studentMarks.iterator();
		while (listItr.hasNext()) {
			System.out.println(listItr.next());
		}

		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		System.out.println("studentMarks using List Iterator");
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		ListIterator<Float> lsItr = studentMarks.listIterator();
		while (lsItr.hasNext()) {
			System.out.println(lsItr.next());
		}
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		System.out.println("studentMarks in BackWard Direction using List Iterator");
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

		while (lsItr.hasPrevious()) {
			System.out.println(lsItr.previous());
		}
		
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		System.out.println("studentMarks using Enumeration");
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		Enumeration<Float> studentMarksEnum = Collections.enumeration(studentMarks);
		while (studentMarksEnum.hasMoreElements()) {
			System.out.println(studentMarksEnum.nextElement());
		}
		
	
	}

}
