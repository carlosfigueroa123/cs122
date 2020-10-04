package com.cs122.assignments;

import java.util.Scanner;

import com.cs122.assignments.OutOfRangeException;
import com.cs122.assignments.NotLowerCaseException;

public class Exceptions {
	public static void main(String[] args) throws OutOfRangeException, NotLowerCaseException
    {
		String output;
		char a;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter output: ");
		output = scan.next();
		
		a = output.charAt(5);
		
		OutOfRangeException problem =
                new OutOfRangeException("Input value is out of range. Output has to have 6 characters");
		
		NotLowerCaseException problem1 = new NotLowerCaseException("The sixth character has to be lower case");
		
		if (output.length()>6) {
			throw problem;
		}
		
		if (Character.isUpperCase(a) == true) {
			
			throw problem1;
		}
		
		
    }
}