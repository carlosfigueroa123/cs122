package com.cs122.assignments;

public class Scientologist implements Speaker {
	
	public void announce(String str) {
		System.out.println("Here we announce the beginning of "+ str + " speech");
		
	}

	@Override
	public void speak() {
		System.out.println("The aliens are going to come, and I is going to be amazing");
		
	}
	
	public void CruiseQuote() {
		System.out.println("For the last time, Time is not relative! Not happy.");
	}


}
