package com.hexaware.exceptionexample.userdefinedexceptionexample;

public class AgeShouldNotBeNegariveException extends Exception {
/**
	 * 
	 */
	private static final long serialVersionUID = -6890085246021924560L;

public AgeShouldNotBeNegariveException(String msg) {
	super(msg);
	System.out.println("Age should not be negative Constructor called...");
}
}
