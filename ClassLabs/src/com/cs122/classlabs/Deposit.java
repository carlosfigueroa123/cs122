package com.cs122.classlabs;

public class Deposit extends Account {

	protected double result;
	protected double balance2;
	protected String interest1;

	public Deposit(String eName, double balance1, double interest1) {
		super(eName, balance1);

		interest = interest1;
		balance2 = balance1;
		type = "Deposits account";
	}

	@Override
	protected double balance() {
		result = balance2 - (balance2 * (interest / 100));
		return result;
	}

}
