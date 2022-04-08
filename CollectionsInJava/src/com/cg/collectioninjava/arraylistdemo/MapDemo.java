package com.cg.collectioninjava.arraylistdemo;

import java.util.HashMap;

public class MapDemo {

	public static void main(String[] args) {
	
		HashMap<Integer, String>  empData = new HashMap<>();
		empData.put(123, "Rama");
		empData.put(124, "Ramya");
		empData.put(125, "Raman");
		empData.put(126, "Ramana");
		empData.put(128, "Rajitha");
		empData.put(128, "Rama");
		empData.put(129, "Rama");
		
		System.out.println(empData);
		System.out.println(empData.get(128));
		System.out.println(empData.keySet());
		System.out.println(empData.values());
		System.out.println(empData.entrySet());
		System.out.println(empData.remove(129));
		System.out.println(empData.remove(126, "Ramana1"));


	}

}
