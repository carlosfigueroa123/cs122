package com.cs122.assignments;

public class GoalSports {
	
	public int numPlayers;
	public int goalsTeam1;
	public int goalsTeam2;
	public String result;
	
	
	
	public void whoWon() {
		if(goalsTeam1 == goalsTeam2) {
			result = "Results: No one wins, it is a tie.";
		}
		else if(goalsTeam1 > goalsTeam2) {
			result = "Results: Team 1 wins";
		}
		else {
			result = "Results: Team 2 wins";
		}
		System.out.print(result + "\n" + "\n");
	}
	

}
