package com.cs122.assignments;

public class PointSports {
	public int numPlayers;
	public int pointsTeam1;
	public int pointsTeam2;
	public int numSets;
	public String result;
	
	
	public void whoWon1() {
		if(pointsTeam1 == pointsTeam2) {
			result = "Results: No one wins, it is a tie.";
		}
		else if(pointsTeam1 > pointsTeam2) {
			result = "Results: Team 1 wins";
		}
		else {
			result = "Results: Team 2 wins";
		}
		System.out.print(result + "\n" + "\n");
	}
}
