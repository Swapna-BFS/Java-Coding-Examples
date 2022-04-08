package com.hexaware.oopsexample.construtordemo;

public class SampleDemo extends Demo{
	Demo d = new Demo();
	public SampleDemo() {
		super(55, 65);
		System.out.println("this is sample demo constructor....");
	}

}
