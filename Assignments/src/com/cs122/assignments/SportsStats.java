package com.cs122.assignments;

public class SportsStats {

	public static void main(String[] args) {
		
		System.out.println("The following sports belong to the type Goal sports");
		
		Soccer s = new Soccer();
		
		s.setSoccerResults(3, 4);
		
		s.statsOfSoccer();
		
		s.statsOfPastGames();
		
		Waterpolo w = new Waterpolo();
		
		w.setWaterpoloResults(7, 7);
		
		w.statsOfWaterpolo();
		
		w.statsOfPastGames();
		
		System.out.println("The following sports belong to the type Point sports");

		Basketball b = new Basketball();
		
		b.setBasketResults(87, 90);
		
		b.statsOfBasketball();
		
		b.statsOfPastGames();
		
		Football f = new Football();
		
		f.setFootballResults(28, 30);
		
		f.statsOfFootball();
		
		f.statsOfPastGames();
		

	}

}
