package com.cs122.assignments;

public class Soccer extends GoalSports {

	public String game0824 = "Results: Team 1 wins";
	public String game0827 = "Results: Team 2 wins";
	public String today;
	
	
 public int numberOfPlayers() {
	 return numPlayers = 11;
 }
 
 public void setSoccerResults(int team1, int team2) {
	 this.goalsTeam1 = team1;
	 this.goalsTeam2 = team2;
 }
 

	public void statsOfSoccer() {
		System.out.println("Soccer:");
		System.out.println("This game has " + numberOfPlayers() + " players per team");
		
		System.out.println("The result of this game was " + goalsTeam1 + " against " + goalsTeam2);
		
		 super.whoWon();
		  
		 today = result;
		
	}
	public void statsOfPastGames() {
		System.out.println("The results of the pass games were " + "\n" + "Todays game: " + today );
	
		System.out.println("August 24th: " + game0824);
		System.out.println("August 27th: " + game0827);
		System.out.println("\n");


	}
	
}
