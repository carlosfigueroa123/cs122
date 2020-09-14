package com.cs122.classlabs;

public class Credit extends Account {

	
protected double balance2;
protected double result;
	
	
	public Credit (String eName, double balance1, double apr1)
{
 super(eName, balance1);

 APR = apr1;
 balance2 = balance1;
 type = "Credit account";
}
	
	protected double balance() {
		
		result = balance2 - (balance2 * (APR/100));
		
		return result;
		
	}
	
	
}
