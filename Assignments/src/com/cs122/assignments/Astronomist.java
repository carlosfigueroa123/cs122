package com.cs122.assignments;

public class Astronomist implements Speaker{

	public void announce(String str) {
		System.out.println("Here we announce the beginning of "+ str + " speech");
		
	}

	@Override
	public void speak() {
		System.out.println("In the depth of the universe, we can see how meaningless things are");
		
	}
	
	public void EinsteinsQuote() {
		System.out.println("For the last time, Time is relative! happy??");
	}


}
