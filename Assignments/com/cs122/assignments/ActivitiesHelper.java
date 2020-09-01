package com.cs122.assignments;

public class ActivitiesHelper {

	public static void main (String[] args) {
		
		boolean odd;
		  Activities act = new Activities();

		  act.printActivity();
		  act.preferredActivity("tennis");
		  odd = act.getOddHours();

		  if (odd == true){
		    System.out.println("Odd");
		  }
		  else{
		    System.out.println("FALSE");
		  }

		
}
}
