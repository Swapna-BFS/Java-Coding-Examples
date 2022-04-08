package com.hexaware.exceptionexample.checkedexceptionexample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHandlingExample {

	public static void main(String[] args) {
		Scanner fileReader = null;
		try {	
			File fileData = new File("file1.txt");
			if(fileData.exists()){
				System.out.println( "FileName = " + fileData.getName());	
			}
			fileReader =  new Scanner(fileData);
			while(fileReader.hasNextLine()){
				String fData = fileReader.nextLine();
				System.out.println(fData);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}	finally {
			fileReader.close();
		}
		
	}

}
