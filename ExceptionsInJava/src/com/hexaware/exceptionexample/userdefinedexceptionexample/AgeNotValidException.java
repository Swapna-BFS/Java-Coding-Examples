package com.hexaware.exceptionexample.userdefinedexceptionexample;

public class AgeNotValidException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1628141346615327647L;

	public AgeNotValidException(String msg) {
		super(msg);
		System.out.println("Age not valid Constructor called...");
		
	}

}
