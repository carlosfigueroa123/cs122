package com.cs122.assignments;

public class Credit extends StoreTransactions {
protected double numberOfPayments;

	
	public Credit(String n, double p, double pa) {
		super(n, p);
		numberOfPayments = pa;
		
	}

	@Override
	public double tax() {
		double result = 0;
		result = (price * 0.03);
		return result;
	}

	@Override
	public double interest() {
	    double result1 = 0;
	    result1 = (numberOfPayments * 0.05);
	    return result1;
	}
	public String toString()
	   {
	      String result1 = super.toString();

	      result1 += "\nType of transaction: " + "Credit card";

	      return result1;
	   }
	

}
