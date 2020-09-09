package com.cs122.assignments;

public class Waterpolo extends GoalSports {
	
	
	public String game0624 = "Results: Team 2 wins";
	public String game0427 = "Results: Team 2 wins";
	public String today;
	
	
 public int numberOfPlayers() {
	 return numPlayers = 13;
 }
 
 public void setWaterpoloResults(int team1, int team2) {
	 this.goalsTeam1 = team1;
	 this.goalsTeam2 = team2;
 }
 

	public void statsOfWaterpolo() {
		System.out.println("Waterpolo:");
		System.out.println("This game has " + numberOfPlayers() + " players per team");
		
		System.out.println("The result of this game was " + goalsTeam1 + " against " + goalsTeam2);
		
		 super.whoWon();
		  
		 today = result;
		
	}
	public void statsOfPastGames() {
		System.out.println("The results of the pass games were " + "\n" + "Todays game: " + today );
		
		System.out.println("June 24th: " + game0624);
		System.out.println("May 27th: " + game0427);
		System.out.println("\n");


	}
	

}
