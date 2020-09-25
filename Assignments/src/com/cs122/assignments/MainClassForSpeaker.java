package com.cs122.assignments;


public class MainClassForSpeaker {

	public static void main(String[] args) {
		
				Speaker guest = new Astronomist();
				guest.announce("Carlos");
				guest.speak();
				((Astronomist) guest).EinsteinsQuote();
				
				guest = new Psicologist();
				guest.announce("Fred");
				guest.speak();
				((Psicologist) guest).FreudQuote();
				
				guest = new Scientologist();
				guest.announce("Marcus");
				guest.speak();
				((Scientologist) guest).CruiseQuote();
				
			}
		

	}


