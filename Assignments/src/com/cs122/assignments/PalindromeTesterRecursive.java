package com.cs122.assignments;

import java.util.Scanner;

public class PalindromeTesterRecursive {

	public static void main(String[] args) {
		String another = "y";
	
		while (another.equalsIgnoreCase("y")) 
        {
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter a potential palindrome:");
        String string = scan.nextLine();
       
        if(isPal(string))
            System.out.println(string + " is a palindrome");
        else
            System.out.println(string + " is not a palindrome");
        System.out.println();
        System.out.print("Test another palindrome (y/n)? ");
        another = scan.nextLine();
	}
	}
	
	public static boolean isPal(String s)
    {   
        if(s.length() == 0 || s.length() == 1)
            return true; 
        
        if(s.charAt(0) == s.charAt(s.length()-1))
       
        return isPal(s.substring(1, s.length()-1));

        return false;
    }
}
