package com.cs122.assignments;

public class Psicologist implements Speaker{
	
	public void announce(String str) {
		System.out.println("Here we announce the beginning of "+ str + " speech");
		
	}

	@Override
	public void speak() {
		System.out.println("On the unconciousness, we find what the human really is: a mystery.");
		
	}
	
	public void FreudQuote() {
		System.out.println("Yeah yeah, it is all your parents fault");
	}


}
