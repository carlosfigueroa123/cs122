package com.cs122.assignments;

public class Basketball extends PointSports {
	
	
	public String game0829 = "Results: Team 1 wins";
	public String game0813 = "Results: Team 1 wins";
	public String today;
	
	
 public int numberOfPlayers() {
	 return numPlayers = 5;
 }
 
 public void setBasketResults(int team1, int team2) {
	 this.pointsTeam1 = team1;
	 this.pointsTeam2 = team2;
 }
 

	public void statsOfBasketball() {
		System.out.println("Basketball:");
		System.out.println("This game has " + numberOfPlayers() + " players per team");
		
		System.out.println("The result of this game was " + pointsTeam1 + " against " + pointsTeam2);
		
		 super.whoWon1();
		  
		 today = result;
		
	}
	public void statsOfPastGames() {
		System.out.println("The results of the pass games were " + "\n" + "Todays game: " + today );
		
		System.out.println("August 29th: " + game0829);
		System.out.println("August 13th: " + game0813);
		System.out.println("\n");


	}

}
