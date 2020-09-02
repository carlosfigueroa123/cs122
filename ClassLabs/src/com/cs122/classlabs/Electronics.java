package com.cs122.classlabs;

public class Electronics extends Product{
	
	public void printMe() {
		System.out.println("I am in electronics");
	}
	
	public static void main (String[] args) {
		print();
		 
		Electronics elec = new Electronics();
		
		elec.printMe();
	}

}
