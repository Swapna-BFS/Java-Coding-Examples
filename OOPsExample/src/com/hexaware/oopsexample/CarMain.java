package com.hexaware.oopsexample;

public class CarMain {


	public static void main(String[] args) {
		Car bmw = new Car(); 
		Car swift = new Car(); 
		bmw.brakes = "hand brakes";
		bmw.steering = "power Steering";
		bmw.applyBrakes();
		bmw.rotateSteering();
		swift.brakes = "brakes";
		swift.steering = "steering";
		swift.applyBrakes();
		swift.rotateSteering();
	}

}
