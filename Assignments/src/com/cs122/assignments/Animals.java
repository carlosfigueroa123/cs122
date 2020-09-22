package com.cs122.assignments;

public abstract class Animals {
	protected String type;
	protected double weight;
	protected double height;
	
	public Animals(String Typ, double we, double he) {
		type = Typ;
		weight = we;
		height = he;
		
	}
	  public String toString()
	   {
	      String result = "Type " + type + "\n";

	      result += "Weight: " + weight + "\n";
	      result += "Height: " + height ;

	      return result;
	   }
	  public abstract String feed();

}
//Polymorphism plays and important role in feeding the animals since each one has different
//needs for food, therefore the function feed changes over time, depending on
//what animal are we referring to. If it wasn't for polymorphism, we would have to create
//different methods in each class to refer to a single act of feeding
//Hence, using polymorphism to feed the animals makes it more easy and feasible.
