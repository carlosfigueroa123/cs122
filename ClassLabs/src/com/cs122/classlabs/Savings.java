package com.cs122.classlabs;

public class Savings extends Deposit{

protected double limit;
protected double result;
protected double balance2;
protected double interest2;

	
	
	public Savings (String eName, double balance1, double interest1, float limit1 )
{
 super(eName, balance1, interest1);

 limit = limit1;
 balance2 = balance1;
 interest2 = interest1;
}
	
	protected double balance() {
		if (balance2 >= limit) {
			result = 0;
		}
		else if(balance2 < limit ) {
			result = balance2 - (balance2 * (interest2/100));
		}
		return result;
		
	}
}
