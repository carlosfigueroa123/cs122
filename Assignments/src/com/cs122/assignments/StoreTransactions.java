package com.cs122.assignments;

public abstract class StoreTransactions {
	protected double price;
	protected double tax;
	protected double profits;
	protected String name;
	
	public StoreTransactions(String n, double p) {
		
		name = n;
		price = p;
		
	}
	public String toString()
	   {
	      String result = "Price of the item " + price +  "\n";

	      result += "Name  " + name + "\n";

	      return result;
	   }
	public abstract double tax();
	
	public abstract double interest();
	}

//Here, polymorphism plays an important role in processing these payments since different
//methods require to charge different rates. So as you can see, the tax is different when
//you pay with cash and with credit card. Therefore, if it wasn't for polymorphism in the 
//toString method, the tax and the interest method, charging the costumer would be way more
//complicated (creating methods for each operation and putting a lot of work into calling
//the methods in the main class.

/*To respond to this questions : EX 10.4 What would happen if the pay method were not
defined as an abstract method in the StaffMember class of the
Firm program?

What would happen is that the employees will not get pay the right amount they deserve,
because if the method pay is not polymorphic, it is not going to take into consideration
the variables necessary to calculate the right amount of payment. And the same would happen
to all the different other classes which share characteristics with the staffmember class
as a parent. Polymorphism is elementary in this proccess of payments to get the variables
right, according to each constructor at the determinated class.

 * 
 * 
 */

