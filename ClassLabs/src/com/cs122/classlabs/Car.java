package com.cs122.classlabs;

public class Car extends Vehicles {
	public int gears;
	
	public Car() {
		 gears = 5;
	}


public void getDetails () {
	System.out.println("the number of wheels is " + this.getWheels() + " and the number of gears is " + gears);
}


}
