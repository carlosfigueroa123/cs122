package com.cs122.classlabs.chap11;

import java.util.Scanner;


public class CreatingExceptionsStrings {
	public static void main(String[] args) throws StringTooLong{
	
	String output;
	char a;
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter output: ");
	output = scan.next();
	
	
	StringTooLong problem =
            new StringTooLong ("Input value is too long. Output has to have 6 characters");
	
	
	if (output.length()>6) {
		throw problem;
	}
	}
}
