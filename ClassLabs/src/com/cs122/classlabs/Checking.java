package com.cs122.classlabs;

public class Checking extends Deposit{

	
	protected double result;
	protected double balance2;
	protected double interest2;
	
	
	public Checking (String eName, double balance1, double interest1, double fees1 )
{
 super(eName, balance1, interest1);

 fees = fees1;
 balance2 = balance1;
 interest2 = interest1;
 type = "Checking account";
}
	
	protected double balance() {
		
		result = balance2 - (balance2 * (interest2/100))- fees;
	
		return result;
		
	}
}
