package com.cs122.assignments;

public class Cash extends StoreTransactions{
protected double numberOfBills;

	
	public Cash(String n, double p, double ni) {
		super(n, p);
		numberOfBills = ni;
		
	}

	@Override
	public double tax() {
		double result = 0;
		result = (price * 0.01);
		return result;
	}

	@Override
	public double interest() {
	    double result1 = 0;
	    result1 = (numberOfBills * 0.02);
	    return result1;
	}
	public String toString()
	   {
	      String result1 = super.toString();

	      result1 += "\nType of transaction: " + "Cash";

	      return result1;
	   }
	

}
