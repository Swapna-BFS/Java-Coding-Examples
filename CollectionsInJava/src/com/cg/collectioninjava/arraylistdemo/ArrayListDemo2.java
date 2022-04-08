package com.cg.collectioninjava.arraylistdemo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList<Integer> studentMarks = new ArrayList<>();
		studentMarks.add(76);
		studentMarks.add(76);
		studentMarks.add(76);
		studentMarks.add(86);
		studentMarks.add(96);
		studentMarks.add(36);
		Collections.sort(studentMarks);
		System.out.println(studentMarks);
	}

}
