package com.cs122.assignments;

public class SportsStats {

	public static void main(String[] args) {
		
		Soccer s = new Soccer();
		
		s.setSoccerResults(3, 4);
		
		s.statsOfSoccer();
		
		s.statsOfPastGames();
		
		Waterpolo w = new Waterpolo();
		
		w.setWaterpoloResults(7, 7);
		
		w.statsOfWaterpolo();
		
		w.statsOfPastGames();
		
		Basketball b = new Basketball();
		
		b.setBasketResults(87, 90);
		
		b.statsOfBasketball();
		
		b.statsOfPastGames();
		

	}

}
