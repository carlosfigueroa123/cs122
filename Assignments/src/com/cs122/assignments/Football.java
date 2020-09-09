package com.cs122.assignments;

public class Football extends PointSports {
	
	public String game0209 = "Results: Team 1 wins";
	public String game0307 = "Results: Team 2 wins";
	public String today;
	
	
 public int numberOfPlayers() {
	 return numPlayers = 11;
 }
 
 public void setFootballResults(int team1, int team2) {
	 this.pointsTeam1 = team1;
	 this.pointsTeam2 = team2;
 }
 

	public void statsOfFootball() {
		System.out.println("Football:");
		System.out.println("This game has " + numberOfPlayers() + " players per team");
		
		System.out.println("The result of this game was " + pointsTeam1 + " against " + pointsTeam2);
		
		 super.whoWon1();
		  
		 today = result;
		
	}
	public void statsOfPastGames() {
		
		System.out.println("The results of the pass games were " + "\n" + "Todays game: " + today );
		
		System.out.println("February 9th: " + game0209);
		System.out.println("March 7th: " + game0307);
		System.out.println("\n");


	}


}
