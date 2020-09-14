package com.cs122.classlabs;

public abstract class Account {
	protected String name;
	protected double balance;
	protected double interest;
	protected double limit;
	protected double APR;
	protected String type;
	protected double fees;
	
	public Account (String eName, double balance1)
	   {
	      name = eName;
	      
	      balance = balance1;
	   }
	public String toString()
	   {
	      String result = "Name: " + name + "\n";
	    
	      result += "Nominal(entry): " + balance + "\n" + "Interest: " + interest + "\n" + "Limit: " + limit + "\n" + "APR: " + APR + "\n" + "Fees: " + fees;

	      result += "\n" + "Type of account: " + type;
	      return result;
	   }
	
	protected abstract double balance();
		
	

}
