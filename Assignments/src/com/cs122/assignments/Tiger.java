package com.cs122.assignments;

public class Tiger extends Animals {
	protected String type1;
	protected double height1;
	protected double weight1;
	protected String name;
	protected int victims;

	
		public Tiger(String Typ, double he, double we, String name1, int vic) {
			super(Typ, we, he);
			name = name1;
			victims = vic;
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
			if (weight1 > 256 && height1 > 1.8 && type1.equalsIgnoreCase("Tiger") && victims <= 2) {
				result = name + " must eat at least 350 pounds of food three times a day";
			}
			else if (type1.equalsIgnoreCase("Tiger") && victims <= 2){
				result = name + " must eat at least 150 pounds of food three times a day";
			}
			else if (type1.equalsIgnoreCase("Tiger") && victims > 2) {
				result = name + " ate enought for today, feed him tomorrow";
			}
			else {
				return null;
			}
			return result;
		}

}
