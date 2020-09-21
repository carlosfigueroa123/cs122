package com.cs122.assignments;

public class Rhino extends Animals{
protected String type1;
protected double height1;
protected double weight1;
protected String name;

	public Rhino(String Typ, double he, double we, String name1) {
		super(Typ, we, he);
		name = name1;
	}
	public String toString()
	   {
	      String result1 = super.toString();

	      result1 += "\nName: " + name;

	      return result1;
	   }
	@Override
	public String feed() {
	String result;
		if (weight1 > 346 && height1 > 2.3 && type1.equalsIgnoreCase("Rhino")) {
			result = name + " must eat at least 200 pounds of food two times a day";
		}
		else if (type1.equalsIgnoreCase("Rhino")) {
			result = name + " must eat at least 100 pounds of food two times a day";
		}
		else {
			return null;
		}
		return result;
	}
}
