package com.cs122.classlabs.chap11;

import java.util.Scanner;

public class ExceptionClass {
	 public static void main(String[] args)
	    {
		 
		try {
			String a = null;
			char b = a.charAt(0);
		}
		 
		 catch (Exception e) {
			 System.out.println(e.toString());
		 }
	        
		try {
			int [] x = new int [1];
			x[2] = 0;
		}

		 catch (Exception e) {
			 System.out.println(e.toString());
		 }
		
		try {
			int y = Integer.parseInt("adnasfnef");
		}
		catch (Exception e) {
			 System.out.println(e.toString());
		 }
		
		
	        
	        }
		
		 
		 
		 
	    }

