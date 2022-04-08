package com.hexaware.oopsexample;

public class Car {
	//variables
	//INSTANCE VARIABLES OR MEMBER VARIABLES
	String brakes;
	String steering;
	//method
	//INSTANCE METHODS OR MEMBER METHODS
	public void applyBrakes(){ 
		//Method signature => access specifier + return type + method name + parameterlist
		System.out.println("this method is used for applying break" + brakes);
	}
	
	void rotateSteering(){
		System.out.println("this method is used for rotating the steering" + steering);
	}

}
