package com.cs122.classlabs.chap11;

public class Lift {

	
	public void floor1() {
		System.out.println("First floor");
		try {
		floor2();
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("The call stack trace:");
            e.printStackTrace();
		}
	}
	
	public void floor2() {
		System.out.println("Second floor");
		int numerator = 0;
		int denominator = 0;
		int result;
		
		result = numerator / denominator;
	}
}
