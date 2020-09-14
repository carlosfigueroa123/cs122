package com.cs122.classlabs;

public class Bank {
	
	   private Account [] icu;

	   public Bank()
	   {
	      icu = new Account[5];

	      icu[0] = new Credit("Sam Diaz", 560, 5.3);

	      icu[1] = new Deposit("Carla Rodriguez", 340, 2.3);
	      
	      icu[2] = new Savings("Woody Allen", 1200,  2.3, 2000);

	      icu[3] = new Checking("Diane Dior", 300, 2.3, 5.0);

	      icu[4] = new Checking("Norm Andia", 750,  2.4, 4.0);
	      
	   }
	   public void balance ()
	   {
	      double amount;

	      for (int count=0; count < icu.length; count++)
	      {
	         System.out.println(icu[count]);

	         amount = icu[count].balance(); // polymorphic
	         

	         if (amount == 0.0)
	            System.out.println("");
	         else
	            System.out.println("Real balance (including fees and interest): " + amount);
	         
	         System.out.println("-----------------------------------");
	      }
	   }
	}





