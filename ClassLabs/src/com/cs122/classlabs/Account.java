package com.cs122.classlabs;

public abstract class Account {
	protected String name;
	protected double balance;
	
	public Account (String eName, double balance1)
	   {
	      name = eName;
	      
	      balance = balance1;
	   }
	public String toString()
	   {
	      String result = "Name: " + name + "\n";
	    
	      result += "Nominal " + balance;

	      return result;
	   }
	
	protected abstract double balance();
		
	

}
